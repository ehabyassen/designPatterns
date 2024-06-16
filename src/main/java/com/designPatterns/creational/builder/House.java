package com.designPatterns.creational.builder;

public class House {

    private final int windows;
    private final int doors;
    private final int rooms;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasStatues;
    private final boolean hasGarden;

    private House(Builder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasStatues = builder.hasStatues;
        this.hasGarden = builder.hasGarden;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasStatues() {
        return hasStatues;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasStatues=" + hasStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public static class Builder {

        private int windows;
        private int doors;
        private int rooms;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasStatues;
        private boolean hasGarden;

        public Builder withWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder withDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder withRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder withGarage() {
            this.hasGarage = true;
            return this;
        }

        public Builder withSwimmingPool() {
            this.hasSwimmingPool = true;
            return this;
        }

        public Builder withStatues() {
            this.hasStatues = true;
            return this;
        }

        public Builder withGarden() {
            this.hasGarden = true;
            return this;
        }
        
        public House build() {
            return new House(this);
        }
    }
}
