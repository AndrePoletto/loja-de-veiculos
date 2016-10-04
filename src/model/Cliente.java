/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author romano
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "clienteId", unique = true, nullable = false, precision = 15, scale = 0)
    private Long clienteId;
    @Column(length=45)
    private String clienteNome;
    @Column(length=45)
    private String clienteSobrenome;
    @Column(length=14)
    private String clienteCpf;
    @Column(length=45)
    private String clienteEmail;
    @Column(length=15)
    private String clienteTelefone;
    @Column(length=45)
    private String clienteNomePai;
    @Column(length=45)
    private String clienteNomeMae;
    @ManyToOne
    @JoinColumn(name="clienteEndereco")
    private Endereco clienteEndereco;
    
    public Cliente() {
    }

    public Cliente(Long clienteId, String clienteNome, String clienteSobrenome, String clienteCpf, String clienteEmail, String clienteTelefone, String clienteNomePai, String clienteNomeMae, Endereco ClienteEndereco) {
        this.clienteId = clienteId;
        this.clienteNome = clienteNome;
        this.clienteSobrenome = clienteSobrenome;
        this.clienteCpf = clienteCpf;
        this.clienteEmail = clienteEmail;
        this.clienteTelefone = clienteTelefone;
        this.clienteNomePai = clienteNomePai;
        this.clienteNomeMae = clienteNomeMae;
        this.clienteEndereco = ClienteEndereco;
    }

    public Endereco getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(Endereco ClienteEndereco) {
        this.clienteEndereco = ClienteEndereco;
    }

    
    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getClienteSobrenome() {
        return clienteSobrenome;
    }

    public void setClienteSobrenome(String clienteSobrenome) {
        this.clienteSobrenome = clienteSobrenome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getClienteTelefone() {
        return clienteTelefone;
    }

    public void setClienteTelefone(String clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }

    public String getClienteNomePai() {
        return clienteNomePai;
    }

    public void setClienteNomePai(String clienteNomePai) {
        this.clienteNomePai = clienteNomePai;
    }

    public String getClienteNomeMae() {
        return clienteNomeMae;
    }

    public void setClienteNomeMae(String clienteNomeMae) {
        this.clienteNomeMae = clienteNomeMae;
    }

}
   