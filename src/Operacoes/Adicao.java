package Operacoes;

public class Adicao extends Numeros implements Operacao {
    public double soma() {
        return getNumero1() + getNumero2();
    }
    @Override
    public double operacao() {
        return getNumero1() + getNumero2();
    }
}
