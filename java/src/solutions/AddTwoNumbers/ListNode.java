package solutions.AddTwoNumbers;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString()
    {
        String tmp ="";
        ListNode cursor = next;
        tmp = tmp + String.valueOf(val);
        while(cursor!= null){

            tmp = tmp + String.valueOf(cursor.val);
            cursor = cursor.next;
        }
        return tmp;
    }
}
