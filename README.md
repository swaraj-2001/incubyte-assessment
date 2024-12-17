#  String Calculator - TDD Kata 

This project implements a  String Calculator  following  Test-Driven Development (TDD)  principles. It evolves step by step with incremental changes, adhering to best coding and testing practices.
 

##  Overview 

The  String Calculator  provides a method:

int add(String numbers)

-  Input : A string containing numbers separated by commas or custom delimiters.  
-  Output : Returns the sum of the numbers.  
- Includes support for advanced cases like custom delimiters, handling newlines, and detecting negative numbers.

 

##  Features 

1.  Empty String Returns Zero   
   Input: `""` → Output: `0`  

2.  Handles Single and Multiple Numbers   
   Input: `"1"` → Output: `1`  
   Input: `"1,2,3"` → Output: `6`  

3.  Supports Newline as a Delimiter   
   Input: `"1\n2,3"` → Output: `6`  

4.  Supports Custom Delimiters   
   Input: `"//;\n1;2"` → Output: `3`  

5.  Throws Exception for Negative Numbers   
   Input: `"1,-2,-3"` → Exception: `"negative numbers not allowed -2,-3"`

 

##  Technologies Used 

-  Java : Programming language  
-  JUnit : Testing framework  
-  Git : Version control  
-  Maven  (optional): Build and dependency management  


##  How to Run 

1.  Clone the Repository 
    bash
   git clone https://github.com/swaraj-2001/incubyte-assessment.git
   cd string-calculator-tdd
    

2.  Build the Project  (optional for Maven users)
    bash
    mvn clean install
    

3.  Run the Tests 
   Execute unit tests to ensure all TDD steps are satisfied:
    bash
   mvn test
    

4.  Explore the Code 
   - The solution is in the `src/main/java` directory.  
   - Unit tests are in the `src/test/java` directory.  

 

##  Development Approach 

This project follows the  Test-Driven Development (TDD)  cycle:  
1.  Write a failing test   
2.  Write minimal code to make the test pass   
3.  Refactor the code   

 Commit History  shows the evolution of the project, with frequent commits for each TDD step.

 

##  Example Usage 

Here’s an example of how the `add()` method works:

 java
StringCalculator calculator = new StringCalculator();

System.out.println(calculator.add(""));           // Output: 0
System.out.println(calculator.add("1"));          // Output: 1
System.out.println(calculator.add("1,2,3"));      // Output: 6
System.out.println(calculator.add("//;\n1;2"));   // Output: 3
 

 

##  References 

- TDD by Example - YouTube (https://www.youtube.com/watch?v=qkblc5WRn-U)  
- Test-Driven Development (https://incubyte.co/inspiration)

 

##  Feel free to give your ideas 🚀
