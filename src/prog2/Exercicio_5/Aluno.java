package prog2.Exercicio_5;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}
