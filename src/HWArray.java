public class HWArray {

    public static void main(String[] args) {
/////////////////////////////////////////////////////////////////////////////////
//        int[] myArray = new int [10];
//
//        int number = 0;
//        for (int i = 0; i < myArray.length; i ++){
//             myArray[i] = number+=2;
//        }
//        for (int k : myArray) {
//            System.out.print(k + " ");
//        }
//        System.out.print("\n");
//
//        for (int j : myArray) {
//            System.out.println(j);
//        }
/////////////////////////////////////////////////////////////////////////////////
//        int[] myArray = new int [100];
//        int number = 0;
//        for (int i = 0; i < myArray.length; i++){
//             myArray[i] = number++;
//        }
////        for (int j : myArray) {
////            if (j % 2 != 0) {
////                System.out.println(j);
////            }
////        }
//        for (int i = myArray.length-1; i > 0 ; i-=2){
//            System.out.println(myArray[i]);
//        }
/////////////////////////////////////////////////////////////////////////////////
//        int[] myArray = new int[15];
//        setRandomValue(myArray);
//        for ( int k : myArray){
//            System.out.print(k  + " ");
//        }
//        System.out.print("\n");
//        int number = 0;
//            for ( int j : myArray){
//                if ( j % 2 == 0){
//                    number++;
//                    System.out.print(j + " ");
//                }
//            }
//        System.out.print("\n");
//        System.out.print(number);
/////////////////////////////////////////////////////////////////////////////////

    int[] myNewArray = new int[20];
    setRandomNumber(myNewArray);
    setReplaceOddElement(myNewArray);
    for (int j : myNewArray){
        System.out.print(j + " ");
    }
        System.out.print("\n");
    }
//    private void setRandomValue(int[] myArray) {
//        for(int i = 0; i < myArray.length; i++){
//            myArray[i] = (int)(Math.random() * 15);
//        }
//    }
/////////////////////////////////////////////////////////////////////////////////

    public static void setRandomNumber(int[] myNewArray) {
        for ( int i = 0; i < myNewArray.length; i++){
            myNewArray[i] = (int) (Math.random() * 20);
        }
    }
    public  static void setReplaceOddElement (int[] myNewArray){
        for ( int i = 0; i < myNewArray.length; i++){
            if (myNewArray[i] % 2 != 0) {
                myNewArray[i]  = 0;
            }
        }
    }
}
