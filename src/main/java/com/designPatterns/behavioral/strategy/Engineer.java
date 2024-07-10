package com.designPatterns.behavioral.strategy;

import java.util.Map;

public class Engineer {

    private static final Map<Car, DisassembleStrategy> MAP = Map.of(
            Car.Toyota, new ToyotaDisassembleStrategy(),
            Car.Volvo, new VolvoDisassembleStrategy(),
            Car.BMW, new BmwDisassembleStrategy()
    );

    DisassembleStrategy getDisassembleStrategy(Car car) {
        return MAP.get(car);
    }
}
