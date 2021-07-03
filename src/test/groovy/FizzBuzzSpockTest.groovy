class FizzBuzzSpockTest extends spock.lang.Specification {

    def 'should return fizz'() {

        when: 'We are going to play with 3'
        def fizzBuzz = new FizzBuzz()
        def play = fizzBuzz.play(3)

        then: 'Should be Fizz'
        assert play == 'Fizz'

    }
}
