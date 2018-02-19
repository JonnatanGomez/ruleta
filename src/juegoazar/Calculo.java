/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoazar;

/**
 *
 * @author alumno
 */
public class Calculo {
    
    public String msjError;
    
    public boolean valido(int numero, float monto, float disponible){
        if(numero<0||numero>10){
            msjError = "Upps! su numero debe estar entre 1 y 10";
            return false;
        }
        
        if(monto>disponible){
            msjError = "Upps! no puedes apostar eso";
            return false;
        }
        
        return true;
    }
    
    public boolean esPar(int n){
        return (n%2==0);
    }
    
    public boolean esIgual(int n, int n2){
        return (n==n2);
    }
    
    public float porDos(float n){
        return n*2;
    }
    
    public float porTres(float n){
        return n*3;
    }
    
    private boolean saldoSuficiente(float disponible, float apostado){
        return(apostado<=disponible);
    }
}
