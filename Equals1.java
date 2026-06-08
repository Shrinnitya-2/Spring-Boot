public class Equals1 {
    public static void main(String args[]) {
        String a = "java";
        String b = "java";
        String c= new String("java");
        abc(a, c);
        defg(a, b);
    }
    public static void hij(String a, String b){
        // returns == is matching since a and b points to same memory location
        if (a == b) {
            System.out.println("== is matching");
        } else {
            System.out.println("exit out of thr loop");
        }
    }
    public static void abc(String a, String c) {
        //exit out of the loop. even though a and c content are equal
        // but they point to diff obj ref
        // requires memory location
        if (a == c) {
            System.out.println("== is matching");
        } else {
            System.out.println("exit out of thr loop");
        }
    }

    public static void defg(String a, String c) {
        // equals checks values. doesnt bother about memory location
        if (a.equals(c)) {
            System.out.println("equals is macthing");
        } else {
            System.out.println("exit equals");
        }
    }
}