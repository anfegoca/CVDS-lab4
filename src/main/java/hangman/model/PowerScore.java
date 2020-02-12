/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

import hangman.exceptions.ExceptionValorInvalido;

/**
 *
 * @author andres.gonzalez-ca
 */
public class PowerScore implements GameScore{
    /**
     * @throws hangman.exceptions.ExceptionValorInvalido
     * @pre correctCount es un numero natural, incorrectCount es un numero natural
     * @pos se multiplica el incorrectCount por 8 y se lo restamos a 100, luego a este resultado le sumamos 
     * 5 a la correctCount
     * @param correctCount Numero de veces que la persona respondió correcto
     * @param incorrectCount Numero de veces que la persona respondió incorrecto
     * @return el resultado de la poscondicion lo retornamos
     */
    public int calculateScore(int correctCount, int incorrectCount)throws ExceptionValorInvalido{
        int puntos = 0;
        if(correctCount>0){
            puntos += Math.pow(5,correctCount);
            puntos -= incorrectCount*8;
        }
        if(puntos < 0){
            puntos = 0;
        }else if(puntos > 500){
            puntos =500;
        }
        return puntos;
    }
    
}
