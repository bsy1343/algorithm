# [Gold II] Sum of QQ - 16834

[문제 링크](https://www.acmicpc.net/problem/16834)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 44, 맞힌 사람: 37, 정답 비율: 90.244%

### 분류

수학

### 문제 설명

<p>You received a card with an integer $S$ and a <em>multiplication table</em> of infinite size. All the elements in the table are integers, and an integer at the $i$-th row from the top and the $j$-th column from the left is $A_{i, j} = i \times j$ ($i, j \ge 1$). The table has infinite size, i.e., the number of the rows and the number of the columns are infinite.</p>

<p>You love rectangular regions of the table in which the sum of numbers is $S$. Your task is to count the number of integer tuples $(a, b, c, d)$ that satisfies $1 \leq a \leq b, 1 \leq c \leq d$ and $\sum_{i=a}^{b} \sum_{j=c}^{d} A_{i,j} = S$.</p>

### 입력

<p>The input consists of a single test case of the following form.</p>

<pre class="mathjax">
$S$</pre>

<p>The first line consists of one integer $S$ ($1 \leq S \leq 10^5$), representing the summation of rectangular regions you have to find.</p>

### 출력

<p>Print the number of rectangular regions whose summation is $S$ in one line.</p>