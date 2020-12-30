public class BreakingTheRecord {

    static int[] breakingRecords(int[] scores){
        int firstMax=scores[0];
        int firstMin=scores[0];

        int maxCount=0;
        int minCount=0;

        for(int i:scores){
            if(i>firstMax){
                maxCount++;
                firstMax=i;
            }
            if(i>firstMin){
                minCount++;
                firstMin=i;
            }
        }
        return new int[]{maxCount,minCount};
    }
    
}
