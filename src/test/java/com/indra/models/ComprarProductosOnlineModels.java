package com.indra.models;

public class ComprarProductosOnlineModels {

    private String nombreUsuario;
    private String direccionUsuario;
    private String telefonoUsuario;
    private String opcionPago1;
    private String opcionPago2;

    private String direccionDeEntrega;
    private String medioDePago;
    private String resumenCompra;
    private String numeroOrden;
    private String numeroGuia;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public String getOpcionPago1() {
        return opcionPago1;
    }

    public String getOpcionPago2() {
        return opcionPago2;
    }

    public String getDireccionDeEntrega() {
        return direccionDeEntrega;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public String getResumenCompra() {
        return resumenCompra;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }
}
