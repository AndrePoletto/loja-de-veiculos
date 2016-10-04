/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esquema;

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
@Table(name = "marca")
public class Marca implements Serializable{
    
    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "marcaId", unique = true, nullable = false, precision = 15, scale = 0)
    private Long marcaId;
    @Column(length=45)
    private String marcaNome;

    public Marca(Long marcaId, String marcaNome) {
        this.marcaId = marcaId;
        this.marcaNome = marcaNome;
    }

    public Marca() {
    }

    public Long getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Long marcaId) {
        this.marcaId = marcaId;
    }

    public String getMarcaNome() {
        return marcaNome;
    }

    public void setMarcaNome(String marcaNome) {
        this.marcaNome = marcaNome;
    }
    
    
}
