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
public class BonusScore implements GameScore {
        /**
     * @throws hangman.exceptions.ExceptionValorInvalido
     * @pre correctCount es un numero natural, incorrectCount es un numero natural
     * @pos se multiplica el incorrectCount por 10 y este resultado se lo restamos a 100 
     * luego el correctCount se multuplica por 10 y se lo sumamos al resultado que nos dió anteriormente 
     * @param correctCount Numero de veces que la persona respondió correcto
     * @param incorrectCount Numero de veces que la persona respondió incorrecto
     * @return el resultado de la poscondicion lo retornamos
     */
    public int calculateScore(int correctCount, int incorrectCount) throws ExceptionValorInvalido  {
        return 0;
    }
}
