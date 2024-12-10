package prog2.Exercicio_2;

public class Moto implements IVeiculo {
    //Declarando Variáveis
    String modelo = "moto";
    boolean veiculoLigado = false, vidroAberto = false, alarmeLigado = false, acelerando = false;
    int m;

    public Moto(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        if(acelerando == true){
            System.out.println("\n" + this.modelo + " já está acelerando!");
        } else {
            System.out.println("\n" + this.modelo + " começa a acelerar!");
            acelerando = true;
        }
    }
    @Override
    public void frear() {
        if(acelerando == true){
            System.out.println("\n" + this.modelo + " freou!");
            this.acelerando = false;
        } else {
            System.out.println("\n" + this.modelo + " está parado!");
        }
    }
    @Override
    public void buzinar() {
        System.out.println("\n" + this.modelo + " fez bee bee!");
    }
}
