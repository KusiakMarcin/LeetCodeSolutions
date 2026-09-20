import solutions.AddTwoNumbers.ListNode;
import solutions.AddTwoNumbers.AddTwoNumbers;


class Main
{
    public static void main(String []args)
    {

       ListNode q = new ListNode(6);
       ListNode w = new ListNode(5,new ListNode(6,new ListNode(4)));


       AddTwoNumbers n = new AddTwoNumbers();


       System.out.println(n.addTwoNumbers(q,w));
    }
}
