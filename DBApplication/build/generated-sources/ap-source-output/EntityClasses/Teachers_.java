package EntityClasses;

import EntityClasses.Pay;
import EntityClasses.Schools;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Teachers.class)
public class Teachers_ { 

    public static volatile SingularAttribute<Teachers, String> password;
    public static volatile SingularAttribute<Teachers, Integer> teacherID;
    public static volatile SingularAttribute<Teachers, String> address;
    public static volatile SingularAttribute<Teachers, Pay> titile;
    public static volatile SingularAttribute<Teachers, String> teacherFName;
    public static volatile SingularAttribute<Teachers, String> teacherLName;
    public static volatile SingularAttribute<Teachers, Schools> schoolID;
    public static volatile SingularAttribute<Teachers, String> email;

}