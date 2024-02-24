package com.gildedrose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class GildedRose {
    private Item[] items; 

    public GildedRose(Item[] items) {
        this.items = items == null ? new Item[]{} : items;
    }

    public void leeroyProcess(){
        for (Item item : this.items) {
            if(item.name == "Sulfuras, Hand of Ragnaros")
                continue;

            switch (item.name) {
                case "Aged Brie":
                    ItemProcess.agedBrieProcess(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    ItemProcess.backStageProcess(item);
                    break;
                case "Conjured Mana Cake":
                    ItemProcess.defaultQualityProcess(item,2);
                    break;
                default:
                    ItemProcess.defaultQualityProcess(item,1);
                    break;
            }
            ItemProcess.checkDataValue(item);
        }
    }  
    
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
