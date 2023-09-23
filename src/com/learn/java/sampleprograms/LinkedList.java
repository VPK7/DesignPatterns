package com.learn.java.sampleprograms;

import java.util.HashSet;

public class LinkedList {

   static class Node{
        int val;
        Node next;
        Node(){

        }
        Node(int val){
            this.val=val;
        }
        Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }

    public static Node findMiddle(Node head){
        if(head==null)
            return head;
        Node sp=head;
        Node fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        return sp;
    }
    public static Node duplicates(Node head){
        HashSet<Integer> set=new HashSet<>();
        Node ptr=head;//1->1->2
        Node prev=head;
        while (ptr!=null){
            if(set.contains(ptr.val)){
                prev.next=ptr.next;
                ptr=prev.next;
            }else {
                set.add(ptr.val);
                prev = ptr;
                ptr = ptr.next;
            }

        }
        return head;
    }

    public static  int findMax(int[] nums){
       int dp[]=new int[nums.length];
       dp[0]=nums[0];
       dp[1]=nums[1];
       for(int i=2;i<nums.length;i++){
           dp[i]=dp[i-2]+nums[i];//{2,7,11,10,12,20}
       }
       return dp[nums.length-1];

    }

    public static Node rotate(Node head,int k){
        if(head==null || head.next==null || k<0)
            return head;

        Node curr=head;
        int len=1;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        curr.next=head;
        int skip=len-k%len;
        while(skip-- > 0){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
    public static int length(Node node){
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        //Node node=findMiddle(head);
//        Node node=duplicates(head);
//        while (node!=null){
//            System.out.println(node.val+" ");
//            node=node.next;
//        }
       // System.out.println(findMax(new int[]{2,7,9,3,1,10}));
        Node node=rotate(head,2);
        while (node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
    }
}
