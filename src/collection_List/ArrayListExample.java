
package collection_List;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> dates = new ArrayList<>(); //creating array
        dates.add("apple");  // adding data(value) in arratlist
        dates.add("banana");
        dates.add("orange");
        dates.add("kiwi");
        dates.add("lichy");
        System.out.println("orignal list :" + dates);

        for(String data:dates){  //we are using for each for getting value one by one, not in list form.
            // It getting value from dates and storing in data(variable one bye one.
            // It get one value from dates and print it and then again getting second value then print
            System.out.println(data);
        }
        // .get is the method for getting(searching) perticular value from list.
        String one=dates.get(0); // we are getting value from list at index value zero. and that value storing into "one" variable
        System.out.println("one element :" + one );

        String third=dates.get(2);
        System.out.println("third element :" + third );

        // .set is the method for updating any value in the list, at perticular index.
        dates.set(0,"apple2");
        System.out.println("update operation :" + dates);

        // .remove is hte method for removing any value from the list, at perticular index.
        dates.remove(0);
        System.out.println("remove opeartion :" + dates);

        // .size is the method for detrmining the size of the arraylist. and it will give in integer form.
        int size=dates.size(); // it will give size of arraylist in integer thats why we declare variable in integer datatype
        System.out.println("size of list:" + size );

        // .clear is the method to deleting all the values from list
        dates.clear();
        System.out.println("current list after clearing arraylist" + dates );

        int sizetwo=dates.size();
        System.out.println("size of list:" + sizetwo );
    }
}
