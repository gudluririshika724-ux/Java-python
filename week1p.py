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
