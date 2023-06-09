package projetologistica;

import cadastro.Funcionario;

/**
 * @author Luiz Carlos
 */
public class ProjetoLogistica {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(9, "Pedro Coelho", "Motorista", 2500f);
        f1.setIdade(20);
        f1.aumentoSalario(200f);
        System.out.println(f1.exibir());
        System.out.println(f1.getSalario());
        
        
    }
    
}
