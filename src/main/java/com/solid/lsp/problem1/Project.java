package com.solid.lsp.problem1;

import java.util.List;

public class Project {

    private final List<Document> allDocs;
    private final List<ReadWriteDocument> readWriteDocs;

    public Project(List<Document> allDocs, List<ReadWriteDocument> readWriteDocs) {
        this.allDocs = allDocs;
        this.readWriteDocs = readWriteDocs;
    }

    public void openAll() {
        allDocs.forEach(Document::open);
    }

    public void saveAll() {
        readWriteDocs.forEach(ReadWriteDocument::save);
    }
}
