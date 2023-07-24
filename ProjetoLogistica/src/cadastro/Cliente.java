package cadastro;

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private int raio;

    public Cliente(int codigo, String nome, String endereco, int raio) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.raio = raio;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    
    
}
