package id.cacing69.apinull;

import id.cacing69.apinull.configuration.BarConfiguration;
import id.cacing69.apinull.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
