package SingleLinkDemo;

/**
 * @project_name:rep001
 * @author: LK
 * @create: 2020-03-15
 **/
public class SingleLinkeListDemo {

    public static void main(String[] args) {

        Node node0 = new Node(0, "宋江", "及时雨");
        Node node1 = new Node(1, "林冲", "豹子头");
        Node node2 = new Node(2, "武松", "行者");
        Node node3 = new Node(3, "鲁智深", "花和尚");

        SingleLinkeList singleLinkeList = new SingleLinkeList();

//        singleLinkeList.add(node0);
//        singleLinkeList.add(node1);
//        singleLinkeList.add(node2);
//        singleLinkeList.add(node3);

        singleLinkeList.addByNo(node0);
        singleLinkeList.addByNo(node3);
        singleLinkeList.addByNo(node2);
        singleLinkeList.addByNo(node1);
        //singleLinkeList.list();
       // System.out.println("新增》》》》》");
        //删除
        //singleLinkeList.delete(1);
       // System.out.println("删除》》》》》");
        singleLinkeList.list();
        //统计总长度
 /*       int length = singleLinkeList.getLength();
        System.out.println("总长度》》》》》"+length);
        //查找倒数第k个节点      length-size    比如倒数第1个 总共4个 那就是正数第3个
        Node nodes = singleLinkeList.findByIndex(0);
        System.out.println("倒数第一个》》》》》"+nodes);

       singleLinkeList.list();
       System.out.println("===========================");
       singleLinkeList.revretLink();
      singleLinkeList.list();
 */
      System.out.println("倒序打印 ===========================");
      singleLinkeList.stackPrint();

    }
}
