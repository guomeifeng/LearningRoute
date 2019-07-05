/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kelly
 */
public class FindMinMaxOnceInSort {
    public int[] solution(int[] A){
        
        for (int i=0; i<A.length/2; i++){
            int minNum = A[i], maxNum = A[i], minPos = i, maxPos = i;
            for (int j=i+1;j<A.length-i;j++){
                if (A[j]<minNum){
                    minNum = A[j];
                    minPos = j;
                }
                if (A[j]>maxNum){
                    maxNum = A[j];
                    maxPos = j;
                }
            }
            System.out.print(" min:" + minNum + " max:" + maxNum);
            A[minPos] = A[i];
            A[maxPos] = A[A.length - i - 1];
            A[i] = minNum;
            A[A.length - i - 1] = maxNum;
        }
        
        return A;
    }
    
    public static void main(String[] args){
        FindMinMaxOnceInSort instance = new FindMinMaxOnceInSort();
        int[] A = {2,3,0,5,1,9,8,4,7,10, 6};
        instance.solution(A);
        for (int i=0;i<A.length;i++){
            System.out.print("   "  +A[i]);
        }
    }
}
