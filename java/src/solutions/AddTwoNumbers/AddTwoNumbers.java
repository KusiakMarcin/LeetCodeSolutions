package solutions.AddTwoNumbers;




public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n, cursor ;
        n = new ListNode(0);
        int carry = 0;
        cursor = n;



        while(l1!= null)
        {

            cursor.val= l1.val;
            if(l1.next!=null){
                cursor.next= new ListNode();
                cursor = cursor.next;
            };
            l1 = l1.next;


        }
        cursor = n;
        while(l2!= null)
        {

            int l = cursor.val;
            cursor.val= (l + l2.val+carry)%10;
            if(l+ l2.val+carry>9) {carry = 1;}
            else {carry = 0;}
            if(cursor.next==null&&(l2.next!=null||carry==1)) cursor.next = new ListNode();
            cursor = cursor.next;
            l2 = l2.next;


//            if(cursor.next!=null){
//                if(l2.next==null) cursor.next.val +=1;
//                cursor = cursor.next;
//            }
//            else{
//                if(l2.next!=null||carry!=0){
//                    cursor.next= new ListNode(carry);
//                    carry = 0;
//                    cursor = cursor.next;
//                }
//
//            }

        }

        while(carry==1&&l2==null){
            int l = cursor.val;
            cursor.val= (l+carry)%10;
            if(l+ carry>9) {carry = 1;}
            else {carry = 0;}
            if(cursor.next==null&&carry==1) cursor.next = new ListNode();
            cursor = cursor.next;
        }




        return n;

    }


}
