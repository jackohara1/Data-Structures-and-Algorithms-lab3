public class MyArrays {
    public static int sumOf (int[] list, int currentSize){

        int total=0;

        for (int x=0; x<=currentSize; x++){

            total= list[x]+total;
        }
        return total;
    }

    public static int remove (int[] list, int currentSize, int position){


        list[position]=0;


        for (int x=position+1; x<=currentSize; x++){

            list[x-1] = list[x];
        }
        return currentSize-1;

    }

    public static int insert (int[] list, int currentSize, int position, int newElement){



        for (int x=currentSize-1; x>position; x--){

            list[x+1] = list[x];
        }
        list[position]=newElement;
        return currentSize+1;

    }

    public static int max (int[] list, int currentSize){


        int max = list[0];

        for (int x=1; x<currentSize; x++){

            if (list[x]>max){
                max = list[x];
            }
        }

        return max;

        
    }
    public static int min (int[] list, int currentSize){


        int min = list[0];

        for (int x=1; x<currentSize; x++){

            if (list[x]< min){
                min = list[x];
            }
        }

        return min;

    }
}
