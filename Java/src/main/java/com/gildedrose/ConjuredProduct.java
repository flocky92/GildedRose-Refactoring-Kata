package com.gildedrose;

public class ConjuredProduct extends AbstractProductBase {

    @Override
    public void calculateQuality(Item item) {
        int currentDegradation = valueDegradation(item.sellIn) * 2;
        item.quality -= currentDegradation;
    }
}
