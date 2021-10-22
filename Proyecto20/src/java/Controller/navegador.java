/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
@ManagedBean (name="navegador")
@RequestScoped
public class navegador implements Serializable {
 private AdministraVista administrador;
 
 public navegador() {
 
 this.administrador = new AdministraVista();
 }
 
 public void metodo1(){
 administrador.presentarInterfaz(1);
 }
 
 public void metodo2(){
 administrador.presentarInterfaz(2);
 }
 public void metodo3(){
 administrador.presentarInterfaz(3);
 }
 
 public void metodo4(){
 administrador.presentarInterfaz(4);
 }
}

