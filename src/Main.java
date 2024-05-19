public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
       System.out.println(list.getSize());
       System.out.println(list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        list.add(130);
        list.add(140);
        list.add(150);
        list.add(160);
        list.add(170);



        System.out.println(list.getSize());
        System.out.println(list.getCapacity());
        System.out.println(list.getIndex(23));
        System.out.println(list.remove(11));
        System.out.println(list.getSize());
        System.out.println(list.getCapacity());
        System.out.println(list.set(12 , 5));
        System.out.println(list.toString());


    }
}
