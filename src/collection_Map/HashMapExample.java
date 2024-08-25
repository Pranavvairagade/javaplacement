package collection_Map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        //CRUD
        //  key= String // value= Integer
        HashMap<String,Integer> map = new HashMap<>();  // hashmap declaration
        map.put("Apple",40); // adding value into hashmap (insert operation)
        map.put("Mango",50);
        map.put("Banana",70);
        map.put("Pineapple",80);
        map.put("Orange",99);

        // .get is the method to getting any value from hashset
        Integer mangoCount = map.get("Banana"); // we are getting value through key value
        System.out.println(mangoCount);

        // .containsKey is the method that, we can check the data is present or not in the hashmap.
        // we are using boolean because it shows only true or false data is present or not
        boolean hasMango=map.containsKey("Mango");
        System.out.println(hasMango);

        boolean hasMango2= map.containsKey("mango");
        System.out.println(hasMango2);

        // .containsValue is the method that we can check that value is present or not in hashset
        boolean hasMangocount = map.containsValue(50);
        System.out.println(hasMangocount);

        // .keySet is the method that all the values has been stored in this keySet method and we can retrive data data from that method into variable
        // we rae using for each loop for getting values from KeySet
        for(String key:map.keySet()){
            System.out.println("key :" + key);
        }
        System.out.println("=====================");

        // .remove is the method for deleting any elements
        map.remove("Mango");

        for(String key:map.keySet()){
            System.out.println("key :" + key);
        }

        System.out.println("====================");

        // .values is the method that stored all the values from hashset
        // it shows all the values from hashset
        for(Integer value:map.values()){
            System.out.println("value: "+ value);
        }




    }
}
