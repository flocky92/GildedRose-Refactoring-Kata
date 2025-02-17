package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GildedRoseTest {

    
    @Test()
    void checkNoProduct() {
        GildedRose app = new GildedRose(null);
        app.updateProcess();
        assertTrue(app.getItems().length == 0);
    }

    @Test
    void checkNegativeQuality() {
        Item[] items = new Item[] { new Item("cake", 0, -1) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertTrue(app.getItems()[0].quality >= 0);
    }   
    

    @Test
    void checkLegendaryQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].name);
        assertEquals(5, app.getItems()[0].sellIn);
        assertEquals(80, app.getItems()[0].quality);
    }  


    @Test
    void conjuredProductSellInPositif() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Conjured Mana Cake", app.getItems()[0].name);
        assertEquals(4, app.getItems()[0].sellIn);
        assertEquals(8, app.getItems()[0].quality);
    }

    @Test
    void conjuredProductSellInNegatif() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 3) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Conjured Mana Cake", app.getItems()[0].name);
        assertEquals(-1, app.getItems()[0].sellIn);
        assertEquals(0, app.getItems()[0].quality);
    }
    
    @Test
    void agedBrieProductSellInPositif() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 3) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Aged Brie", app.getItems()[0].name);
        assertEquals(4, app.getItems()[0].sellIn);
        assertEquals(4, app.getItems()[0].quality);
    }

    @Test
    void agedBrieProductSellInNegatif() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 3) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Aged Brie", app.getItems()[0].name);
        assertEquals(-1, app.getItems()[0].sellIn);
        assertEquals(5, app.getItems()[0].quality);
    }
    
    
    @Test
    void backstageProductSellInPositif() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 3) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].name);
        assertEquals(19, app.getItems()[0].sellIn);
        assertEquals(4, app.getItems()[0].quality);
    }

    @Test
    void backstageProductSellInPositif10DaysLeft() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 3) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].name);
        assertEquals(9, app.getItems()[0].sellIn);
        assertEquals(5, app.getItems()[0].quality);
    }

    @Test
    void backstageProductSellInPositif5DaysLeft() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 3) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].name);
        assertEquals(4, app.getItems()[0].sellIn);
        assertEquals(6, app.getItems()[0].quality);
    }

    @Test
    void backstageProductSellInNegatif() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.getItems()[0].name);
        assertEquals(-1, app.getItems()[0].sellIn);
        assertEquals(0, app.getItems()[0].quality);
    }
    
    @Test
    void legendaryProductSellInPositif() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 82) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].name);
        assertEquals(5, app.getItems()[0].sellIn);
        assertEquals(82, app.getItems()[0].quality);
    }

    @Test
    void legendaryProductSellInNegatif() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 75) };
        GildedRose app = new GildedRose(items);
        app.updateProcess();
        assertEquals("Sulfuras, Hand of Ragnaros", app.getItems()[0].name);
        assertEquals(-1, app.getItems()[0].sellIn);
        assertEquals(75, app.getItems()[0].quality);
    }
}
