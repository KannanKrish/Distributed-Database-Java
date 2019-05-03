package EntityClasses;

import EntityClasses.Students;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Fee.class)
public class Fee_ { 

    public static volatile SingularAttribute<Fee, Students> studentID;
    public static volatile SingularAttribute<Fee, Integer> amount;
    public static volatile SingularAttribute<Fee, Date> year;
    public static volatile SingularAttribute<Fee, Integer> schoolID;
    public static volatile SingularAttribute<Fee, String> feeStatus;

}