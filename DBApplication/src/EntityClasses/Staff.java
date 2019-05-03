/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kannan
 */
@Entity
@Table(name = "Staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s"),
    @NamedQuery(name = "Staff.findByStaffID", query = "SELECT s FROM Staff s WHERE s.staffID = :staffID"),
    @NamedQuery(name = "Staff.findByStaffFName", query = "SELECT s FROM Staff s WHERE s.staffFName = :staffFName"),
    @NamedQuery(name = "Staff.findByStaffLName", query = "SELECT s FROM Staff s WHERE s.staffLName = :staffLName"),
    @NamedQuery(name = "Staff.findByEmail", query = "SELECT s FROM Staff s WHERE s.email = :email"),
    @NamedQuery(name = "Staff.findByPassword", query = "SELECT s FROM Staff s WHERE s.password = :password")})
public class Staff implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Staff_ID")
    private Integer staffID;
    @Column(name = "Staff_F_Name")
    private String staffFName;
    @Column(name = "Staff_L_Name")
    private String staffLName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @JoinColumn(name = "Titile", referencedColumnName = "Title")
    @ManyToOne(optional = false)
    private Pay titile;
    @JoinColumn(name = "School_ID", referencedColumnName = "School_ID")
    @ManyToOne(optional = false)
    private Schools schoolID;

    public Staff() {
    }

    public Staff(Integer staffID) {
        this.staffID = staffID;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        Integer oldStaffID = this.staffID;
        this.staffID = staffID;
        changeSupport.firePropertyChange("staffID", oldStaffID, staffID);
    }

    public String getStaffFName() {
        return staffFName;
    }

    public void setStaffFName(String staffFName) {
        String oldStaffFName = this.staffFName;
        this.staffFName = staffFName;
        changeSupport.firePropertyChange("staffFName", oldStaffFName, staffFName);
    }

    public String getStaffLName() {
        return staffLName;
    }

    public void setStaffLName(String staffLName) {
        String oldStaffLName = this.staffLName;
        this.staffLName = staffLName;
        changeSupport.firePropertyChange("staffLName", oldStaffLName, staffLName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public Pay getTitile() {
        return titile;
    }

    public void setTitile(Pay titile) {
        Pay oldTitile = this.titile;
        this.titile = titile;
        changeSupport.firePropertyChange("titile", oldTitile, titile);
    }

    public Schools getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Schools schoolID) {
        Schools oldSchoolID = this.schoolID;
        this.schoolID = schoolID;
        changeSupport.firePropertyChange("schoolID", oldSchoolID, schoolID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffID != null ? staffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffID == null && other.staffID != null) || (this.staffID != null && !this.staffID.equals(other.staffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  staffID.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
