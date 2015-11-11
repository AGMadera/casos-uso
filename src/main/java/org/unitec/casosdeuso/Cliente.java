/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.casosdeuso;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alfonsogalvanmadera
 */
@Entity
@Table(name = "cliente")

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "idCliente")
    private Collection<Destino> destinoCollection;
    @OneToMany(mappedBy = "idCliente")
    private Collection<Tarjeta> tarjetaCollection;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Destino> getDestinoCollection() {
        return destinoCollection;
    }

    public void setDestinoCollection(Collection<Destino> destinoCollection) {
        this.destinoCollection = destinoCollection;
    }

    public Collection<Tarjeta> getTarjetaCollection() {
        return tarjetaCollection;
    }

    public void setTarjetaCollection(Collection<Tarjeta> tarjetaCollection) {
        this.tarjetaCollection = tarjetaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.unitec.casosdeuso.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
