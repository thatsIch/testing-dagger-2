package coffee;


import org.assertj.core.api.Assertions;
import org.junit.Test;


public class ElectricHeaterTest
{
	@Test
	public void test_constructingElectricHeater_ShouldWork() throws Exception
	{
		final Heater heater = new ElectricHeater();
		final Heater other = new ElectricHeater();

		Assertions.assertThat( heater )
			.isEqualToComparingFieldByFieldRecursively( other )
			.as( "The constructor of ElectricHeater has no special requirements and should always work." );
	}

	@Test
	public void test_initialElectricHeater_ShouldNotBeHot() throws Exception
	{
		final Heater heater = new ElectricHeater();

		Assertions.assertThat( heater.isHot() )
			.isEqualTo( false )
			.as( "The initial state of the electrical heater should not be hot." );
	}
}
