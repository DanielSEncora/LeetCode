import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 2, 4};
        System.out.println(unequalTriplets(nums));
    }

    public static int unequalTriplets(int[] nums){
        if(nums.length < 3)
            return 0;

        int unequal = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -2; i++) {
            for (int j = i+1 ; j < nums.length - 1; j++) {
                if (nums[i] != nums[j]){
                    for (int k = j+1; k < nums.length; k++) {
                        if (nums[j] != nums[k]) {
                            //System.out.println("Num j= " + nums[j] + "     Num k= " + nums[k]);
                            //System.out.println("i = " + i +"       j= " + j + "     k= " + k);
                            //System.out.println("unequal++");
                            //System.out.println();
                            unequal++;
                        }
                    }
                }
            }
        }

        return unequal;
    }
}
