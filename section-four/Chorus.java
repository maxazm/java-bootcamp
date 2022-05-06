public class Chorus {
    public static void main(String[] args) {
        singChorus(8);
    }
    public static void singChorus(int times){
        for(int i = 0; i < times; i++){
            System.out.println("Don't blame it on the sunshine");
            System.out.println("Don't blame it on the moonlight");
            System.out.println("Don't blame it on good times");
            System.out.println("Blame it on boogie\n");
        }
    }
}