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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kannan
 */
@Entity
@Table(name = "Grades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grades.findAll", query = "SELECT g FROM Grades g"),
    @NamedQuery(name = "Grades.findByClassNO", query = "SELECT g FROM Grades g WHERE g.classNO = :classNO"),
    @NamedQuery(name = "Grades.findByStdudentID", query = "SELECT g FROM Grades g WHERE g.studentID = :studentID"),
    @NamedQuery(name = "Grades.findByMark", query = "SELECT g FROM Grades g WHERE g.mark = :mark"),
    @NamedQuery(name = "Grades.findByAttendance", query = "SELECT g FROM Grades g WHERE g.attendance = :attendance")})
public class Grades implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Class_NO")
    private Integer classNO;
    @Column(name = "Mark")
    private Integer mark;
    @Column(name = "Attendance")
    private String attendance;
    @JoinColumn(name = "Class_NO", referencedColumnName = "Class_NO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Classes classes;
    @JoinColumn(name = "Student_ID", referencedColumnName = "Student_ID")
    @OneToOne(optional = false)
    private Students studentID;

    public Grades() {
    }

    public Grades(Integer classNO) {
        this.classNO = classNO;
    }

    public Integer getClassNO() {
        return classNO;
    }

    public void setClassNO(Integer classNO) {
        Integer oldClassNO = this.classNO;
        this.classNO = classNO;
        changeSupport.firePropertyChange("classNO", oldClassNO, classNO);
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        Integer oldMark = this.mark;
        this.mark = mark;
        changeSupport.firePropertyChange("mark", oldMark, mark);
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        String oldAttendance = this.attendance;
        this.attendance = attendance;
        changeSupport.firePropertyChange("attendance", oldAttendance, attendance);
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Students getStudentID() {
        return studentID;
    }

    public void setStudentID(Students studentID) {
        this.studentID = studentID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classNO != null ? classNO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grades)) {
            return false;
        }
        Grades other = (Grades) object;
        if ((this.classNO == null && other.classNO != null) || (this.classNO != null && !this.classNO.equals(other.classNO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return classNO.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
