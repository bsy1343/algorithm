# [Platinum V] Problem Solving - 6214

[문제 링크](https://www.acmicpc.net/problem/6214)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 86, 정답: 38, 맞힌 사람: 32, 정답 비율: 47.059%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In easier times, Farmer John&#39;s cows had no problems. These days, though, they have problems, lots of problems; they have P (1 &lt;= P &lt;= 300) problems, to be exact. They have quit providing milk and have taken regular jobs like all other good citizens. &nbsp;In fact, on a normal month they make M (1 &lt;= M &lt;= 1000) money.</p>

<p>Their problems, however, are so complex they must hire consultants to solve them. Consultants are not free, but they are competent: consultants can solve any problem in a single month. Each consultant demands two payments: one in advance (1 &lt;= payment &lt;= M) to be paid at the start of the month problem-solving is commenced and one more payment at the start of the month after the problem is solved (1 &lt;= payment &lt;= M). Thus, each month the cows can spend the money earned during the previous month to pay for consultants. Cows are spendthrifts: they can never save any money from month-to-month; money not used is wasted on cow candy.</p>

<p>Since the problems to be solved depend on each other, they must be solved mostly in order. For example, problem 3 must be solved before problem 4 or during the same month as problem 4.</p>

<p>Determine the number of months it takes to solve all of the cows&#39; problems and pay for the solutions.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: M and P.</li>
	<li>Lines 2..P+1: Line i+1 describes problem i with two space-separated integers: B_i and A_i. B_i is the payment to the consult BEFORE the problem is solved; A_i is the payment to the consult AFTER the problem is solved.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The number of months it takes to solve and pay for all the cows&#39; problems.</li>
</ul>

### 힌트

<pre>
+------+------+--------+---------+---------+--------+
|      | Avail | Probs  | Before  |  After  |  Candy |
|Month | Money | Solved | Payment | Payment |  Money |
+------+-------+--------+---------+---------+--------+
|  1   |  0    | -none- |    0    |    0    |     0  |
|  2   | 100   |  1, 2  | 40+60   |    0    |     0  |
|  3   | 100   |  3, 4  | 30+30   |  20+20  |     0  |
|  4   | 100   | -none- |    0    |  50+50  |     0  |
|  5   | 100   |   5    |   40    |    0    |    60  |
|  6   | 100   | -none- |    0    |   40    |    60  | 
+------+-------+--------+---------+---------+--------+</pre>