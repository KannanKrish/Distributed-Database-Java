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
@Table(name = "Fee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fee.findAll", query = "SELECT f FROM Fee f"),
    @NamedQuery(name = "Fee.findBySchoolID", query = "SELECT f FROM Fee f WHERE f.schoolID = :schoolID"),
    @NamedQuery(name = "Fee.findByStudentID", query = "SELECT f FROM Fee f WHERE f.studentID = :studentID"),
    @NamedQuery(name = "Fee.findByFeeStatus", query = "SELECT f FROM Fee f WHERE f.feeStatus = :feeStatus"),
    @NamedQuery(name = "Fee.findByAmount", query = "SELECT f FROM Fee f WHERE f.amount = :amount"),
    @NamedQuery(name = "Fee.findByYear", query = "SELECT f FROM Fee f WHERE f.year = :year")})
public class Fee implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "School_ID")
    private Integer schoolID;
    @Column(name = "Fee_Status")
    private String feeStatus;
    @Column(name = "Amount")
    private Integer amount;
    @Column(name = "Year")
    @Temporal(TemporalType.DATE)
    private Date year;
    @JoinColumn(name = "Student_ID", referencedColumnName = "Student_ID")
    @ManyToOne(optional = false)
    private Students studentID;

    public Fee() {
    }

    public Fee(Integer schoolID) {
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

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        String oldFeeStatus = this.feeStatus;
        this.feeStatus = feeStatus;
        changeSupport.firePropertyChange("feeStatus", oldFeeStatus, feeStatus);
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        Integer oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        Date oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public Students getStudentID() {
        return studentID;
    }

    public void setStudentID(Students studentID) {
        Students oldStudentID = this.studentID;
        this.studentID = studentID;
        changeSupport.firePropertyChange("studentID", oldStudentID, studentID);
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
        if (!(object instanceof Fee)) {
            return false;
        }
        Fee other = (Fee) object;
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
