package fizzbuzz;

public class FizzBuzz {

    public static String play(int value){

        StringBuilder stringBuilder = new StringBuilder();
        for (GameDividers divider : GameDividers.values()) {
            if(value % divider.getDivider() == 0) stringBuilder.append(divider.getResult());
        }

        return stringBuilder.length() != 0 ? stringBuilder.toString() : Integer.toString(value);
    }
}
