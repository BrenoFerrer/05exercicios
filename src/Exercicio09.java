import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int Digito;
        int unidade, dezena, centena;
        int valorInvertido;




        System.out.println(" Digite o valor --> ");
        Digito = ent.nextInt();

        unidade = Digito %10;
        dezena = Digito / 10 % 10;
        centena = Digito /100;


        valorInvertido = unidade *100 + dezena*10 + centena;

        System.out.println(valorInvertido);












    }
}
