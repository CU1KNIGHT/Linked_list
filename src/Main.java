public class Main {
    public static void main(String[] args) {
        List arr = new List();

        for (int i = 0; i < 10; i++) {
            arr.append("node "+ i);
//            System.out.println(arr.getSize());
        }
        System.out.println("+++++++++++++++++++++++");
        ListElement l1= new ListElement("h1");
        ListElement l2= new ListElement("h2");
        ListElement l3= new ListElement("h3");
        ListElement l4= new ListElement("h4");
        ListElement l5= new ListElement("h5");
        ListElement l6= new ListElement("h6");
//        arr.head.setNext(l1);
//        l1.setNext(l2);
//        l2.setNext(l3);
//        l3.setNext(l4);
        arr.show();

        System.out.println("+++++++++++++++++++++++");

//        arr.append("hello").getContent();
//        System.out.println( arr.append("hello").getNext());
//        arr.show();
        arr.remove("node 5");
        arr.show();
    }

}
