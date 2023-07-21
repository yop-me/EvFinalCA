/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jajimenez
 */
@Entity
public class Imc /*implements Serializable*/ {
    
    private long id;
    private String nombrePersona;
    private double peso;
    private double altura;
   
    public Imc() {
      
    }
    protected Imc (long id, String nombrePersona, double peso, double altura) {
    
        super ();
        this.id = id;
        this.nombrePersona = nombrePersona;
        this.peso = peso;
        this.altura = altura;
        
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 

}
