package cargo;

public class Cargo {
    private  String nome;
    private  Double salarioBase;
    private  String beneficio;

    public Cargo (String nome, Double salarioBase, String beneficio) {
        this.nome=nome;
        this.salarioBase=salarioBase;
        this.beneficio=beneficio;
    }
    public String getNome() {
        return this.nome;
    }
    public Double getSalarioBase() {
        return this.salarioBase;
    }
    public String getBeneficio() {
        return this.beneficio;
    }

}
