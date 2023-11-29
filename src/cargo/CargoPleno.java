package cargo;

public class CargoPleno extends Cargo {
    private  Double salarioBase;
    public CargoPleno(String nome, Double salarioBase, String beneficio) {
        super(nome, salarioBase, beneficio);
        this.salarioBase=salarioBase;
    }
    public Double getSalarioBase() {
        return this.salarioBase;
    }
}
