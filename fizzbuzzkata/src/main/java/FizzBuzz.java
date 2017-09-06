public class FizzBuzz {

    public static String play(int value){
        if (value % 3 == 0) return "Fizz";
        else if (value % 5 == 0) return "Buzz";
        return Integer.toString(value);
    }
}
