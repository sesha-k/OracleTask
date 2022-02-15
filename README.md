**VERY IMPORTANT** USE Ecclipse to run program at src/PalindromeMain.java


# OracleTask
This is the solution for Oracle task to find palindrome after the given number.

Palindrome is a String or a number which is the same as its reverse, Such as: liril, wow, 131 or 11. The task of finding the next palindrome is described below:

How we humans proceed to do it?
There are 2 types of inputs possible:

Case 1)
**Any of right digits are bigger than any of their corresponding left digits.**
like 1464 or 1338 or 123 etc

let XYZ be format of input number (assume x,y,z are numeric digits)


Here if any of the digits(At first encounter) right(here z) side to middle digit(here y) is greater than any of the **CORRESPONDING** digits left(here x) of middle. Then we simply increase the y by 1 and copy all digits to left to right.

Example 1:

145
    **iterate starting from middle except middle if odd number of digits**
    1<5

    so 4++

    1-5-5

    And copy 1 to right

    1-5-1

151, Which is next palindrome of 145;

Example 2
123341
    **starting from middle**
    CHECKS:
        3==3
        2<4
    So increase 3(left '3')
        3++
        12'3'341 => 12'4'341
    and copy reverse of 124 at left in place of 341

   **124421** Which is next Palindrome of 123341.

Case 2)
**If any of the digits of LEFT(x) of middle(y) are greater than CORRESPONDING right(z)**
like 4641 or 4331 or 1100 

Then we simply copy the left digits to right WITHOUT INCREMENTING middle.

X>Z

    then

    XYX is next palindrome.

EXAMPLE:
431
    **starting from middle**
    4>1

    So copy 4 to 1 

    4-3-4

And 434 is next Palindrome of 431.

421101
    **starting from middle**
  1==1 => iter next 2 digits
  2>0
  
So copy all digits on left to right

i.e

421124, Which is next palindrome of 421101

Case 3)
If all digits are equal with their respective digits on right then the digit is palindrome.


Methods Explaination:

**numberIntoArray** takes a number as input and converts the number into an arraylist this helps us to compare digits.

**numberOfDigits** Takes a number and finds how many digits there are.

**changeDigits**: takes arraylist as input. to copy array of left digits to right.

**arrayIntoNumber**: takes array as input and converts it into a number.
  
**nextPalindrome**: changes the number to become a palindrome greater than input number.


