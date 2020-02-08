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
 * 
 */
public interface GameScore {
    /**
     * @throws hangman.exceptions.ExceptionValorInvalido
     * @pre correctCount es un numero natural, incorrectCount es un numero natural
     * @pos  apartir de los parametros calcula el puntaje
     * @param correctCount Numero de veces que la persona respondió correcto
     * @param incorrectCountNumero Numero de veces que la persona respondió incorrecto
     * @return score
     */
    public int calculateScore(int correctCount, int incorrectCount)throws ExceptionValorInvalido;
    
}
