package projetologistica;

import cadastro.Funcionario;
import cadastro.Produto;
import cadastro.Veiculo;

/**
 * @author Luiz Carlos
 */
public class ProjetoLogistica {
    public static void main(String[] args) {
        
        Funcionario[] f = new Funcionario[3];
        f[0] = new Funcionario(3, "Aline Franco", "Assist. Adm.", 2800f);
        f[1] = new Funcionario(4, "Pedro Coelho", "Motorista", 2500f);
        f[2] = new Funcionario(5, "Lucas Silva", "Ajudante", 2300f);
        System.out.println(f[2].exibir());
        
        Veiculo[] v = new Veiculo[3];
        v[0] = new Veiculo(121, "Mercedez Benz", 20000);
        v[1] = new Veiculo(122, "Volvo", 25000);
        v[2] = new Veiculo(123, "Scania", 30000);
        System.out.println(v[2].exibir());
        
        Produto[] p = new Produto[3];
        p[0] = new Produto(111, "Cafe EF 1Kg", 1, 20.0f);
        p[1] = new Produto(121, "Achocolatado LT 1kg", 1, 8.0f);
        p[2] = new Produto(122, "Cafe Trad 1kg", 1, 15.0f);
        System.out.println(p[2].exibir());
        
    }
    
}
