package id.cacing69.apinull;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "id.cacing69.apinull.configuration"
})
public class ScanConfiguration {
}
