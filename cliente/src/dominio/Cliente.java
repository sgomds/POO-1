package dominio;

public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String cpf, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public Object getEndereco() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getEndereco'");
    }

    public void setEndereco(Object endereco) {
     
        throw new UnsupportedOperationException("Unimplemented method 'setEndereco'");
    }
}

