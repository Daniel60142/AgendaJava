/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DANIEL
 */
@Entity
@Table(name = "tblagenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblagenda.findAll", query = "SELECT t FROM Tblagenda t")
    , @NamedQuery(name = "Tblagenda.findById", query = "SELECT t FROM Tblagenda t WHERE t.id = :id")
    , @NamedQuery(name = "Tblagenda.findByFecha", query = "SELECT t FROM Tblagenda t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "Tblagenda.findByHoraInicio", query = "SELECT t FROM Tblagenda t WHERE t.horaInicio = :horaInicio")
    , @NamedQuery(name = "Tblagenda.findByHoraFin", query = "SELECT t FROM Tblagenda t WHERE t.horaFin = :horaFin")
    , @NamedQuery(name = "Tblagenda.findByTelefonoPaciente", query = "SELECT t FROM Tblagenda t WHERE t.telefonoPaciente = :telefonoPaciente")
    , @NamedQuery(name = "Tblagenda.findByCorreoPaciente", query = "SELECT t FROM Tblagenda t WHERE t.correoPaciente = :correoPaciente")})
public class Tblagenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "HoraInicio")
    @Temporal(TemporalType.DATE)
    private Date horaInicio;
    @Column(name = "HoraFin")
    @Temporal(TemporalType.DATE)
    private Date horaFin;
    @Size(max = 20)
    @Column(name = "TelefonoPaciente")
    private String telefonoPaciente;
    @Size(max = 100)
    @Column(name = "CorreoPaciente")
    private String correoPaciente;
    @JoinColumn(name = "FKId_tblmedico", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Tblmedico fKIdtblmedico;
    @JoinColumn(name = "FKId_tblusuariopaciente", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Tblusuariopaciente fKIdtblusuariopaciente;

    public Tblagenda() {
    }

    public Tblagenda(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public String getCorreoPaciente() {
        return correoPaciente;
    }

    public void setCorreoPaciente(String correoPaciente) {
        this.correoPaciente = correoPaciente;
    }

    public Tblmedico getFKIdtblmedico() {
        return fKIdtblmedico;
    }

    public void setFKIdtblmedico(Tblmedico fKIdtblmedico) {
        this.fKIdtblmedico = fKIdtblmedico;
    }

    public Tblusuariopaciente getFKIdtblusuariopaciente() {
        return fKIdtblusuariopaciente;
    }

    public void setFKIdtblusuariopaciente(Tblusuariopaciente fKIdtblusuariopaciente) {
        this.fKIdtblusuariopaciente = fKIdtblusuariopaciente;
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
        if (!(object instanceof Tblagenda)) {
            return false;
        }
        Tblagenda other = (Tblagenda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Tblagenda[ id=" + id + " ]";
    }
    
}
