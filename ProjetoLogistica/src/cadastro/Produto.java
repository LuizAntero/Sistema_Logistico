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
    private int estoque;
    
    public Produto(int codigo, String descricao, int pesounit, float valor, int estoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.pesounit = pesounit;
        this.valor = valor;
        this.estoque = estoque;
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

    public int getEstoque(){
        return estoque;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    
    public void aumentaEstoque (int qtd){
        this.setEstoque(this.getEstoque() + qtd);
    }
    
    public void diminuiEstoque (int qtd){
        this.setEstoque(this.getEstoque() - qtd);
    }
    
    public String exibir() {
        return "Produto{" + "codigo=" + codigo 
                + ", descricao=" + descricao 
                + ", pesounit=" + pesounit 
                + ", valor=" + valor + '}'
                + ", estoque=" + estoque;
    }
    
    
    
    
    
}
