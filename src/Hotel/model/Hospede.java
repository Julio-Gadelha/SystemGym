package Hotel.model;

public class Hospede {
    private String nome;
    private final String cpf;
    private  String telefone;

    public Hospede(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
}
