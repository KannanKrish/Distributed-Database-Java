/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kannan
 */
@Entity
@Table(name = "Classes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c"),
    @NamedQuery(name = "Classes.findByClassNO", query = "SELECT c FROM Classes c WHERE c.classNO = :classNO"),
    @NamedQuery(name = "Classes.findByClassName", query = "SELECT c FROM Classes c WHERE c.className = :className"),
    @NamedQuery(name = "Classes.findByClassBeginTime", query = "SELECT c FROM Classes c WHERE c.classBeginTime = :classBeginTime"),
    @NamedQuery(name = "Classes.findByClassEndTime", query = "SELECT c FROM Classes c WHERE c.classEndTime = :classEndTime")})
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Class_NO")
    private Integer classNO;
    @Column(name = "Class_Name")
    private String className;
    @Column(name = "Class_Begin_Time")
    @Temporal(TemporalType.TIME)
    private Date classBeginTime;
    @Column(name = "Class_End_Time")
    @Temporal(TemporalType.TIME)
    private Date classEndTime;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "classes")
    private Grades grades;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classNO")
    private List<ClassRooms> classRoomsList;

    public Classes() {
    }

    public Classes(Integer classNO) {
        this.classNO = classNO;
    }

    public Integer getClassNO() {
        return classNO;
    }

    public void setClassNO(Integer classNO) {
        this.classNO = classNO;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getClassBeginTime() {
        return classBeginTime;
    }

    public void setClassBeginTime(Date classBeginTime) {
        this.classBeginTime = classBeginTime;
    }

    public Date getClassEndTime() {
        return classEndTime;
    }

    public void setClassEndTime(Date classEndTime) {
        this.classEndTime = classEndTime;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    @XmlTransient
    public List<ClassRooms> getClassRoomsList() {
        return classRoomsList;
    }

    public void setClassRoomsList(List<ClassRooms> classRoomsList) {
        this.classRoomsList = classRoomsList;
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
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.classNO == null && other.classNO != null) || (this.classNO != null && !this.classNO.equals(other.classNO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return classNO.toString();
    }
    
}
