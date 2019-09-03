package com.udec.Utilitarios;

/**
 * Clase que contiene los datos del objeto Triangulo.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Triangulo extends Figura2D implements IFiguras{
    
  //  private double base;    provisional
  //  private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;
/*
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }                                      // Constructor provisional
*/
/**
 * Constructor de la clase Triangulo que recibe los lados de un triangulo
 * @param lado1 
 * @param lado2
 * @param lado3 
 */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * Metodos Get y Set de la clase 
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    /*
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
*/
    /**
     * Metodo implementado de la interfaz IFiguras y especializado para hallar
     * el area del triangulo.
     * @return area
     */
    @Override
    public double hallarArea() {
       // return getAltura()*getBase();
        double semiperimetro = (getLado1()+getLado2()+getLado3())/2;
        return Math.sqrt(semiperimetro*(semiperimetro-getLado1())*(semiperimetro-getLado2())*(semiperimetro-getLado3()));
    }

   /**
     * Metodo implementado de la interfaz IFiguras y especializado para imprimir los datos.
     */
    @Override
    public void imprimirResultados() {
        System.out.println("|----------------------------------------------------------------------------------------------------|");
        System.out.println("| Figura: 2D |"+"Triangulo "+" TipoDeTriangulo: "+tipoTriangulo()+"| Area: "+hallarArea()+"cm^2"+"| Perimetro: "+hallarPerimetro()+" cm"+"|");
        System.out.println("|----------------------------------------------------------------------------------------------------|");
    }

    /**
     * Metodo heredado de la clase Figura2D y especializado para hallar el perimetro
     * @return perimetro.
     */
    @Override
    public double hallarPerimetro() {
        if((getLado1()!=(getLado2()))&&(getLado1())!=(getLado3())){
            if(getLado2()!=getLado3())
                return getLado1()+getLado2()+getLado3();
        }        
        if((getLado1()==(getLado2()))&&(getLado1())==(getLado3())){
            return 3*getLado1();
        }
        if((getLado1())==(getLado2())){
            return (getLado1()*2)+getLado3();           
        }else{
            if(getLado1() == getLado3()){
                return (getLado1()*2)+getLado2();
            }
        }
        return getLado1();
    }
    
    /**
     * Metodo que retorna el tipo de triagulo dependiendo de sus lados.
     * @return String tipo de triangulo.
     */
    public String tipoTriangulo(){
        if((getLado1()!=(getLado2()))&&(getLado1())!=(getLado3())){
            if(getLado2()!=getLado3())
                return "Escaleno";
        }        
        if((getLado1()==(getLado2()))&&(getLado1())==(getLado3())){
            return "Equilatero";
        }
        if((getLado1())==(getLado2())){
            return "Isoceles";           
        }else{
            if(getLado1() == getLado3()){
                return "Isoceles";
            }
        }
        return "Error";
    }
        
}
