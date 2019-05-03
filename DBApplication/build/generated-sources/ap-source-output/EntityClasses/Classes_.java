package EntityClasses;

import EntityClasses.ClassRooms;
import EntityClasses.Grades;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Classes.class)
public class Classes_ { 

    public static volatile SingularAttribute<Classes, Date> classEndTime;
    public static volatile SingularAttribute<Classes, Integer> classNO;
    public static volatile SingularAttribute<Classes, String> className;
    public static volatile SingularAttribute<Classes, Date> classBeginTime;
    public static volatile SingularAttribute<Classes, Grades> grades;
    public static volatile ListAttribute<Classes, ClassRooms> classRoomsList;

}