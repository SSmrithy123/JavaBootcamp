package module10.Activity5;

import java.util.HashMap;

public class ElectronicItemDetails {

    // Creating method to return the price of a given item from itemHashMap
    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (itemHashMap != null && itemHashMap.containsKey(name)) { // Check if map exists and contains the item name
            return itemHashMap.get(name); // Return price
        }
        return 0.0; // Return 0.0 if item is not found
    }


    public static void main(String[] args) {
        //Create itemHashMap with String name and double price
        HashMap<String, Double> itemHashMap = new HashMap<String, Double>();
       // Add 4 items in hashmap
        itemHashMap.put("TV", 799.99); // Add TV and its price
        itemHashMap.put("Refrigerator", 11299.50);
        itemHashMap.put("Washing Machine", 6489.00);
        itemHashMap.put("Laptop", 1099.99);

        //Print the price of TV by calling returnPriceOfItem
        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV")); // Here Passing map and "TV" as arguments
    }
}
