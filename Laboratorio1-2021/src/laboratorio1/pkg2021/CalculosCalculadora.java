/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1.pkg2021;

/**
 *
 * @author juanr
 */
public class CalculosCalculadora {
    //atributos (opcional)
    
    //constructor
    public CalculosCalculadora(){}
    
    //metodos
    //suma
    public float Suma(float numero1, float numero2){
        return numero1+numero2;
    }
    
    public float Resta(float numero1, float numero2){
        return numero1-numero2;
    }
    
    public float Multiplicacion(float numero1, float numero2){
        return numero1*numero2;
    }
    
    public float Division(float numero1, float numero2){
        return numero1/numero2;
    }
    
    public double Seno(double numero1)
    {
        return Math.sin(numero1);
    } 
    
    public double Cos(double numero1)
    {
        return Math.cos(numero1);
    }
    
    public double Tan(double numero1)
    {
        return Math.tan(numero1);
    }
    
    public double Potencia(double numero, double potencia)
    {
        return Math.pow(numero, potencia);
    }
    
    public boolean ValidacionDivisionCero(float numero1, float numero2){
        if(numero2==0){
            return false;
        }
        return true;
    }
    
    public boolean ValidacionTangente(double numero){
        if(numero==90 || numero==-90){
            return false;
        }
        return true;
    }
    
}
