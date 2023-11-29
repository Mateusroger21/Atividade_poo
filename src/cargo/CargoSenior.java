package cargo;

public class CargoSenior extends Cargo {
    private  Double salarioBase;
    public CargoSenior(String nome, Double salarioBase, String beneficio) {
        super(nome, salarioBase, beneficio);
        this.salarioBase=salarioBase;
    }
    public Double getSalarioBase() {
        return this.salarioBase;
    }
}
