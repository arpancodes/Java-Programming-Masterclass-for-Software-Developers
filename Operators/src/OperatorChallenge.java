public class OperatorChallenge {
    public static void main(String[] args) {
        double number1 = 20.0;
        double number2 = 80.0;
        double addAndMultiply = (number1 + number2) * 100;
        double remainder = addAndMultiply%40;
        boolean checkRemainder = remainder == 0 ? true :  false;
        System.out.println(checkRemainder);
        if (!checkRemainder){
            System.out.println("Got some remainder");
        }
    }
}
