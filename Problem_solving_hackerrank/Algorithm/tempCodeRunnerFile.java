public class GradingStudent{

    public static int[] gradingStudents(int arr[]){

        for(int i=0;i<arr.length;i++){

            if(arr[i]>=38){

            int nextMultipleOfFive = 5 - (arr[i]%5) + arr[i];

            if(nextMultipleOfFive - arr[i]<3){
                arr[i] = nextMultipleOfFive;
            }

         }

        }

        return arr;

    }

    public satic void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
              
              arr[i]= sc.nextInt();

         }
      int result[] =  gradingStudents[arr];
      for(int i=0;i<result.length;i++){
              
             System.out.println(result[i]+(i != result.length-1 ? "\n":""));

         }

         System.out.println("");

    }
}