package fizzbuzz;

public enum GameDividers {
    THREE(3, "Fizz"),
    FIVE(5, "Buzz");

    private final int divider;
    private final String result;

    GameDividers(int divider, String result) {
        this.divider = divider;
        this.result = result;
    }

    public int getDivider() {
        return divider;
    }

    public String getResult() {
        return result;
    }
}
