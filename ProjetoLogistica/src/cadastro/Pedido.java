package cadastro;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int qtdItem;
    private float valorPedido;

    public Pedido(Cliente cliente, Produto produto, int qtdItem) {
        this.cliente = cliente;
        this.produto = produto;
        this.qtdItem = qtdItem;
        this.valorPedido = 0;
    }

    
    
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    
    
    public void realizarVenda(){
        String cliente = this.getCliente().getNome();
        String produto = this.getProduto().getDescricao();
        int quantidade = this.getQtdItem();
        float valorPedido = this.getProduto().getValor()*this.getQtdItem();
        int pesoPedido = this.getProduto().getpesounit()*this.getQtdItem();
        System.out.println("Nome do cliente: " + cliente);
        System.out.println("Descrição produto: " + produto);
        System.out.println("Valor do pedido: " + valorPedido);
        
    }
   
    
    
    
    
    
    
    
    
}
