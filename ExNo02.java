/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsg;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author DP
 */
public class ExNo02 
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,1,5};
        int targetSum=6;
        sumSubArrays(arr,targetSum);
    }
    static void sumSubArrays(int []arr,int targetSum)
    {
        ArrayList<ArrayList<Integer>> subArrays=new ArrayList<>();int sum=0;      
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    al.add(arr[k]);
                }
                subArrays.add(al);
                al=new ArrayList<>();
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<subArrays.size();i++)
        {
            int s=0;
            for(int j=0;j<subArrays.get(i).size();j++)
            {
                s+=subArrays.get(i).get(j);
            }
            if(s==targetSum)
                System.out.print(subArrays.get(i)+" ");
        }
    }

    
    
        
}
