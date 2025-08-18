class ListNode:
    def __init__(self, val):
        self.val = val
        self.next = None
class LinkedList(self):
    self.head=None


# traversing the linkedList
    def traverse(self):
        current=self.head
        while current:
            print(current.val,"-->")
            current=current.next
        print("none")
# insert element at the start 
    def addAtstart(self):
        newnode=ListNode(val)
        newnode.next=self.head
        self.head=newnode
# insert element at the end 
    def addatend(self):
        newnode=ListNode(val)
        if not self.head:
            self.head=newnode
            return
        current=self.head
        while current.next:
            current=current.next
        current.next=newnode
# insert at position
    def addatpostion(self,pos):
        newnode=ListNode(val)
        if(pos==1):
            newnode.next=self.head
            self.head=newnode
        current =self.head
        count =1
        while current is not None and count<pos-1:
            current=current.next
            count =count+1
        if current is None:
            print("Position out of range")
            return
        
        # Insert the new node
        newnode.next = current.next
        current.next = newnode


