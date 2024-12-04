package prog2.Exercicio_2;

public interface Veiculo {

    //Código para colar na main e testar:
    /*

        Moto moto = new Moto("Bis");
        Carro carro = new Carro("Chevet");

        carro.acelerar();
        moto.acelerar();
        carro.buzinar();
        moto.buzinar();
        carro.frear();
        moto.frear();

        */

    default void acelerar(){}
    default void frear(){}
    default void buzinar(){}
    default void debrear(){}
    default void passarMarcha(){}
    default void ligarSom(){}
    default void abrirVidro(){}
    default void fecharVidro(){}
    default void ligarAlarme(){}
    default void desligarAlarme(){}
    default void ligarVeiculo(){}
    default void desligarVeiculo(){}
}
