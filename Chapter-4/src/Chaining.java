public class Chaining {

    public static void main(String[] args) {
        String msg1 = " Maroon the First Mate with a flagon of water and a pistol! ";
        System.out.println(chaining1(msg1));
        System.out.println(chaining2(msg1));
    }
    
    public static String chaining1(String message){

        String msg2;
        String step1;
        String step2;
        String step3;
        String step4;

        step1 = message.trim();
        step2 = step1.replace("First Mate", "Quartermaster");
        step3 = step2.substring(0, 47);
        step4 = step3 + ".";
        msg2 = step4;
        return msg2;
    }

    public static String chaining2(String message){

        String msg2;
        msg2 = (((message.trim()).replace("First Mate", "Quartermaster")).substring(0, 47)) + ".";

        return msg2;
    }

}
