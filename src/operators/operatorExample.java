package operators;

public class operatorExample {
    public static void main(String[] args) {
        System.out.println("Arithmatic operator");

        int a = 15; // datatypes, variable, data value
        int b = 4; // declaration and initialization

        System.out.println("a+b= " + (a+b)); //addition
        System.out.println("a-b= " + (a-b)); // sub
        System.out.println("a*b= " + (a*b)); // multipilcation
        System.out.println("a/b= " + (a/b)); // devides
        System.out.println("a%b= " + (a%b)); // gives remiander


        System.out.println();
        System.out.println("a = "+ a);
        System.out.println("unary operator");
        // ++a
        // a++
        System.out.println("postincreament : " +  (a++));   //15>16
        System.out.println("preincreament : " +  (++a));   //16>17

        System.out.println("a = "+ a); //17 `

        System.out.println("predecreamnet : " +  (a--));  //17>16
        System.out.println("predecreament : " +  (--a));  //16>15


        System.out.println();

        System.out.println("Assignment operator");


        System.out.println(a); //15
        System.out.println("a += 4: " + (a += 4));
        System.out.println("a -= 5: " + (a -= 5));
        System.out.println("a *= 2: " + (a *= 5));
        System.out.println("a /= 3: " + (a /= 3)); //23
        System.out.println("a %= 2: " + (a  %= 4));
        System.out.println(a);

        System.out.println("Relational operator / equality, greater than, and less than");

        int x = 15;
        int y = 12;


        System.out.println("x==y :" + (x==y));
        System.out.println("x!=y :" + (x!=y));
        System.out.println("x>y  :" + (x>y));
        System.out.println("x<y  :" + (x<y));
        System.out.println("x>=y :" + (x>=y));
        System.out.println("x<=y :" + (x<=y));

        System.out.println("Logical operator");

        //        &&, Logical AND: returns true when both conditions are true.
        //       ||, Logical OR: returns true if at least one condition is true.
        //       !, Logical NOT: returns true when a condition is false and vice-versa

        boolean j = true;
        boolean k = false;

        System.out.println("j && k  : " + (j && k)); // false
        System.out.println("j || k  : " + (j || k));  // true
        System.out.println("!j    :"    + (!j));   // it gives opposite
        System.out.println("!k    :"    + (!k));



        System.out.println("shift operator");



    }
}
