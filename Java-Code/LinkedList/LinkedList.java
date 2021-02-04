public class LinkedList {
    private static class Node{
        String items;
        Node next;
    }
    private Node head = null;

    public void Printlist(){
        Node runner ;
        runner = head;
        while(runner!=null){
            System.out.println(runner.items);
            runner = runner.next;
        }
    }
    public boolean find(String str){
        Node runner;
        runner = head;
        while(runner!=null ){
            if(runner!=null && runner.items.equals(str))
            return true;
            runner = runner.next;

        }
        return  false;
    }
    public void Insert(String mystr){
        Node tempNode = new Node();
        tempNode.items = mystr;
        if(head == null){
            head = tempNode;
        }else if(head.items.compareTo(mystr)>=0){
            tempNode.next = head;
            head = tempNode;
        }else{
            Node runner, prev;
            runner = head.next;
            prev = head;
            while(runner!=null && runner.items.compareTo(mystr)<0){
                prev = runner;
                runner = runner.next;
            }
            tempNode.next = runner;
            prev.next = tempNode;
        }
    }
    public boolean deleteItem(String str){
        if(head==null){
            return false;
        }else if(head.items.equals(str)){
            head = head.next;
            return true;

        }else{
            Node runner, prev;
            runner = head.next;
            prev = head;
            while(runner!=null && runner.items.compareTo(str)<0){
                prev = runner;
                runner = runner.next;

            }
            if(runner!=null && runner.items.equals(str)){
                prev.next = runner.next;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.Insert("Habyba");list.Insert("Adam");list.Insert("Ibrahim");
        list.Printlist();
        System.out.println(list.deleteItem("Adam"));
        System.out.println(list.find("Adam"));

    }
}

