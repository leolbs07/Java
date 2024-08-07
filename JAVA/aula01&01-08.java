/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2certo;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class AULA2CERTO {

    public static void main(String[] args) {
       Scanner teclado  = new Scanner (System.in); 
        
        System.out.println("Valor da compra: ");
        double valorCompra = teclado.nextDouble();
        
        Double valorParcela = valorCompra / 5;
        
        System.out.println("Valor das parcelas: " + valorParcela);
        
        teclado.close();
        
    }
}
