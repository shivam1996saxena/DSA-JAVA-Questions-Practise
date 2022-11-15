package Assignments_Searchin_Linear_and_Binary;

public class Searching_an_element_in_a_sorted_array {
    public static void main(String[] args) {

    }
    static int isPresent(long arr[], int n, long k)
    {
        // Your code here
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int medium = (start+end)/2;
            if (k==arr[medium]){
                return 1;
            }
            else if (k<arr[medium]){
                end = medium-1;
            }
            else if(k>arr[medium]){
                start = medium + 1;
            }
        }
        return -1;
    }
}
//    Problem Statement
//    Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is present in the array or not.
//
//        Note: Use binary search to solve the problem
//        Input
//        The first line of input contains a number of test cases T. For each test case, first line of input contains a number of elements in the array, and the number K separated by space. The next line contains N elements.
//
//        Constraints:
//        1 <= T <= 10
//        1 <= N <= 100000
//        1 <= K <= 1000000000
//        1 <= arr[i] <= 1000000000
//
//        Sum of N over all test cases doesn't exceed 106
//        Output
//        For each testcase, if the element is present in the array print "1" (without quotes), else print "-1" (without quotes).
//        Example
//        Sample Input:
//        2
//        5 6
//        1 2 3 4 6
//        5 2
//        1 3 4 5 6
//
//        Sample Output:
//        1
//        -1