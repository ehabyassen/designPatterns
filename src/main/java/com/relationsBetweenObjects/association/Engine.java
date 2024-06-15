package com.relationsBetweenObjects.association;

public class Engine {

    private String modelName;
    private String serialNum;

    public Engine(String modelName, String serialNum) {
        this.modelName = modelName;
        this.serialNum = serialNum;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelName='" + modelName + '\'' +
                ", serialNum='" + serialNum + '\'' +
                '}';
    }
}
