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
@Table(name = "Teachers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teachers.findAll", query = "SELECT t FROM Teachers t"),
    @NamedQuery(name = "Teachers.findByTeacherID", query = "SELECT t FROM Teachers t WHERE t.teacherID = :teacherID"),
    @NamedQuery(name = "Teachers.findByTeacherFName", query = "SELECT t FROM Teachers t WHERE t.teacherFName = :teacherFName"),
    @NamedQuery(name = "Teachers.findByTeacherLName", query = "SELECT t FROM Teachers t WHERE t.teacherLName = :teacherLName"),
    @NamedQuery(name = "Teachers.findByEmail", query = "SELECT t FROM Teachers t WHERE t.email = :email"),
    @NamedQuery(name = "Teachers.findByAddress", query = "SELECT t FROM Teachers t WHERE t.address = :address"),
    @NamedQuery(name = "Teachers.findByPassword", query = "SELECT t FROM Teachers t WHERE t.password = :password")})
public class Teachers implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Teacher_ID")
    private Integer teacherID;
    @Column(name = "Teacher_F_Name")
    private String teacherFName;
    @Basic(optional = false)
    @Column(name = "Teacher_L_Name")
    private String teacherLName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @JoinColumn(name = "Titile", referencedColumnName = "Title")
    @ManyToOne(optional = false)
    private Pay titile;
    @JoinColumn(name = "School_ID", referencedColumnName = "School_ID")
    @ManyToOne(optional = false)
    private Schools schoolID;

    public Teachers() {
    }

    public Teachers(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public Teachers(Integer teacherID, String teacherLName, String password) {
        this.teacherID = teacherID;
        this.teacherLName = teacherLName;
        this.password = password;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        Integer oldTeacherID = this.teacherID;
        this.teacherID = teacherID;
        changeSupport.firePropertyChange("teacherID", oldTeacherID, teacherID);
    }

    public String getTeacherFName() {
        return teacherFName;
    }

    public void setTeacherFName(String teacherFName) {
        String oldTeacherFName = this.teacherFName;
        this.teacherFName = teacherFName;
        changeSupport.firePropertyChange("teacherFName", oldTeacherFName, teacherFName);
    }

    public String getTeacherLName() {
        return teacherLName;
    }

    public void setTeacherLName(String teacherLName) {
        String oldTeacherLName = this.teacherLName;
        this.teacherLName = teacherLName;
        changeSupport.firePropertyChange("teacherLName", oldTeacherLName, teacherLName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
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
        hash += (teacherID != null ? teacherID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teachers)) {
            return false;
        }
        Teachers other = (Teachers) object;
        if ((this.teacherID == null && other.teacherID != null) || (this.teacherID != null && !this.teacherID.equals(other.teacherID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return teacherID.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
