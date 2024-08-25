package Collection_Set;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("2");
        set.add("3");
        set.add("four");
        set.add("five");
        set.add("six");
        System.out.println(set);
        System.out.println("=============================");


        set.add("six");
        System.out.println(set);
        System.out.println("=============================");

                                            // hashset is doesnt allow the duplicacy. (No duplicate/repeated values not allow)
        boolean isAdded =  set.add("six"); // it will give us that value is added or not.
        System.out.println(isAdded);       //above method giving the value is (false) because "six" value is already added. thats why it giving false statement  and number is not adding to the hashset.
        System.out.println(set);

        boolean isCheckAdded =  set.add("nine");
        System.out.println(isCheckAdded);
        System.out.println(set);

        System.out.println("=============contains ====================");

        //  .contains is the  method that using for checking  value is present or not in the hashset.

        boolean contains = set.contains("hh"); ///false.
        System.out.println(contains);

        boolean valueCheck = set.contains("nine");
        System.out.println(valueCheck);

        System.out.println("==========Remove==========");

        set.remove("four");
        System.out.println(set);


        System.out.println("=====Size==========");

        int size = set.size();
        System.out.println(size);




    }

}
