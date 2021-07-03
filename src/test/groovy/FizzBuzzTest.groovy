import org.junit.Before
import org.junit.Test

class FizzBuzzTest {

    def fizzBuzz

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz()
    }

    @Test
    void 'should return Fizz'() {
        assert fizzBuzz.play(3) == 'Fizz'
    }

    @Test
    void 'should return Buzz'() {
        assert fizzBuzz.play(5) == 'Buzz'
    }

    @Test
    void 'should return FizzBuzz'() {
        assert fizzBuzz.play(1) == 'FizzBuzz'
    }
}
