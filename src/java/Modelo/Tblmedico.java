/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DANIEL
 */
@Entity
@Table(name = "tblmedico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblmedico.findAll", query = "SELECT t FROM Tblmedico t")
    , @NamedQuery(name = "Tblmedico.findById", query = "SELECT t FROM Tblmedico t WHERE t.id = :id")
    , @NamedQuery(name = "Tblmedico.findByNombre", query = "SELECT t FROM Tblmedico t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tblmedico.findByApellido", query = "SELECT t FROM Tblmedico t WHERE t.apellido = :apellido")
    , @NamedQuery(name = "Tblmedico.findByEstado", query = "SELECT t FROM Tblmedico t WHERE t.estado = :estado")})
public class Tblmedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "Apellido")
    private String apellido;
    @Size(max = 15)
    @Column(name = "Estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fKIdtblmedico")
    private Collection<Tblagenda> tblagendaCollection;

    public Tblmedico() {
    }

    public Tblmedico(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Tblagenda> getTblagendaCollection() {
        return tblagendaCollection;
    }

    public void setTblagendaCollection(Collection<Tblagenda> tblagendaCollection) {
        this.tblagendaCollection = tblagendaCollection;
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
        if (!(object instanceof Tblmedico)) {
            return false;
        }
        Tblmedico other = (Tblmedico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Tblmedico[ id=" + id + " ]";
    }
    
}
