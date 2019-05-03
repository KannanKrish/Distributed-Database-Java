package EntityClasses;

import EntityClasses.Departments;
import EntityClasses.Schools;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Offices.class)
public class Offices_ { 

    public static volatile SingularAttribute<Offices, Integer> tacherID;
    public static volatile SingularAttribute<Offices, Schools> schoolID;
    public static volatile SingularAttribute<Offices, Departments> departID;
    public static volatile SingularAttribute<Offices, Integer> officeNO;
    public static volatile SingularAttribute<Offices, Date> officehours;

}