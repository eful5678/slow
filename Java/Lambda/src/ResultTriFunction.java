import util.TriFunction;

public class ResultTriFunction {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

        int result = add.apply(3, 4, 5);
        System.out.println(result);
    }
}
