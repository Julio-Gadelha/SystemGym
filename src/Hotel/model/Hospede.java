package Hotel.model;

import Hotel.model.Exception.CpfInvalidoException;
import Hotel.model.Exception.TelefoneInvalidoException;

public class Hospede {
    private String nome;
    private final String cpf;
    private String telefone;

    public Hospede(String cpf, String nome, String telefone) throws CpfInvalidoException, TelefoneInvalidoException {
        if (cpf == null || cpf.trim().length() < 11) {
            throw new CpfInvalidoException("O CPF deve possuir pelo menos 11 caracteres.");
        }
        this.cpf = cpf;

        String telefoneLimpo = telefone.replaceAll("[\\s\\-()]", "");
        if (telefoneLimpo.length() != 11) {
            throw new TelefoneInvalidoException("O telefone deve possuir exatamente 11 dígitos.");
        }
        this.telefone = telefone;
        this.nome = nome;

    }


}
