package com.designPatterns.structural.bridge.example1;

public abstract class Material {

    private final String code;

    protected Material(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Material{" +
                "code='" + code + '\'' +
                '}';
    }
}
