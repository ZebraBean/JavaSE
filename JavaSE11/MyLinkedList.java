package Tests.JavaSE11;

public class MyLinkedList {  //不带头结点

    public Node head ;  //这个不算头结点，算是这个链表的第一个节点

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);

        if(this.head == null){    //注意这里要进行特判
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data){
        Node node =new Node(data);
        if(this.head == null){
            this.head = node;
        }else {
            Node cur = this.head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public Node searchPreNode(int data){   //返回结点data值为data的前一个结点
        Node p = this.head;
        while (p.next != null){
            if(p.next.data == data){
                return p;
            }
            p = p.next;
        }
        return null;
    }

    public Node searchPrev(int index){     //返回index所对应结点的前一个结点
        Node p = this.head;
        while(index-1 > 0){
            p = p.next;
            index--;
        }
        return p;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        int len = this.size();
        if (index > len ||index < 0){
            return false;
        }
        if(index == 0){
            this.addFirst(data);
            return true;
        }
        if (index == len){
            this.addLast(data);
            return true;
        }else {
            Node p = this.searchPrev(index);
            Node node = new Node(data);
            node.next = p.next;
            p.next = node;
            return true;
        }

    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node p = this.head;
        while(p != null){
            if(p.data == key){
                return true;
            }
            p = p.next;
        }
        return false;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head == null){
            System.out.println("链表为空");
            return;
        }
        if (!this.contains(key)){
            System.out.println("非法的key");
            return;
        }
        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }
        Node pre = searchPreNode(key);
        pre.next = pre.next.next;

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head == null){
            System.out.println("链表为空");
        }
        if (!this.contains(key)){
            System.out.println("非法的key");
        }

//        Node p = this.head;
//        while (p.next != null){
//            if(p.next.data == key){   //如果key的值在最后一位，那么
//                p.next = p.next.next; //这里的p.next是最后一个结点，那么此时p.next以及被赋值为Null
//                if(p.next == null){   //那么此时就应该退出循环，要是继续执行后面的p=p.next，
//                                      // 那么p就会=null，此时在执行循环开头的那个语句p.next就相当于null.next，出现了空指针异常
//                    break;
//                }
//            }
//            p = p.next;
//        }
        Node pre = head;
        Node cur = head.next;
        while(cur != null){
            if(cur.data == key){
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }

       if(this.head.data == key){   //如果本来的第二个结点还是key呢，这个必须放到后面去
            this.head = this.head.next;
        }
    }

    //得到单链表的长度
    public int size(){
        Node p = this.head;
        int len = 0;
        while (p != null){
            p = p.next;
            len++;
        }
        return len;
    }
    public void display(){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
//    public void clear();
}
