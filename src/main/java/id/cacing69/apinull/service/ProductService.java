package id.cacing69.apinull.service;

import id.cacing69.apinull.repository.ProdukRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Lazy
@Component
public class ProductService {

    @Getter
    private ProdukRepository produkRepository;

    @Autowired
    public ProductService(ProdukRepository produkRepository) {
        this.produkRepository = produkRepository;
    }

    public ProductService(ProdukRepository produkRepository, String name) {
        this.produkRepository = produkRepository;
    }
}
