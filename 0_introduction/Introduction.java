import java.util.*;

public class Introduction {

    public static void printDays(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("not a day");
        }
    }

    public static int fibonacciLoop(int num) {
        if (num < 0) {
            return -1;
        } else if (num <= 1) {
            return num;
        } else {
            int num1 = 0, num2 = 1;
            int sum = 0;
            for (int i = 2; i <= num; i++) {
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
            return sum;
        }
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int num) {
        int number = num;
        int sum = 0, temp = 0;
        while (number % 10 != 0) {// or while (number > 0)
            temp = number % 10;
            number = number / 10;
            sum += temp;
        }
        return sum;
    }

    public static int reverseOfDigits(int num) {
        int currDigit = 0, ans = 0;
        while (num > 0) {
            currDigit = num % 10;
            ans = ans * 10 + currDigit;
            num /= 10;
        }
        return ans;
    }

    public static long factorialLoop(int num) {
        long ans = 1;
        for (int i = num; i > 1; i--) {
            ans *= i;
        }
        return ans;
    }

    public static long factorialFunction(int no) {
        long ans = 1;
        while (no != 0) {
            ans *= no;
            no--;
        }
        return ans;
    }

    public static int inverseOfDigit(int num) {
        int pos = 1;
        int inverse = 0, digit = 0;
        while (num > 0) {
            digit = num % 10;
            inverse = inverse + ((int) Math.pow(10, digit - 1) * pos);
            num = num / 10;
            pos++;
        }
        return inverse;
    }

    public static void isLeapYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void isPrimeLoop(int num) {
        boolean isPrime = true;
        if (num == 2) {
            System.out.println(isPrime);
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            System.out.println(isPrime);
        }
    }

    public static void sieveOfEratosthenes(int num) {
        int primeArr[] = new int[num + 1];
        Arrays.fill(primeArr, 1);
        for (int i = 2; i * i <= num; i++) {
            if (primeArr[i] == 1) {
                for (int j = i * i; j <= num; j += i) {
                    primeArr[j] = 0; // marking non-prime
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (primeArr[i] == 1) {
                System.out.println(i);
            }
        }
    }

    public static void isPalindrome(int num) {
        int number = num;
        int reverse = 0;

        // calculate reverse to compare with original
        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        boolean isPalin = (num == reverse);
        System.out.println(reverse);
        System.out.println(isPalin);
    }

    public static void isArmstrongNo(int num) {
        int digits = 0;
        int sum = 0;

        // Count digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the Armstrong sum
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static void allDivisor(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        System.out.println(divisors);
    }

    public static void rotateByK(int num, int k) {
        int size = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            size++;
        }
        // returning the same number
        if (k == 0) {
            System.out.println(num);
            return;
        }
        // if k is negative
        if (k < 0) {
            k = ((k % size) + size) % size; // making k +ve & keeping k in range of size
        }
        // if k is positive
        if (k > size) {
            k = k % size;
        }
        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, size - k);

        int lastPart = num % divisor;
        int firstPart = num / divisor;

        int rotated = lastPart * multiplier + firstPart;
        System.out.println(rotated);

        // OR SHORTCUT ------------
        /*
         * int temp1 = (int) Math.pow(10, k);
         * int newN = (num % temp1) * (int) Math.pow(10, size - k) + (num / temp1);
         * System.out.println(newN);
         */
    }

    public static void gcdLcmCal(int num1, int num2) {
        while (num2 % num1 != 0) {
            int rem = num2 % num1;
            num2 = num1;
            num1 = rem;
        }
        // LCM ------------------
        int gcd = num1;
        int lcm = (num1 * num2) / gcd;
        System.out.println(gcd + "," + lcm);
    }

    public static void binaryToDecimal(int num) {
        int number = num;
        int ans = 0;
        int base = 1; // 2^0
        while (number > 0) {
            int temp = number % 10;
            ans += temp * base;

            number /= 10;
            base *= 2;
        }
        System.out.println(ans);
        // OR----------------
        /*
         * int pow = 0;
         * int rem;
         * int bin = 0;
         * while (number > 0){
         * rem = number % 2;
         * bin += rem*(int)Math.pow(10, pow);
         * pow++;
         * number = number/2;
         * }
         * System.out.println(bin);
         */
    }

    public static void decimalToBinary(int num) {
        int quotient = 0;
        int divisor = 2, remainder = 0;
        int number = num, ans = 0, i = 0;
        while (number > 0) {
            quotient = number / divisor;
            remainder = number % divisor;
            System.out.println(remainder);
            ans = ans + (remainder * (int) Math.pow(10, i));
            number = quotient;
            i++;
        }
        System.out.println(ans);
    }

    public static void combination(int n, int r) {
        if (n < r) {
            System.out.println("0");
            return;
        }
        long nFac = factorialFunction(n);
        long rFac = factorialFunction(r);
        long nrFac = factorialFunction(n - r);

        if (rFac == 0 || nrFac == 0) {
            System.out.println("Factorial overflow or error");
            return;
        }

        long ans = nFac / (rFac * nrFac);
        System.out.println(ans);
    }

    public static void permutation(int n, int r) {
        if (n < r) {
            System.out.println("0");
            return;
        }
        long nFac = factorialFunction(n);
        long nrFac = factorialFunction(n - r);

        if (nrFac == 0) {
            System.out.println("Factorial overflow or error");
            return;
        }

        long ans = nFac / nrFac;
        System.out.println(ans);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // switch-cases ----------------------
        // printDays(sc.nextInt());

        // nth fibonacci USING LOOPS-----------------
        // System.out.println(fibonacciLoop(sc.nextInt()));
        // System.out.println(factorialFunction(sc.nextInt()));

        // nth factorial using loops --------------------
        // System.out.println(factorialLoop(sc.nextInt()));

        // Count digits ------------------------
        // System.out.println(countDigit(sc.nextInt()));

        // FIND THE SUM OF DIGITS--------------------------
        // System.out.println(sumOfDigits(sc.nextInt()));

        // reverse of a digit ---------------------------
        // System.out.println(reverseOfDigits(sc.nextInt()));

        // mathematical inverse of a number (permutation of
        // positions)--------------------------
        // System.out.println(inverseOfDigit(sc.nextInt()));

        // isLeap year -----------------------------
        // isLeapYear(sc.nextInt());

        // isPrime till n-th element using loops ----------------------
        // isPrimeLoop(sc.nextInt());

        // isPrime using sieve of eratosthenes -------------------
        // sieveOfEratosthenes(sc.nextInt());

        // palindrome number -----------------------------
        // isPalindrome(sc.nextInt());

        // armstrong number -------------------------
        // isArmstrongNo(sc.nextInt());

        // divisor of a no. ---------------------
        // allDivisor(sc.nextInt());

        // rotate a number by k ----------------------------
        // rotateByK(sc.nextInt(), sc.nextInt());

        // GCD-LCM calculator -----------------------
        // gcdLcmCal(sc.nextInt(), sc.nextInt());

        // combination ------------
        // combination(sc.nextInt(), sc.nextInt());

        // permutation ----------------
        // permutation(sc.nextInt(), sc.nextInt());

        // binary to decimal conversion -----------
        // binaryToDecimal(sc.nextInt());
        
        // decimal to binary conversion --------------
        // decimalToBinary(sc.nextInt());

        // prime-factorisation ------------
    }
}
