package Hotel.model;

public class QuartoSuite  extends  Quarto implements  ServicoDeQuarto{
    public QuartoSuite(int numeroQuarto, Tipo tipo) {
        super(numeroQuarto, tipo);
    }

    @Override
    public void limpezaQuarto() {
        System.out.println("Limpando o Quarto");
    }

}
