class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
// traverse the linked list 

class LinkedList{
    ListNode heaNode;

    public void traverse(){
        ListNode current=heaNode;

        while(current!=null){
            System.out.println(current.val +"->");
            current=current.next;
        }
         System.out.println("null");
    }
//insert at the start

    public void insertAthead(int val){
        ListNode newNode=new ListNode(val);
        newNode.next=heaNode;
        heaNode=newNode;

    }
// Insert at the end 

    public void insertAtTail(int val){
        ListNode newnode=new ListNode(val);
        if(heaNode==null){
            heaNode=newnode;
            return;

        }
        ListNode curr=new ListNode(val);
        while(curr.next!=null){
            curr=curr.next;

        }
        curr.next=newnode;

    }

    public static void main(String args[]){

    }
}