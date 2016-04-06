package coffee;


import org.assertj.core.api.Assertions;
import org.junit.Test;


public class ThermosiphonTest
{
	@Test
	public void test_constructingThermosiphon_WithNull_ShouldFail()
	{
		Assertions.assertThatThrownBy( () -> new Thermosiphon( null ) )
			.as( "The constructor should not be able to be initialized with 'null'." )
			.isExactlyInstanceOf( NullPointerException.class );
	}
}
