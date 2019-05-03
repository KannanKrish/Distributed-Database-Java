package EntityClasses;

import EntityClasses.Offices;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Departments.class)
public class Departments_ { 

    public static volatile SingularAttribute<Departments, String> deptName;
    public static volatile ListAttribute<Departments, Offices> officesList;
    public static volatile SingularAttribute<Departments, Integer> deptID;

}