public class CommandLineArgs {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide at least one argument (num).");
            return;
        }

        int num = Integer.parseInt(args[0]);

        int length = 5;

        if (args.length >= 2) {
            length = Integer.parseInt(args[1]);
        }

        System.out.println("Number: " + num);
        System.out.println("Length: " + length);

        for (int i = 0; i < length; i++) {
            System.out.println(num);
        }
    }
}
