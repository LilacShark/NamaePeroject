package marker.test.service;

import marker.test.dao.ProductRepository;
import marker.test.domain.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<Products> findAllProducts() {

        return productRepository.findAll();

    }

}
