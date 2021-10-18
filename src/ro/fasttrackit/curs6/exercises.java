package ro.fasttrackit.curs6;

public class exercises {
    public static void main(String[] args) {
        String[] names = {"Ana", "Oana", "Daria"};
        printLongerThan(names,  4);
    }
    static void printLongerThan(String[] names, int minlength){
        for(String name : names) {
            if (name.length()>=minlength){
                System.out.println(name);
            }
        }
    }
}
