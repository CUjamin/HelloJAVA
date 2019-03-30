package cuj.jianzhioffer.chapter2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by cujamin on 2017/9/3.
 */
public class Chapter2 {
    static String str1="0123456789";

    private void main()
    {

    }
    static boolean foo(char c)
    {
        System.out.print(c);
        return true;
    }
//    public static void main( String[] argv )
//    {
//
//        String str2=str1.substring(5);
//        int i = 0;
//        for ( foo('A'); foo('B') && (i < 2); foo('C'))
//        {
//            i++ ;
//            foo('D');
//        }
//    }

    public static void main(String[]args)
    {
        boolean b=true?false:true==true?false:true;
        System.out.println(b);
        Hashtable ht = new Hashtable();
        ht.put(null,null);
//        testSeachInArray();
        Vector vt = new Vector();
        vt.add(null);




        Hashtable hashtable = new Hashtable();
        HashMap hashMap = new HashMap();
        Stack sk = new Stack();

        String[] strs = {"A","B"};
        List<String> ay = Arrays.asList(strs);
    }

    /**
     * 二维数组中查找
     * 1 2 8 9
     * 2 4 9 12
     * 4 7 10 13
     * 6 8 11 15
     * 查找7和5
     * 找到返回true
     * 否则返回false
     */
    public static void testSeachInArray()
    {
        int[][] nums = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 5;
        System.out.println(seachInArray(nums,target));
    }
    public static boolean seachInArray(int[][] nums , int target )
    {
        boolean result = false;
        if(null!=nums)
        {
            int i = 0;
            int j = nums[0].length-1;
            while(i<nums.length&&j>=0)
            {
                if(nums[i][j]==target)
                {
                    result =true;
                    break;
                }
                else if(nums[0][j]>target)
                {
                    --j;
                }
                else
                {
                    ++i;
                }
            }
        }
        return result;
    }

    /**
     * String
     */
    public static void testString()
    {
        char[] cstr = {'h','e','l'};
        String str = "hel";

    }


    /**
     * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(
     * 注意: 在返回值的list中，数组长度大的数组靠前)
     */
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null) return listAll;

        list.add(root.val);
        target -= root.val;

        if(target == 0 && root.left == null && root.right == null){
            listAll.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        //回退
        list.remove(list.size()-1);
        return listAll;
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
