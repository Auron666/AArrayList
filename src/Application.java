public class Application {

    public static void main(String[] args) {
        System.out.println("AArrayList start");

        AArrayList<Integer> customArray = new AArrayList<>();

        customArray.add(1);
        customArray.add(2);
        customArray.add(3);
        customArray.add(4);
        customArray.add(5);
        customArray.add(6);
        customArray.add(7);
        customArray.add(8);
        customArray.add(9);
        customArray.add(10);

        System.out.println("CustomArray Size: " + customArray.size());

    }

}
