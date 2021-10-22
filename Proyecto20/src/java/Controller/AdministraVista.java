/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Interfaces;
import java.io.IOException;
import javax.faces.context.FacesContext;

/**
 *
 * @author pablo
 */
public class AdministraVista {
 private Interfaces catalogoInterfaces;
 
 public void presentarInterfaz( int interfaceId ) {
 try{
 Interfaces listaInterfaces = new Interfaces();
 FacesContext.getCurrentInstance().getExternalContext()
 .redirect(listaInterfaces.obtenerNombreInterfaz(interfaceId));
 
 } catch (IOException ex) {
 System.out.println("Error");
 }
}
}
