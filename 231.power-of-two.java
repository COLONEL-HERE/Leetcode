/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    boolean x;
    public boolean isPowerOfTwo(int n) {
        System.out.println(n);
        if( n == 0) return true;
        else x = false;
        x = isPowerOfTwo(n/2); 
        return x;

    }
}
// @lc code=end

