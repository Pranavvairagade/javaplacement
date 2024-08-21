package collection_List;
import java.util.ArrayList;
public class ArrayListExampleTwo {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        movies.add("prisonBreak");
        movies.add("MoneyHeist");
        movies.add("3idiot");
        movies.add("YehJawaniHaiDeewani");
        movies.add("PhirHeraPhir");
        System.out.println("orignal list : "+ movies);

        movies.add("Bahubali");
        movies.add("Harraypotter");
        System.out.println("list after adding two value : " + movies);

        movies.remove(2);
        System.out.println("list after removing third movie : " + movies);

        movies.set(0,"stree2");
        System.out.println("list after updating first movie : " + movies);

        System.out.println("list after using for ech loop : ");
        for(String movie:movies){
            System.out.println(movie);
        }

        int size=movies.size();
        System.out.println("total number of movies : " + size);

    }
}
