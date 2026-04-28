# [Platinum IV] Complete the sequence! - 3471

[문제 링크](https://www.acmicpc.net/problem/3471)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 22, 맞힌 사람: 18, 정답 비율: 62.069%

### 분류

수학, 미적분학, 차분 배열 트릭, 다항식 보간법

### 문제 설명

<p>You probably know those quizzes in Sunday magazines: given the sequence 1, 2, 3, 4, 5, what is the next number? Sometimes it is very easy to answer, sometimes it could be pretty hard. Because these &quot;sequence problems&quot; are very popular, ACM wants to implement them into the &quot;Free Time&quot; section of their new WAP portal.</p>

<p>ACM programmers have noticed that some of the quizzes can be solved by describing the sequence by polynomials. For example, the sequence 1, 2, 3, 4, 5 can be easily understood as a trivial polynomial. The next number is 6. But even more complex sequences, like 1, 2, 4, 7, 11, can be described by a polynomial. In this case, 1/2&sdot;n<sup>2</sup>-1/2&sdot;n+1 can be used. Note that even if the members of the sequence are integers, polynomial coefficients may be any real numbers.</p>

<p>Polynomial is an expression in the following form:&nbsp;</p>

<p style="text-align:center">P(n) = a<sub>D</sub>&sdot;n<sup>D</sup>+a<sub>D-1</sub>&sdot;n<sup>D-1</sup>+...+a<sub>1</sub>&sdot;n+a<sub>0</sub></p>

<p>. If a<sub>D</sub> &lt;&gt; 0, the number D is called a degree of the polynomial. Note that constant function P(n) = C can be considered as polynomial of degree 0, and the zero function P(n) = 0 is usually defined to have degree -1.</p>

### 입력

<p>There is a single positive integer T on the first line of input. It stands for the number of test cases to follow. Each test case consists of two lines. First line of each test case contains two integer numbers S and C separated by a single space, 1 &lt;= S &lt; 100, 1 &lt;= C &lt; 100, (S+C) &lt;= 100. The first number, S, stands for the length of the given sequence, the second number, C is the amount of numbers you are to find to complete the sequence.</p>

<p>The second line of each test case contains S integer numbers X<sub>1</sub>, X<sub>2</sub>, ... X<sub>S</sub> separated by a space. These numbers form the given sequence. The sequence can always be described by a polynomial P(n) such that for every i, X<sub>i</sub> = P(i). Among these polynomials, we can find the polynomial P<sub>min</sub> with the lowest possible degree. This polynomial should be used for completing the sequence.</p>

### 출력

<p>For every test case, your program must print a single line containing C integer numbers, separated by a space. These numbers are the values completing the sequence according to the polynomial of the lowest possible degree. In other words, you are to print values P<sub>min</sub>(S+1), P<sub>min</sub>(S+2), .... P<sub>min</sub>(S+C).</p>

<p>It is guaranteed that the results P<sub>min</sub>(S+i) will be non-negative and will fit into the standard integer type.</p>