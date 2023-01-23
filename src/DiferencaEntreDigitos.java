/*Desafio
O desafio consiste em um número inteiro n, 
onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.

Entrada 
• Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
• A soma, basta realizar uma adição entre os dígitos.
• A diferença, é necessário substrair o resultado final dos dois valores.

Saída
A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos. 

IMPORTANTE: 
Para ler os dados de entrada do usuário, utilize a classe Scanner, 
instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.
*/

import java.util.Scanner;

public class DiferencaEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
       
        int soma = 0;
        int digito = 0;
        int multiplicacao = 1;
       
        while (numero > 0) {
            digito = numero % 10;
           
            soma = soma + digito;
            multiplicacao = multiplicacao * digito;
           
            numero = numero / 10;
        }
   
        int diferenca = multiplicacao - soma;
       
        System.out.println(diferenca);

    scan.close();
    }
}