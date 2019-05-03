/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kannan
 */
@Entity
@Table(name = "Offices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Offices.findAll", query = "SELECT o FROM Offices o"),
    @NamedQuery(name = "Offices.findByTacherID", query = "SELECT o FROM Offices o WHERE o.tacherID = :tacherID"),
    @NamedQuery(name = "Offices.findByOfficeNO", query = "SELECT o FROM Offices o WHERE o.officeNO = :officeNO"),
    @NamedQuery(name = "Offices.findByOfficehours", query = "SELECT o FROM Offices o WHERE o.officehours = :officehours")})
public class Offices implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Tacher_ID")
    private Integer tacherID;
    @Column(name = "Office_NO")
    private Integer officeNO;
    @Column(name = "Office_hours")
    @Temporal(TemporalType.TIME)
    private Date officehours;
    @JoinColumn(name = "Depart_ID", referencedColumnName = "Dept_ID")
    @ManyToOne(optional = false)
    private Departments departID;
    @JoinColumn(name = "School_ID", referencedColumnName = "School_ID")
    @ManyToOne(optional = false)
    private Schools schoolID;

    public Offices() {
    }

    public Offices(Integer tacherID) {
        this.tacherID = tacherID;
    }

    public Integer getTacherID() {
        return tacherID;
    }

    public void setTacherID(Integer tacherID) {
        Integer oldTacherID = this.tacherID;
        this.tacherID = tacherID;
        changeSupport.firePropertyChange("tacherID", oldTacherID, tacherID);
    }

    public Integer getOfficeNO() {
        return officeNO;
    }

    public void setOfficeNO(Integer officeNO) {
        Integer oldOfficeNO = this.officeNO;
        this.officeNO = officeNO;
        changeSupport.firePropertyChange("officeNO", oldOfficeNO, officeNO);
    }

    public Date getOfficehours() {
        return officehours;
    }

    public void setOfficehours(Date officehours) {
        Date oldOfficehours = this.officehours;
        this.officehours = officehours;
        changeSupport.firePropertyChange("officehours", oldOfficehours, officehours);
    }

    public Departments getDepartID() {
        return departID;
    }

    public void setDepartID(Departments departID) {
        Departments oldDepartID = this.departID;
        this.departID = departID;
        changeSupport.firePropertyChange("departID", oldDepartID, departID);
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
        hash += (tacherID != null ? tacherID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offices)) {
            return false;
        }
        Offices other = (Offices) object;
        if ((this.tacherID == null && other.tacherID != null) || (this.tacherID != null && !this.tacherID.equals(other.tacherID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tacherID.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
