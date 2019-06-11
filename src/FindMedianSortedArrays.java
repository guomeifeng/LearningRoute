
import java.util.ArrayList;

//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//You may assume nums1 and nums2 cannot be both empty.
//
//Example 1:
//
//nums1 = [1, 3]
//nums2 = [2]
//
//The median is 2.0
//Example 2:
//
//nums1 = [1, 2]
//nums2 = [3, 4]
//
//The median is (2 + 3)/2 = 2.5
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> organizedArray = new ArrayList<>();
        int j1 = 0;
        int j2 = 0;
        for (int i=0; i<nums1.length+nums2.length; i++){
            if (nums1.length>j1&&nums2.length>j2) {
                if (nums1[j1]<nums2[j2]){
                    organizedArray.add(nums1[j1]);
                    j1++;
                }else{
                    organizedArray.add(nums2[j2]);
                    j2++;
                }
            } else if (nums1.length<=j1){
                organizedArray.add(nums2[j2]);
                j2++;
            } else {
                organizedArray.add(nums1[j1]);
                j1++;
            }
        }
        if ((nums1.length+nums2.length) % 2 == 0){
            return (double) (organizedArray.get((nums1.length+nums2.length)/2)+organizedArray.get((nums1.length+nums2.length)/2-1))/2;
        }else{
            return (double) organizedArray.get((nums1.length+nums2.length)/2)   ; 
        }
    }
    
        public static void main (String[] args){
        FindMedianSortedArrays test = new FindMedianSortedArrays();
        int[] nums1 = {2,3};
        int[] nums2 = {};
        test.findMedianSortedArrays(nums1,nums2);
    }
}
