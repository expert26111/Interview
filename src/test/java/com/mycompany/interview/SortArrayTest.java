/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Yoana
 */

public class SortArrayTest {
    
    int[] array = new int[7];

    
    //using the constructor instead of setUp()
    public SortArrayTest() 
    {
              for (int i=array.length-1; i>=0; i--)
            {
                 array[i]= i;
               
            }
    }
    

    /**
     * Test of sortArray method, of class SortArray.
     * Testing to check if it sorts correctly
     */
    @Test
   public void testSortArray() 
    {
        int[] expResult = {0,1,2,3,4,5,6};
        int[] result = SortArray.sortArray(array);
        assertArrayEquals(expResult, result);
       
    }

    @Test
    public void testSortArrayExpectedNumberElements() 
   {
       
        int[] result = SortArray.sortArray(array);
        assertThat(result.length, is(7));
       
    }
       
    @Test(expected = NullPointerException.class)
   public void testNullPointerException() 
    {
         
             int[] badarray = null;
             int[] result = SortArray.sortArray(badarray);
   }
    
       @Test
       public void testAscending() 
      {
                   Random random= new Random();
                   int[] array = new int[10];
                   //create random array of ints
                    for (int i = 0; i < 10; i++) 
                   {
                       int number= random.nextInt(100);
                      array[i]=number;
                   }


                int[] result = SortArray.sortArray(array);
                               for (int i = 0; i < result.length-1; i++)
                               {
                                   assertFalse(result[i] > result[i+1] );
                               }
        }
       
       
                    
    @Test
   public void testEmptyResult() 
    {
         
              int[] empty = new int[0];
              int[] result = SortArray.sortArray(empty);
              assertThat(result.length, is(0));
   }
             
 }
    
    
    
    

