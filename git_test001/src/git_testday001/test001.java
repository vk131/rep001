package git_testday001;

import java.util.ArrayList;

/**
 * @project_name:git_test001
 * @author: LK
 * @create: 2020-03-05
 **/
public class test001 {

    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            System.out.println("this is  git_test00"+i+" ");
        }

        ArrayList<String> ad = new ArrayList<>();
        ad.add("123");
        System.out.println("集合ad的值是==>"+ad);

        nametoJson();

    }


    public static String nametoJson() {
        String str1 = new String("z这是分支dev001");
        return str1;
    }

}
