package ConditionalsAndLoops.Loops;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(1999));
    }
    public static String identify(int number) {
        if (number == 1) {
            return "unique";
        }
        else if (number < 1) {
            return "composite";
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return "composite";
                }
            }
            return "prime";
        }
    }
    public static String identify(long number) {
        if (number == 1) {
            return "unique";
        }
        else if (number < 1) {
            return "composite";
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return "composite";
                }
            }
            return "prime";
        }
    }

    public static String identify(short number) {
        if (number == 1) {
            return "unique";
        }
        else if (number < 1) {
            return "composite";
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return "composite";
                }
            }
            return "prime";
        }
    }

    public static String identify(byte number) {
        if (number == 1) {
            return "unique";
        }
        else if (number < 1) {
            return "composite";
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return "composite";
                }
            }
            return "prime";
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long number) {
        for (long i = 2; i < (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void listPrimes(int max) {
        if (max >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i <= max; i+=2) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void listPrimes(long max) {
        if (max >= 2) {
            System.out.println(2);
        }
        for (long i = 3; i <= max; i+=2) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static int[] arrayListPrimes(int max){
        int[] primes = new int[numberOfPrimes(max)];
        int count = 0;
        if (max >= 2) {
            primes[count] = 2;
            count++;
        }
        for (int i = 3; i <= max; i+=2) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
        }
        return primes;
    }
    public static int numberOfPrimes(int max) {
        int count = 0;
        if (max >= 2) {
            count++;
        }
        for (int i = 3; i <= max; i+=2) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
