package Lab1.challenge3;

public class Pair {
    void finPairs(int [] numbers) {
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int l = j + 1; l < numbers.length; l++) {
                    if (numbers[i] + numbers[j] + numbers[l] == 0) {
                        //k++;
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[l]);
                        //System.out.println(k);

                    }
                }
            }

        }
    }
    public static void main(String [] args){
        Pair p = new Pair();
        int num[] = new int[5];
        num[0]=-1;
        num[1]=-2;
        num[2]=3;
        num[3]=1;
        num[4]=-3;
        p.finPairs(num);
    }
}
