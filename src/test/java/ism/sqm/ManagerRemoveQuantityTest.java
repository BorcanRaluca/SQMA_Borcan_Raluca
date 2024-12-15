package ism.sqm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerRemoveQuantityTest {

    @Test
    public void testRemoveQuantity() {
        ShoppingListManager manager = new ShoppingListManager();
        
        manager.addItem(ShoppingListItem.WATER);
        manager.addQuantity(ShoppingListItem.WATER, 5);

        assertTrue(manager.removeQuantity(ShoppingListItem.WATER, 3), "removeQuantity() should remove part of the quantity");
        assertTrue(manager.removeQuantity(ShoppingListItem.WATER, 2), "removeQuantity() should remove remaining quantity and delete item");

        assertNull(manager.getQuantity(ShoppingListItem.WATER), "removeQuantity() should remove remaining quantity and delete item");
        assertFalse(manager.removeQuantity(ShoppingListItem.WATER, 1), "removeQuantity() should not remove quantity for a non-existent item");
    }

}
