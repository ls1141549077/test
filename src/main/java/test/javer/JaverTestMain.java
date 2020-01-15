package test.javer;

import org.javers.common.collections.Lists;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.javers.core.diff.ListCompareAlgorithm;
import org.javers.core.diff.changetype.NewObject;
import org.javers.core.diff.changetype.ObjectRemoved;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Discription
 */
public class JaverTestMain {

    public static void main(String[] args) {

        SkuUnit unit = SkuUnit.builder().unitNum(1d).salePrice(2.0d).unit("ge").unitType("1").id(1l).build();
        SkuUnit unit2 = SkuUnit.builder().unitNum(3d).salePrice(3.0d).unit("de").unitType("3").build();
        List<SkuUnit> oldList = Lists.asList(unit, unit2);
        SkuUnit unit1 = SkuUnit.builder().unitNum(2d).salePrice(3.0d).unit("ge").unitType("1").id(2l).build();
         SkuUnit unit3 = SkuUnit.builder().unitNum(3d).salePrice(3.0d).unit("de").unitType("3").build();
         SkuUnit unit4 = SkuUnit.builder().unitNum(2d).salePrice(3.0d).unit("me").unitType("4").build();
        //List<SkuUnit> newList =  Lists.asList(unit1,unit3,unit4);
        List<SkuUnit> newList =  Lists.asList(unit1);
        //Javers javers = JaversBuilder.javers().withListCompareAlgorithm(ListCompareAlgorithm.LEVENSHTEIN_DISTANCE).build();
       Javers javers = JaversBuilder.javers().build();
        Diff diff = javers.compareCollections(oldList, newList,SkuUnit.class);
        List<NewObject> changesByType = diff.getChangesByType(NewObject.class);
        List<ObjectRemoved> removes = diff.getChangesByType(ObjectRemoved.class);
        for(NewObject object : changesByType){
            Optional<Object> affectedObject = object.getAffectedObject();
            SkuUnit skuUnit= (SkuUnit)affectedObject.get();
            System.out.println(affectedObject);
        }

        for (ObjectRemoved remove : removes) {
            Optional<Object> affectedObject = remove.getAffectedObject();
            SkuUnit skuUnit= (SkuUnit)affectedObject.get();
            System.out.println(affectedObject);
        }


        System.out.println(1);

    }

}
