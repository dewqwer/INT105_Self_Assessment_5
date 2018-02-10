/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myself;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dew2016_Wins10
 */
public class Self_Assessment_5Test {
    int[] score={100,30,60,20,80};
    int[] scoreOverLength={-100,30,60,20,80};
    
   @Test
   public void NumberLessthanZeroOrMorethanOneHundredReturnNull(){
       int[] result=Self_Assessment_5.findMinMax(scoreOverLength);
       assertNotNull(result);
   }
   
   @Test
   public void findMaxAndMin(){
       int[] result={20,100};
       int[] computed=Self_Assessment_5.findMinMax(score);
       assertArrayEquals(computed, result);
   }

   
}
