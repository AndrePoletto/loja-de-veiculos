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
@Table(name = "endereco")
public class Endereco implements Serializable{
    
    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "enderecoId", unique = true, nullable = false, precision = 15, scale = 0)
    private Long enderecoId;
    @Column(length=45)
    private String enderecoRua;

    public Endereco(Long enderecoId, String enderecoRua) {
        this.enderecoId = enderecoId;
        this.enderecoRua = enderecoRua;
    }

    public Endereco() {
    }

    public Long getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Long enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }
    
    
}
