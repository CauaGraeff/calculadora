package Operacoes;

public class Potenciacao extends Numeros implements Operacao{
    @Override
    public double operacao() {
        return Math.pow(getNumero1(), getNumero2());
    }
}
