public List2{
    LinkedListNode nthToLas(LinkedListNode head, int k){
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;
    }
    /*p1을 k노드만큼 이동시킨다*/
    for (int i = 0; i < k; i++){
        if (p1 == null) return null;
        p1 = p1.next;
    }
    
    /*p1과 p2를 함께 움직인다. p1이 끝에 도달하면, p2는 LENGTH-k번째 원소를 가리키게 된다*/
    while (p1 != null){
        p1 = p1.next;
        p2 = p2.next;
    }
    return p2;
}