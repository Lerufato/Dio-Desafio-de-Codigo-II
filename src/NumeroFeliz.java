/*Desafio

Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.

Entrada
A entrada será feita por um número inteiro, correpondente ao valor de entrada para verificar se  o número é feliz ou não.

Saída
Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz. 

IMPORTANTE: 
Para ler os dados de entrada do usuário, utilize a classe Scanner, 
instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.
*/


import java.util.Scanner;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        System.out.println(numeroFeliz(n));
        }
        
    public static boolean numeroFeliz(int n) {
        String numero = String.valueOf(n);
        if (numero.length() == 1) {
            return Integer.parseInt(numero) == 1;
        }
        do {
        String[] vetor = numero.split("");
        int soma = 0;
            for (int x = 0; x < vetor.length; x++) {
            int valor = Integer.parseInt(vetor[x]);
            soma += (valor * valor);
            }
        String somaStr = String.valueOf(soma);
            if (somaStr.length() == 1) {
            return Integer.parseInt(somaStr) == 1;
            }
        numero = somaStr;
        } 
        while (numero.length() != 1);
        return false;
        
    }

}