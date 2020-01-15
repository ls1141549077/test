package test.javer;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.javers.core.metamodel.annotation.Id;
import org.javers.core.metamodel.annotation.PropertyName;
import org.jfree.util.UnitType;

/**
 * @Discription
 */
@ToString
@Builder
@Data
public class SkuUnit {
    @DiffIgnore
    private Long id ;
    @PropertyName("单位")
    private String unit ;


    private Double unitNum;


    private Double salePrice ;
    @Id
    private String unitType;



}
