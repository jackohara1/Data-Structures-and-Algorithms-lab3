public class TestMyArrays {
    public static void main(String[] args) {
        int [] myValues = new int[25];

        myValues[0]=6;
        myValues[1]=9;
        myValues[2]=22;
        myValues[3]=6;

        int currentSize=4;
        System.out.println(MyArrays.sumOf(myValues,currentSize));

      //  System.out.println(MyArrays.remove(myValues,currentSize,2));

        System.out.println(MyArrays.insert(myValues,currentSize,0,5));

        System.out.println(MyArrays.sumOf(myValues,currentSize));

        System.out.println(MyArrays.max(myValues,currentSize));
        System.out.println(MyArrays.min(myValues,currentSize));
    }
}
