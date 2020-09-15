Count 1's Question Link - https://practice.geeksforgeeks.org/problems/count-1s-in-binary-array-1587115620/1/?track=DSASP-Searching&batchId=154

class Ones{
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    public static int countOnes(int arr[], int N){
        int count = 0;
        int l = 0, r = N-1;
        while(l <= r){
            count = l + (r-l)/2;
            if(arr[count] == 1){
                l = count + 1;
            }
            else if(arr[count] == 0){
                r = count - 1;
            }
        }
        return l;
    }
    
}
