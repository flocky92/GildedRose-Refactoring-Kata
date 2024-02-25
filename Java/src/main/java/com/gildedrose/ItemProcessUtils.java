package com.gildedrose;

public final class ItemProcessUtils {
    final static int maxQuality = 50;
    final static int baseDegradationQuality = 1;

    public static void defaultQualityProcess(Item item, int multiplicatorDegradation){
        multiplicatorDegradation = multiplicatorDegradation <= 0 ? 1 : multiplicatorDegradation;
        int currentDregradation = baseDegradationQuality * multiplicatorDegradation;
        //negative sellIn -> X 2 degradation quality
        if(item.sellIn <= 0)
        currentDregradation *=2;

        item.quality = item.quality - currentDregradation;
    }

    public static void agedBrieProcess(Item item){
        item.quality = item.sellIn > 0 ? item.quality + 1 : item.quality + 2;
    }

    public static void backStageProcess(Item item){   
        if(item.sellIn <= 0)
            item.quality = 0;      
        else if(item.sellIn <= 5)
            item.quality += 3;      
        else if(item.sellIn <= 10)
            item.quality += 2;
        else
            item.quality ++;
    }

    public static void checkDataValue(Item item){
        if(item.quality < 0)
            item.quality = 0;
        else if(item.quality > maxQuality)
            item.quality = maxQuality;

        item.sellIn --;
    }
}
