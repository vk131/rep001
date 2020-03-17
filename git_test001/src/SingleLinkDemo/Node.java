package SingleLinkDemo;

/**
 * @project_name:rep001
 * @author: LK
 * @create: 2020-03-15
 **/
public  class  Node{

    protected Integer no;
    protected String name;
    protected String nickname;
    protected Node next;  //下一个节点的next域
    protected Node pre;  //上一个节点的pre域


    public Node(int no,String name,String nickname){
        this.no=no;
        this.name=name;
        this.nickname=nickname;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "no=" + no +
//                ", name='" + name + '\'' +
//                ", nickname='" + nickname + '\'' +
//                ", next=" + next +
//                '}';
//    }


    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }
}
