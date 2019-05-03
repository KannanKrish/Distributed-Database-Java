package EntityClasses;

import EntityClasses.Admin;
import EntityClasses.ClassRooms;
import EntityClasses.Offices;
import EntityClasses.Staff;
import EntityClasses.Teachers;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-19T17:46:47")
@StaticMetamodel(Schools.class)
public class Schools_ { 

    public static volatile ListAttribute<Schools, Offices> officesList;
    public static volatile ListAttribute<Schools, Admin> adminList;
    public static volatile SingularAttribute<Schools, Integer> schoolID;
    public static volatile SingularAttribute<Schools, String> schoolType;
    public static volatile ListAttribute<Schools, Teachers> teachersList;
    public static volatile SingularAttribute<Schools, String> schoolName;
    public static volatile ListAttribute<Schools, Staff> staffList;
    public static volatile ListAttribute<Schools, ClassRooms> classRoomsList;

}