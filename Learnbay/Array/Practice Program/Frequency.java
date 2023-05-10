public class Frequency {
    public static void FindFrequency(int[] arr){
        int[] freq = new int[arr.length];
        int visited = -1;
        int count;
        for(int i=0;i<arr.length;i++){
            count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i] !=visited){
                freq[i] = count;
            }
        }

        for(int i=0;i<freq.length; i++){
            if(freq[i] !=-1){
            System.out.println(arr[i] +"--->"+ freq[i]);}
        }

    }

    public static void main(String[] args) {
        int[] arr = {10,30,10,20,40,10,30};
        FindFrequency(arr);


    }
}
