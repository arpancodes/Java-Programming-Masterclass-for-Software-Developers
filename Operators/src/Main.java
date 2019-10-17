public class Main {
    public static void main(String[] args) {
        int add = 5 + 1; // addition operator
        System.out.println("5 + 1 = " + add); // 5 + 1 = 6
        add += 8; // Short-hand operator for addition | Same as : add = add + 8
        System.out.println("6 + 8 = "+ add); // 6 + 8 = 14
        add++; // increment operator | same as : add = add + 1
        System.out.println("14 + 1 = "+ add); // 14 + 1 = 15

        int multiply = 6 * 2; // multiplication operator
        System.out.println("6 * 2 = " + multiply); // 6 * 2 = 12
        multiply *= 4; // Short-hand operator for multiplication | Same as : multiply = multiply * 4
        System.out.println("12 * 4 = " + multiply);

        int subt = 5 - 1; // Subtraction operator
        System.out.println("5 - 1 = " + subt); // 5 - 1 = 4
        subt -= 8; // Short-hand operator for subtraction | Same as : subt = subt + 8
        System.out.println("4 - 8 = " + subt); // 4 - 8 = -4
        subt--; // decrement operator | same as : subt = subt - 1
        System.out.println("-4 - 1 = " + subt); // -4 - 1 = -5

        int div = 6 / 2; // Division operator
        System.out.println("6 /2 = " + div); // 6 / 2 = 3
        div /= 4; // Short-hand operator for Division | Same as : div = div * 4
        System.out.println("3 / 4 = " + div); // 3 / 4 = 0 | integer division
    }
}
