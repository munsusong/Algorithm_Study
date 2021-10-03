public class List2{
    public static void main(String[] args) {
        
    }
    
    class Index{
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
        LinkedList list = findIt(head.)
    }
}