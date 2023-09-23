package com.learn.java.sampleprograms.Trees;

import org.testng.annotations.Test;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

    public static void main(String[] args) {
        TreeNode node=null;
        assert false;
        int i=test(node).val;
        System.out.println(" value 0 : "+i);
    }

    public static TreeNode test(TreeNode root){
        if(root==null)
            return null;
        return root;
    }
}
