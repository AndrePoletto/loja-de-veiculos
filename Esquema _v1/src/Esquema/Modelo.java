/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esquema;

import java.io.Serializable;
import java.time.Year;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author romano
 */
@Entity
@Table(name = "modelo")
public class Modelo implements Serializable {

    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    @Column(name = "modeloId", unique = true, nullable = false, precision = 15, scale = 0)
    private Long modeloId;
    @Column(length=45)
    private String modeloNome;
    @Column(length=45)
    private String modeloData;
    @ManyToOne
    @JoinColumn(name = "modeloMarca")
    private Marca modeloMarca;

    public Modelo(Long modeloId, String modeloNome, String modeloData, Marca modeloMarca) {
        this.modeloId = modeloId;
        this.modeloNome = modeloNome;
        this.modeloData = modeloData;
        this.modeloMarca = modeloMarca;
    }

    public Modelo() {
    }

    public Long getModeloId() {
        return modeloId;
    }

    public void setModeloId(Long modeloId) {
        this.modeloId = modeloId;
    }

    public String getModeloNome() {
        return modeloNome;
    }

    public void setModeloNome(String modeloNome) {
        this.modeloNome = modeloNome;
    }

    public String getModeloData() {
        return modeloData;
    }

    public void setModeloData(String modeloData) {
        this.modeloData = modeloData;
    }

    public Marca getModeloMarca() {
        return modeloMarca;
    }

    public void setModeloMarca(Marca modeloMarca) {
        this.modeloMarca = modeloMarca;
    }
    
    
    
}
