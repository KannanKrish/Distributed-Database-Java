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
@Table(name = "Departments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departments.findAll", query = "SELECT d FROM Departments d"),
    @NamedQuery(name = "Departments.findByDeptID", query = "SELECT d FROM Departments d WHERE d.deptID = :deptID"),
    @NamedQuery(name = "Departments.findByDeptName", query = "SELECT d FROM Departments d WHERE d.deptName = :deptName")})
public class Departments implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Dept_ID")
    private Integer deptID;
    @Column(name = "Dept_Name")
    private String deptName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departID")
    private List<Offices> officesList;

    public Departments() {
    }

    public Departments(Integer deptID) {
        this.deptID = deptID;
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        Integer oldDeptID = this.deptID;
        this.deptID = deptID;
        changeSupport.firePropertyChange("deptID", oldDeptID, deptID);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        String oldDeptName = this.deptName;
        this.deptName = deptName;
        changeSupport.firePropertyChange("deptName", oldDeptName, deptName);
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
        hash += (deptID != null ? deptID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departments)) {
            return false;
        }
        Departments other = (Departments) object;
        if ((this.deptID == null && other.deptID != null) || (this.deptID != null && !this.deptID.equals(other.deptID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  deptID.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
