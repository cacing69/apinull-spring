package id.cacing69.apinull;

import id.cacing69.apinull.data.Connection;
import id.cacing69.apinull.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }
// gunakan ini jika tidak ada akses ke kelasnya
//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server(){
        return new Server();
    }
}