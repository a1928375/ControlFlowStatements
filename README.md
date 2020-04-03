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
	
	(2) Example Input/Output

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

	(3) Example input/output

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
