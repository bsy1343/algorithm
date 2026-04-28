# [Gold III] Deducing relationships - 29912

[문제 링크](https://www.acmicpc.net/problem/29912)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Let&#39;s consider equalities and inequalities between the numbers $a$, $b$, and $c$. The relationships between the numbers can be expressed as a $3 \times 3$ table, with two characters for each pair $(x, y)$ denoting their relationship as &#39;<code>&lt;&lt;</code>&#39;, &#39;<code>&le;</code>&#39;, &#39;<code>==</code>&#39;, &#39;<code>&gt;=</code>&#39;, &#39;<code>&gt;&gt;</code>&#39; ($x &lt; y$, $x \le y$, $x = y$, $x \ge y$, $x &gt; y$, respectively), or &#39;<code>??</code>&#39; (if the relationship is not known and can&#39;t be deduced from the known ones).</p>

<p>The input contains two known equalities or inequalities and the program must fill the table with the strongest relationships that can be deduced from the input. This means that if it is possible to deduce that $x &lt; y$ then the program must output &#39;<code>&lt;&lt;</code>&#39; in the corresponding cell of the table, and not &#39;<code>&le;</code>&#39;, even though $x \le y$ also holds.</p>

### 입력

<p>The two lines of input each contain one relationship (equality or inequality).</p>

### 출력

<p>The output should contain exactly three lines of the table, where each cell of the table contains the strongest possible relationship that can be deduced, with the cells on each line spearated by spaces, or the message &#39;<code>VASTUOLU</code>&#39;, denoting a contradiction in the input.</p>