package pr05_randomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList ral = new RandomArrayList();
        ral.add("Pesho");
        ral.add(1);
        ral.add("989808");
        ral.add("ggggg");
        ral.add(3);

        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());

    }
}
