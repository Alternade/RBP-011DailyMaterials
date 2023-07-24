public class CustomLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int i){
            this.data = i;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int d){
        Node newNode = new Node(d);
        if (head == null){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;

    }

    public void addMiddle(int loc, int data){
        Node newNode = new Node(data);
        int count = 1;
        Node current = head;
        while (count < loc -1 ){
            current = current .next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;


    }

    public void delete(int loc){

        int count = 1;
        Node current = head;
        while (count < loc -1 ){
            current = current .next;
            count++;
        }
        current.next = current.next.next;
    }

    public void deleteValue(int value){


        Node current = head;
        int flag = 0;
        while (current.next != null){
            if(current.next.data == value){
                current.next = current.next.next;
                flag = 1;
            }
            current = current.next;
        }
        if (flag == 0){
            System.out.println("Element not found");
        }

    }

    public void displayList(){
        if (head == null){
            System.out.println("List is empty");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.data+ " ");
                current = current.next;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        CustomLinkedList list1 =new CustomLinkedList();
        list1.displayList();
        list1.addNode(10);
        list1.addNode(20);
        list1.addNode(30);
        list1.addNode(40);
        list1.addNode(50);
        list1.addNode(60);
        list1.displayList();
        list1.addMiddle(3,100);
        list1.displayList();
        list1.delete(5);
        list1.displayList();
        list1.deleteValue(900);
        list1.displayList();
    }

}

