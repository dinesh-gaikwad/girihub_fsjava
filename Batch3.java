import java.util.Scanner;

/*
 * Batch 3 - Java Loops & Iteration Logic
 * File name: Batch3.java
 *
 * Compile: javac Batch3.java
 * Run:     java Batch3
 * Enter a question number (1-50), then provide the sample input.
 */
public class Batch3 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Question Number (1-50): ");
        int q = sc.nextInt();
        switch (q) {
            case 1: q01(); break; case 2: q02(); break; case 3: q03(); break;
            case 4: q04(); break; case 5: q05(); break; case 6: q06(); break;
            case 7: q07(); break; case 8: q08(); break; case 9: q09(); break;
            case 10: q10(); break; case 11: q11(); break; case 12: q12(); break;
            case 13: q13(); break; case 14: q14(); break; case 15: q15(); break;
            case 16: q16(); break; case 17: q17(); break; case 18: q18(); break;
            case 19: q19(); break; case 20: q20(); break; case 21: q21(); break;
            case 22: q22(); break; case 23: q23(); break; case 24: q24(); break;
            case 25: q25(); break; case 26: q26(); break; case 27: q27(); break;
            case 28: q28(); break; case 29: q29(); break; case 30: q30(); break;
            case 31: q31(); break; case 32: q32(); break; case 33: q33(); break;
            case 34: q34(); break; case 35: q35(); break; case 36: q36(); break;
            case 37: q37(); break; case 38: q38(); break; case 39: q39(); break;
            case 40: q40(); break; case 41: q41(); break; case 42: q42(); break;
            case 43: q43(); break; case 44: q44(); break; case 45: q45(); break;
            case 46: q46(); break; case 47: q47(); break; case 48: q48(); break;
            case 49: q49(); break; case 50: q50(); break;
            default: System.out.println("Invalid question number.");
        }
        sc.close();
    }

    // Q1. Print numbers from 1 to N using a for loop.
    // Input: 5 | Output: 1 2 3 4 5
    static void q01() { int n=sc.nextInt(); for(int i=1;i<=n;i++) System.out.print(i+" "); System.out.println(); }

    // Q2. Print numbers from N to 1 using a while loop.
    // Input: 5 | Output: 5 4 3 2 1
    static void q02() { int n=sc.nextInt(); while(n>=1){System.out.print(n+" ");n--;} System.out.println(); }

    // Q3. Print all even numbers from 1 to N.
    // Input: 10 | Output: 2 4 6 8 10
    static void q03() { int n=sc.nextInt(); for(int i=2;i<=n;i+=2)System.out.print(i+" "); System.out.println(); }

    // Q4. Print all odd numbers from 1 to N.
    // Input: 10 | Output: 1 3 5 7 9
    static void q04() { int n=sc.nextInt(); for(int i=1;i<=n;i+=2)System.out.print(i+" "); System.out.println(); }

    // Q5. Find the sum of numbers from 1 to N using a loop.
    // Input: 5 | Output: Sum = 15
    static void q05() { int n=sc.nextInt(); long sum=0; for(int i=1;i<=n;i++)sum+=i; System.out.println("Sum = "+sum); }

    // Q6. Find the sum of all even numbers from 1 to N.
    // Input: 10 | Output: Sum = 30
    static void q06() { int n=sc.nextInt(); long sum=0; for(int i=2;i<=n;i+=2)sum+=i; System.out.println("Sum = "+sum); }

    // Q7. Find the sum of all odd numbers from 1 to N.
    // Input: 10 | Output: Sum = 25
    static void q07() { int n=sc.nextInt(); long sum=0; for(int i=1;i<=n;i+=2)sum+=i; System.out.println("Sum = "+sum); }

    // Q8. Print the multiplication table of N from 1 to 10.
    // Input: 7 | Output: 7 14 21 28 35 42 49 56 63 70
    static void q08() { int n=sc.nextInt(); for(int i=1;i<=10;i++)System.out.print((n*i)+" "); System.out.println(); }

    // Q9. Find the factorial of N using a loop.
    // Input: 5 | Output: Factorial = 120
    static void q09() { int n=sc.nextInt(); if(n<0){System.out.println("Invalid input");return;} long f=1; for(int i=2;i<=n;i++)f*=i; System.out.println("Factorial = "+f); }

    // Q10. Count the digits of an integer using a loop.
    // Input: -58320 | Output: Digit Count = 5
    static void q10() { long n=Math.abs(sc.nextLong()); int count=n==0?1:0; while(n>0){count++;n/=10;} System.out.println("Digit Count = "+count); }

    // Q11. Find the sum of digits of an integer.
    // Input: 583 | Output: Sum = 16
    static void q11() { long n=Math.abs(sc.nextLong()); int sum=0; while(n>0){sum+=(int)(n%10);n/=10;} System.out.println("Sum = "+sum); }

    // Q12. Find the product of digits of an integer.
    // Input: 234 | Output: Product = 24
    static void q12() { long n=Math.abs(sc.nextLong()); if(n==0){System.out.println("Product = 0");return;} long p=1; while(n>0){p*=n%10;n/=10;} System.out.println("Product = "+p); }

    // Q13. Reverse an integer using a loop.
    // Input: 12340 | Output: Reverse = 4321
    static void q13() { long n=sc.nextLong(),x=Math.abs(n),r=0; while(x>0){r=r*10+x%10;x/=10;} System.out.println("Reverse = "+(n<0?-r:r)); }

    // Q14. Check whether an integer is a palindrome.
    // Input: 1221 | Output: Palindrome
    static void q14() { long n=sc.nextLong(),x=Math.abs(n),t=x,r=0; while(t>0){r=r*10+t%10;t/=10;} System.out.println(x==r?"Palindrome":"Not Palindrome"); }

    // Q15. Find the largest digit in an integer.
    // Input: 58320 | Output: Largest Digit = 8
    static void q15() { long n=Math.abs(sc.nextLong()); int max=0; do{max=Math.max(max,(int)(n%10));n/=10;}while(n>0); System.out.println("Largest Digit = "+max); }

    // Q16. Find the smallest digit in an integer.
    // Input: 58320 | Output: Smallest Digit = 0
    static void q16() { long n=Math.abs(sc.nextLong()); int min=9; do{min=Math.min(min,(int)(n%10));n/=10;}while(n>0); System.out.println("Smallest Digit = "+min); }

    // Q17. Count even and odd digits in an integer.
    // Input: 123456 | Output: Even digits = 3, Odd digits = 3
    static void q17() { long n=Math.abs(sc.nextLong()); int even=0,odd=0; do{if((n%10)%2==0)even++;else odd++;n/=10;}while(n>0); System.out.println("Even digits = "+even+", Odd digits = "+odd); }

    // Q18. Count how many times a specified digit occurs in a number.
    // Input: number=122333 digit=3 | Output: Frequency = 3
    static void q18() { long n=Math.abs(sc.nextLong()); int d=sc.nextInt(),count=0; if(d<0||d>9){System.out.println("Invalid digit");return;} do{if(n%10==d)count++;n/=10;}while(n>0); System.out.println("Frequency = "+count); }

    // Q19. Check whether a number contains a zero digit.
    // Input: 12045 | Output: Contains zero
    static void q19() { long n=Math.abs(sc.nextLong()); boolean found=false; while(n>0){if(n%10==0){found=true;break;}n/=10;} System.out.println(found?"Contains zero":"Does not contain zero"); }

    // Q20. Find the sum of the first and last digits of an integer.
    // Input: 58327 | Output: Sum = 12
    static void q20() { long n=Math.abs(sc.nextLong()); int last=(int)(n%10); while(n>=10)n/=10; System.out.println("Sum = "+(last+n)); }

    // Q21. Check whether a number is prime.
    // Input: 29 | Output: Prime
    static void q21() { int n=sc.nextInt(); boolean prime=n>=2; for(int i=2;i<=n/i&&prime;i++)if(n%i==0)prime=false; System.out.println(prime?"Prime":"Not Prime"); }

    // Q22. Print all prime numbers from 1 to N.
    // Input: 20 | Output: 2 3 5 7 11 13 17 19
    static void q22() { int n=sc.nextInt(); for(int x=2;x<=n;x++){boolean p=true;for(int d=2;d<=x/d;d++)if(x%d==0){p=false;break;}if(p)System.out.print(x+" ");} System.out.println(); }

    // Q23. Count prime numbers from 1 to N.
    // Input: 10 | Output: Prime Count = 4
    static void q23() { int n=sc.nextInt(),count=0; for(int x=2;x<=n;x++){boolean p=true;for(int d=2;d<=x/d;d++)if(x%d==0){p=false;break;}if(p)count++;} System.out.println("Prime Count = "+count); }

    // Q24. Find all factors of a positive integer.
    // Input: 12 | Output: 1 2 3 4 6 12
    static void q24() { int n=sc.nextInt(); if(n<=0){System.out.println("Enter a positive integer");return;} for(int i=1;i<=n;i++)if(n%i==0)System.out.print(i+" "); System.out.println(); }

    // Q25. Count the factors of a positive integer.
    // Input: 12 | Output: Factor Count = 6
    static void q25() { int n=sc.nextInt(),count=0; if(n<=0){System.out.println("Enter a positive integer");return;} for(int i=1;i<=n;i++)if(n%i==0)count++; System.out.println("Factor Count = "+count); }

    // Q26. Check whether a number is a perfect number.
    // Input: 28 | Output: Perfect Number
    static void q26() { int n=sc.nextInt(); if(n<=1){System.out.println("Not a Perfect Number");return;} int sum=1; for(int i=2;i<=n/i;i++)if(n%i==0){sum+=i;if(i!=n/i)sum+=n/i;} System.out.println(sum==n?"Perfect Number":"Not a Perfect Number"); }

    // Q27. Check whether a number is an Armstrong number for any digit length.
    // Input: 9474 | Output: Armstrong Number
    static void q27() { long n=sc.nextLong(); if(n<0){System.out.println("Not Armstrong");return;} long t=n; int digits=0; do{digits++;t/=10;}while(t>0); t=n; long sum=0; do{int d=(int)(t%10);long p=1;for(int i=0;i<digits;i++)p*=d;sum+=p;t/=10;}while(t>0); System.out.println(sum==n?"Armstrong Number":"Not Armstrong"); }

    // Q28. Print the first N Fibonacci terms.
    // Input: 7 | Output: 0 1 1 2 3 5 8
    static void q28() { int n=sc.nextInt(); long a=0,b=1; for(int i=0;i<n;i++){System.out.print(a+" ");long c=a+b;a=b;b=c;} System.out.println(); }

    // Q29. Find the Nth Fibonacci number (0th term is 0).
    // Input: 7 | Output: Fibonacci = 13
    static void q29() { int n=sc.nextInt(); if(n<0){System.out.println("Invalid input");return;} long a=0,b=1; for(int i=0;i<n;i++){long c=a+b;a=b;b=c;} System.out.println("Fibonacci = "+a); }

    // Q30. Find the greatest common divisor (GCD) of two integers.
    // Input: 48 18 | Output: GCD = 6
    static void q30() { long a=Math.abs(sc.nextLong()),b=Math.abs(sc.nextLong()); while(b!=0){long t=b;b=a%b;a=t;} System.out.println("GCD = "+a); }

    // Q31. Find the least common multiple (LCM) of two integers.
    // Input: 12 18 | Output: LCM = 36
    static void q31() { long a=Math.abs(sc.nextLong()),b=Math.abs(sc.nextLong()); if(a==0||b==0){System.out.println("LCM = 0");return;} long x=a,y=b;while(y!=0){long t=y;y=x%y;x=t;} System.out.println("LCM = "+(a/x*b)); }

    // Q32. Convert a decimal integer to binary using repeated division.
    // Input: 13 | Output: Binary = 1101
    static void q32() { int n=sc.nextInt(); if(n<0){System.out.println("Enter a non-negative integer");return;} if(n==0){System.out.println("Binary = 0");return;} String s="";while(n>0){s=(n%2)+s;n/=2;}System.out.println("Binary = "+s); }

    // Q33. Convert a binary string to decimal using a loop.
    // Input: 1101 | Output: Decimal = 13
    static void q33() { String s=sc.next(); long value=0; for(int i=0;i<s.length();i++){char c=s.charAt(i);if(c!='0'&&c!='1'){System.out.println("Invalid binary number");return;}value=value*2+(c-'0');}System.out.println("Decimal = "+value); }

    // Q34. Print all numbers between A and B divisible by K.
    // Input: A=1 B=20 K=4 | Output: 4 8 12 16 20
    static void q34() { int a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt(); if(k==0){System.out.println("Divisor cannot be zero");return;} for(int i=a;i<=b;i++)if(i%k==0)System.out.print(i+" ");System.out.println(); }

    // Q35. Find the sum of numbers in a given inclusive range.
    // Input: 3 7 | Output: Sum = 25
    static void q35() { int a=sc.nextInt(),b=sc.nextInt(); long sum=0;for(int i=a;i<=b;i++)sum+=i;System.out.println("Sum = "+sum); }

    // Q36. Print a right triangle of stars with N rows.
    // Input: 4 | Output: * / ** / *** / ****
    static void q36() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print("*");System.out.println();} }

    // Q37. Print an inverted right triangle of stars.
    // Input: 4 | Output: **** / *** / ** / *
    static void q37() { int n=sc.nextInt();for(int i=n;i>=1;i--){for(int j=1;j<=i;j++)System.out.print("*");System.out.println();} }

    // Q38. Print a square star pattern.
    // Input: 3 | Output: *** / *** / ***
    static void q38() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=n;j++)System.out.print("*");System.out.println();} }

    // Q39. Print an increasing number triangle.
    // Input: 4 | Output: 1 / 12 / 123 / 1234
    static void q39() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(j);System.out.println();} }

    // Q40. Print a repeated-row-number triangle.
    // Input: 4 | Output: 1 / 22 / 333 / 4444
    static void q40() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(i);System.out.println();} }

    // Q41. Print a centered pyramid of stars.
    // Input: 4 | Output: centered rows with 1, 3, 5, 7 stars
    static void q41() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int s=1;s<=n-i;s++)System.out.print(" ");for(int j=1;j<=2*i-1;j++)System.out.print("*");System.out.println();} }

    // Q42. Print an inverted centered pyramid of stars.
    // Input: 4 | Output: centered rows with 7, 5, 3, 1 stars
    static void q42() { int n=sc.nextInt();for(int i=n;i>=1;i--){for(int s=1;s<=n-i;s++)System.out.print(" ");for(int j=1;j<=2*i-1;j++)System.out.print("*");System.out.println();} }

    // Q43. Print a number staircase where each row starts at 1.
    // Input: 4 | Output: 1 / 1 2 / 1 2 3 / 1 2 3 4
    static void q43() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(j+" ");System.out.println();} }

    // Q44. Print Floyd's triangle.
    // Input: 4 | Output: 1 / 2 3 / 4 5 6 / 7 8 9 10
    static void q44() { int n=sc.nextInt(),v=1;for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print((v++)+" ");System.out.println();} }

    // Q45. Print a 0-1 triangle with alternating values by column.
    // Input: 4 | Output: 1 / 10 / 101 / 1010
    static void q45() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print((j%2==1?1:0));System.out.println();} }

    // Q46. Print a hollow square star pattern.
    // Input: 4 | Output: four-by-four hollow square
    static void q46() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=n;j++)System.out.print(i==1||i==n||j==1||j==n?"*":" ");System.out.println();} }

    // Q47. Print a multiplication grid from 1 to N.
    // Input: 3 | Output: 1 2 3 / 2 4 6 / 3 6 9
    static void q47() { int n=sc.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=n;j++)System.out.print((i*j)+"\\t");System.out.println();} }

    // Q48. Keep reading integers until 0 is entered; print their sum.
    // Input: 5 8 -2 0 | Output: Sum = 11
    static void q48() { long sum=0;while(true){int n=sc.nextInt();if(n==0)break;sum+=n;}System.out.println("Sum = "+sum); }

    // Q49. Read N numbers and find the largest.
    // Input: N=5; values=4 9 2 15 7 | Output: Largest = 15
    static void q49() { int n=sc.nextInt();if(n<=0){System.out.println("Invalid count");return;}int max=sc.nextInt();for(int i=1;i<n;i++){int x=sc.nextInt();if(x>max)max=x;}System.out.println("Largest = "+max); }

    // Q50. Read N numbers and count positive, negative and zero values.
    // Input: N=6; values=2 -1 0 5 -3 0 | Output: Positive=2, Negative=2, Zero=2
    static void q50() { int n=sc.nextInt(),p=0,neg=0,z=0;for(int i=0;i<n;i++){int x=sc.nextInt();if(x>0)p++;else if(x<0)neg++;else z++;}System.out.println("Positive = "+p+", Negative = "+neg+", Zero = "+z); }
}
