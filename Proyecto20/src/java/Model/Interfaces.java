/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pablo
 */
public class Interfaces {
      private String interfaces[];
   public Interfaces() {
    
        this.interfaces = new String[10];
        this.interfaces[1]="index.xhtml";
        this.interfaces[2]="sonrisa.xhtml";
        this.interfaces[3]="interfaz.xhtml";
    }
   public String obtenerNombreInterfaz(int numeroInterfaz){
 return this.interfaces[numeroInterfaz];
 }
}
