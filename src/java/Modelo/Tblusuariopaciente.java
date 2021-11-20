/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DANIEL
 */
@Entity
@Table(name = "tblusuariopaciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblusuariopaciente.findAll", query = "SELECT t FROM Tblusuariopaciente t")
    , @NamedQuery(name = "Tblusuariopaciente.findById", query = "SELECT t FROM Tblusuariopaciente t WHERE t.id = :id")
    , @NamedQuery(name = "Tblusuariopaciente.findByNombre", query = "SELECT t FROM Tblusuariopaciente t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tblusuariopaciente.findByApellido", query = "SELECT t FROM Tblusuariopaciente t WHERE t.apellido = :apellido")
    , @NamedQuery(name = "Tblusuariopaciente.findByCorreo", query = "SELECT t FROM Tblusuariopaciente t WHERE t.correo = :correo")
    , @NamedQuery(name = "Tblusuariopaciente.findByPassword", query = "SELECT t FROM Tblusuariopaciente t WHERE t.password = :password")
    , @NamedQuery(name = "Tblusuariopaciente.findByTelefono", query = "SELECT t FROM Tblusuariopaciente t WHERE t.telefono = :telefono")
    , @NamedQuery(name = "Tblusuariopaciente.findByDireccion", query = "SELECT t FROM Tblusuariopaciente t WHERE t.direccion = :direccion")
    , @NamedQuery(name = "Tblusuariopaciente.findByFechaCreacion", query = "SELECT t FROM Tblusuariopaciente t WHERE t.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Tblusuariopaciente.findByFechaUltimoIngreso", query = "SELECT t FROM Tblusuariopaciente t WHERE t.fechaUltimoIngreso = :fechaUltimoIngreso")})
public class Tblusuariopaciente implements Serializable {

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
    @Size(max = 100)
    @Column(name = "Correo")
    private String correo;
    @Size(max = 100)
    @Column(name = "Password")
    private String password;
    @Size(max = 20)
    @Column(name = "Telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "FechaUltimoIngreso")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoIngreso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fKIdtblusuariopaciente")
    private Collection<Tblagenda> tblagendaCollection;

    public Tblusuariopaciente() {
    }

    public Tblusuariopaciente(Integer id) {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltimoIngreso() {
        return fechaUltimoIngreso;
    }

    public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
        this.fechaUltimoIngreso = fechaUltimoIngreso;
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
        if (!(object instanceof Tblusuariopaciente)) {
            return false;
        }
        Tblusuariopaciente other = (Tblusuariopaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Tblusuariopaciente[ id=" + id + " ]";
    }
    
}
