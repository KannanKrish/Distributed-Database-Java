package EntityClasses;

import EntityClasses.Classes;
import EntityClasses.Students;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Grades.class)
public class Grades_ { 

    public static volatile SingularAttribute<Grades, Students> studentID;
    public static volatile SingularAttribute<Grades, Classes> classes;
    public static volatile SingularAttribute<Grades, Integer> classNO;
    public static volatile SingularAttribute<Grades, Integer> mark;
    public static volatile SingularAttribute<Grades, String> attendance;

}