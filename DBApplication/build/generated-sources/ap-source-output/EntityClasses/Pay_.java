package EntityClasses;

import EntityClasses.Admin;
import EntityClasses.Staff;
import EntityClasses.Teachers;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Pay.class)
public class Pay_ { 

    public static volatile ListAttribute<Pay, Admin> adminList;
    public static volatile ListAttribute<Pay, Teachers> teachersList;
    public static volatile SingularAttribute<Pay, String> title;
    public static volatile SingularAttribute<Pay, Integer> salary;
    public static volatile ListAttribute<Pay, Staff> staffList;

}