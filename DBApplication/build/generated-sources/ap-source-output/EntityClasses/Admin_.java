package EntityClasses;

import EntityClasses.Pay;
import EntityClasses.Schools;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, String> adminFName;
    public static volatile SingularAttribute<Admin, String> password;
    public static volatile SingularAttribute<Admin, Schools> schoolID;
    public static volatile SingularAttribute<Admin, Integer> adminID;
    public static volatile SingularAttribute<Admin, Pay> title;
    public static volatile SingularAttribute<Admin, String> adminLName;

}