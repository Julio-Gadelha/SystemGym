package Hotel.model;

public enum Tipo {
    STANDARD(0),
    LUXO(0.40),
    PRESIDENCIAL(1.00);

   private double percentualAcrescimo;

    Tipo(double percentualAcrescimo) {
        this.percentualAcrescimo = percentualAcrescimo;
    }

    public double getPercentualAcrescimo() {
        return percentualAcrescimo;
    }
}
