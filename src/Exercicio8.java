import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);


        int valor, valorDezena;

        //

        System.out.println("Digite o Valor de 3 Digitos (100 - 999) --> ");
        valor = ent.nextInt();


        valorDezena = valor % 100 /10;

        System.out.println("O Valor da Dezena deste número é --> " + valorDezena);
        valorDezena = ent.nextInt();













    }
}
