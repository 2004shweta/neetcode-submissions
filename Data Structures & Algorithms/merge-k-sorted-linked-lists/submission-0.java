/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         if (lists == null || lists.length == 0) {
            return null;
        }
     int inter=1;
     while(inter<lists.length){
     for(int i=0;i+ inter<lists.length;i+=inter*2){
        lists[i]=merge(lists[i], lists[i+inter]);
     }
     inter*=2;
    }
    return lists[0];

    }
    ListNode merge(ListNode list1,ListNode list2){

        ListNode dummy= new ListNode(-1);
        ListNode curr=dummy;

        while(list1!=null && list2!=null){

            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        if(list1 != null) {
    curr.next = list1;
} else {
    curr.next = list2;
}
        return dummy.next;
    }
}
