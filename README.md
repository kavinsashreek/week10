# Week 10 — Category C Java Practice

Solutions based on the uploaded Category C practice PDF and the Busiest Bus Row assignment.

## Part A — Coding Problems

| Problem | Solution |
|---|---|
| 1. Vowel and Consonant Counter | [VowelConsonantCounter.java](Assignment/M1/VowelConsonantCounter.java) |
| 2. Word Reverser and Palindrome Checker | [WordReverserPalindromeChecker.java](Assignment/M2/WordReverserPalindromeChecker.java) |
| 3. Even and Odd Numbers in a List | [EvenOddCounter.java](Assignment/M3/EvenOddCounter.java) |
| 4. In-Place Array Reversal | [InPlaceArrayReversal.java](Assignment/M4/InPlaceArrayReversal.java) |
| 5. Digit Sum and Number Reversal | [DigitSumAndNumberReversal.java](Assignment/M5/DigitSumAndNumberReversal.java) |
| 6. Prime Number Checker | [PrimeNumberChecker.java](Assignment/M6/PrimeNumberChecker.java) |
| 7. Factorial Calculation | [FactorialCalculation.java](Assignment/M7/FactorialCalculation.java) |
| 8. Student Grade Assignment | [StudentGradeAssignment.java](Assignment/M8/StudentGradeAssignment.java) |
| 9. Leap Year Detector | [LeapYearDetector.java](Assignment/M9/LeapYearDetector.java) |
| 10. Student Result Card Generator | [StudentResultCardGenerator.java](Assignment/M10/StudentResultCardGenerator.java) |
| Extra. Busiest Bus Row | [BusiestBusRow.java](Assignment/Extra/BusiestBusRow.java) |

### Compile and run

Run commands from the directory containing the source file. Example:

```bash
javac VowelConsonantCounter.java
java VowelConsonantCounter
```

Each Java program is independent. The Student Result Card Generator uses the sample students from the worksheet. The Even/Odd and Array Reversal programs also use the worksheet's sample arrays.

## Part B — Quiz Answers

1. **D** — `==` compares references; `equals()` compares String contents.
2. **B** — `baL avaJ`.
3. **B** — `Student(String name)` is called directly.
4. **D** — Both references point to the same wallet, whose balance becomes 700.
5. **C** — The static visitor count is 3.
6. **A** — `45 78 92 60 85`.
7. **B** — `1 2 4 5`; `continue` skips printing 3.
8. **A** — 5; primitive arguments are passed by value.
9. **C** — `83.33333333333333`.
10. **B** — `Paid 510.0 by card`.
11. **B** — Strings are immutable; `upperName` receives the uppercase result.
12. **B** — Two String objects: the pooled literal and the explicitly constructed object.
13. **B** — `6` then `m`.
14. **A** — `4`, the index of `@`.
15. **B** — `Title: Unknown, Price: 0.0`.
16. **A** — `Title: Java Programming, Price: 450.0`.
17. **B** — Two Wallet objects.
18. **C** — Both balances are 700.
19. **C** — s1 is Anu and s2 remains Ravi.
20. **C** — `Total visitors: 3`.

## Part C — Concept Questions

### 1. String immutability and performance
Strings in Java are immutable, so their contents cannot be changed after creation. Repeated concatenation creates new String objects and may use extra time and memory. Use `StringBuilder` when building text repeatedly; it modifies a reusable character buffer.

### 2. The `this` keyword
When a constructor parameter has the same name as an instance variable, `this` refers to the current object's field. For example, `this.name = name;` assigns the parameter `name` to the field `name`.

### 3. Object versus reference variable
An object is an instance stored in memory; a reference variable holds a value that refers to that object. Assigning `w2 = w1` copies the reference, not the object, so both variables refer to the same object. Changes made through either reference are visible through the other.

### 4. Static versus instance variables
A static variable belongs to the class and is shared by every object, such as a total visitor count. An instance variable belongs to one object, such as an individual student's name or marks, because each student has different data.

### 5. for, while, and do-while loops
A `for` loop suits a known number of repetitions, such as iterating through an array. A `while` loop suits repetition that continues while a condition is true, such as reading until a sentinel value. A `do-while` loop checks its condition after the body, so it runs at least once; it suits menus that must be displayed before checking whether to continue.

### 6. Pass-by-value
Java always passes arguments by value. For a primitive, the method receives a copy of the value, so changing the parameter does not change the original variable. For an object, the method receives a copy of the reference; it can modify the same object's fields, but reassigning the copied reference does not change the caller's reference.

### 7. Integer division
When both operands are integers, Java integer division discards the fractional part: `250 / 3` evaluates to `83`. To get a floating-point result, make at least one operand floating point, for example `250.0 / 3` or `(double) total / count`.

### 8. Encapsulation
Encapsulation bundles data and methods in a class and controls access to the data. Declaring fields `private` prevents direct outside access; public getters and setters provide controlled access. A setter can validate values before changing a field, helping maintain valid object state.

### 9. `==` versus `equals()`
For object references, `==` checks whether both references point to the same object. `equals()` checks logical equality according to the class implementation. String overrides `equals()` to compare character contents, so two separate String objects can be equal even when `==` is false.

### 10. Overloading versus overriding
**Overloading** uses the same method name with different parameter lists; the compiler selects the matching signature at compile time, for example `print(int)` and `print(String)`. **Overriding** occurs when a subclass provides its own implementation of an inherited method with the same signature; the implementation used for an overridden instance method is selected at run time based on the actual object type.

## Extra — Busiest Bus Row

Sum each row and update the best row only when the new total is strictly greater. This preserves the smaller row index when totals tie.

- **Time complexity:** `O(r × c)`, because every grid cell is visited once.
- **Additional space:** `O(1)` auxiliary space, excluding the input grid and the two-element return array.
- For the sample grid, the output is `Row 1, Total 7` (zero-based row index).
