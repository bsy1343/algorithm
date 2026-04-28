# [Gold IV] Equation Elation - 4686

[문제 링크](https://www.acmicpc.net/problem/4686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 18, 맞힌 사람: 15, 정답 비율: 60.000%

### 분류

구현, 수학, 파싱, 문자열

### 문제 설명

<p>The author of an elementary school algebra text book has approached you to write a program to solve simple algebra equations. The author wants to use a program to avoid human errors in preparing the solutions manual. The text book author will provide a text file of the simple problems for your problem to solve. All of the problems will be in the form of an algebraic equality. The specific syntax of the problems will be an algebraic statement consisting of integer constants and the four basic arithmetic operators, an &nbsp;equal sign, and a variable. For example:</p>

<p>12 - 4 * 3 = x</p>

<p>For the solutions manual the problem is not just to be solved, but solved one step at a time. For the above input line, the corresponding output would be:</p>

<p>12 - 4 * 3 = x<br />
12 - 12 = x<br />
0 = x</p>

<p>The simple problems your program is to solve are limited to integer values with multiplication, division, addition and subtraction operations. Note that, as in the above example, the computation must follow the standard order of precedence for arithmetic operations. All multiplications and divisions are performed, from left to right, before any additions and subtractions, and then all additions and subtractions are performed from left to right. You may assume that all divisions will result in integer values.</p>

### 입력

<p>The input file will consist of several equations to be solved. Each equation will contain from 1 to 20 operations with 2 to 21 integer operands (there will, of course, always be one more operand than operators). Integer operations in the input may have a leading sign (i.e may be preceded by a unary operator). Spaces in the input line are optional; that is, spaces may be present between operators and operands, or they may not. The variable names will consist of 1 to 8 alphabetic characters.</p>

<p>&nbsp;</p>

### 출력

<p>Output for a problem should begin with the problem to be solved, then followed by one line of output after each operation. The spacing between the numbers and operations in the output is not critical. Having the correct answers and all the correct steps in the output is important.&nbsp;</p>

<p>A typical input file will consist of multiple algebraic problems, each on a separate line. The output for each input problem should be separated by single plank line in the output. The end of the file marks the end of the input.</p>