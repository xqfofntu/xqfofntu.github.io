package 力扣;

/**
 * @Author xqf
 */
// 删除排序链表中的重复元素

public class Solution07 {
    public static void main(String[] args) {
//        public ListNode deleteDuplicates(ListNode head) {
//            ListNode prehead = head;
//            while(prehead != null && prehead.next != null){
//                if(prehead.val == prehead.next.val){
//                    prehead.next = prehead.next.next;
//                } else {
//                    prehead = prehead.next;
//                }
//            }
//            return head;
//        }


//删除排序列表中的重复元素，只保留不重复的元素
//        public ListNode deleteDuplicates(ListNode head) {
//            ListNode no1=new ListNode(0);no1.next=head;
//            ListNode p1=no1,p2=head;
//            int r=0;
//            while(p1.next!=null){
//                while(p2.next!=null&&p2.next.val==p1.next.val){
//                    p2=p2.next;
//                    r=1;//如果有重复节点则r置为1
//                }
//                if(r==1){
//                    p1.next=p2.next;//删掉重复节点
//                    p2=p2.next;//再指针后移！！这时候p1不用动！
//                    r=0;
//                }else{
//                    p1=p2;//指针后移!p1,p2都向后移动一下
//                    if(p2.next!=null)p2=p2.next;
//                }
//            }
//            return no1.next;
//        }

    }
}
