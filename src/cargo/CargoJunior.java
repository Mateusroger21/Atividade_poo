package cargo;

public class CargoJunior extends Cargo {
    private  Double salarioBase;
    public CargoJunior(String nome, Double salarioBase, String beneficio) {
        super(nome, salarioBase, beneficio);
        this.salarioBase=salarioBase;
    }
    public Double getSalarioBase() {
        return this.salarioBase;
    }

}
