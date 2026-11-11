package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    static void main(String[] args) {
        // set은 중복을 허용하지 않는 자료구조이다.
        // set은 순서를 보장하지 않아요.
        Set<String> frutis = new HashSet<>(Arrays.asList("apple","banana"));
        frutis.add("grape");
        frutis.add("mango");
        frutis.add("banana");
        System.out.println("과일바구니 사이즈 : " + frutis.size());
        System.out.println("===============");
        for (String f : frutis) {
            System.out.println(f);
        }
    }
}
