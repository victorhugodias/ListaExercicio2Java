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

/*6.	Faça um algoritmo que leia um caractere e informe se o mesmo é uma vogal ou não.
  
        

        System.out.println("introduza a letra:");
        String N = entrada.next();
        char c = N.charAt(0);
        switch(c){ 
        case'a': case 'A' :
        case'e': case 'E' :
        case'i': case 'I' :
        case'o': case 'O' :
        case'u': case 'U' :
        {
        System.out.println("a letra "+N+" é uma vogal"); 
        break; 
        }
        default: {
        System.out.println("O caractere "+N+" não é uma vogal"); 
            }
        } */
        
/*7.	Faça um algoritmo que calcule e mostre o novo valor de um salário a partir 
das seguintes regras: salários de até R$ 1.000,00 inclusive recebem 30% de aumento,
salários de até R$ 2.000,00 inclusive recebem 25%, salários de até R$ 3.000,00 inclusive recebem 20%,
salários de até R$ 4.000,00 inclusive recebem 15% e salários acima de R$ 4.000,00 recebem apenas 10%. */

        







/*8.	Os endereços IP versão 4 são divididos em cinco classes: A, B, C, D e E.
Os endereços no intervalo de 0 à 127 são classe A, de 128 à 191 são classe B,
de 192 à 223 são classe C, de 224 à 239 são classe D e a partir de 240 são classe E
. Faça um algoritmo que leia o primeiro octeto, no formato decimal, de um endereço IP e informe a sua classe.

        
        int ip;
        System.out.print("Entre o primeiro octeto do IP: ");
        ip = entrada.nextInt();
        if(ip >= 0 && ip <= 127){
            System.out.println("IP classe A");
        }else if (ip >= 128 && ip <= 191){
            System.out.println("IP classe B");
        }else if (ip >= 192 && ip <= 223){
            System.out.println("IP classe C");
        }else if (ip >= 224 && ip <= 239){
            System.out.println("IP classe D");
        }else if (ip >= 240 && ip <= 255){
            System.out.println("IP classe E");
        }else{
            System.out.println("Erro: IP inválido!");
        }*/


/*9.	Faça um algoritmo que receba um número inteiro, que representa um determinado
mês do ano, e mostre o nome do mês correspondente. Por exemplo, se for informado o número 2,
algoritmo deverá exibir fevereiro. O algoritmo deve validar se a entrada está correta.*/




    




/*10.	Faça um algoritmo que valide uma data, formada por dia, mês e ano. Por exemplo,
a data 30/2 é inválida, porém a data 29/2/2012 é válida.*/


        
        
        
    } 
}
    
