package main;

import cargo.CargoJunior;
import cargo.CargoPleno;
import cargo.CargoSenior;

public class Main {
    public static void main(String[] args) {
        CargoJunior cargoJunior= new CargoJunior("Desenvolvedor Junior", 1000D, "VT");
        CargoPleno cargoPleno= new CargoPleno("Desenvolvedor Pleno", 1500D, "VT");
        CargoSenior cargoSenior= new CargoSenior("Desenvolvedor Senior", 2000D, "VT, PPR");

        System.out.println(" Nome do cargo: " + cargoJunior.getNome() + "\n Salário base: " + cargoJunior.getSalarioBase() + "\n Beneficio: " + cargoJunior.getBeneficio());
        System.out.println("---------------------------");
        System.out.println(" Nome do cargo: " + cargoPleno.getNome() + "\n Salário base: " + cargoPleno.getSalarioBase() + "\n Beneficio: " + cargoPleno.getBeneficio());
        System.out.println("---------------------------");
        System.out.println(" Nome do cargo: " + cargoSenior.getNome() + "\n Salário base: " + cargoSenior.getSalarioBase() + "\n Beneficio: " + cargoSenior.getBeneficio());
    }
}

