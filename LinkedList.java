public class LinkedList {
    private Link  first;

    public LinkedList(){
        first = null;
    }
    public boolean isEmpty(){
        return  first == null;
    }

    //method to insert a new node at thr beginning
    public void insertFirst(int id, int mark){
        Link newLink = new Link(id, mark);
        newLink.next = first;
        first = newLink;
    }
    //method to insert a new node after first one
    public boolean insertAfter(int key, int id, int mark){
        Link current = first;
        while (current != null && current.id != key){
            current = current.next;
        }
        if (current == null)return false;

        Link newLink = new Link(id, mark);
        newLink.next = current.next;
        current.next = newLink;
        return true;
    }
    //method to find anode by ID
    public Link find(int key){
        Link current = first;

        while(current != first){
            if (current.id == key)return current;
            current = current.next;
        }
        return null;
    }
    //method to delete first
    public Link deleteFirst(){
        if(first == null)return null;
        Link temp = first;
        first = first.next;

        return temp;
    }
    //method delete
    public boolean delete(int key){
        if(first == null)return false;

        if(first.id == key){
            first = first.next;
            return true;
        }
        Link current = first;
        Link previous = null;

        while (current != null && current.id != key){
            previous = current.next;
            current = current.next;
        }
        if(current == null)return false;
        previous.next = current.next;
        return true;
    }
    public void displayList(){
        Link current = first;

        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }
}
