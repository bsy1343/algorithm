# [Gold III] Factorial Factors - 30004

[문제 링크](https://www.acmicpc.net/problem/30004)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 14, 맞힌 사람: 11, 정답 비율: 52.381%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>For any positive integer $n$, define $s(n)$ as the smallest positive integer $m$, whose factorial\footnote{The <em>factorial</em> of a positive integer $m$ (denoted as $m!$) is the product of all integers from 1 to $m$: $$ m! := 1\cdot 2 \cdot 3 \cdot \ldots \cdot m. $$ is divisible by $n$.</p>

<p>For example, $$\begin{align*} s(1) &amp;= 1,\\ s(2) &amp;= 2,\quad \text{(because $1!$ (=1) is not divisible by 2, but $2!$ (=2) is)}\\ s(4) &amp;= 4,\quad \text{($3!$ (=6) is not divisible by 4, but $4!$ (=24) is)}\\ s(6) &amp;= 3,\quad \text{($3!$ (=6) is divisible by 6)}\\ s(9) &amp;= 6,\quad \text{($6!$ (=720) is divisible by 9)}\\ s(10) &amp;= 5,\quad \text{etc}\\ \end{align*}$$</p>

<p>The task is, given two integers $A$ and $B$, to find the sum:</p>

<p>$$s(A) + s(A+1) + \ldots + s(B).$$</p>

### 입력

<p>The single line of input contains two space-separated integers: $A$ and $B$ ($1 \le A \le B \le 1\,000\,000$).</p>

### 출력

<p>The first and only line of output should contain the required sum.</p>