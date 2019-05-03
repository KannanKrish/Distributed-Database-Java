/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kannan
 */
@Entity
@Table(name = "Schools")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Schools.findAll", query = "SELECT s FROM Schools s"),
    @NamedQuery(name = "Schools.findBySchoolID", query = "SELECT s FROM Schools s WHERE s.schoolID = :schoolID"),
    @NamedQuery(name = "Schools.findBySchoolName", query = "SELECT s FROM Schools s WHERE s.schoolName = :schoolName"),
    @NamedQuery(name = "Schools.findBySchoolType", query = "SELECT s FROM Schools s WHERE s.schoolType = :schoolType")})
public class Schools implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "School_ID")
    private Integer schoolID;
    @Column(name = "School_Name")
    private String schoolName;
    @Column(name = "School_Type")
    private String schoolType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schoolID")
    private List<Teachers> teachersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schoolID")
    private List<Staff> staffList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schoolID")
    private List<ClassRooms> classRoomsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schoolID")
    private List<Admin> adminList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schoolID")
    private List<Offices> officesList;

    public Schools() {
    }

    public Schools(Integer schoolID) {
        this.schoolID = schoolID;
    }

    public Integer getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Integer schoolID) {
        Integer oldSchoolID = this.schoolID;
        this.schoolID = schoolID;
        changeSupport.firePropertyChange("schoolID", oldSchoolID, schoolID);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        String oldSchoolName = this.schoolName;
        this.schoolName = schoolName;
        changeSupport.firePropertyChange("schoolName", oldSchoolName, schoolName);
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        String oldSchoolType = this.schoolType;
        this.schoolType = schoolType;
        changeSupport.firePropertyChange("schoolType", oldSchoolType, schoolType);
    }

    @XmlTransient
    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teachers> teachersList) {
        this.teachersList = teachersList;
    }

    @XmlTransient
    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    @XmlTransient
    public List<ClassRooms> getClassRoomsList() {
        return classRoomsList;
    }

    public void setClassRoomsList(List<ClassRooms> classRoomsList) {
        this.classRoomsList = classRoomsList;
    }

    @XmlTransient
    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }

    @XmlTransient
    public List<Offices> getOfficesList() {
        return officesList;
    }

    public void setOfficesList(List<Offices> officesList) {
        this.officesList = officesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolID != null ? schoolID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Schools)) {
            return false;
        }
        Schools other = (Schools) object;
        if ((this.schoolID == null && other.schoolID != null) || (this.schoolID != null && !this.schoolID.equals(other.schoolID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return schoolID.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
