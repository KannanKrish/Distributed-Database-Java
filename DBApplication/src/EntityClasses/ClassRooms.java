/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kannan
 */
@Entity
@Table(name = "ClassRooms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClassRooms.findAll", query = "SELECT c FROM ClassRooms c"),
    @NamedQuery(name = "ClassRooms.findByClassRoomNumber", query = "SELECT c FROM ClassRooms c WHERE c.classRoomNumber = :classRoomNumber")})
public class ClassRooms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Class_Room_Number")
    private Integer classRoomNumber;
    @JoinColumn(name = "Class_NO", referencedColumnName = "Class_NO")
    @ManyToOne(optional = false)
    private Classes classNO;
    @JoinColumn(name = "School_ID", referencedColumnName = "School_ID")
    @ManyToOne(optional = false)
    private Schools schoolID;

    public ClassRooms() {
    }

    public ClassRooms(Integer classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    public Integer getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(Integer classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    public Classes getClassNO() {
        return classNO;
    }

    public void setClassNO(Classes classNO) {
        this.classNO = classNO;
    }

    public Schools getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Schools schoolID) {
        this.schoolID = schoolID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classRoomNumber != null ? classRoomNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassRooms)) {
            return false;
        }
        ClassRooms other = (ClassRooms) object;
        if ((this.classRoomNumber == null && other.classRoomNumber != null) || (this.classRoomNumber != null && !this.classRoomNumber.equals(other.classRoomNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return classRoomNumber.toString();
    }

}
