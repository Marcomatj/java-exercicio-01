package Exercicios;

import java.util.Scanner;

package java.exercicio.pkg01;

public class JavaExercicio01 {

    public static void main(String[] args) {

        double valores[
        4];
        double maior = 0;
        double menor = 0;
        int cont = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os valores de entrada:\n");
        while (cont <= 4) {
            valores[cont] = ler.nextDouble();

            if (maior < valores[cont]) {
                maior = valores[cont];
            } else {
                if (menor > valores) {
                    menor = valores[cont];
                }
            }
            cont++;
        }
        
        System.out.println("Maior valor: %d", maior);
        System.out.println("Menor valor: %d", menor);
        
        if(maior > 50){
            System.out.println("Valor muito alto!");
        }
        
        

    }

}
