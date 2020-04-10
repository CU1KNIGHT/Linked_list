public class ListElement {
    //ListElement, which represents one element of the list.

    private String content;
    private ListElement next;

    ListElement(String content) {
        this.content = content;
        if (content == null || content.equals("")) {
            throw new IllegalArgumentException("content can't be null");
        }
         ListElement next = null;

    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        if (content == null || content.equals("")) {
            throw new IllegalArgumentException("content can't be null");
        }
        this.next = next;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content == null || content.equals("")) {
            throw new IllegalArgumentException("content can't be null");
        }
        this.content = content;
    }
}
