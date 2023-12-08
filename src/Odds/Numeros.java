package Odds;

public class Numeros {
    
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        if(numero%2==0){
            return "El Numero "+numero+" es par.";
        } else {
            return "El Numero "+numero+" es impar.";
        }
    }
}
