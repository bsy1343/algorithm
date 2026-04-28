# [Gold IV] Calculator - 3725

[문제 링크](https://www.acmicpc.net/problem/3725)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 4, 정답 비율: 26.667%

### 분류

수학, 문자열, 사칙연산, 파싱

### 문제 설명

<p>A calculator works with numbers of at most 90 digits long and computes expressions with the following syntax:</p>

<pre>
&lt;expression&gt;::= &lt;number&gt; | (&lt;expression&gt;&lt;operator&gt;&lt;expression&gt;)
&lt;operator&gt;::= + | - | * | /
&lt;number&gt;::= an unsigned decimal integer number</pre>

<p>The operators are: + (addition), - (subtraction), * (multiplication), and / (integer division, yielding the quotient of the division). The calculator aborts the evaluation in the following cases: 1) a division by zero; 2) the result of some operation is negative or exceeds 90 digits; 3) an input number exceeds 90 digits.</p>

<p>Write a program that simulates the calculator. For each expression read from an input text file, the program prints the value of the expression starting from the beginning of an output line. If the calculator aborts the evaluation of the expression, the word Error is printed as shown in the input/output sample above. An expression can contain at most 90 operators and is syntactically correct. White spaces are used freely in input that terminates with an end of file.</p>

### 입력



### 출력

