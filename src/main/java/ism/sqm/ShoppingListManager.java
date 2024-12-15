package ism.sqm;

import java.util.HashMap;
import java.util.Map;

public class ShoppingListManager {

    private final Map<ShoppingListItem, Integer> shoppingList = new HashMap<>();

    public boolean addItem(ShoppingListItem item) {
        if (shoppingList.containsKey(item)) {
            return false;
        }
        shoppingList.put(item, 0);
        return true;
    }

    public boolean addQuantity(ShoppingListItem item, Integer quantity) {
        if (shoppingList.containsKey(item)) {
            Integer initialQuantity = shoppingList.get(item);
            shoppingList.put(item, initialQuantity + quantity);
        } else {
            shoppingList.put(item, quantity);
        }

        return true;
    }

    public boolean removeItem(ShoppingListItem item) {
        if (shoppingList.containsKey(item)) {
            shoppingList.remove(item);
            return true;
        }
        return false;
    }

    public boolean removeQuantity(ShoppingListItem item, Integer quantity) {
        if (!shoppingList.containsKey(item)) {
            return false;
        }
        Integer initialQuantity = shoppingList.get(item);
        if (initialQuantity < quantity) {
            return false;
        } else if (initialQuantity.equals(quantity)) {
            shoppingList.remove(item);
        } else {
            shoppingList.put(item, initialQuantity - quantity);
        }
        return true;
    }

    public Integer getQuantity(ShoppingListItem item) {
        return shoppingList.get(item);
    }

}
