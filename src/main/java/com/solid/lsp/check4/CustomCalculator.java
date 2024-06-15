package com.solid.lsp.check4;

public class CustomCalculator extends Calculator {

    @Override
    public int doubleNum(int num) {
        //breaks LSP because this method strengthen the pre-conditions
        //by accepting only positive values and the overriden method accepts full range
        if (num < 0) return 0;
        else return num * 2;
    }
}
