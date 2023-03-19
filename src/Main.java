public class Main {

    public static void main(String[] args) {

        String output = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) { output += "Fizz"; }
            if (i % 5 == 0) { output += "Buzz"; }

            if (output.isBlank()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
            output = "";
        }

    }
}
