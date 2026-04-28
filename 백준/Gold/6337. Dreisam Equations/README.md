# [Gold II] Dreisam Equations - 6337

[문제 링크](https://www.acmicpc.net/problem/6337)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 5, 맞힌 사람: 5, 정답 비율: 35.714%

### 분류

문자열, 파싱, 재귀

### 문제 설명

<p>During excavations in the Dreisamw&uuml;ste, a desert on some far away and probably uncivilized planet, sheets of paper containing mysterious symbols had been found. After a long investigation, the project scientists have concluded that the symbols might be parts of equations. If this were true, it would be proof that the Dreisamw&uuml;ste was civilized a long long time ago.</p>

<p>The problem, however, is that the only symbols found on the sheets are digits, parantheses and equality signs. There is strong evidence that the people living in the Dreisamw&uuml;ste knew only of three arithmetic operations: addition, subtraction, and multiplication. It is also known that the people of the Dreisamw&uuml;ste did not have prioritization rules for arithmetic operations - they evaluate all terms strictly left to right. For example, for them the term 3 + 3 * 5 would be equal to 30, and not 18.</p>

<p>But currently, the sheets do not contain any arithmetic operators. So if the hypothesis is true, and the numbers on the sheets form equations, then the operators must have faded away over time.</p>

<p>You are the computer expert who is supposed to find out whether the hypothesis is sensible or not. For some given equations (without arithmetic operators) you must find out if there is a possibility to place +, -, and * in the expression, so that it yields a valid equation. For example, on one sheet, the string &quot;18=7 (5 3) 2&quot; has been discovered. Here, one possible solution is &quot;18=7+(5-3)*2&quot;. But if there was a sheet containing &quot;5=3 3&quot;, then this would mean that the Dreisamw&uuml;ste people did not mean an equation when writing this.</p>

### 입력

<p>Each equation to deal with occupies one line in the input. Each line begins with a positive integer (less than 2<sup>30</sup>) followed by an equality sign =. (For your convenience, the Dreisamw&uuml;ste inhabitants used equations with trivial left sides only.) This is followed by up to 12 positive integers forming the right side of the equation. (The product of these numbers will be less than 2<sup>30</sup>.) There might be some parentheses around groups of one or more numbers. There will be no line containing more than 80 characters. There is no other limit for the amount of the parentheses in the equation. There will always be at least one space or parenthesis between two numbers, otherwise the occurrence of white space is unrestricted.</p>

<p>The line containing only the number 0 terminates the input, it should not be processed.</p>

### 출력

<p>For each equation, output the line &quot;Equation #n:&quot;, where n is the number of the equation. Then, output one line containing a solution to the problem, i. e. the equation with the missing +, -, and * signs inserted. Do not print any white space in the equation.</p>

<p>If there is no way to insert operators to make the equation valid, then output the line &quot;Impossible.&quot;.</p>

<p>Output one blank line after each test case.</p>