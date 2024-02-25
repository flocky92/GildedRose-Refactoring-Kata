package com.gildedrose;

public class AgedBrieProduct extends AbstractProductBase {

    @Override
    public void calculateQuality(Item item) {
        item.quality = item.sellIn > 0 ? item.quality + 1 : item.quality + 2;
    }
    
}
