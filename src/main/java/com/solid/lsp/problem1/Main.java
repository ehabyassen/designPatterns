package com.solid.lsp.problem1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReadWriteDocument doc1 = new ReadWriteDocument("doc1.txt");
        Document doc2 = new Document("doc2.pdf");

        List<Document> allDocs = List.of(doc1, doc2);
        List<ReadWriteDocument> readWriteDocs = List.of(doc1);

        Project project = new Project(allDocs, readWriteDocs);

        project.openAll();
        project.saveAll();
    }
}
