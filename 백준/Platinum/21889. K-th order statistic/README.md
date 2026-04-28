# [Platinum II] K-th order statistic - 21889

[문제 링크](https://www.acmicpc.net/problem/21889)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 10, 맞힌 사람: 9, 정답 비율: 18.000%

### 분류

수학, 문자열, 애드 혹, 해 구성하기, 사칙연산

### 문제 설명

<p>Perhaps you are familiar with the problem of finding $k$-th order statistic in an array. Problem is to find out what number is at position $k$, if all numbers are sorted in ascending order. For example, the $2$-nd order statistic from the numbers $[10, 2, 5]$ is $5$, and $n$-th order statistic is always equal to the maximum of $n$ numbers.</p>

<p>In this task, you need to come up with an expression that computes the $k$-th order statistic of $n$ different positive integers using only the arithmetic operations &quot;<code>+</code>&quot;, &quot;<code>-</code>&quot;, &quot;<code>*</code>&quot;, &quot;<code>/</code>&quot;, the function returning the absolute value of the number <code>abs</code>, the variables named with the first $n$ lowercase letters of the Latin alphabet, starting with <code>a</code>, and also any integers not exceeding $10^9$ by absolute value. You can use the unary minus, but you can not use the unary plus. Also, the expression can not contain any whitespace characters.</p>

<p>Verification of your expression will be conducted as follows: for each test, a certain number of sets of values of $n$ variables are generated. These sets are determined before the start of the competition and are the same for all solutions of all participants. All values of variables are positive, different and do not exceed $1000$.</p>

<p>The solution will be considered correct if the evaluation of the expression printed by your program gives the correct result for all selected sets of variables. All calculations are performed from left to right, but taking into account the priorities of the operators. The unary minus has the biggest priority. The operators &quot;<code>*</code>&quot; and &quot;<code>/</code>&quot; have the same priority, less than the unary minus, and operators &quot;<code>+</code>&quot; and &quot;<code>-</code>&quot; have the same priority, less than all of the above. For all generated sets of variables, your expression can not divide by zero, and all intermediate calculations must be integers from $-10^9$ to $10^9$.</p>

### 입력

<p>The only line contains two integers $n$ and $k$ ($1 \le k \le n \le 26$).</p>

### 출력

<p>Output one line containing an expression that computes the $k$-th order statistics from $n$ given variables. The length of the expression should not exceed $10^5$. If there are several different correct expressions, you can print any of those.</p>

### 힌트

<p>In the first example you need to create an expression which evaluates the minimum of $a$ and $b$. Let&#39;s show the result of evaluation for different values of $a$ and $b$:</p>

<ul>
	<li>$a = 3$, $b = 5$. Result is $\frac 12 |-3+5+\frac{9-25}{|3-5|}|$ = $\frac{|5-3-8|}2$ = $\frac{|-6|}2$ = $3$ = $a$ = $\min(a, b)$.</li>
	<li>$a = 5$, $b = 2$. Result is $\frac 12 |-5+2+\frac{25-4}{|5-2|}|$ = $\frac{|-5+2+7|}2$ = $\frac{|4|}2$ = $2$, which equals also to $\min(a, b)$.</li>
</ul>