public class Test3 {
    public static void main(String[] args) {

        Runnable gritar = new Runnable() {
            @Override
            public void run() {
                System.out.println("Goool");
            }
        };

        gritar.run();


        Runnable gritar2 = ()-> System.out.println("Goool2");
        gritar2.run();

    }
}
