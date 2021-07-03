public class FizzBuzz {
    public String play(final int num) {
        if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        return "FizzBuzz";
    }
}
