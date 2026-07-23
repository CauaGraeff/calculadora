package Operacoes;

public class Numeros {
    private Double numero1;
    private Double numero2;

    public void setNumero1(String numero1) {
        this.numero1 = Double.parseDouble(numero1.replace(",", "."));
    }

    public void setNumero2(String numero2) {
        this.numero2 = Double.parseDouble(numero2.replace(",", "."));;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
}
