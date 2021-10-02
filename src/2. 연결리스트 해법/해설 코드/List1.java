public class List1{
    void deleteDups(LinkedListNode n){
        HashSet set = new HashSet();
        LinkedListNode previous = null;
        while (n != null){
            if (set.contains(n.data)){
                previous.next = n.next;
            } else{
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }
}