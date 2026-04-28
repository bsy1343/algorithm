# [Silver III] Chinese Remainder Theorem - 23604

[문제 링크](https://www.acmicpc.net/problem/23604)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 76, 정답: 57, 맞힌 사람: 54, 정답 비율: 73.973%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>Johnny is a computer science student. This semester he became well versed with the Chinese Remainder Theorem. While waiting &nbsp;for a next lecture he heard that Maggie complained that she cannot solve her homework; as he heard the familiar words &quot;modulo&quot; and &quot;system of equations&quot; he immediately offered his help to the damsel in distress. It turns out that Maggie&#39;s task is much different than those that Johnny is accustomed to solve, it is of the following &nbsp;form:</p>

<p>$$ \left\{\begin{array}{ccc} a_1 &amp; \equiv &amp; b_1 \pmod{m} \\ a_2 &amp; \equiv &amp; b_2 \pmod{m} \\ \vdots &amp; \vdots &amp; \vdots \\ a_n &amp; \equiv &amp; b_n \pmod{m} \end{array}\right. $$</p>

<p>(where $\equiv$ means equivalence modulo) and for the given $a_1, b_1,\ldots, a_n, b_n$ Maggie should compute the largest $m$ such that all of the equations hold. Maggie already started processing the equations and she ensured that $a_i \geq b_i$ for each $i$. Johhny cannot fail and lose his face -- help him to solve the task.</p>

### 입력

<p>The first line of the input contains a single integer $n$ ($1 \leq n \leq 10^5$), denoting the number of equations.</p>

<p>The second line contains $n$ integers $a_1 , a_2 , \dots , a_n$, each separated by a single space, these are the numbers on the left-hand sides of consecutive equations.</p>

<p>The third and last line contains $n$ integers $b_1 , b_2 , \dots , b_n$, each separated by a single space, these are the numbers on the right-hand sides of consecutive equations.</p>

<p>The inequality $0 \leq b_i \leq a_i \leq 10^{18}$ holds for each $i$ $(1 \leq i \leq n)$. The system of equations is nontrivial: $a_i \neq b_i$ holds for some $i$ &nbsp;$(1 \leq i \leq n)$.</p>

### 출력

<p>You should write a single integer in the first and only line of the output -- the largest $m$ for which the given system of equations is satisfied.</p>

### 힌트

<p>For Sample 1, system of equations $$ \left\{\begin{array}{ccc} 7 &amp; \equiv &amp; 3 \pmod{4} \\ 17 &amp; \equiv &amp; 5 \pmod{4} \\ 9 &nbsp;&amp; \equiv &amp; 1 \pmod{4} \end{array}\right. $$ is satisfied and it is easy to verify that it is not satisfied for $m &gt; 4$.</p>

<p> For Sample 2, system of equations $$ \left\{\begin{array}{ccc} 4 &amp; \equiv &amp; 2 \pmod{1} \\ 6 &amp; \equiv &amp; 2 \pmod{1} \\ 5 &nbsp;&amp; \equiv &amp; 2 \pmod{1} \end{array}\right. $$ is satisfied and it is easy to verify that it is not satisfied for $m &gt; 1$.</p>