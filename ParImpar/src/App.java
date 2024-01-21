public class App {
    public static void main(String[] args) throws Exception {

        int number = 3;

        if (number >= 0 && number % 2 == 0) {
            System.out.println(number + " é par e positivo");
        } else if (number >= 0 && number % 2 != 0) {
            System.out.println(number + " é ímpar e positivo");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println(number + " é par e negativo");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println(number + " é ímpar e negativo");
        }
    }
}