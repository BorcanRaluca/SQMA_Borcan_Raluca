package ism.sqm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddQuantityTest {

    @Test
    public void testAddQuantity() {
        ShoppingListManager manager = new ShoppingListManager();

        manager.addItem(ShoppingListItem.BREAD);
        manager.addQuantity(ShoppingListItem.BANANAS, 5);
        manager.addQuantity(ShoppingListItem.BANANAS, 3);

        assertEquals(8, manager.getQuantity(ShoppingListItem.BANANAS),
                "addQuantity() should add quantity to existing item. Expected 8, but received " + manager.getQuantity(ShoppingListItem.BANANAS));
        assertEquals(0, manager.getQuantity(ShoppingListItem.BREAD),
                "addQuantity() should add default quantity to new item. Expected 0, but received " + manager.getQuantity(ShoppingListItem.BREAD));
    }

}
