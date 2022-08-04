public class Main {
    public static void main(String[] args) {

        //task1
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        double[] decimalNumbers = {1.57, 7.654, 9.986};
        char[] charList = {'a', 'b', 'c'};

        task2(numbers, decimalNumbers, charList);
        task3(numbers, decimalNumbers, charList);
        task4(numbers);
    }

    public static void task2(int numbers[], double decimalNumbers[], char charList[]) {

        //1
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
            } else {
                System.out.printf("%d, ", numbers[i]);
            }
        }

        //2
        for (int i = 0; i < decimalNumbers.length; i++) {
            if (i == decimalNumbers.length - 1) {
                System.out.println(decimalNumbers[i]);
            } else {
                System.out.printf("%.3f, ", decimalNumbers[i]);
            }
        }

        //3

        for (int i = 0; i < charList.length; i++) {
            if (i == charList.length - 1) {
                System.out.println(charList[i]);
            } else {
                System.out.printf("%c, ", charList[i]);
            }
        }
    }

    private static void task3(int numbers[], double decimalNumbers[], char charList[]) {
        //1
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.printf("%d, ", numbers[i]);
            }
        }

        //2
        for (int i = decimalNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(decimalNumbers[i]);
            } else {
                System.out.printf("%.3f, ", decimalNumbers[i]);
            }
        }

        //3

        for (int i = charList.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(charList[i]);
            } else {
                System.out.printf("%c, ", charList[i]);
            }
        }
    }

    private static void task4(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
            System.out.print(numbers[i] + " ");
        }
    }
}