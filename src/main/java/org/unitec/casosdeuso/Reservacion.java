/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.casosdeuso;

/**
 *
 * @author alfonsogalvanmadera
 */
public class Reservacion {
    private Cliente clientesito;
    private Destino destinito;
    private Tarjeta tarjetucha;

    public Cliente getClientesito() {
        return clientesito;
    }

    public void setClientesito(Cliente clientesito) {
        this.clientesito = clientesito;
    }

    public Destino getDestinito() {
        return destinito;
    }

    public void setDestinito(Destino destinito) {
        this.destinito = destinito;
    }

    public Tarjeta getTarjetucha() {
        return tarjetucha;
    }

    public void setTarjetucha(Tarjeta tarjetucha) {
        this.tarjetucha = tarjetucha;
    }
    
    
}
