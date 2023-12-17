public class ArrayDemo {

    public static void main(String[] args) {
        int [] marks ={89,55,44,55,77,88};
        System.out.println(marks[2]);

        int total = 0;

        for (int i=0 ; i<marks.length ;i++){
            total= total + marks [i];
        }

        System.out.println("total= "+ total);
    }
}
