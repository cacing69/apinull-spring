package id.cacing69.apinull;

import id.cacing69.apinull.repository.ProdukRepository;
import id.cacing69.apinull.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentConfigurationTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testScan(){
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService" ,ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection(){
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProdukRepository produkRepository = applicationContext.getBean(ProdukRepository.class);

        Assertions.assertSame(productService.getProdukRepository(), produkRepository);
    }
}
