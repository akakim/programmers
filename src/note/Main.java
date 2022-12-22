package note;

import java.util.LinkedList;

//import java.util.LinkedList;
class MyData{

    int value;
    MyData(int v){
        value = v;
    }
    static MyData create(int v){
        return new MyData(v);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyData : " +
                "[Value : " + value + "]";

    }
}

public class Main {

    public static void main(String [] args ){
        LinkedList<MyData> list = new LinkedList<>();

        list.add(MyData.create(1));
        list.add(MyData.create(2));
        list.add(MyData.create(3));

        System.out.println(list);
        System.out.println(list.contains( MyData.create( 2 )));

    }

}

