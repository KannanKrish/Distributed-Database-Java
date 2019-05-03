package EntityClasses;

import EntityClasses.Fee;
import EntityClasses.Grades;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Students.class)
public class Students_ { 

    public static volatile SingularAttribute<Students, Integer> studentID;
    public static volatile SingularAttribute<Students, Integer> gradeLevel;
    public static volatile SingularAttribute<Students, String> password;
    public static volatile SingularAttribute<Students, String> address;
    public static volatile SingularAttribute<Students, Integer> phone;
    public static volatile SingularAttribute<Students, String> studentFName;
    public static volatile SingularAttribute<Students, Integer> emergancyPhone;
    public static volatile SingularAttribute<Students, Integer> schoolID;
    public static volatile SingularAttribute<Students, String> studentLName;
    public static volatile SingularAttribute<Students, Grades> grades;
    public static volatile ListAttribute<Students, Fee> feeList;
    public static volatile SingularAttribute<Students, String> email;

}