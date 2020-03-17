package SingleLinkDemo;

/**
 * @project_name:rep001
 * @author: LK
 * @create: 2020-03-17
 **/
public class DoubleLinkListDemo {
    public static void main(String[] args) {

        Node node0 = new Node(0, "宋江", "及时雨");
        Node node1 = new Node(1, "林冲", "豹子头");
        Node node2 = new Node(2, "武松", "行者");
        Node node3 = new Node(3, "鲁智深", "花和尚");

        DoubleLinkList doubleLinkList = new DoubleLinkList();

        doubleLinkList.doubleAdd(node0);
        doubleLinkList.doubleAdd(node3);
        doubleLinkList.doubleAdd(node1);
        doubleLinkList.doubleAdd(node2);

        doubleLinkList.list();
    }
}
