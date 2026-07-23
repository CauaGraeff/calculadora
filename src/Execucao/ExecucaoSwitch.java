package Execucao;

import Operacoes.*;

import java.io.IOException;
import java.util.Scanner;

public class ExecucaoSwitch {
    Adicao sum = new Adicao();
    Subtracao sub = new Subtracao();
    Multiplicacao mult = new Multiplicacao();
    Divisao div = new Divisao();
    Potenciacao poten = new Potenciacao();
    AddLinhaArquivo add = new AddLinhaArquivo();
    Scanner sc = new Scanner(System.in);

    public void blocoAdicao() throws IOException {
        try {
            System.out.println("Digite o primeiro número da soma: ");
            sum.setNumero1(sc.nextLine());
            System.out.println("Digite um valor válido!");
            System.out.println("Digite o segundo número da soma: ");
            sum.setNumero2(sc.nextLine());

            double soma = sum.operacao();

            String operacaoNova = "A soma entre os números " + sum.getNumero1() + " e " + sum.getNumero2() + " é: " + soma + System.lineSeparator();
            System.out.println(operacaoNova);

            add.addLinha(operacaoNova);
        } catch (NumberFormatException e) {
            System.out.println("Você não pode digitar um valor que não seja numérico!");
        }
    }
    public void blocoSubtracao() throws IOException {
        try {
        System.out.println("Digite o primeiro número da subtração: ");
        sub.setNumero1(sc.nextLine());

        System.out.println("Digite o segundo número da subtração: ");
        sub.setNumero2(sc.nextLine());

        double subtracao = sub.operacao();

        String operacaoNova = "A subtração entre os números " + sub.getNumero1() + " e " + sub.getNumero2() + " é: " + subtracao + System.lineSeparator();
        System.out.println(operacaoNova);

        add.addLinha(operacaoNova);
        } catch (NumberFormatException e) {
        System.out.println("Você não pode digitar um valor que não seja numérico!");
    }
    }

    public void blocoMultiplicacao() throws IOException {
        try {
        System.out.println("Digite o primeiro número da multiplicação: ");
        mult.setNumero1(sc.nextLine());

        System.out.println("Digite o segundo número da multiplicação: ");
        mult.setNumero2(sc.nextLine());

        double multiplicacao = mult.operacao();

        String operacaoNova = "O produto entre os números " + mult.getNumero1() + " e " + mult.getNumero2() + " é: " + multiplicacao + System.lineSeparator();
        System.out.println(operacaoNova);

        add.addLinha(operacaoNova);
        } catch (NumberFormatException e) {
            System.out.println("Você não pode digitar um valor que não seja numérico!");
        }
    }

    public void blocoDivisao() throws IOException {
        try {
        System.out.println("Digite o número numerador: ");
        div.setNumero1(sc.nextLine());

        System.out.println("Digite o número denominador: ");
        div.setNumero2(sc.nextLine());


        while(div.getNumero2() == 0) {
            System.out.println("Digite um número denominador válido: ");
            div.setNumero2(sc.nextLine());
        }

        double divisao = div.operacao();

        String operacaoNova = "A divisão entre os números " + div.getNumero1() + " e " + div.getNumero2() + " é: " + divisao + System.lineSeparator();
        System.out.println(operacaoNova);

        add.addLinha(operacaoNova);
        } catch (NumberFormatException e) {
            System.out.println("Você não pode digitar um valor que não seja numérico!");
        }
    }

    public void blocoPotenciacao() throws IOException {
        try {
        System.out.println("Digite a base");
        poten.setNumero1(sc.nextLine());

        System.out.println("Digite o expoente: ");
        poten.setNumero2(sc.nextLine());

        double potenciacao = poten.operacao();

        String operacaoNova = "A potência da base " + poten.getNumero1() + " na expoente de " + poten.getNumero2() + " é: " + potenciacao + System.lineSeparator();
        System.out.println(operacaoNova);

        add.addLinha(operacaoNova);
        } catch (NumberFormatException e) {
            System.out.println("Você não pode digitar um valor que não seja numérico!");
        }
    }

}
