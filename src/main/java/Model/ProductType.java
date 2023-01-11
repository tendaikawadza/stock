package Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class ProductType  implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(nullable = false, updatable = false)
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private Integer id;

  private Integer ProductCode;

  private String name;
}
