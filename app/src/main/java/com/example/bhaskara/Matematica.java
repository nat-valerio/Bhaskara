package com.example.bhaskara;

public class Matematica {

    public Double Exponenciacao(double base, int expoente) {

        Double resultado;
        int potencia;

        /*if (expoente == 0) {

            resultado = 1;

        } else if (expoente > 0) {
            resultado = base;
            for (int i = 2; i <= expoente; i++) {

                resultado *= base;

            }return resultado;
        }
        else if (expoente < 0){

            resultado = base;
            for (int i = 2; i <= expoente; i++) {

                resultado *= 1/base;

            }return resultado;


        }
        return resultado ;*/

        if (expoente == 0) return 1.0;

        resultado = base;
        potencia = expoente;

        if (expoente < 0) potencia *= -1;
        for (int i = 2; i <= potencia; i++){
            resultado *= base;
        }

        if (expoente < 0) resultado = 1.0 / resultado;
        return resultado;
    }

    public Double calculaDelta(double a, double b, double c){
        Double resultado;
        resultado = Exponenciacao(b, 2) - 4 * a * c;
        //resultado = Math.pow(b, 2) -4 * a * c (jeito certo);
        return resultado;

    }

    public Double[] calculaRaizesEq2Grau(double a, double b,double c){
        /*double a, b, c;
        double x1;
        double x2;
        double resultado;

        x1 = - b + Math.sqrt(cauculaDelta(resultado), 2) / 2 * a;
        x2 = - b - Math.sqrt(cauculaDelta(resultado), 2) / 2 * a;*/

        Double delta = calculaDelta(a, b, c);
        Double[] raizes = null;

        if (delta >= 0){
            raizes = new Double[2];

            raizes[0] = (- b + Math.sqrt(delta))/ (2 * a);

            if (delta > 0)
                raizes[1] = (- b - Math.sqrt(delta))/ (2 * a);
            else
                raizes[1] = raizes[0];
        }
        return raizes;




    }

}
