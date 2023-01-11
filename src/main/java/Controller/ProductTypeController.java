package Controller;

import Model.ProductType;
import Service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producttype")
public class ProductTypeController {
    @Autowired
    ProductTypeService productTypeService;

    @GetMapping("/get/{productCode}")
    public ProductType getProductCode( @PathVariable("productCode") Integer productCode) {
        ProductType productType =  productTypeService.getProductTypeByCode(productCode);
        return productType;
    }


}
