package com.solid.lsp.check5;

public class JdbcDataSource extends DataSource {

    @Override
    public void getUsers() {
        //opens connection
        //gets users
        //does not close connection

        //breaks LSP check5 because it weakens the post-conditions
        //by leaving the connection open
    }
}
