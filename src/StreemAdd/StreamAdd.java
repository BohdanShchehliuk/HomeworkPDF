package StreemAdd;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamAdd {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).limit(3).sum());
    }

}
