public class List2{
    public static void main(String[] args) {
        Listnode<Integer> list = new LinkedList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

//         System.out.println("결과입니다. ");
//         for(Object i : findIt(list,5)){
//             System.out.println(i);
        }
           
    }
    
    static class Index{
        public int value = 0;
    }
    
    static LinkedList findIt(LinkedList head, int k){
        Index idx = new Index();
        return findIt(head, k, idx);
    }
    
    static LinkedList findIt(LinkedList head, int k, Index idx){
        if(head == null) {
            return null;
        }
        LinkedList list = findIt(head., k, idx);
        idx.value = idx.value + 1;
        if(idx.value ==k){
            return head;
        }
        return list;
    }
}