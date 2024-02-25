package com.gildedrose;

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
                    ItemProcessUtils.agedBrieProcess(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    ItemProcessUtils.backStageProcess(item);
                    break;
                case "Conjured Mana Cake":
                    ItemProcessUtils.defaultQualityProcess(item,2);
                    break;
                default:
                    ItemProcessUtils.defaultQualityProcess(item,1);
                    break;
            }
            ItemProcessUtils.checkDataValue(item);
        }
    }  
    
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
