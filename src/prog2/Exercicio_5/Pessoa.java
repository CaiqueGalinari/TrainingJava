package prog2.Exercicio_5;

public class Pessoa {
    private String nome;
    private int idade;

    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    //Na main vc vai só chamar e imprmir os métodos com várias "pessoas" diferentes, muito massante e sem propósito, portanto não vou fazer
}
