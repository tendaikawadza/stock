package Repository;


import Model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType,Integer >{


      public ProductType findByProductCode(Integer productCode);

}
