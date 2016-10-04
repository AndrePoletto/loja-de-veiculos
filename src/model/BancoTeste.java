/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author romano
 */
public class BancoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        //CREATE
        /* 
        Cliente c = new Cliente();
        
        c.setClienteNome("Klebinho Marrento");
        c.setClienteSobrenome("Juninho");
        c.setClienteCpf("001");
        c.setClienteEmail("alla@hotmail.com");
        c.setClienteTelefone("000001111");
        c.setClienteNomePai("Jair");
        c.setClienteNomeMae("Creuzinha");

        Endereco e = new Endereco();
        e.setEnderecoRua("Rua Brasil");
        c.setClienteEndereco(e);
       
        
        
        session.saveOrUpdate(e);
        session.saveOrUpdate(c);
        
        
        session.getTransaction().commit();
        
        */
        
        //READ ( por linha)
        /*
        Endereco e = (Endereco) session.get(Endereco.class,1L);
        
        System.out.println(e.getEnderecoRua());
        */
        
        //READ (por Query)
        /*
        Query consulta = session.createQuery("from Endereco where enderecoRua = 'Rua Brasil' ");

        List<Endereco> enderecos = consulta.list();
        
        for (Endereco endereco : enderecos){
            System.out.println("Id :" + endereco.getEnderecoId());
            System.out.println("Nome:" + endereco.getEnderecoRua());
            System.out.println("--------------------------");
        }
        */
        
        Query consulta = session.createQuery("from Cliente");

        List<Cliente> clientes = consulta.list();
        
        for (Cliente cliente : clientes){
            System.out.println("Id :" + cliente.getClienteId());
            System.out.println("Nome:" + cliente.getClienteNome());
            System.out.println("Endereco (Rua):" + cliente.getClienteEndereco().getEnderecoRua());
            System.out.println("--------------------------");
        }
        session.close();
        
        System.exit(0);
    }
    
}
