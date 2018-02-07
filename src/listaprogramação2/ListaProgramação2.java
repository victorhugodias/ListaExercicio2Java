/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaprogramação2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class ListaProgramação2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //recebendo valores digitados pelo usuario
            Scanner entrada = new Scanner(System.in);
        
/*  1Faça um algoritmo que leia um número e mostre se o mesmo é positivo, negativo ou zero.
        
       int numero;
        System.out.println("Digite um número");
        numero=entrada.nextInt();
       if(numero == 0){
           System.out.println("Número digitado 0");
       }else if(numero < 0 ){
           System.out.println("Número Negativo");
       }else if (numero > 0){
           System.out.println("Número positivo");
       }*/
        
/*2.	Faça um algoritmo que leia um número e mostre se o mesmo é par ou ímpar.

        int numero;
        System.out.println("Digite um número");
        numero=entrada.nextInt();
        if (numero % 2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }*/
/* 3.	Faça um algoritmo que leia dois números e mostre o maior número.
        
        int numero1;
        int numero2;
        System.out.println("Digite número 1");
        numero1=entrada.nextInt();
        System.out.println("Digite número 2");
        numero2=entrada.nextInt();
        if(numero1 > numero2){
            System.out.println("O maior número é: " + numero1);
        }else if(numero1 < numero2){
            System.out.println("O maior número é: " + numero2);
        }
        else if (numero1 == numero2){
            System.out.println("Número Iguais");
        }*/

/*4.	Faça um algoritmo que leia três números e mostre o maior número.

        int numero1;
        int numero2;
        int numero3;
        System.out.println("Digite número 1");
        numero1=entrada.nextInt();
        System.out.println("Digite número 2");
        numero2=entrada.nextInt();
        System.out.println("Digite número 3");
        numero3=entrada.nextInt();
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número é: " + numero1);
        }else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("O maior número é: " + numero2);
        }
        else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("O maior número é: " + numero3);
        }else if(numero1 == numero2 || numero1 == numero3 || numero2 == numero3){
            System.out.println("Números maiores iguais , tente novamente");
        }*/

/*5.	Faça um algoritmo que leia três números e mostre-os em ordem crescente.

     	List<Integer> list = new ArrayList<Integer>();
        list.add( Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1") ) );
        list.add( Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2") ) );
        list.add( Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3") ) );
        Collections.sort(list);
        JOptionPane.showMessageDialog(null," ordem crescente dos numeros = " + list ); */

/*6.	Faça um algoritmo que leia um caractere e informe se o mesmo é uma vogal ou não.*/
  
   System.out.println("introduza a letra:");
   String N=entrada.next();
   char c=N.charAt(0);
   switch(c){ 
   case'a': 
   case'e': 
   case'i': 
   case'o': 
   case'u': 
      System.out.println("a letra "+N+" é uma vogal"); 
      break; 
     default: 
      System.out.println("a letra "+N+" é uma consoante"); 
     } 
   }
     
}
    
