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
