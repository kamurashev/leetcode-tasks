package org.zapto.trywithfun.sequentialdigits;

import java.util.ArrayList;
import java.util.List;

/**
 * 1291. Sequential Digits
 *
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 * @see <a href="https://leetcode.com/problems/sequential-digits/">Sequential Digits<a/>
 */
public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        var res = new ArrayList<Integer>();
        int val = 12, tmp = 12, next = 3, additive = 11;
        while (val <= high) {
            if (val >= low) {
                res.add(val);
            }
            val += additive;
            if (val % 10 == 0) {
                val = tmp = tmp * 10 + next;
                additive = additive * 10 + 1;
                next++;
                next = next > 9 ? 0 : next;
            }
        }
        return res;
    }
}
