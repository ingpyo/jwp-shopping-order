package cart.application.service.product;

import cart.application.repository.product.ProductRepository;
import cart.application.service.product.dto.ProductResultDto;
import cart.domain.product.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class ProductReadService {

    private final ProductRepository productRepository;

    public ProductReadService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductResultDto> getAllProducts() {
        final List<Product> products = productRepository.findAll();

        return products.stream().map(ProductResultDto::of).collect(Collectors.toList());
    }

    public ProductResultDto getProductById(Long productId) {
        final Product product = productRepository.getById(productId);

        return ProductResultDto.of(product);
    }

}
