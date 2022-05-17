class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        Node ptr = head;
        while(ptr != null){
            if(ptr.data == 0){
                count0++;
                ptr = ptr.next;
            }
            else if(ptr.data == 1){
                count1++;
                ptr = ptr.next;
            }
            else if(ptr.data == 2){
                count2++;
                ptr = ptr.next;
            }
        }
        ptr = head;
        while(count0-- > 0 && ptr != null){
            ptr.data = 0;
            ptr = ptr.next;
        }
        while(count1-- > 0 && ptr != null){
            ptr.data = 1;
            ptr = ptr.next;
        }
        while(count2-- > 0 && ptr != null){
            ptr.data = 2;
            ptr = ptr.next;
        }
        return head;
    }
}