package Exercise2Prog2;

public class Carro implements Veiculo {
    String modelo;
    boolean veiculoLigado = false, vidroAberto = false, alarmeLigado = false, acelerando = false;
    int m;

    public Carro(String modelo) {
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
        System.out.println("\nbee bee!");
    }
    @Override
    public void debrear() {
        System.out.println("\n" + this.modelo + " debreou!");
    }
    //parei por aqui, não vi sentido em continuar.
}
