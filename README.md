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
	        (ii) Use n = n / 10 to discard the least-significant digit.

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
	
	(2) For example, take the number 6: Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is 		excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. Therefore, 6 is a perfect number (as well as the first perfect 		number).

	(3) Write a method named isPerfectNumber with one parameter of type int named number. If number is < 1, the method should return 	 false. The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, 	it should return false.

	(4) EXAMPLE INPUT/OUTPUT:

		* isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
		
		* isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 		= 28

		* isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5

		* isPerfectNumber(-1); should return false since the number is < 1

	(5) HINT: 
	
		(i) Use a while or for loop.
		(ii) Use the remainder operator.

19. NumberToWords:

	(1) Write a method called numberToWords with one int parameter named number. The method should print out the passed number using 	 words for the digits. If the number is negative, print "Invalid Value".

	(2) To print the number as words, follow these steps:

		(i) Extract the last digit of the given number using the remainder operator. 
		
		(ii) Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those 			being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, 			"One" if the digit is 1, and so on.
		
		(iii) Remove the last digit from the number.
		
		(iv) Repeat Steps 2 through 4 until the number is 0.

	(3) The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number 	 is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a 	 second method called reverse.

	(4) The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 	234, then the reversed number would be 432. The method  reverse should also reverse negative numbers. Use the method reverse 		within the method numberToWords in order to print the words in the correct order.

	(5) Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The 		logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this 	 problem, write a third method called getDigitCount.

	(6) The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If 		the number is negative, return -1 to indicate an invalid value. For example, if the number has a value of 100, the method 		getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

	(7) 
		(i) Example Input/Output - getDigitCount method:

			* getDigitCount(0); should return 1 since there is only 1 digit
			* getDigitCount(123); should return 3
			* getDigitCount(-12); should return -1 since the parameter is negative
			* getDigitCount(5200); should return 4 since there are 4 digits in the number

		(ii) Example Input/Output - reverse method

			* reverse(-121); should  return -121
			* reverse(1212); should return  2121
			* reverse(1234); should return 4321
			* reverse(100); should return 1

		(iii) Example Input/Output - numberToWords method

			* numberToWords(123); should print "One Two Three".
			* numberToWords(1010); should print "One Zero One Zero".
			* numberToWords(1000); should print "One Zero Zero Zero".
			* numberToWords(-12); should print "Invalid Value" since the parameter is negative.

	(8) HINT: 
	
		(i) Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, 			but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the 		 digit count from the original number and the reversed number. 

		(ii) When printing words, each word can be in its own line. For example, numberToWords(123); can be:

		One
		Two
		Three

		They don't have to be separated by a space.

20. FlourPackProblem:

	(1) Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal. The parameter bigCount 	represents the count of big flour bags (5 kilos each). The parameter smallCount represents the count of small flour bags (1 kilo 	 each).

	(2) The parameter goal represents the goal amount of kilos of flour needed to assemble a package. Therefore, the sum of the 		kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to 	 make a package with goal kilos of flour.

	(3) If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, 		bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, 		if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full 			smallCount bags equal goal, and it's okay if there are additional bags left over. If any of the parameters are negative, return 	false.
	
	(4) EXAMPLE INPUT/OUTPUT:

		* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

		* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

		* canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 		bag left which is ok as mentioned above.

		* canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 		1 kilo), makes in total 12 kilos and goal is 11 kilos. 

		* canPack (-3, 2, 12); should return false since bigCount is negative.

21. LargestPrime: 

	(1) Write a method named getLargestPrime with one parameter of type int named number. If the number is negative or does not have 	 any prime numbers, the method should return -1 to indicate an invalid value. The method should calculate the largest prime 		factor of a given number and return it.

	(2) EXAMPLE INPUT/OUTPUT:

		* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
		* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
		* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
		* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
		* getLargestPrime (-1); should return -1 since the parameter is negative

	(3) HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

22. DiagonalStar: 

	(1) Write a method named printSquareStar with one parameter of type int named number. If number is < 5, the method should print 	"Invalid Value".

	(2) The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by 		using loops (see examples below).

	(3) EXAMPLE INPUT/OUTPUT:

		EXAMPLE 1

		printSquareStar(5); should print the following:

		*****
		** **
		* * *
		** **
		*****

		Explanation:

		*****   5 stars
		** **   2 stars space 2 stars
		* * *   1 star space 1 star space 1 star
		** **   2 stars space 2 stars
		*****   5 stars

		EXAMPLE 2

		printSquareStar(8); should print the following:

		********
		**    **
		* *  * *
		*  **  *
		*  **  *
		* *  * *
		**    **
		********

	(4) The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or 		column, stars are printed based on four conditions (Read them carefully):

		* In the first or last row
		* In the first or last column
		* When the row number equals the column number
		* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

	(5) HINT: 
	
		(i) Use a nested loop (a loop inside of a loop).

		(ii) To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and 		does not "move" to another line.

		(iii) To "move" to another line, you can use an empty println call, e.g. System.out.println(); .

23. ReadingUserInput: Read inputs from users

24. MinAndMaxInput:

	(1) Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered. Before 	the user enters the number, print the message "Enter number:"
	
	(2) If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

	(3) Hint: Use an endless while loop.

25. InputCalculator:

	(1) Write a method called inputThenPrintSumAndAverage that does not have any parameters. The method should not return anything 		(void) and it needs to keep reading int numbers from the keyboard.

	(2) When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

		XX represents the sum of all entered numbers of type int.
		YY represents the calculated average of all numbers of type long.

	(3) EXAMPLES OF INPUT/OUTPUT:

		EXAMPLE 1:

		INPUT:

		1
		2
		3
		4
		5
		a

		OUTPUT

		SUM = 15 AVG = 3

		EXAMPLE 2:

		INPUT:

		hello

		OUTPUT:

		SUM = 0 AVG = 0

	(4) TIP: 
	
		(i) Use Scanner to read an input from the user.
		(ii) Use casting when calling the round method since it needs double as a parameter.
		(iii) Use the method Math.round to round the calculated average (double). The method round returns long.
		(iv) Be mindful of spaces in the printed message.
		(v) Be mindful of users who may type an invalid input right away (see example above).

26. PaintJob:

	(1) Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint 	 he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover 	with one bucket of paint.

	(2) Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This 		parameter represents the width of the wall. The second parameter should be named height of type double. This parameter 			represents the height of the wall. The third parameter should be named areaPerBucket. This parameter represents the area that 		can be covered with one bucket of paint. The fourth parameter should be named extraBuckets. This parameter represents the bucket 	 count that Bob has at home. 
	
	(3) The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to 		work. To calculate the bucket count, refer to the notes below. If one of the parameters width, height or areaPerBucket is less 		or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value. If all parameters 		are valid, the method needs to calculate the number of buckets and return it.

	(4) Examples of input/output:

		*getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid

		*getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 			1.5 and Bob has 2 extra buckets home.

		*getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area 		of 2.5 and Bob has 1 extra bucket at home.

	(5) Bob does not like to enter 0 for the extraBuckets parameter so he needs another method. Write another overloaded method 		named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double). This method needs to return 	 a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket 		count, refer to the notes below.

	(6) If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an 	invalid value. If all parameters are valid, the method needs to calculate the number of buckets and return it.

	(7) Examples of input/output:

		*getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
		
		*getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 		1.5.

		*getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an 			area of 2.35.

	(8) In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write 		another method. Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of 		type double).

	(9) The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to 		work. To calculate the bucket count, refer to the notes below. If one of the parameters area or areaPerBucket is less or equal 		to 0, the method needs to return -1to indicate an invalid value.If all parameters are valid, the method needs to calculate the 		number of buckets and return it.
	
	(10) Examples of input/output:

		*getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5

		*getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.

		*getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 			0.75 .

	(11) Do your best to help Bob.

	(12) NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert it into an int before 		returning the value from the methods.
