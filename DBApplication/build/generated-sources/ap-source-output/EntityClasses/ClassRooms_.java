package EntityClasses;

import EntityClasses.Classes;
import EntityClasses.Schools;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(ClassRooms.class)
public class ClassRooms_ { 

    public static volatile SingularAttribute<ClassRooms, Schools> schoolID;
    public static volatile SingularAttribute<ClassRooms, Integer> classRoomNumber;
    public static volatile SingularAttribute<ClassRooms, Classes> classNO;

}