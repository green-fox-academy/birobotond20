package sum;

import java.util.ArrayList;

public class Numbers {

    public int sum(ArrayList<Integer> inputArrayList){

        if (inputArrayList == null){
            return 0;
        }

        int sum = 0;

        for (Integer number : inputArrayList) {
            sum += number;
        }

        return sum;
    }
}
