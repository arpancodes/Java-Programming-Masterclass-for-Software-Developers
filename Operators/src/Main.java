public class Main {
    public static void main(String[] args) {
        // Arithmetic Operator

        /*ADDITION*/
        int add = 5 + 1; // addition operator
        System.out.println("5 + 1 = " + add); // 5 + 1 = 6

        add += 8; // Short-hand operator for addition | Same as : add = add + 8
        System.out.println("6 + 8 = "+ add); // 6 + 8 = 14

        add++; // increment operator | same as : add = add + 1
        System.out.println("14 + 1 = "+ add); // 14 + 1 = 15

        /*MULTIPLICATION*/

        int multiply = 6 * 2; // multiplication operator
        System.out.println("6 * 2 = " + multiply); // 6 * 2 = 12

        multiply *= 4; // Short-hand operator for multiplication | Same as : multiply = multiply * 4
        System.out.println("12 * 4 = " + multiply);

        /*SUBTRACTION*/

        int subt = 5 - 1; // Subtraction operator
        System.out.println("5 - 1 = " + subt); // 5 - 1 = 4

        subt -= 8; // Short-hand operator for subtraction | Same as : subt = subt + 8
        System.out.println("4 - 8 = " + subt); // 4 - 8 = -4

        subt--; // decrement operator | same as : subt = subt - 1
        System.out.println("-4 - 1 = " + subt); // -4 - 1 = -5

        /*DIVISION*/

        int div = 6 / 2; // Division operator
        System.out.println("6 /2 = " + div); // 6 / 2 = 3

        div /= 4; // Short-hand operator for Division | Same as : div = div * 4
        System.out.println("3 / 4 = " + div); // 3 / 4 = 0 | integer division

        // Relational Operator

         /* EQUAL TO (==) */
        boolean equalTo = 5==6; // false
        System.out.println(equalTo);

        /* NOT EQUAL TO (!=) */
        boolean notEqual = 5 != 4; // true
        System.out.println(notEqual);

        /* GREATER THAN (>) */
        boolean greater = 6 > 2; // true
        System.out.println(greater);

        /* GREATER THAN OR EQUAL TO (>=) */
        boolean greaterEqual = 5 >= 5; // true
        System.out.println(greaterEqual);

         /* LESSER THAN (<) */
        boolean lesser = 8 < 10; // true
        System.out.println(lesser);

        /* LESSER THAN OR EQUAL TO */
        boolean lesserEqual = 8 <= 8; // true
        System.out.println(lesserEqual);

        // Logical Operator

        /* OR (||) */
        boolean thisOrThat = 50 > 100 || 45 < 50; // true
        System.out.println(thisOrThat);

        /* AND (&&) */
        boolean thisAndThat = 50 > 100 && 45 < 50; // false
        System.out.println(thisAndThat);

        /* NOT (!) */
        boolean notThis = !(50 > 100); // true
        System.out.println(notThis);

    }
}
