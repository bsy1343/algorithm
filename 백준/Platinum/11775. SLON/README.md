# [Platinum IV] SLON - 11775

[문제 링크](https://www.acmicpc.net/problem/11775)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 198, 정답: 36, 맞힌 사람: 28, 정답 비율: 28.866%

### 분류

자료 구조, 수학, 정수론, 스택, 문자열

### 문제 설명

<p>A student called Slon is very mischievous in school. He is always bored in class and he is always making a mess. The teacher wanted to calm him down and &ldquo;tame&rdquo; him, so he has given him a difficult mathematical problem.</p>

<p>The teacher gives Slon an arithmetic expression A, the integer P and M. Slon has to answer the following question: &ldquo;What is the minimal non-negative value of variable x in expression A so that the remainder of dividing A with M is equal to P?&rdquo;. The solution will always exist.</p>

<p>Additionally, it will hold that, if we apply the laws of distribution on expression A, variable x will not multiply variable x (formally, the expression is a polynomial of the first degree in variable x).</p>

<p>Examples of valid expressions A: 5 + x &lowast; (3 + 2), x + 3 &lowast; x + 4 &lowast; (5 + 3 &lowast; (2 + x &minus; 2 &lowast; x)).</p>

<p>Examples of invalid expressions A: 5 &lowast; (3 + x &lowast; (3 + x)), x &lowast; (x + x &lowast; (1 + x)).</p>

### 입력

<p>The first line of input contains the expression A (1 &le; |A| &le; 100 000).</p>

<p>The second line of input contains two integers P (0 &le; P &le; M &minus; 1) i M (1 &le; M &le; 1 000 000).</p>

<p>The arithmetic expression A will only consists of characters +, -, *, (, ), x and digits from 0 to 9.</p>

<p>The brackets will always be paired, the operators +, - and * will always be applied to exactly two values (there will not be an expression (-5) or (4+-5)) and all multiplications will be explicit (there will not be an expression 4(5) or 2(x)).</p>

### 출력

<p>The first and only line of output must contain the minimal non-negative value of variable x.</p>

### 힌트

<p>Clarification of the first example: The remainder of dividing 5 + 3 + x with 10 for x = 0 is 8, and the remainder of division for x = 1 is 9, which is the solution.</p>