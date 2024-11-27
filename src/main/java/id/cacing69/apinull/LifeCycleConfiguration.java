package id.cacing69.apinull;

import id.cacing69.apinull.data.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }
}