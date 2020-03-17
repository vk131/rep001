package SingleLinkDemo;

/**
 * @project_name:rep001
 * @author: LK
 * @create: 2020-03-17
 **/

/**
 * 双向链表的增删改查
 */
public class DoubleLinkList {

    //初始化头节点 头节点本身无参数 不能动
    private  Node head;
    public Node getHead() {
        return head;
    }
    public DoubleLinkList(){
        this.head=new Node(-1,"","");
    }

    //增加（尾插法）  和单链最大的不同就是pre要和上一个节点绑定
    public void doubleAdd(Node node){
        Node temp=head;

        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=node;
        node.pre=temp;
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
