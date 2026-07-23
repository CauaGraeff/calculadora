package Operacoes;

public class Divisao extends Numeros implements Operacao{
    @Override
    public double operacao() {
        return getNumero1() / getNumero2();
    }
}
