package Exercicios;

import java.util.Scanner;
public class JavaExercicio01 {

    public static void main(String[] args) {

        double[] valores;
        valores = null;
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
                if (menor > valores[cont]) {
                    menor = valores[cont];
                }
            }
            cont++;
        }
        
        System.out.println("Maior valor: "+ maior);
        System.out.println("Menor valor: "+ menor);
        
        if(maior > 50){
            System.out.println("Valor muito alto!");
        }
        
        

    }

}
