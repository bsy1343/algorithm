# [Gold V] Expression Evaluator - 6742

[문제 링크](https://www.acmicpc.net/problem/6742)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 22, 맞힌 사람: 14, 정답 비율: 20.290%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>This problem is about evaluating some C-style expressions. The expressions to be evaluated will contain only simple integer variables and a limited set of operators; there will be no constants in the expressions. There are 26 variables in the program, named by lower case letters a through z. Before evaluation, the initial values of these variables are a = 1, b = 2, ..., z = 26.</p>

<p>The operators allowed are addition and subtraction (binary + and -), with their known meaning. So, the expression a + c - d + b has the value 2 (1 + 3 - 4 + 2). Additionally, ++ and &ndash;- operators are allowed in the input expression too, which are unary operators, and may come before or after variables. If the ++ operator comes before a variable, then that variable&#39;s value is increased (by one) before the variable&#39;s value is used in calculating the value of the whole expression. Thus the value of ++ c - b is 2. When ++ comes after a variable, that variable is increased (by one) after its value is used to calculate the value of the whole expression. So, the value of the c ++ - b is 1, though c is incremented after the value for entire expression is computed; its value will be 4 too. The -- operator behaves the same way, except that it decreases the value of its operand.</p>

<p>More formally, an expression is evaluated in the following manner:</p>

<ol>
	<li>Identify every variable that are preceded by ++. Write an assignment statement for incrementing the value of each of them, and omit the ++ from before that variable in the expression.</li>
	<li>Do similarly for the variables with ++ after them.</li>
	<li>At this point, there is no ++ operator in the expression. Write a statement evaluating the remaining expression after the statements determined in step 1, and before those determined in step 2.</li>
	<li>Execute the statements determined in step 1, then those written in step 3, and finally the one written in step 2.</li>
</ol>

<p>This way, evaluating ++ a + b ++ is the same as computing a = a + 1, result = a + b, and b = b + 1.</p>

### 입력

<p>The first line of the input contains a single integer T which is the number of test cases, followed by T lines each containing the input expression for a test case. Ignore blanks in the input expression. Be sure that no ambiguity is in the input expressions (like a+++b). Similarly, ++ or -- operators do not appear both before and after one single variable (like ++a++). You may safely assume each variable appears only once in an expression.</p>

### 출력

<p>For each test case, write each expression as it appears in the input (exactly), then write the value of the complete expression. After this, on separate lines, write the value of each variable after evaluating the expression (write them in sorted order of the variable names). Write only the values of the variables that are used in the expressions. To find out about the output format, follow the style used in the sample output below.</p>