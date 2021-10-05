/*재귀 변수를 이용하여 List2 문제를 해결하는 과정

해설에는 LinkedListNode로 구현하여 똑같이 구현이 어려움. (LinkedListNode는 직접 클래스를 제작하여야 하는 것으로 보임)

따라서 LinkedList의 내부 값을 Integer로 고정하여 문제를 해결하려고 하였으나 이 경우, itr을 첫 번째 findIt부터 생성하여 계속 매개변수에 넣어줘야 함.

구현하긴 했으나, 재귀 함수 연습을 위해 구현하였고 차라리 Index 값을 static으로 지정하여 문제를 해결하는 게 더 효율적임.*/

public class List2 {
    public static void main(String[] args) {
        LinkedList < Integer > list = new LinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("결과입니다.");
        System.out.println(findIt(list, 6));
    }
    static class Index {
        public int value = 0;
    }
    static Integer findIt(LinkedList head, int k) {
        Index idx = new Index();
        Iterator < Integer > itr = head.iterator();
        return findIt(k, idx, itr);
    }
    static Integer findIt(int k, Index idx, Iterator < Integer > itr) {
        Integer list = findIt(itr.next(), k, idx, itr);
        idx.value = idx.value + 1;
        if (idx.value == k) {
            return itr.next();
        }
        return list;
    }
    static Integer findIt(Integer head, int k, Index idx, Iterator < Integer > itr) {
        if (itr.hasNext() == false) {
            return null;
        } else {
            Integer list = findIt(itr.next(), k, idx, itr);
            idx.value = idx.value + 1;
            if (idx.value == k) {
                return head + 1;
            }
            return list;
        }
    }
}