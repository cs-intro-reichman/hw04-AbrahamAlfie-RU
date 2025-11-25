public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] nums = new boolean[n + 1];
        int i = 3;
        int p = 2;
        int count = 0;

        for (int j = 2; j < nums.length; j++) {
            nums[j] = true;
        }

        while (p <= Math.sqrt(n)) {
            while (i < nums.length) {
                if (nums[i] == true && i % p == 0 && i != p) {
                    nums[i] = false;
                }
                i++;
            }
            i = p;
            p++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == true) {
                System.out.println(j);
                count++;
            }
        }
        double percent = ((double)count / n) * 100;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)percent + "% are primes)");
    }
}