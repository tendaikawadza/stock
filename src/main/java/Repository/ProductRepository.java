package Repository;

import Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long>{


    Product findProductByproductName    (String productName);
    Product findProductCode (int  productCode);


}
