/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author romano
 */
@Entity
@Table(name = "motocicleta")
public class Motocicleta implements Serializable{
    
    @Id
    @Column(name = "motoPlaca", unique = true)
    private Long motocicletaId;
    @Column(length=45)
    private String motoChassi;    
    @Column(length=45)
    private String motoCombustivel;
    @Column
    private String motoDescricao;
    @ManyToOne
    @JoinColumn(name = "motoDono")
    private Cliente motoDono;
    @ManyToOne
    @JoinColumn(name = "motoCor")
    private Cor motoCor;
    @ManyToOne
    @JoinColumn(name = "motoModelo")
    private Modelo motoModelo;
}
