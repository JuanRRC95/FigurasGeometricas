package com.udec.Utilitarios;
/**
 * Clase Padre que contiene los datos de la clase Figura2D.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public abstract class Figura2D  {
   /* 
    private double area;
    
    private double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    */
    
    /**
     * Metodo abstracto para hallar el perimetro
     * @return un double.
     */
    public abstract double hallarPerimetro();
        
    
    
}
