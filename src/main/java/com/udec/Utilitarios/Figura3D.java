package com.udec.Utilitarios;
/**
 * Clase Padre que contiene los datos de la clase Figura3D.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public abstract class Figura3D {
/*    
    private double volumen;

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
  */  
    /**
     * Metodo abstracto para hallar volumen
     * @return double.
     */
    public abstract double hallarVolumen();
        
    
    
}
