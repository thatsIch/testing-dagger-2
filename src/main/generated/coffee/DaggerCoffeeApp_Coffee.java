package coffee;

import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCoffeeApp_Coffee implements CoffeeApp.Coffee {
  private Provider<Heater> provideHeaterProvider;

  private Provider<Thermosiphon> thermosiphonProvider;

  private Provider<Pump> providePumpProvider;

  private Provider<CoffeeMaker> coffeeMakerProvider;

  private DaggerCoffeeApp_Coffee(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CoffeeApp.Coffee create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideHeaterProvider =
        ScopedProvider.create(
            DripCoffeeModule_ProvideHeaterFactory.create(builder.dripCoffeeModule));

    this.thermosiphonProvider = Thermosiphon_Factory.create(provideHeaterProvider);

    this.providePumpProvider =
        PumpModule_ProvidePumpFactory.create(builder.pumpModule, thermosiphonProvider);

    this.coffeeMakerProvider =
        CoffeeMaker_Factory.create(provideHeaterProvider, providePumpProvider);
  }

  @Override
  public CoffeeMaker maker() {
    return coffeeMakerProvider.get();
  }

  public static final class Builder {
    private DripCoffeeModule dripCoffeeModule;

    private PumpModule pumpModule;

    private Builder() {}

    public CoffeeApp.Coffee build() {
      if (dripCoffeeModule == null) {
        this.dripCoffeeModule = new DripCoffeeModule();
      }
      if (pumpModule == null) {
        this.pumpModule = new PumpModule();
      }
      return new DaggerCoffeeApp_Coffee(this);
    }

    public Builder dripCoffeeModule(DripCoffeeModule dripCoffeeModule) {
      this.dripCoffeeModule = Preconditions.checkNotNull(dripCoffeeModule);
      return this;
    }

    public Builder pumpModule(PumpModule pumpModule) {
      this.pumpModule = Preconditions.checkNotNull(pumpModule);
      return this;
    }
  }
}
