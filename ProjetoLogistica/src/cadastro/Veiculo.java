package cadastro;
public class Veiculo {
    private int matricula;
    private String modelo;
    private int capacidade;
    private boolean disponibilidade;
    
    public Veiculo(int matricula, String model, int cap ){
        this.setMatricula(matricula);
        this.setModelo(model);
        this.setCapacidade(cap);
        this.disponibilidade= true;
    }

    //sobrescrever esse método quando veículo estiver no plano
    public void viajando(){
        this.disponibilidade = false;
        System.out.println("Indisponível. Veículo em roteiro de entrega");
    }
    
    public void manutencao(){
        this.disponibilidade = false;
        System.out.println("Indisponível. Veículo em manutenção");
    }
   
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    
    public void setDisponibiliade(boolean disp){
        this.disponibilidade = disp;
    }
    
    
    public String exibir (){
        return "Veículo {Modelo: " + this.getModelo() 
                + " Matrícula: " + this.getMatricula()
                + " Capacidade total: " + this.getCapacidade() + "}";
    }
    
}
