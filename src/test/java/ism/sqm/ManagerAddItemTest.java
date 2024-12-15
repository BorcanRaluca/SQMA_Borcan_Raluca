package ism.sqm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManagerAddItemTest {

    @Test
    public void testAddItem() {
        ShoppingListManager manager = new ShoppingListManager();

        assertTrue(manager.addItem(ShoppingListItem.APPLES),
                "Item " + ShoppingListItem.APPLES + " should be added");
        assertFalse(manager.addItem(ShoppingListItem.APPLES),
                "Should not add duplicate item " + ShoppingListItem.APPLES);
    }

}
