public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
//task 1,2
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        System.out.print(weights[0] + "," + weights[1] + "," + weights[2]);

        System.out.println();
        float[] weight = {1.57f, 7.654f, 9.986f};
        weight[0] = 1.57f;
        weight[1] = 7.654f;
        weight[2] = 9.986f;
        System.out.print(weight[0] + "," + weight[1] + "," + weight[2]);

        System.out.println();
        long[] number = new long[2];
        number[0] = 1;
        number[1] = 2;

        System.out.print(number[0] + "," + number[1]);

        System.out.println();
        //task 3

        weights[0] = 3;
        weights[1] = 2;
        weights[2] = 1;
        System.out.print(weights[0] + "," + weights[1] + "," + weights[2]);

        System.out.println();

        weight[0] = 9.986f;
        weight[1] = 7.654f;
        weight[2] = 1.57f;
        System.out.print(weight[0] + "," + weight[1] + "," + weight[2]);
        System.out.println();

        number[0] = 2;
        number[1] = 1;
        System.out.print(number[0] + "," + number[1]);
        System.out.println();

        //task4

        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            if (weights [i] % 2 == 0) {
                System.out.println(weights[i] + ",");
            }else if (weights [i] % 2 != 0) {
                System.out.print(++weights[i] +",");
            }

        }
    }

}
