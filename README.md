VERY IMPORTANT USED ECLIPSE TO CREATE PROJECT


# OracleTask
This is the solution for Oracle task to find palindrome after the given number.

Palindrome is a String or a number which is the same as its reverse, Such as: liril, wow, 131 or 11. The task of finding the next palindrome is described below:

How we humans proceed to do it?
There are 2 types of inputs possible:

Case 1)
**Any of right digits are bigger than aany of their corresponding left digits.**
xyz (assume x,y,z are numbers)

Here if any of the digits(At first encounter) right(here z) side to middle digit(here y) is greater than any of the **CORRESPONDING** digits left(here x) of middle. Then we simply increase the y by 1 and copy all digits to left to right.

Example 1:

145

1<5

so 4++

1-5-5

And copy 1 to right

1-5-1

151, Which is next palindrome of 145;

Example 2
123341

CHECKS:
    3==3
    2<4
So increase 3(left '3')
3++
124341
and copy

124421 Which is next Palindrome of 123341.

Case 2)
**If any of the digits of LEFT(x) of middle(y) are greater than CORRESPONDING right(z)**
if x>z

Then we simply copy the left digits to right WITHOUT INCREMENTING middle.

X>Z

then

XYX is next palindrome.

EXAMPLE:
431

4>1

So copy 4 to 1 

4-3-4

And 434 is next Palindrome of 431.

421101

  1==1
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


