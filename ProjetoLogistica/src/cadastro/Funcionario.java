package cadastro;
public class Funcionario extends Pessoa implements Comparable<Funcionario>{
    private int id;
    private String cargo;
    private float salario;

    public Funcionario(int id, String nome, String cargo, float salario) {
        this.id = id;
        this.setNome(nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumentoSalario(float valor){
        
        this.setSalario(this.getSalario()+valor);
    }

    /**
    public String exibir(){
        return "Funcionário{" + "Id: " + this.getId() 
                + " Nome: " + this.getNome()
                + " Cargo: " + this.getCargo() + "}";        
    }
    */

    @Override
    public String toString(){
        return this.nome;
    }
    @Override
    public int compareTo(Funcionario funcionario){
        return this.nome.compareTo(funcionario.getNome());
    }
    
    
}
