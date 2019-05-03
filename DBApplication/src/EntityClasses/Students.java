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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kannan
 */
@Entity
@Table(name = "Students")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s"),
    @NamedQuery(name = "Students.findByStudentID", query = "SELECT s FROM Students s WHERE s.studentID = :studentID"),
    @NamedQuery(name = "Students.findByStudentFName", query = "SELECT s FROM Students s WHERE s.studentFName = :studentFName"),
    @NamedQuery(name = "Students.findByStudentLName", query = "SELECT s FROM Students s WHERE s.studentLName = :studentLName"),
    @NamedQuery(name = "Students.findByAddress", query = "SELECT s FROM Students s WHERE s.address = :address"),
    @NamedQuery(name = "Students.findByEmail", query = "SELECT s FROM Students s WHERE s.email = :email"),
    @NamedQuery(name = "Students.findByPhone", query = "SELECT s FROM Students s WHERE s.phone = :phone"),
    @NamedQuery(name = "Students.findByEmergancyPhone", query = "SELECT s FROM Students s WHERE s.emergancyPhone = :emergancyPhone"),
    @NamedQuery(name = "Students.findByGradeLevel", query = "SELECT s FROM Students s WHERE s.gradeLevel = :gradeLevel"),
    @NamedQuery(name = "Students.findByPassword", query = "SELECT s FROM Students s WHERE s.password = :password"),
    @NamedQuery(name = "Students.findBySchoolID", query = "SELECT s FROM Students s WHERE s.schoolID = :schoolID")})
public class Students implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Student_ID")
    private Integer studentID;
    @Column(name = "Student_F_Name")
    private String studentFName;
    @Column(name = "Student_L_Name")
    private String studentLName;
    @Column(name = "Address")
    private String address;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone")
    private Integer phone;
    @Column(name = "Emergancy_Phone")
    private Integer emergancyPhone;
    @Column(name = "Grade_Level")
    private Integer gradeLevel;
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "School_ID")
    private int schoolID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "studentID")
    private Grades grades;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentID")
    private List<Fee> feeList;

    public Students() {
    }

    public Students(Integer studentID) {
        this.studentID = studentID;
    }

    public Students(Integer studentID, int schoolID) {
        this.studentID = studentID;
        this.schoolID = schoolID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        Integer oldStudentID = this.studentID;
        this.studentID = studentID;
        changeSupport.firePropertyChange("studentID", oldStudentID, studentID);
    }

    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        String oldStudentFName = this.studentFName;
        this.studentFName = studentFName;
        changeSupport.firePropertyChange("studentFName", oldStudentFName, studentFName);
    }

    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        String oldStudentLName = this.studentLName;
        this.studentLName = studentLName;
        changeSupport.firePropertyChange("studentLName", oldStudentLName, studentLName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        Integer oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public Integer getEmergancyPhone() {
        return emergancyPhone;
    }

    public void setEmergancyPhone(Integer emergancyPhone) {
        Integer oldEmergancyPhone = this.emergancyPhone;
        this.emergancyPhone = emergancyPhone;
        changeSupport.firePropertyChange("emergancyPhone", oldEmergancyPhone, emergancyPhone);
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        Integer oldGradeLevel = this.gradeLevel;
        this.gradeLevel = gradeLevel;
        changeSupport.firePropertyChange("gradeLevel", oldGradeLevel, gradeLevel);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        int oldSchoolID = this.schoolID;
        this.schoolID = schoolID;
        changeSupport.firePropertyChange("schoolID", oldSchoolID, schoolID);
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    @XmlTransient
    public List<Fee> getFeeList() {
        return feeList;
    }

    public void setFeeList(List<Fee> feeList) {
        this.feeList = feeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentID != null ? studentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.studentID == null && other.studentID != null) || (this.studentID != null && !this.studentID.equals(other.studentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return studentID.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
