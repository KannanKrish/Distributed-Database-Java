package EntityClasses;

import EntityClasses.Pay;
import EntityClasses.Schools;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile SingularAttribute<Staff, String> password;
    public static volatile SingularAttribute<Staff, Pay> titile;
    public static volatile SingularAttribute<Staff, Schools> schoolID;
    public static volatile SingularAttribute<Staff, String> staffLName;
    public static volatile SingularAttribute<Staff, String> staffFName;
    public static volatile SingularAttribute<Staff, Integer> staffID;
    public static volatile SingularAttribute<Staff, String> email;

}