import java.util.Scanner;

/*
 * Batch 2 - Java Conditional Statements & Decision-Making
 * File name: Batch2.java
 *
 * Compile: javac Batch2.java
 * Run:     java Batch2
 * Enter a question number (1-50), then provide the sample input.
 */
public class Batch2 {
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

    // Q1. Check whether a person is eligible for a driving licence (age >= 18).
    // Input: 20 | Output: Eligible
    static void q01() { int age=sc.nextInt(); System.out.println(age>=18 ? "Eligible" : "Not Eligible"); }

    // Q2. Check whether a number is a two-digit number.
    // Input: 45 | Output: Two-digit number
    static void q02() { int n=Math.abs(sc.nextInt()); System.out.println(n>=10 && n<=99 ? "Two-digit number" : "Not a two-digit number"); }

    // Q3. Check whether a number is a three-digit number.
    // Input: 725 | Output: Three-digit number
    static void q03() { int n=Math.abs(sc.nextInt()); System.out.println(n>=100 && n<=999 ? "Three-digit number" : "Not a three-digit number"); }

    // Q4. Check whether the last digit of a number is 5.
    // Input: 125 | Output: Last digit is 5
    static void q04() { int n=sc.nextInt(); System.out.println(Math.abs(n%10)==5 ? "Last digit is 5" : "Last digit is not 5"); }

    // Q5. Check whether a number is divisible by 3 or 7.
    // Input: 21 | Output: Divisible by 3 or 7
    static void q05() { int n=sc.nextInt(); System.out.println(n%3==0 || n%7==0 ? "Divisible by 3 or 7" : "Not divisible by 3 or 7"); }

    // Q6. Check whether a number is divisible by 2 and 3 but not by 5.
    // Input: 12 | Output: Condition satisfied
    static void q06() { int n=sc.nextInt(); System.out.println(n%2==0 && n%3==0 && n%5!=0 ? "Condition satisfied" : "Condition not satisfied"); }

    // Q7. Check whether a character is uppercase or lowercase.
    // Input: G | Output: Uppercase
    static void q07() { char c=sc.next().charAt(0); if(Character.isUpperCase(c)) System.out.println("Uppercase"); else if(Character.isLowerCase(c)) System.out.println("Lowercase"); else System.out.println("Not an alphabetic letter"); }

    // Q8. Check whether an entered character is an English alphabet.
    // Input: m | Output: Alphabet
    static void q08() { char c=sc.next().charAt(0); System.out.println((c>='A'&&c<='Z')||(c>='a'&&c<='z') ? "Alphabet" : "Not an alphabet"); }

    // Q9. Check whether a character is a vowel using switch.
    // Input: O | Output: Vowel
    static void q09() { char c=Character.toLowerCase(sc.next().charAt(0)); switch(c){case 'a':case 'e':case 'i':case 'o':case 'u':System.out.println("Vowel");break;default:System.out.println("Not a vowel");} }

    // Q10. Check whether a number lies in the range 1 to 100 inclusive.
    // Input: 75 | Output: Inside range
    static void q10() { int n=sc.nextInt(); System.out.println(n>=1&&n<=100 ? "Inside range" : "Outside range"); }

    // Q11. Find the middle value among three distinct integers.
    // Input: 10 30 20 | Output: Middle = 20
    static void q11() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); int mid=(a>b)?((b>c)?b:((a>c)?c:a)):((a>c)?a:((b>c)?c:b)); System.out.println("Middle = "+mid); }

    // Q12. Check whether three angles can form a triangle.
    // Input: 60 60 60 | Output: Valid triangle
    static void q12() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); System.out.println(a>0&&b>0&&c>0&&a+b+c==180 ? "Valid triangle" : "Invalid triangle"); }

    // Q13. Identify triangle type by sides.
    // Input: 5 5 8 | Output: Isosceles triangle
    static void q13() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); if(a<=0||b<=0||c<=0||a+b<=c||a+c<=b||b+c<=a) System.out.println("Invalid triangle"); else if(a==b&&b==c) System.out.println("Equilateral triangle"); else if(a==b||b==c||a==c) System.out.println("Isosceles triangle"); else System.out.println("Scalene triangle"); }

    // Q14. Identify triangle type by angles.
    // Input: 90 60 30 | Output: Right-angled triangle
    static void q14() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); if(a<=0||b<=0||c<=0||a+b+c!=180) System.out.println("Invalid triangle"); else if(a==90||b==90||c==90) System.out.println("Right-angled triangle"); else if(a>90||b>90||c>90) System.out.println("Obtuse-angled triangle"); else System.out.println("Acute-angled triangle"); }

    // Q15. Check whether a year is a century year.
    // Input: 2000 | Output: Century year
    static void q15() { int y=sc.nextInt(); System.out.println(y%100==0 ? "Century year" : "Not a century year"); }

    // Q16. Check whether a year is a leap year and a century year.
    // Input: 2000 | Output: Leap century year
    static void q16() { int y=sc.nextInt(); boolean leap=y%400==0||(y%4==0&&y%100!=0); if(leap&&y%100==0) System.out.println("Leap century year"); else if(leap) System.out.println("Leap year, not century"); else if(y%100==0) System.out.println("Century year, not leap"); else System.out.println("Neither leap nor century"); }

    // Q17. Calculate profit or loss from cost price and selling price.
    // Input: 500 650 | Output: Profit = 150.0
    static void q17() { double cp=sc.nextDouble(),sp=sc.nextDouble(); if(sp>cp) System.out.println("Profit = "+(sp-cp)); else if(cp>sp) System.out.println("Loss = "+(cp-sp)); else System.out.println("No profit, no loss"); }

    // Q18. Calculate profit/loss percentage.
    // Input: 500 600 | Output: Profit Percentage = 20.0
    static void q18() { double cp=sc.nextDouble(),sp=sc.nextDouble(); if(cp<=0) System.out.println("Invalid cost price"); else if(sp>cp) System.out.println("Profit Percentage = "+((sp-cp)*100/cp)); else if(sp<cp) System.out.println("Loss Percentage = "+((cp-sp)*100/cp)); else System.out.println("0.0%"); }

    // Q19. Apply discount: 20% for bill >= 5000, 10% for bill >= 2000, otherwise none.
    // Input: 6000 | Output: Discount=1200.0, Payable=4800.0
    static void q19() { double bill=sc.nextDouble(),rate=bill>=5000?0.20:bill>=2000?0.10:0; if(bill<0){System.out.println("Invalid bill");return;} double d=bill*rate; System.out.println("Discount = "+d); System.out.println("Payable = "+(bill-d)); }

    // Q20. Calculate bonus: 10% for service >= 10 years, 5% for >= 5 years.
    // Input: salary=30000 years=12 | Output: Bonus=3000.0
    static void q20() { double salary=sc.nextDouble(); int years=sc.nextInt(); double bonus=years>=10?salary*.10:years>=5?salary*.05:0; System.out.println("Bonus = "+bonus); }

    // Q21. Determine whether a student passes: each of three subjects must be >= 35.
    // Input: 60 35 70 | Output: Pass
    static void q21() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); System.out.println(a>=35&&b>=35&&c>=35?"Pass":"Fail"); }

    // Q22. Determine division: >=75 Distinction, >=60 First, >=50 Second, >=35 Pass.
    // Input: 78 | Output: Distinction
    static void q22() { int m=sc.nextInt(); if(m<0||m>100)System.out.println("Invalid marks"); else if(m>=75)System.out.println("Distinction"); else if(m>=60)System.out.println("First Division"); else if(m>=50)System.out.println("Second Division"); else if(m>=35)System.out.println("Pass"); else System.out.println("Fail"); }

    // Q23. Check scholarship eligibility: marks >= 85 and family income <= 300000.
    // Input: 90 250000 | Output: Scholarship eligible
    static void q23() { int marks=sc.nextInt(); double income=sc.nextDouble(); System.out.println(marks>=85&&income<=300000?"Scholarship eligible":"Not eligible"); }

    // Q24. Check whether a person is eligible for a senior citizen discount (age >= 60).
    // Input: 65 | Output: Discount applicable
    static void q24() { int age=sc.nextInt(); System.out.println(age>=60?"Discount applicable":"Discount not applicable"); }

    // Q25. Calculate parking fee: first 2 hours 30, each extra hour 10.
    // Input: 5 | Output: Parking Fee = 60
    static void q25() { int h=sc.nextInt(); if(h<=0){System.out.println("Invalid hours");return;} System.out.println("Parking Fee = "+(h<=2?30:30+(h-2)*10)); }

    // Q26. Calculate taxi fare: first 5 km 50, each additional km 12.
    // Input: 8 | Output: Fare = 86.0
    static void q26() { double km=sc.nextDouble(); if(km<0){System.out.println("Invalid distance");return;} System.out.println("Fare = "+(km<=5?50:50+(km-5)*12)); }

    // Q27. Check whether a given month number has 30, 31 or 28/29 days.
    // Input: 2 2024 | Output: 29 days
    static void q27() { int m=sc.nextInt(),y=sc.nextInt(); switch(m){case 1:case 3:case 5:case 7:case 8:case 10:case 12:System.out.println("31 days");break;case 4:case 6:case 9:case 11:System.out.println("30 days");break;case 2:boolean leap=y%400==0||(y%4==0&&y%100!=0);System.out.println(leap?"29 days":"28 days");break;default:System.out.println("Invalid month");} }

    // Q28. Display the day name for day number 1 to 7.
    // Input: 3 | Output: Wednesday
    static void q28() { int d=sc.nextInt(); String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; if(d>=1&&d<=7)System.out.println(days[d-1]);else System.out.println("Invalid day number"); }

    // Q29. Display the month name for month number 1 to 12.
    // Input: 11 | Output: November
    static void q29() { int m=sc.nextInt(); String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"}; if(m>=1&&m<=12)System.out.println(months[m-1]);else System.out.println("Invalid month number"); }

    // Q30. Build a simple menu-driven area calculator (1 square, 2 rectangle, 3 circle).
    // Input: choice=2, length=5, width=4 | Output: Area = 20.0
    static void q30() { int ch=sc.nextInt(); switch(ch){case 1:double s=sc.nextDouble();System.out.println("Area = "+(s*s));break;case 2:double l=sc.nextDouble(),w=sc.nextDouble();System.out.println("Area = "+(l*w));break;case 3:double r=sc.nextDouble();System.out.println("Area = "+(Math.PI*r*r));break;default:System.out.println("Invalid choice");} }

    // Q31. Check whether a given time in 24-hour format is valid.
    // Input: 23 45 | Output: Valid time
    static void q31() { int h=sc.nextInt(),m=sc.nextInt(); System.out.println(h>=0&&h<=23&&m>=0&&m<=59?"Valid time":"Invalid time"); }

    // Q32. Convert 24-hour hour value to AM/PM label.
    // Input: 18 | Output: 6 PM
    static void q32() { int h=sc.nextInt(); if(h<0||h>23)System.out.println("Invalid hour"); else System.out.println((h%12==0?12:h%12)+(h<12?" AM":" PM")); }

    // Q33. Check whether a number is within 10 of 100.
    // Input: 94 | Output: Within 10 of 100
    static void q33() { int n=sc.nextInt(); System.out.println(Math.abs(n-100)<=10?"Within 10 of 100":"Outside range"); }

    // Q34. Check whether exactly one of two boolean-like integers is 1.
    // Input: 1 0 | Output: Exactly one is 1
    static void q34() { int a=sc.nextInt(),b=sc.nextInt(); if((a!=0&&a!=1)||(b!=0&&b!=1)){System.out.println("Invalid input");return;} System.out.println((a^b)==1?"Exactly one is 1":"Not exactly one"); }

    // Q35. Check whether three numbers are in strictly increasing order.
    // Input: 2 5 9 | Output: Increasing order
    static void q35() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); System.out.println(a<b&&b<c?"Increasing order":"Not increasing order"); }

    // Q36. Check whether three numbers are in strictly decreasing order.
    // Input: 9 5 2 | Output: Decreasing order
    static void q36() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); System.out.println(a>b&&b>c?"Decreasing order":"Not decreasing order"); }

    // Q37. Check whether a point lies on X-axis, Y-axis, origin or elsewhere.
    // Input: 0 5 | Output: On Y-axis
    static void q37() { int x=sc.nextInt(),y=sc.nextInt(); if(x==0&&y==0)System.out.println("Origin"); else if(y==0)System.out.println("On X-axis"); else if(x==0)System.out.println("On Y-axis"); else System.out.println("Neither axis"); }

    // Q38. Identify the quadrant of a point.
    // Input: -3 4 | Output: Quadrant II
    static void q38() { int x=sc.nextInt(),y=sc.nextInt(); if(x==0||y==0)System.out.println("Point lies on an axis"); else if(x>0&&y>0)System.out.println("Quadrant I"); else if(x<0&&y>0)System.out.println("Quadrant II"); else if(x<0)System.out.println("Quadrant III"); else System.out.println("Quadrant IV"); }

    // Q39. Check whether a point is inside, on or outside a circle centered at origin.
    // Input: x=3 y=4 radius=5 | Output: On the circle
    static void q39() { double x=sc.nextDouble(),y=sc.nextDouble(),r=sc.nextDouble(); if(r<0){System.out.println("Invalid radius");return;} double d2=x*x+y*y,r2=r*r; if(Math.abs(d2-r2)<1e-9)System.out.println("On the circle"); else if(d2<r2)System.out.println("Inside the circle"); else System.out.println("Outside the circle"); }

    // Q40. Check whether a number is a multiple of 10 but not 20.
    // Input: 30 | Output: Valid multiple
    static void q40() { int n=sc.nextInt(); System.out.println(n%10==0&&n%20!=0?"Valid multiple":"Condition not satisfied"); }

    // Q41. Calculate water bill: 0-100 units at 2, 101-200 at 3, above 200 at 5 (slab-wise).
    // Input: 250 | Output: Water Bill = 650.0
    static void q41() { int u=sc.nextInt(); if(u<0){System.out.println("Invalid units");return;} double bill=u<=100?u*2:u<=200?200+(u-100)*3:200+300+(u-200)*5; System.out.println("Water Bill = "+bill); }

    // Q42. Calculate income tax: first 250000 at 0%, next 250000 at 5%, next 500000 at 10%, rest at 20%.
    // Input: 800000 | Output: Income Tax = 35000.0
    static void q42() { double income=sc.nextDouble(); if(income<0){System.out.println("Invalid income");return;} double tax=0; if(income>250000)tax+=(Math.min(income,500000)-250000)*.05; if(income>500000)tax+=(Math.min(income,1000000)-500000)*.10; if(income>1000000)tax+=(income-1000000)*.20; System.out.println("Income Tax = "+tax); }

    // Q43. Check login credentials against a sample username and password.
    // Input: admin Java123 | Output: Login successful
    static void q43() { String user=sc.next(),pass=sc.next(); System.out.println(user.equals("admin")&&pass.equals("Java123")?"Login successful":"Invalid username or password"); }

    // Q44. Validate a simple PIN: exactly four digits.
    // Input: 1234 | Output: Valid PIN
    static void q44() { String pin=sc.next(); System.out.println(pin.matches("[0-9]{4}")?"Valid PIN":"Invalid PIN"); }

    // Q45. Validate an age category.
    // Input: 14 | Output: Teenager
    static void q45() { int age=sc.nextInt(); if(age<0)System.out.println("Invalid age"); else if(age<=12)System.out.println("Child"); else if(age<=19)System.out.println("Teenager"); else if(age<=59)System.out.println("Adult"); else System.out.println("Senior citizen"); }

    // Q46. Determine the nature of roots of a quadratic equation using its discriminant.
    // Input: 1 -5 6 | Output: Two distinct real roots
    static void q46() { double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble(); if(a==0){System.out.println("Not a quadratic equation");return;} double d=b*b-4*a*c; if(d>0)System.out.println("Two distinct real roots"); else if(d==0)System.out.println("Two equal real roots"); else System.out.println("Two complex roots"); }

    // Q47. Calculate roots of a quadratic equation when roots are real.
    // Input: 1 -5 6 | Output: Roots = 3.0, 2.0
    static void q47() { double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble(); if(a==0){System.out.println("Not a quadratic equation");return;} double d=b*b-4*a*c; if(d<0){System.out.println("No real roots");return;} double r1=(-b+Math.sqrt(d))/(2*a),r2=(-b-Math.sqrt(d))/(2*a); System.out.println("Roots = "+r1+", "+r2); }

    // Q48. Check whether three given sides form a right triangle.
    // Input: 3 4 5 | Output: Right triangle
    static void q48() { int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(); int[] s={a,b,c}; java.util.Arrays.sort(s); if(s[0]<=0||s[0]+s[1]<=s[2])System.out.println("Invalid triangle"); else System.out.println((long)s[0]*s[0]+(long)s[1]*s[1]==(long)s[2]*s[2]?"Right triangle":"Not a right triangle"); }

    // Q49. Determine employee category from salary: <20000 Junior, <50000 Mid-level, otherwise Senior.
    // Input: 42000 | Output: Mid-level employee
    static void q49() { double salary=sc.nextDouble(); if(salary<0)System.out.println("Invalid salary"); else if(salary<20000)System.out.println("Junior employee"); else if(salary<50000)System.out.println("Mid-level employee"); else System.out.println("Senior employee"); }

    // Q50. Determine whether a customer qualifies for a loan: age 21-60, salary >= 25000, credit score >= 700.
    // Input: age=30 salary=40000 creditScore=750 | Output: Loan eligible
    static void q50() { int age=sc.nextInt(); double salary=sc.nextDouble(); int score=sc.nextInt(); System.out.println(age>=21&&age<=60&&salary>=25000&&score>=700?"Loan eligible":"Loan not eligible"); }
}
