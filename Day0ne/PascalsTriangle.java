package Day0ne;
import java.util.*;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.
*/

public class PascalsTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer> > res = new ArrayList<List<Integer>>();
        List<Integer> row , col = null;

        for (int i = 0; i < n; i++) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++)
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(col.get(j - 1) + col.get(j));
            col = row;
            res.add(row);
        }
        return res;
    }
}
