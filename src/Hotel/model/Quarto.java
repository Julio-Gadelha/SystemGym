package Hotel.model;

public  abstract class Quarto {
    private  final int numeroQuarto ;
    private  static  final double DIARIA_HOTEL= 80.75;
    private Tipo tipo;

    public Quarto(int numeroQuarto, Tipo tipo) {
        this.numeroQuarto = numeroQuarto;
        this.tipo = tipo;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
