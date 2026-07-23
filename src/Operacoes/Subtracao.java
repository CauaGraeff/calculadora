package Operacoes;

public class Subtracao extends Numeros implements Operacao{
    @Override
    public double operacao() {
        return getNumero1() - getNumero2();
    }
}
