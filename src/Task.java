public class Task {
    public static void printArray(){
        int[] array=new int[9];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=6;
        array[6]=7;
        array[7]=8;
        array[8]=9;
        for(int a: array){
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        printArray();
    }
}
