public class NumberFactoryTest {
    public static void main(String[] args) {
        String list1 = new String("1 2 3 4 5 6 7 8 9 10");
        String list2 = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1");
        String hexList = new String("0xF 0xff 0x123a");


        NumberFactory nfactory = new NumberFactory();

        nfactory.getNumberList(list1).display();

        System.out.println("");

        NumberList numberList2 = nfactory.getNumberList(list2);
        numberList2.display();

        System.out.println("");
        System.out.println("Sum of list 2: " + numberList2.sum());

       NumberList numberList3 = nfactory.getNumberList(hexList);
        numberList3.display();

    }
}
