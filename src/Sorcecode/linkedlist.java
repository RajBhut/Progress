public class linkedlist {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addfirst(3);
        list.addfirst(2);
        list.addlast(4);
        list.printlist();
        list.addfirst(1);
        list.addfirst(0);
       list.printlist();
//      list.head = list.reverse(list.head);
//list.printlist();
      list.reverseBetween(list.head, 1,3);
      list.printlist();




       // System.out.println(list.size());
        int[] arr = {5,4,3,2,1,};

        linkedlist list2 = new linkedlist();
        for (int i = 0 ; i < arr.length;i++)
        {
            list2.addlast(arr[i]);
        }


    }
    Node head;
    public int count = 0;


    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void addfirst(int data)
    {
        count++;
        Node newnode = new Node(data);

        if(head ==null)
        {
            head = newnode;
            return;
        }
        newnode.next = head;
       head = newnode;
    }
    public int size()
    {
        return count;
    }
    public int nodeat(int idx )
    {
        if(idx > count-1)
        {
            System.out.println("Index is not valid!");
            return 0;

        }
        int check =0;
        Node current = head;
        while ( check != idx)
        {
            current = current.next;
            check++;
        }
       return current.data;
    }
    public void addlast(int data)
    {
        count++;
        Node newnode = new Node(data);
        Node currentnode = head;
        if(head == null)
        {
            head = newnode;
            return;
        }
        while (currentnode.next != null)
        {
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;

    }
    public void deletfirst()
    {
        if (head == null)
        {
            System.out.println("List is allrady emty!");
            return;
        }

        head = head.next;
        count--;
    }
    public void deletlast()
    {
        if(head == null)
        {
            System.out.println("Allrady ampty!");
            return;
        }
        if (head.next == null)
        {
            head = null;
        }
        Node last = head.next;
        Node secondlast = head;
        while (last.next != null)
        {
            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;
        count--;
    }
    public void  printlist()
    {
        if (head == null)
        {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current != null)
        {
            System.out.print(  current.data + "->");
            current = current.next;

        }
        System.out.print("Null");
        System.out.println();
    }
    public Node reverse(Node head)
    {
        Node current = head;
        Node previous = null;

        while(current != null)
        {
         Node   next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        return previous;
    }


        public Node reverseBetween(Node head, int left, int right) {
        if(head == null || head.next == null )
        {
            return head;
        }
        Node dummyhead = new Node(-1);


        dummyhead.next = head;
        Node leftprv = dummyhead;
        Node current = head;
      for (int i =0; i < left-1; i++)
        {
            leftprv = leftprv.next;
            current = current.next;

        }
        Node pre = null;
        Node sublistnode = current;


        for (int i = 0 ; i<= right-left; i++) {
        Node next = current.next;
        current.next = pre;
        pre = current;
        current = next;
        }
        leftprv.next = pre;
        sublistnode.next = current;
        linkedlist.this.head = dummyhead.next;
        return dummyhead.next;


        }
//public Node reverseBetween(Node head, int left, int right) {
//    if (head == null || head.next == null || left == right) {
//        return head;
//    }
//
//    Node dummyHead = new Node(-1);
//    dummyHead.next = head;
//    Node prev = dummyHead;
//
//    // Move to the node just before the 'left' position
//    for (int i = 1; i < left; i++) {
//        prev = prev.next;
//    }
//
//    Node current = prev.next;
//    Node next;
//
//    // Reverse the sublist between 'left' and 'right'
//    for (int i = left; i < right; i++) {
//        next = current.next;
//        current.next = next.next;
//        next.next = prev.next;
//        prev.next = next;
//    }
//
//    return dummyHead.next;
//}


}
