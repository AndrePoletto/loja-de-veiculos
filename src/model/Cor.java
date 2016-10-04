/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author romano
 */
@Entity
@Table(name = "cor")
public class Cor implements Serializable {

    @Id
    @GenericGenerator(name = "gen", strategy = "increment")
    @GeneratedValue(generator = "gen")
    @Column(name = "corId", unique = true, nullable = false, precision = 15, scale = 0)
    private Long corId;
    @Column(length=45)
    private String corNome;

    public Cor() {
    }

    public Cor(Long corId, String corNome) {
        this.corId = corId;
        this.corNome = corNome;
    }

    public Long getCorId() {
        return corId;
    }

    public void setCorId(Long corId) {
        this.corId = corId;
    }

    public String getCorNome() {
        return corNome;
    }

    public void setCorNome(String corNome) {
        this.corNome = corNome;
    }
    
    
}
