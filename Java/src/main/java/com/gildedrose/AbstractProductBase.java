package com.gildedrose;

public abstract class AbstractProductBase implements ProductInterface {
    final static int MAX_QUALITY = 50;
    final static int BASE_DEGRADATION_QUALITY = 1;

    public void decreaseSellIn(Item item){
        item.sellIn --;
    }

    public int valueDegradation(int nbSellIn) {
        return (nbSellIn > 0 ? BASE_DEGRADATION_QUALITY : BASE_DEGRADATION_QUALITY*2);
    }

    public void checkDataValue(Item item){
        if(item.quality < 0)
            item.quality = 0;
        else if(item.quality > MAX_QUALITY)
            item.quality = MAX_QUALITY;
    }

    abstract void calculateQuality(Item item);

    @Override
    public void update(Item item) {
        calculateQuality(item);
        decreaseSellIn(item);
        checkDataValue(item);
    }

}
