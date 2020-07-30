package methods;

public class printCommandLineArgs {
    public static void main(String[] args) {
        if (args.length != 0){
            for(String argument : args){
                System.out.print(argument + " ");
            }
        }
//        else{
//            System.out.println("No Arguments!");
//        }
    }
}
