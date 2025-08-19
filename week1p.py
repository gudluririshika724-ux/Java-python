class ListNode:
    def __init__(self, val):
        self.val = val
        self.next = None


class LinkedList:
    def __init__(self):
        self.head=None


# traversing the linkedList
    def traverse(self):
        current=self.head
        while current:
            print(current.val,"-->",end=" ")
            current=current.next
        print("none")


# insert element at the start 
    def addAtstart(self,val):
        newnode=ListNode(val)
        newnode.next=self.head
        self.head=newnode


# insert element at the end 
    def addatend(self, val):
        newnode=ListNode(val)
        if not self.head:
            self.head=newnode
            return
        current=self.head

        while current.next:
            current=current.next
        current.next=newnode

# insert at position
    def addatpostion(self,pos,val):
        newnode=ListNode(val)
        if pos==1:
            newnode.next=self.head
            self.head=newnode
            return
        
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

    def display(self):
        temp=self.head
        while(temp!=None):
            print(str(temp.val)+"-->",end=" ")
            temp=temp.next
        print("END")


ll=LinkedList()
ll.addAtstart(5)
ll.addatend(10)
ll.addatend(15)
ll.addatpostion(1,50)
ll.display()



