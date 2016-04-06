package coffee;


import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;


public class ThermosiphonTest
{
	@Test
	public void test_constructingThermosiphon_WithNull_ShouldFail()
	{
		Assertions.assertThatThrownBy( () -> new Thermosiphon( null ) )
			.as( "The constructor should not be able to be initialized with 'null'." )
			.isExactlyInstanceOf( NullPointerException.class );
	}

	@Test
	public void test_constructingThermoshiphon_WithHeater_ShouldWork() throws Exception
	{
		final Heater heaterMock = Mockito.mock( Heater.class );

		Assertions.assertThat( new Thermosiphon( heaterMock ) )
			.isEqualToComparingFieldByFieldRecursively( new Thermosiphon( heaterMock ) )
			.as( "Both thermosiphons use the same heater and should be the same and not 'null'." );
	}
}
