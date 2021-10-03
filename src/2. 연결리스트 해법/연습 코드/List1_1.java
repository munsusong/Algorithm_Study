public class List1{
    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 3, 3, 4));
        deleteDups(list);
    }
    public static void deleteDups(LinkedList list) {
        HashSet hs = new HashSet();
        for (int i = 0; i < list.size(); i ++) {
            if (hs.contains(list.get(i))) {
                list.remove(i);
                i --;
                System.out.println("delete");
            } else {
                hs.add(list.get(i));
            }
            System.out.println(list.size() + "  " + i);
        }
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }
}