public class LL
{
    Node head;
    private  int count;

     LL() {
         this.count = 0;

    }
    public int size()
    {
        return count;
    }

    public static void main(String[] args) {
        LL linklist = new LL();
        linklist.addfirst(2);
        linklist.addlast(3);
        linklist.printlist();
        linklist.addfirst(1);
        linklist.addlast(4);
        linklist.printlist();
        System.out.println(linklist.size());
        linklist.addlast(5);
        linklist.printlist();
        System.out.println(linklist.size());
     //  linklist.deletfirst();

       linklist.deletelast();
        linklist.printlist();

    }
     class Node{

         int data ;

Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            count++;
        }
    }
    public  void addlast(int data)
    {

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
public void addfirst(int data)
{

    Node newnode = new Node(data);
    if(head == null)
    {
        head = newnode;
        return;
    }
    newnode.next = head;
    head = newnode;

}
public void printlist()
{

    if (head == null)
    {
        System.out.println("This list is empty");
        return;
    }
    Node current = head;
    while(current != null)
    {
        System.out.print(current.data + "->");
        current = current.next;

    }
    System.out.print("Null");
    System.out.println();
}
public void deletfirst()
{
    if(head == null)
    {
        System.out.println("Alrady empty");
        return;
    }

    head = head.next;
}
public void deletelast()
{
    if(head == null)
    {
        System.out.println("Alrady empty");
        return;
    }
    if(head.next == null)
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
    }
}
