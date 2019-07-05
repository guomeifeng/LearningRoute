/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kelly
 */
public class FindMinimalPositiveInteger {

    public int solution(int[] A) {
        
        int goal = 1;
        for (int i = 0; i < A.length; i++) {
            int tempMinIndex = i;
            int tempMinNum = A[i];

            for (int j = i + 1; j < A.length; j++) {
                if (tempMinNum > A[j]) {
                    tempMinNum = A[j];
                    tempMinIndex = j;
                }
            }
            System.out.print(tempMinNum);

            if (A[tempMinIndex] > goal) {
                return goal;
            } else {
                A[tempMinIndex] = A[i];
                A[i] = tempMinNum;
                if (A[i] <= 0) {
                    goal = 1;
                } else {
                    goal = A[i] + 1;
                }
            }
        }
        return goal;
    }

    public static void main(String args[]) {
        int A[] = {1,3,6,4,1,2};
        FindMinimalPositiveInteger instance = new FindMinimalPositiveInteger();
        int s = instance.solution(A);
        System.out.println("    "+s);
    }
}
