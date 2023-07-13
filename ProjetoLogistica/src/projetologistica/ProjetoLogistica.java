package projetologistica;


import cadastro.Funcionario;
import cadastro.Produto;
import cadastro.Veiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Luiz Carlos
 */
public class ProjetoLogistica {
    public static void main(String[] args) {
        
        /**Funcionario[] f = new Funcionario[3];
        f[0] = new Funcionario(3, "Aline Franco", "Assist. Adm.", 2800f);
        f[1] = new Funcionario(4, "Pedro Coelho", "Motorista", 2500f);
        f[2] = new Funcionario(5, "Lucas Silva", "Ajudante", 2300f);
        System.out.println(f[2].exibir());
         */


        List<Funcionario> func =new ArrayList<>();

        Funcionario a = new Funcionario(3, "Aline Franco", "Assist. Adm", 2800f);
        Funcionario b = new Funcionario(4, "Paloma Oliveira", "Motorista", 2500f);
        Funcionario c = new Funcionario(5, "Luma de Assis", "Ajudante", 2300f);

        func.add(a);
        func.add(b);
        func.add(c);
        Collections.sort(func);
        System.out.println("Lista de Funcionários: " + func);




        
        Veiculo[] v = new Veiculo[3];
        v[0] = new Veiculo(121, "Mercedez Benz", 20000);
        v[1] = new Veiculo(122, "Volvo", 25000);
        v[2] = new Veiculo(123, "Scania", 30000);
        System.out.println(v[2].exibir());
        
        Produto[] p = new Produto[3];
        p[0] = new Produto(111, "Cafe EF 1Kg", 1, 20.0f, 100);
        p[1] = new Produto(121, "Achocolatado LT 1kg", 1, 8.0f, 100);
        p[2] = new Produto(122, "Cafe Trad 1kg", 1, 15.0f, 100);
        System.out.println(p[2].exibir());

        /**
        Cliente[] cli = new Cliente[3];
        c[0] = new Cliente(777, "Supermercado X", "Rua FG", 10);
        c[1] = new Cliente(771, "Padaria W", "Rua AC", 9);
        c[2] = new Cliente(771, "Açougue N", "Rua CD", 8);



        Pedido[] pd = new Pedido[2];
        pd[0]= new Pedido(c[1], p[1], 50);
        pd[0].realizarVenda();
         */

        /*
        for(int i=0; i<c.length; i++){
            System.out.println(c[i].getRaio());
        }
        */
    }
    
}
