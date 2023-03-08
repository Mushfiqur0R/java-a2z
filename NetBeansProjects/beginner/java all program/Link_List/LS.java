package Link_List;

import java.util.LinkedList;

public class LS {

    public static void main(String[] args) {
        LinkedList<String> yourName = new LinkedList<String>();
        yourName.add("M");
        yourName.add("U");
        yourName.add("S");
        yourName.add("H");
        yourName.add("F");
        yourName.add("I");
        yourName.add("Q");
        yourName.add("R");
        yourName.add(3, "RRR");
        yourName.addFirst("MEG");
        yourName.add("IRI");
        yourName.remove(9);
//        System.out.println(yourName);

        for (String Name : yourName) {
            System.out.println(yourName);
        }
        System.out.println("Size of the Linked List:" + yourName.size());
        System.out.println("1st name:"+yourName.getFirst());
        System.out.println("Lst name:"+yourName.getLast());
    }
}
