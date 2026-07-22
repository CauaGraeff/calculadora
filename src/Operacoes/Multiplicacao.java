package Operacoes;

public class Multiplicacao extends Numeros implements Operacao{
    @Override
    public double operacao() {
        return getNumero1() * getNumero2();
    }
}
