/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.test;

import hangman.exceptions.ExceptionValorInvalido;
import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author andres.gonzalez-ca
 */
public class GameScoreTest {
    
    
    /**
     * correctCount < 0  --->  ExceptionValorInvalido
     */
    @Test
    public void calculateScoreOriginal() {
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(-2,0);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
    }
    /**
     * correctCount > 0  --->  Integer
     */
    @Test
    public void calculateScoreOriginal2() {
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(res);
        assertEquals(100,res);
        
    }
    
    /**
     * incorrectCount < 0 ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScoreOriginal3() {
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(0,-2);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
        
    }

    /**
     * incorrectCount > 0 ---> Integer
     */
    @Test
    public void calculateScoreOriginal4() {
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(5,5);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(50,res);
    }
    /**
     * correctCount < 0  ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScorePower() {
        PowerScore score = new PowerScore();
        try{
            int res = score.calculateScore(-1,0);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
    }
    /**
     * (correctCount > 0  && 100+(5^^correctCount)-8*incorrectCount < 500) ---> Integer
     * 
     */
    @Test
    public void calculateScorePower2() {
        PowerScore score = new PowerScore();
        int res=-5;
        try {
            res = score.calculateScore(2,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(25,res);
        
    }
    /**
     * 100+(5^^correctCount)-8*incorrectCount > 500 ---> 500
     */
    @Test
    public void calculateScorePower3() {
        PowerScore score = new PowerScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(500,res);
        
    }
    
    /**
     *
     * incorrectCount < 0  ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScorePower4() {
        PowerScore score = new PowerScore();
        try{
            int res = score.calculateScore(0,-1);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
    }

    /**
     * (incorrectCount > 0 && 100+(5^^correctCount)-8*incorrectCount < 500) ---> Integer
     */
    @Test
    public void calculateScorePower5() {
        PowerScore score = new PowerScore();
        int res=-5;
        try {
            res = score.calculateScore(2,1);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(17,res);
     
    }
    /**
     * correctCount < 0  ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScoreBonusl() {
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(-1,0);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
    }
    /**
     * correctCount > 0  ---> Integer
     */
    @Test
    public void calculateScoreBonus2() {
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(2,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(20,res);
        
    }
    
    /**
     * incorrectCount < 0  ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScoreBonus3() {
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(0,-1);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
    }

    /**
     * incorrectCount > 0  ---> Integer
     */
    @Test
    public void calculateScoreBonus4() {
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,1);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    /**
     * CorrectCount = -1 && IncorrectCount=5 ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScoreOriginal1(){
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(-1,5);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
    }
    /**
     * CorrectCount = 5 && IncorrectCount=-1 ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScoreOriginalF2(){
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(5,-1);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
    }
    /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
    @Test
    public void calculateScoreOriginalF3(){
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(0,5);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(50,res);
    }
    /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
    @Test
    public void calculateScoreOriginalF4(){
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(100,res);
    }
    /**
     * CorrectCount = 0 && IncorrectCount=0
     */
    @Test
    public void calculateScoreOriginalF5(){
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(0,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        assertEquals(100,res);
    }
    /**
     * CorrectCount = -1 && IncorrectCount=5 ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScoreBonus1(){
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(-1,5);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
    }
    /**
     * CorrectCount = 5 && IncorrectCount=-1 ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScoreBonusF2(){
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(5,-1);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
    }
    /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
    @Test
    public void calculateScoreBonusF3(){
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,5);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
    @Test
    public void calculateScoreBonusF4(){
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(50,res);
    }
    /**
     * CorrectCount = 0 && IncorrectCount=0 
     */
    @Test
    public void calculateScoreBonusF5(){
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    /**
     * CorrectCount = -1 && IncorrectCount=5 ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScorePowerBonus1(){
        PowerScore score = new PowerScore();
        try{
            int res = score.calculateScore(-1,5);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
    }
    /**
     * CorrectCount = 5 && IncorrectCount=-1 ---> ExceptionValorInvalido
     */
    @Test
    public void calculateScorePowerBonus2(){
        PowerScore score = new PowerScore();
        try{
            int res = score.calculateScore(5,-1);
        }catch(ExceptionValorInvalido e){
            assertTrue(true);
        }
        
    }
    /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
    @Test
    public void calculateScorePowerBonus3(){
        PowerScore score = new PowerScore();
        int res=-5;
        try {
            res = score.calculateScore(0,5);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
    @Test
    public void calculateScorePowerBonus4(){
        PowerScore score = new PowerScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(500,res);
    }
    /**
     * CorrectCount = 0 && IncorrectCount=0 
     */
    @Test
    public void calculateScorePowerBonus5(){
        PowerScore score = new PowerScore();
        int res=-5;
        try {
            res = score.calculateScore(0,0);
        } catch (ExceptionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    
}
