package cadastro;

/**
 *
 * @author DELL
 */
public class Produto {
    private int codigo;
    private String descricao;
    private int pesounit;
    private float valor;
    
    public Produto(int codigo, String descricao, int pesounit, float valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.pesounit = pesounit;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getpesounit() {
        return pesounit;
    }

    public void setpesounit(int pesounit) {
        this.pesounit = pesounit;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String exibir() {
        return "Produto{" + "codigo=" + codigo 
                + ", descricao=" + descricao 
                + ", pesounit=" + pesounit 
                + ", valor=" + valor + '}';
    }
    
    
    
    
    
}
