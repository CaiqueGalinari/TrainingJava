package prog2.Exercicio_2;

public interface IVeiculo {

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

    //Default antes do tipo que retorna para ter um corpo que é modificável na classe que implementa essa interface
    //Static antes do tipo que retorna para ter um corpo que NÃO é modificável na classe que implementa essa interface
    //Nada antes do tipo que retorna para NÃO ter um corpo (força com que seja implementado)
    void acelerar();
    void frear();
    void buzinar();
    //Comentei o resto por preguiça de implementar
    /*
    void debrear();
    void passarMarcha();
    void ligarSom();
    void abrirVidro();
    void fecharVidro();
    void ligarAlarme();
    void desligarAlarme();
    void ligarVeiculo();
    void desligarVeiculo();
     */
}
