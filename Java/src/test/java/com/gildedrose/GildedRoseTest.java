package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GildedRoseTest {

    
    @Test()
    void checkNoProduct() {
        GildedRose app = new GildedRose(null);
        app.updateQuality();
        assertTrue(app.items.length == 0);
    }

    @Test
    void checkNegativeQuality() {
        Item[] items = new Item[] { new Item("cake", 0, -10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("cake", app.items[0].name);
        assertTrue(app.items[0].quality < 0);
    }

    @Test
    void testConjuredProductSellInPositif() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void testConjuredProductSellInNegatif() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

}
