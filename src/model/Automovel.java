/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esquema;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author romano
 */
@Entity
@Table(name = "automovel")
public class Automovel implements Serializable{
    
    @Id
    @Column(name = "autoPlaca", unique = true)
    private Long automovelId;
    @Column(length=45)
    private String autoChassi;    
    @Column(length=45)
    private String autoCombustivel;
    @Column
    private Boolean autoMultimidia;
    @Column
    private Boolean autoArCondicionado;
    @Column
    private Boolean autoPortaEletrica;
    @Column
    private Boolean autoVidroEletrico;
    @Column
    private String autoDescricao;
    @ManyToOne
    @JoinColumn(name = "autoDono")
    private Cliente autoDono;
    @ManyToOne
    @JoinColumn(name = "autoCor")
    private Cor autoCor;
    @ManyToOne
    @JoinColumn(name = "autoModelo")
    private Modelo autoModelo;

    public Automovel(Long automovelId, String autoChassi, String autoCombustivel, Boolean autoMultimidia, Boolean autoArCondicionado, Boolean autoPortaEletrica, Boolean autoVidroEletrico, String autoDescricao, Cliente autoDono, Cor autoCor, Modelo autoModelo) {
        this.automovelId = automovelId;
        this.autoChassi = autoChassi;
        this.autoCombustivel = autoCombustivel;
        this.autoMultimidia = autoMultimidia;
        this.autoArCondicionado = autoArCondicionado;
        this.autoPortaEletrica = autoPortaEletrica;
        this.autoVidroEletrico = autoVidroEletrico;
        this.autoDescricao = autoDescricao;
        this.autoDono = autoDono;
        this.autoCor = autoCor;
        this.autoModelo = autoModelo;
    }

    public Automovel() {
    }

    public Long getAutomovelId() {
        return automovelId;
    }

    public void setAutomovelId(Long automovelId) {
        this.automovelId = automovelId;
    }

    public String getAutoChassi() {
        return autoChassi;
    }

    public void setAutoChassi(String autoChassi) {
        this.autoChassi = autoChassi;
    }

    public String getAutoCombustivel() {
        return autoCombustivel;
    }

    public void setAutoCombustivel(String autoCombustivel) {
        this.autoCombustivel = autoCombustivel;
    }

    public Boolean getAutoMultimidia() {
        return autoMultimidia;
    }

    public void setAutoMultimidia(Boolean autoMultimidia) {
        this.autoMultimidia = autoMultimidia;
    }

    public Boolean getAutoArCondicionado() {
        return autoArCondicionado;
    }

    public void setAutoArCondicionado(Boolean autoArCondicionado) {
        this.autoArCondicionado = autoArCondicionado;
    }

    public Boolean getAutoPortaEletrica() {
        return autoPortaEletrica;
    }

    public void setAutoPortaEletrica(Boolean autoPortaEletrica) {
        this.autoPortaEletrica = autoPortaEletrica;
    }

    public Boolean getAutoVidroEletrico() {
        return autoVidroEletrico;
    }

    public void setAutoVidroEletrico(Boolean autoVidroEletrico) {
        this.autoVidroEletrico = autoVidroEletrico;
    }

    public String getAutoDescricao() {
        return autoDescricao;
    }

    public void setAutoDescricao(String autoDescricao) {
        this.autoDescricao = autoDescricao;
    }

    public Cliente getAutoDono() {
        return autoDono;
    }

    public void setAutoDono(Cliente autoDono) {
        this.autoDono = autoDono;
    }

    public Cor getAutoCor() {
        return autoCor;
    }

    public void setAutoCor(Cor autoCor) {
        this.autoCor = autoCor;
    }

    public Modelo getAutoModelo() {
        return autoModelo;
    }

    public void setAutoModelo(Modelo autoModelo) {
        this.autoModelo = autoModelo;
    }
    
    
}
