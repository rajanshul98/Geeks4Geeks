//Question Link :- https://practice.geeksforgeeks.org/problems/square-root/1/?track=DSASP-Searching&batchId=154
// Function to find square root
// x: element to find square root
class SquareRoot
{
     long floorSqrt(long x)
	 {
        long s = 1, e = x;
        long val = 0;
        while(s <= e){
            val = s + (e-s)/2;
            long pwr2 = val * val;
            if(x == pwr2)
                return val;
            else if(pwr2 > x)
                e = val - 1; //if power of mid value is greater than x then search in left part
            else
                s = val + 1; //if power of mid value is greater than x then search in left part
        }
        return e; //When perfect SquareRoot is not there then return the value of end
	 }
}
