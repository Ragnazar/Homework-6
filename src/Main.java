public class Main {
    public static void main(String[] args) {
        task1and2();
        task3();
        task4();
    }

    private static void task1and2() {

        //1
        int[] numbers = new int[3];
        byte i = 0;
        while (i < 2) {
            numbers[i] = i + 1;
            System.out.printf("%d, ", numbers[i]);
            i++;
        }
        numbers[2] = 3;
        System.out.println(numbers[2]);

        //2
        double[] decimalNumbers = {1.57, 7.654, 9.986};
        i = 0;
        while (i < 2) {
            System.out.printf("%.3f, ", decimalNumbers[i]);
            i++;
        }
        System.out.printf("%.3f, ", decimalNumbers[2]);
        System.out.println();

        //3
        char[] charList = {'a', 'b', 'c'};
        for (int j = 0; j < 2; j++) {
            System.out.printf("%c, ", charList[j]);
        }
        System.out.println(charList[2]);
    }

    private static void task3() {
        //1
        int[] numbers = new int[3];
        byte i = 2;
        while (i > 0) {
            numbers[i] = i + 1;
            System.out.printf("%d, ", numbers[i]);
            i--;
        }
        numbers[0] = 1;
        System.out.println(numbers[0]);

        //2
        double[] decimalNumbers = {1.57, 7.654, 9.986};
        i = 2;
        while (i > 0) {
            System.out.printf("%.3f, ", decimalNumbers[i]);
            i--;
        }
        System.out.printf("%.3f, ", decimalNumbers[0]);
        System.out.println();

        //3
        char[] charList = {'a', 'b', 'c'};
        for (int j = 2; j > 0; j--) {
            System.out.printf("%c, ", charList[j]);
        }
        System.out.println(charList[0]);
    }

    private static void task4() {
        int[] numbers = new int[3];
        for (byte i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (byte j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 != 0) {
                numbers[j] = numbers[j] + 1;
            }
            System.out.print(numbers[j] + " ");
        }
    }
}