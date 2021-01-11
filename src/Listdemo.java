import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Listdemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add("hcxy");
        list.add(123456.f);
        list.add(false);
        list.add(2);

        System.out.println("当前集合的元素个数：");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
