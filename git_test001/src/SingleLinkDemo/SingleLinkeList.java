package SingleLinkDemo;

import java.util.Stack;

/**
 * @project_name:rep001
 * @author: LK
 * @create: 2020-03-15
 **/
public class SingleLinkeList {

    //初始化头节点 头节点本身无参数 不能动
    private  Node head;

    public Node getHead() {
        return head;
    }


    public SingleLinkeList(){
        this.head=new Node(-1,"","");
    }

    //尾插法
    public void add(Node nodes) {
        //辅助节点
        Node temp=head;

//            //我这样写问题在于node节点对象next没有不断下移
//            while(temp.getNext()==null){
//                temp.next=nodes;
//                break;
//            }

        //不断下移到下一个节点对象
        while(true) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(nodes);
        System.out.println(temp.getNext());
    }

    //排序插入法
    public void addByNo(Node nodes){
        Node temp1=head;
        boolean flag=false;
        while(true){
            if (temp1.next== null) {
                break;
            }
            //判断插入的no值是否已存在
            if(temp1.next.no==nodes.no){
                flag=true;
                break;
            }else if(temp1.next.no>nodes.no){
                //插入的节点要比temp辅助节点的值小即可插入
                break;
            }
            temp1=temp1.getNext();
        }


//        if(flag=true){
//            System.out.println("该节点已存在");
//        }
//        nodes.setNext(temp1.getNext());
////        temp1.setNext(nodes);
        nodes.next=temp1.next;
        temp1.next=nodes;

    }

    //删除某个节点 传参传数值
   public void delete(int no){
        Node temp=head;
        //判断是否为空节点
        if(temp.getNext()==null){
            System.out.println("改链表为空");
            return;
        }
        while(temp.getNext()!=null){
            if(temp.getNext()==null){
                break;
            }
            //找到要删除的节点
            if(temp.next.no==no){
                temp.setNext(temp.getNext().getNext());
            }
            //继续遍历下一个节点
            temp=temp.getNext();
        }
    }
    //删除某个节点 传对象
    public void delete(Node nodes){
        Node temp=head;
        //判断是否为空节点
        if(temp.getNext()==null){
            System.out.println("改链表为空");
            return;
        }
        while(temp.getNext()!=null){
            if(temp.getNext()==null){
                break;
            }
            //找到要删除的节点
            if(temp.next.no==nodes.no){
                temp.setNext(nodes.getNext());
            }
            temp=temp.getNext();
        }
    }

    //查找倒数第k个节点      length-size    比如倒数第1个 总共4个 那就是正数第3个
    public Node findByIndex(int index){
        Node cur=head.getNext();
        //判断是否为空节点
        if(cur==null){
            System.out.println("该链表为空");
            return null;
        }
        int length = getLength();
        if(index<0 || index>length){
            System.out.println("找不到该节点");
            return null;
        }
            for (int i = 0; i <length-index; i++) {
                cur=cur.getNext();
            }
        return cur;
    }

    //新浪面试题 查询所有的节点
    public  int getLength(){
        //定义一个计数器即可
        int count=0;
        Node temp=head;
        //判断是否为空节点
        if(temp.getNext()==null){
            System.out.println("改链表为空");
            return 0;
        }
        while(temp.getNext()!=null){
            if(temp.getNext()==null){
                break;
            }
            count++;
            temp=temp.getNext();
        }
        return count;
    }


    //腾讯面试链表题  反转单链表   创建一个中间链表  将原链表进行遍历 每遍历一个节点将其插入到头节点后面 最后插入原头节点
    public void revretLink(){
        Node revertHead = new Node(-1,"","");
        //辅助节点
        Node temp;
        Node cur=head.getNext();
        //判断是否为空节点
        if(head==null||head.next.next==null){
            System.out.println("该链表无须反转");
            return;
        }
        while(cur!=null){
            temp=cur.next;
            //保证永远插入到头节点后面
            cur.next=revertHead.next;
            //处理了一个节点
            revertHead.next=cur;
            //下一个节点数据回吐给cur
            cur=temp;
        }
        //头信息还原
        head.next= revertHead.next;
    }


    //百度面试题 单链表倒序打印  关键点使用栈的先进后出特性
    public void stackPrint(){
        Stack<Node> stacks = new Stack<>();
        Node cur=head.getNext(); //有效节点
        if(head==null||head.next.next==null){
            System.out.println("该链表无须反转");
            return;
        }
        while(cur!=null){
            stacks.push(cur);//只是处理一个节点
            cur=cur.getNext();
        }
       while(stacks.size()>0){
           System.out.println(stacks.pop());
       }

    }


     //遍历展示
    public void list(){
        Node tepls=head.next;
        while(true){
            if(tepls==null){
                break;
            }
            System.out.println(tepls);
           tepls= tepls.next;
        }
    }


}
