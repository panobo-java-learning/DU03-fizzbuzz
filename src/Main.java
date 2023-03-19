public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String output = markFizzBuzz(i);

            System.out.println(
                    output.isBlank() ? i : output
            );
        }
    }

    public static String markFizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) { result += "Fizz"; }
        if (number % 5 == 0) { result += "Buzz"; }
        return result;
    }
}
