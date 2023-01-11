package Service;


import Model.ProductType;
import Repository.ProductRepository;
import Repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;


    public ProductType getProductTypeByCode(Integer productCode) {

        ProductType ProductType = productTypeRepository.findByProductCode(productCode);

        return ProductType;
    }


}













