public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
//task 1,2
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(weights[i] + ",");

        }

        System.out.println();
        float[] weight = {1.57f, 7.654f, 9.986f};
        weight[0] = 1.57f;
        weight[1] = 7.654f;
        weight[2] = 9.986f;
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i] + ",");
        }
        System.out.println();
        long[] number = new long[2];
        number[0] = 1;
        number[1] = 2;
        for (int i = 0; i < 2; i++) {
            System.out.print(number[i] + ",");
        }

        System.out.println();

        //task 3
        for (int i = weights.length-1;i >=0; i--) {
        System.out.print(weights[i] + ",");
        }

        System.out.println();

        for (int i = weight.length - 1; i>=0;i--) {
        System.out.print(weight[i] + ",");
        }
        System.out.println();

        for (int i = number.length - 1; i >=0; i--) {
        System.out.print(number[i] + ",");
        }
        System.out.println();

        //task4


        for (int i = 0; i < weights.length; i++) {
            if (weights [i] % 2 == 0) {
                System.out.println(weights[i] + ",");
            }else if (weights [i] % 2 != 0) {
                System.out.print(++weights[i] +",");
            }

        }
        }

    }


