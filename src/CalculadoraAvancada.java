public class CalculadoraAvancada extends Calculadora {
    float baseLog;

    public void raizQuadrada(){
        this.resultado = Math.sqrt(this.n1);
    }

    public void exponencial(){this.resultado = Math.pow(this.n1, this.n2);}

    public void logaritmo(){this.resultado = Math.log(this.n1);}

    // Não entendi a diferença de potência para exponencial. public void potencia(){}
}
