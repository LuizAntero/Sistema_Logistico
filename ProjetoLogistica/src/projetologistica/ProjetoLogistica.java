package projetologistica;


import cadastro.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Luiz Carlos
 */
public class ProjetoLogistica {
    public static void main(String[] args) {
        Funcionario a = new Funcionario(3, "Aline Franco", "Assist. Adm", 2800f);
        Funcionario b = new Funcionario(4, "Paloma Oliveira", "Motorista", 2500f);
        Funcionario c = new Funcionario(5, "Luma de Assis", "Ajudante", 2300f);
        List<Funcionario> func =new ArrayList<>();
        func.add(a);
        func.add(b);
        func.add(c);
        //Método para ordenar alfabético
        Collections.sort(func);
        System.out.println("Lista de Funcionários: " + func);

        Veiculo v1 = new Veiculo(121, "Mercedes Benz",20000);
        Veiculo v2 = new Veiculo(122, "Volvo",25000);
        Veiculo v3 = new Veiculo(123, "Scania",30000);
        List<Veiculo> veiculo = new ArrayList<>();
        veiculo.add(v1);
        veiculo.add(v2);
        veiculo.add(v3);

        Produto p1 = new Produto(111, "Cafe EF 1Kg", 1, 20.0f, 100 );
        Produto p2 = new Produto(121, "Achocolatado LT 1kg", 1, 8.0f, 100 );
        Produto p3 = new Produto(111, "Cafe Trad 1kg", 1, 15.0f, 100 );
        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(p1);
        listaProduto.add(p2);
        listaProduto.add(p3);

        Cliente c1 = new Cliente(100, "Super Compra", "Rua Primavera, 1", 500);
        Cliente c2 = new Cliente(101, "Preço Bom", "Rua Outono, 1", 350);
        Cliente c3 = new Cliente(102, "Super Desconto", "Avenida das Acácias, 1", 180);
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente.add(c1);
        listaCliente.add(c2);
        listaCliente.add(c3);

        ///////////////////PAINEL INTERATIVO/////////////////////
        //Exibir clientes cadastrados
        System.out.println("Clientes Cadastrados: ");
        for (Cliente lista: listaCliente){
            System.out.println(lista.getCodigo() + " - " + lista.getNome());
        }

        Scanner leitor = new Scanner(System.in);
        //Solicitar o código do cliente
        System.out.println("Digite o código do cliente desejado: ");
        int codigoCliente = leitor.nextInt();

        //Buscando o cliente na lista
        Cliente clienteEscolhido = null;
        for (Cliente cliente: listaCliente){
            if (cliente.getCodigo() == codigoCliente){
                clienteEscolhido = cliente;
                break;
            }
        }

        if (clienteEscolhido == null){
            System.out.println("Código de cliente inválido!");
        }

        //Exibir produtos na lista
        System.out.println("Produtos Cadastrados");
        for (Produto listando: listaProduto){
            System.out.println(listando.getCodigo() + " - " + listando.getDescricao());
        }
        //Solicitar código do produto
        System.out.println("Insira um código de produto");
        int codProduto = leitor.nextInt();
        //Buscando o produto na lista
        Produto produtoEscolhido = null;
        for (Produto produto: listaProduto){
            if (produto.getCodigo() == codProduto){
                produtoEscolhido = produto;
                break;
            }
        }
        if (produtoEscolhido == null){
            System.out.println("Código de produto inválido!");
        }

        //Solicitar a quantidade do produto
        System.out.println("Insira a quantidade do produto");
        int qtdProduto = leitor.nextInt();
        if (qtdProduto<=produtoEscolhido.getEstoque()){
            produtoEscolhido.setEstoque(produtoEscolhido.getEstoque()-qtdProduto);
        } else {
            System.out.println("Saldo de estoque insuficiente: " + produtoEscolhido.getEstoque());
        }


        Pedido pedido1 = new Pedido(clienteEscolhido,produtoEscolhido,qtdProduto);
        List<Pedido> listaPedido = new ArrayList<>();
        listaPedido.add(pedido1);

        for (Pedido pedido: listaPedido){
            System.out.println("Código do cliente: " + pedido.getCliente().getCodigo() + " " + pedido.getCliente().getNome());
            System.out.println("Código do produto: " + pedido.getProduto().getCodigo() + " " + pedido.getProduto().getDescricao());
            System.out.println("Quantidade: " + pedido.getQtdItem());
        }





    }
    
}
