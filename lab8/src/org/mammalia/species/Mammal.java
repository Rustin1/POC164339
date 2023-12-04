package org.mammalia.species;

public record Mammal(String species, String furColor, boolean isDomesticated) {
    public Mammal() {
        this("bawół", "czarny", false);
    }

    @Override
    public String toString() {
        return "Rasa: "+ species+", kolor futra: "+furColor+", czy oswojony: "+isDomesticated;
    }
}




