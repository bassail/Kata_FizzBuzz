import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_same_number_if_not_dividable_by_3_5_or_15() throws Exception {
        assertThat(FizzBuzz.play(1)).isEqualTo("1");
        assertThat(FizzBuzz.play(7)).isEqualTo("7");
        assertThat(FizzBuzz.play(8)).isEqualTo("8");
    }

    @Test
    public void should_return_Fizz_if_number_is_dividable_by_3() throws Exception {
        assertThat(FizzBuzz.play(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.play(9)).isEqualTo("Fizz");
        assertThat(FizzBuzz.play(33)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Fizz_if_number_is_dividable_by_5() throws Exception {
        assertThat(FizzBuzz.play(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.play(10)).isEqualTo("Buzz");
        assertThat(FizzBuzz.play(20)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Fizz_if_number_is_dividable_by_15() throws Exception {
        assertThat(FizzBuzz.play(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.play(30)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.play(45)).isEqualTo("FizzBuzz");
    }
}
