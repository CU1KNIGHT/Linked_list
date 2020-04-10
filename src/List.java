public class List {
    //List, which represents a linked list itself.
    private ListElement head;
    private int size;

    List() {
        head = new ListElement("hello world!");
        size = 0;
    }

    // append function: It must be possible to append a new element to the end of the list with the method
    public List append(String content) {
        ListElement curr = this.head;
        ListElement prev = null;
        while (curr != null) {
            if (curr.getNext() == null) {
                curr.setNext(new ListElement(content));
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }
        this.size++;
        return this;
    }


    // remove function: It must remove the first element whose content equals the given argument and return the removed element’s content or null if no element was removed.

    public String remove(String content) {
        if (content == null || content.equals("")) {
            throw new IllegalArgumentException("content can't be null");
        }
        ListElement curr = this.head;
        ListElement prev = null;
        while (curr != null) {
            if (curr.getContent().equals(content)) {
                prev.setNext(curr.getNext());
                curr.setNext(null);
                return curr.getContent();
            }
            prev = curr;
            curr = curr.getNext();
        }
        return null;
    }

    public int getSize() {
        return size;
    }


    public void show() {
        ListElement curr = this.head;
        ListElement prev = null;
        while (curr != null) {
            //            System.out.println(curr);
            System.out.println(curr.getContent());
            prev = curr;
            curr = curr.getNext();
        }
    }
}
