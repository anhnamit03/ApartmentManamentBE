/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hoang
 */
@Entity
@Table(name = "surveyform")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Surveyform.findAll", query = "SELECT s FROM Surveyform s"),
    @NamedQuery(name = "Surveyform.findById", query = "SELECT s FROM Surveyform s WHERE s.id = :id"),
    @NamedQuery(name = "Surveyform.findByInnitiatedDate", query = "SELECT s FROM Surveyform s WHERE s.innitiatedDate = :innitiatedDate"),
    @NamedQuery(name = "Surveyform.findByDescription", query = "SELECT s FROM Surveyform s WHERE s.description = :description")})
public class Surveyform implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "innitiated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date innitiatedDate;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;
    @OneToMany(mappedBy = "idSurveryform")
    private Set<Question> questionSet;

    public Surveyform() {
    }

    public Surveyform(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInnitiatedDate() {
        return innitiatedDate;
    }

    public void setInnitiatedDate(Date innitiatedDate) {
        this.innitiatedDate = innitiatedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(Set<Question> questionSet) {
        this.questionSet = questionSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Surveyform)) {
            return false;
        }
        Surveyform other = (Surveyform) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hvn.pojo.Surveyform[ id=" + id + " ]";
    }
    
}
