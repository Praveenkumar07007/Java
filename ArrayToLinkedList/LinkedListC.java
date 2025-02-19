public class LinkedListC {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i < arr.length; i++){
            Node node = new Node(arr[i]);
            temp.next = node;
            temp = node;
        }
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
