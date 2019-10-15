public class Array {
    public static void main(String[] args){
        int[] idade = new int[3];

        idade[0] = 21;
        idade[1] = 18;

        for(int i = 0; i < idade.length; i++){
            System.out.print(idade[i] + " ");
        }
    }
}