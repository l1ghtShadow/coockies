public class coockies{
    static void checkForCoockies(Boolean agreed){
        if(agreed == true){
            System.out.println("we have access to your data");
        }
        else{
            System.out.println("Fuck you, we still have access to your data");
        }
    }
    public static void main(String[] args) {
        checkForCoockies(false);
}
}
