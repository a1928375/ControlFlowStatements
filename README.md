# ControlFlowStatements

1. Switch:

        (1) Create a new switch statement using char instead of int
        (2) create a new char variable
        (3) create a switch statement testing for A, B, C, D, or E
        (4) display a message if any of these are found and then break
        (5) Add a default which displays a message saying not found

2. printDayOfTheWeek:

        (1) Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day. The method should not  
        return any value (hint: void)
        
        (2) Using a switch statement print Sunday, Monday, Saturday if the int parameter day is 0, 1.....6 respectively, otherwise it   
        should print "Invalid day".

        (3) Bonus: Write a second solution using if then else, instead of using switch.

3. NumberInWord: Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.

4. NumbersOfDaysInMonth: 

        (1) Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater than or equal to 1 and         less than or equal to 9999.
        
        (2) If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate if the year is a leap         year and return true if it is, otherwise return false. 

        (3) A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

        (4) Examples of input/output:

                * isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
                * isLeapYear(1600); → should return true since 1600 is a leap year
                * isLeapYear(2017); → should return false since 2017 is not a leap year
                * isLeapYear(2000); → should return true because 2000 is a leap year 


        (5) Write another method getDaysInMonth with two parameters month and year. Both of type int.

                If parameter month is < 1 or > 12 return -1. 
                If parameter year is < 1 or > 9999 then return -1.

        (6) This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2               (February). You should check if the year is a leap year using the method isLeapYear described above.

        (7) Examples of input/output:

                * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
                * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
                * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap                 year.
                * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
                * getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.


        (8) HINT: Use the switch statement.

5. ForLoops:

        (1) using the for statement, call the calculateInterest method with the amount of 10000 with an interestRate of 2,3,4,5,6,7, and         8 and print the results to the console window.

        (2) How would you modify the for loop above to do the same thing as shown but to start from 8% and work back to 2%

        (3) Create a for statement using any range of numbers. Determine if the number is a prime number using the isPrime method if it         is a prime number, print it out AND increment a count of the number of prime numbers found if that count is 3 exit the for loop
        
        (4) hint:  Use the break; statement to exit

6. PrimeNumber:

        (1) Create a for statement using any range of numbers. Determine if the number is a prime number using the isPrime method if it         is a prime number, print it out AND increment a count of the number of prime numbers found if that count is 3 exit the for loop
        
        (2) hint:  Use the break; statement to exit
        
7. Sum3And5:

        (1) Create a for statement using a range of numbers from 1 to 1000 inclusive. Sum all the numbers that can be divided with both         3 and also with 5.
        
        (2) For those numbers that met the above conditions, print out the number. Break out of the loop once you find 5 numbers that           met the above conditions.

        (3) After breaking out of the loop print the sum of the numbers that met the above conditions.

8. SumOdd:

        (1) Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean. Check that               number is > 0, if it is not return false. If number is odd return true, otherwise  return false.

        (2) Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers. The method         should use a for loop to sum all odd numbers  in that range including the end and return the sum. It should call the method             isOdd to check if each number is odd. The parameter end needs to be greater than or equal to start and both start and end               parameters have to be greater than 0. If those conditions are not satisfied return -1 from the method to indicate invalid input. 

        (3) Example input/output:

                * sumOdd(1, 100); → should return 2500
                * sumOdd(-1, 100); →  should return -1
                * sumOdd(100, 100); → should return 0
                * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
                * sumOdd(100, -100); → should return -1
                * sumOdd(100, 1000); → should return 247500


        (4) TIP: use the remainder operator to check if the number is odd

9. While:

        (1) Make the program record the total number of even numbers it has found and break once 5 are found and at the end, display the         total number of even numbers found

        (2) Create a method called isEvenNumber that takes a parameter of type int. Its purpose is to determine if the argument passed           to the method is an even number or not. Return true if an even number, otherwise return false.
        
10. DigitSum:

        (1) Write a method with the name sumDigits that has one int parameter called number. If parameter is >= 10 then the method               should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.

        (2) The numbers from 0-9 have 1 digit so we dont want to process them, also we dont want to process negative numbers, so also         return -1 for negative numbers.

        (3) For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8. Calling the method sumDigits(1) should           return -1 as per requirements described above.

        (4) Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and           invalid values passed as arguments.

        (5) Hint: 
	        
                (i) Use n % 10 to extract the least-significant digit.
	        (2) Use n = n / 10 to discard the least-significant digit.

11. NumberPalindrome:

	(1) Write a method called isPalindrome with one int parameter called number. The method needs to return a boolean. It should 		return true if the number is a palindrome number otherwise it should return false. Check the tips below for more info about 		palindromes.
	
	(2) Example Input/Output:

		isPalindrome(-1221); → should return true
		isPalindrome(707); → should return true
		isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

	(3) Tip 
		
		(i) What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. 			For example: 121, 12321, 1001 etc.
		
		(ii) Logic to check a palindrome number

		(iii) Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse. 		If both are the the same then the number is a palindrome otherwise it is not.

		(iv) Logic to reverse a number. Declare and initialize another variable to store the reverse of a number, for example 			reverse = 0.

		(v) Extract the last digit of the given number by performing the modulo division (remainder). Store the last digit to 			some variable say lastDigit = num % 10. Increase the place value of reverse by one. To increase place value multiply the 		 reverse variable by 10 e.g. reverse = reverse * 10. Add lastDigit to reverse. Since the last digit of the number is 			processed, remove the last digit of num. To remove the last digit divide number by 10. Repeat steps until number is not 		equal to (or greater than) zero. 

		(vi) A while loop would be good for this coding exercise.
		
		(vii) Be careful with negative numbers. They can also be palindrome numbers. Be careful with reversing a number, you 			will need a parameter for comparing a reversed number with the starting number (parameter).

12. FirstAndLastDigitSum:

	(1) Write a method named sumFirstAndLastDigit with one parameter of type int called number.

	(2) The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return 	the sum of the first and the last digit of that number. If the number is negative then the method needs to return -1 to indicate 	 an invalid value.

	(3) Example input/output:

		* sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 
		4.
		
		* sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 
		9.
		
		* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which 
		gives us 0+0 and the sum is 0.
		
		* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which 
		gives us 5+5 and the sum is 10.
		
		* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.

13. EvenDigitSum:

	(1) Write a method named getEvenDigitSum with one parameter of type int called number. The method should return the sum of the 		even digits within the number. If the number is negative, the method should return -1 to indicate an invalid value.

	(2) EXAMPLE INPUT/OUTPUT:

		* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
		* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
		* getEvenDigitSum(-22); → should return -1 since the number is negative

14. SharedDigit:

	(1) Write a method named hasSharedDigit with two parameters of type int. Each number should be within the range of 10 			(inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

	(2) The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the 		method should return false.

	(3) EXAMPLE INPUT/OUTPUT:

		* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
		* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
		* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

15. LastDigitChecker:

	(1) Write a method named hasSameLastDigit with three parameters of type int. Each number should be within the range of 10 		(inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false. The method should  	  return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


	(2) EXAMPLE INPUT/OUTPUT:

		* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
		* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
		* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000


	(3) Write another method named isValid with one parameter of type int. The method needs to return true if the number parameter 		is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

	(4) EXAMPLE INPUT/OUTPUT:

		* isValid(10); → should return true since 10 is within the range of 10-1000
		* isValid(468); → should return true since 468 is within the range of 10-1000
		* isValid(1051); → should return false since 1051 is not within the range of 10-1000

16. GreatestCommonDivisor:

	(1) Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. If one of the 		parameters is < 10, the method should return -1 to indicate an invalid value. The method should return the greatest common 		divisor of the two numbers (int). The greatest common divisor is the largest positive integer that can fully divide each of the 	integers (i.e. without leaving a remainder).
	
	(2) For example 12 and 30:

		12 can be divided by 1, 2, 3, 4, 6, 12
		30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

	The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.


	(3) EXAMPLE INPUT/OUTPUT:

		* getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
		* getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
		* getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
		* getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder


	(4) HINT: 
	
		(i) Use a while or a for loop and check if both numbers can be divided without a remainder.
		(ii) Find the minimum of the two numbers.

17. AllFactors:

	(1) Write a method named printFactors with one parameter of type int named number. If number is < 1, the method should print 		"Invalid Value".

	(2) The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. 	 without leaving a remainder). For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other 		words 6 / 3 = 2.
	
	(3) EXAMPLE INPUT/OUTPUT:

		* printFactors(6); → should print 1 2 3 6
		* printFactors(32); → should print 1 2 4 8 16 32
		* printFactors(10); → should print 1 2 5 10
		* printFactors(-1); → should print "Invalid Value" since number is < 1


	(4) HINT: 
	
		(i) Use a while or for loop.
		(ii) When printing numbers, each number can be in its own line. They don't have to be separated by a space.

			For example, the printout for printFactors(10); can be:

			1
			2
			5
			10

18. PerfectNumber:

	(1) What is the perfect number? A perfect number is a positive integer which is equal to the sum of its proper positive 		divisors. Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and 		exclude the perfect number itself.
	
	(2) For example, take the number 6:
		Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its 			proper divisors is 1 + 2 + 3 = 6. 

	Therefore, 6 is a perfect number (as well as the first perfect number).

	(3) Write a method named isPerfectNumber with one parameter of type int named number. If number is < 1, the method should return 	 false. The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, 	it should return false.

	(4) EXAMPLE INPUT/OUTPUT:

		* isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
		
		* isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 		= 28

		* isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5

		* isPerfectNumber(-1); should return false since the number is < 1


	(5) HINT: 
	
		(i) Use a while or for loop.
		(ii) Use the remainder operator.
