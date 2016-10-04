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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author romano
 */
@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable{
    
    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "clienteId", unique = true, nullable = false, precision = 15, scale = 0)
    private Long vendedorId;
    @Column(length=45)
    private String vendedorNome;
    @Column(length=45)
    private String vendedorSobrenome;
    @Column(length=15)
    private String vendedorTelefone;
    @Column(length=45)
    private String vendedorSalario;
    @Column(length=45)
    private String vendedorLogin;
    @Column(length=45)
    private String vendedorSenha;
    @Column(length=45)
    private String vendedorComissao;
    @ManyToOne
    @JoinColumn(name="vendedorEndereco")
    private Endereco vendedorEndereco;

    public Vendedor() {
    }

    public Vendedor(Long vendedorId, String vendedorNome, String vendedorSobrenome, String vendedorTelefone, String vendedorSalario, String vendedorLogin, String vendedorSenha, String vendedorComissao, Endereco vendedorEndereco) {
        this.vendedorId = vendedorId;
        this.vendedorNome = vendedorNome;
        this.vendedorSobrenome = vendedorSobrenome;
        this.vendedorTelefone = vendedorTelefone;
        this.vendedorSalario = vendedorSalario;
        this.vendedorLogin = vendedorLogin;
        this.vendedorSenha = vendedorSenha;
        this.vendedorComissao = vendedorComissao;
        this.vendedorEndereco = vendedorEndereco;
    }

    public Long getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Long vendedorId) {
        this.vendedorId = vendedorId;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    public String getVendedorSobrenome() {
        return vendedorSobrenome;
    }

    public void setVendedorSobrenome(String vendedorSobrenome) {
        this.vendedorSobrenome = vendedorSobrenome;
    }

    public String getVendedorTelefone() {
        return vendedorTelefone;
    }

    public void setVendedorTelefone(String vendedorTelefone) {
        this.vendedorTelefone = vendedorTelefone;
    }

    public String getVendedorSalario() {
        return vendedorSalario;
    }

    public void setVendedorSalario(String vendedorSalario) {
        this.vendedorSalario = vendedorSalario;
    }

    public String getVendedorLogin() {
        return vendedorLogin;
    }

    public void setVendedorLogin(String vendedorLogin) {
        this.vendedorLogin = vendedorLogin;
    }

    public String getVendedorSenha() {
        return vendedorSenha;
    }

    public void setVendedorSenha(String vendedorSenha) {
        this.vendedorSenha = vendedorSenha;
    }

    public String getVendedorComissao() {
        return vendedorComissao;
    }

    public void setVendedorComissao(String vendedorComissao) {
        this.vendedorComissao = vendedorComissao;
    }

    public Endereco getVendedorEndereco() {
        return vendedorEndereco;
    }

    public void setVendedorEndereco(Endereco vendedorEndereco) {
        this.vendedorEndereco = vendedorEndereco;
    }
    
    
}
