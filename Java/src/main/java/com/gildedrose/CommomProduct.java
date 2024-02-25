package com.gildedrose;

public class CommomProduct extends AbstractProductBase {

    @Override
    public void calculateQuality(Item item) {
        item.quality -= valueDegradation(item.sellIn);
    }
    
}
