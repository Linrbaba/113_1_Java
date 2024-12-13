import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //顯示所有元素


        //刪除元素
        list.remove(0);
        System.out.println("刪除後的ArrayList: " + list);

        //檢查大小
        int size = list.size();
        System.out.println("ArrayList大小: " + list);

        //判斷是否包含其他元素
        boolean containsCherry = list.contains("Cherry");
        System.out.println("ArrayList是否包含Cherry: " + list);

    }
}
