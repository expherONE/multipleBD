package com.multipledb.multipledb.foo.domain;

import javax.persistence.*;

@Entity
@Table(name="DOCUMENTOS_CANDIDATOS")
public class DocumentosCandidato {
    @Id
    @Column(name="id_documentacion")
    private Integer idDocumentacion;

    private String fotografia;
    private String identificacion;
    private String curp;
    private String rfc;

    @Column(name = "comprobante_domicilio")
    private String comprobanteDomicilio;

    @Column(name = "comprobante_estudios")
    private String comprobanteEstudios;

    @Column(name = "servicio_militar")
    private String servicioMilitar;

    @Column(name = "acta_nacimiento_hijo")
    private String actaNacimientoHijo;

    private String cv;

    @Column(name = "certificado_medico")
    private String certificadoMedico;


    public Integer getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(Integer idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getComprobanteDomicilio() {
        return comprobanteDomicilio;
    }

    public void setComprobanteDomicilio(String comprobanteDomicilio) {
        this.comprobanteDomicilio = comprobanteDomicilio;
    }

    public String getComprobanteEstudios() {
        return comprobanteEstudios;
    }

    public void setComprobanteEstudios(String comprobanteEstudios) {
        this.comprobanteEstudios = comprobanteEstudios;
    }

    public String getServicioMilitar() {
        return servicioMilitar;
    }

    public void setServicioMilitar(String servicioMilitar) {
        this.servicioMilitar = servicioMilitar;
    }

    public String getActaNacimientoHijo() {
        return actaNacimientoHijo;
    }

    public void setActaNacimientoHijo(String actaNacimientoHijo) {
        this.actaNacimientoHijo = actaNacimientoHijo;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getCertificadoMedico() {
        return certificadoMedico;
    }

    public void setCertificadoMedico(String certificadoMedico) {
        this.certificadoMedico = certificadoMedico;
    }

}
