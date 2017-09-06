import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_same_number_if_not_dividable_by_3_5_or_15() throws Exception {
        Assertions.assertThat(FizzBuzz.play(0)).isEqualTo("0");
    }
}
