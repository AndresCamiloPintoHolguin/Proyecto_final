/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.Producto;
import services.ProductoFacade;

/**
 *
 * @author camil
 */
@Named(value = "controller")
@SessionScoped
public class Controller implements Serializable {


 private String message;
 
 private Producto producto= new Producto();
 
 @EJB
 
 private ProductoFacade productofacade;

 
 public List<Producto>getALLProducto(){
     return productofacade.findAll();
 }
 
 public void eliminar(int id){
    Producto productos = new Producto();
    productos.setIdproducto(id);
    productofacade.remove(productos);
     
 }
 
 
 public void create(){
     productofacade.create(producto);
     
     message="se creo correctamente";
     
 }
 public void update( int id ){
     producto.setIdproducto(id);
     productofacade.edit(producto);
     message=" se catualizo correctamente";
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    /**
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the productofacade
     */
    public ProductoFacade getProductofacade() {
        return productofacade;
    }

    /**
     * @param productofacade the productofacade to set
     */
    public void setProductofacade(ProductoFacade productofacade) {
        this.productofacade = productofacade;
    }
    
}
