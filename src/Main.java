import Execucao.ExecucaoSwitch;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
//Locale.setDefault(Locale.canada);
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ExecucaoSwitch blocos = new ExecucaoSwitch();
        boolean condicao = true;
        while (condicao) {
            System.out.println("Escolha uma das operações:");
            System.out.println("""
                    0 - Sair\s
                    1 - Adição\s
                    2 - Subtração\s
                    3 - Multiplicação\s
                    4 - Divisão\s
                    5 - Potenciação\s
                    """);
            int escolha = sc.nextInt();
            switch (escolha) {
                case(0):
                    condicao = false;
                    System.out.println("Finalizando o programa");
                    break;
                case(1):
                    blocos.blocoAdicao();
                    break;
                case(2):
                    blocos.blocoSubtracao();
                    break;
                case(3):
                    blocos.blocoMultiplicacao();
                    break;
                case(4):
                    blocos.blocoDivisao();
                    break;
                case(5):
                    blocos.blocoPotenciacao();
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
    }
}