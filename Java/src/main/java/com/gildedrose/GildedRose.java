package com.gildedrose;

class GildedRose {
    private Item[] items; 

    public GildedRose(Item[] items) {
        this.items = items == null ? new Item[]{} : items;
    }

    public void updateProcess(){
        ProductInterface product;
        for (Item item : this.items) {
            switch (item.name) {
                case "Sulfuras, Hand of Ragnaros":
                    product = new LegendProduct();
                    break;
                case "Aged Brie":        
                    product = new AgedBrieProduct();
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    product = new BackstageProduct();
                    break;
                case "Conjured Mana Cake":                    
                    product = new ConjuredProduct();
                    break;
                default:
                    product = new CommomProduct();
                    break;
            }
            product.update(item);
        }
    }
    
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

}
