# [Platinum II] A Plus B Problem - 31135

[문제 링크](https://www.acmicpc.net/problem/31135)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 10, 맞힌 사람: 8, 정답 비율: 25.000%

### 분류

자료 구조, 세그먼트 트리, 트리를 사용한 집합과 맵, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>JB gets a machine that can solve &quot;A Plus B Problem&quot; and feels curious about the mechanism.  He hears that you are proficient in competitive programming and have learned many advanced data structures and algorithms such as Link-Cut tree, Lagrange Inversion formula, Sweepline Mo, and so on. Hence, he asks you to help implement a program that can solve &quot;A Plus B Problem&quot; as same as the machine.</p>

<p>The machine consists of $3\times n$ digits. The digits of the first two rows can be changed arbitrarily, and the third row always equals the decimal sum of the first two rows. The third row only consists of the lowest $n$ digits even if the sum exceeds $n$ digits.</p>

<p>For example, when $n=5$, the three rows can be &quot;<code>01234</code>&quot;, &quot;<code>56789</code>&quot;, &quot;<code>58023</code>&quot; or &quot;<code>56789</code>&quot;,  &quot;<code>58023</code>&quot;, &quot;<code>14812</code>&quot;.</p>

<p>To test your function, you are given $q$ queries. In the $i$-th query, the $c_i$-th digit of the $r_i$-th row is updated to $d_i$ (the digit may not change). Because the digits are too many and JB has no time to check your answer, he only asks you to find the $c_i$-th digit of the third row after the query and how many digits of the machine change in the query.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ ($1\le n, q\le10^6$).</p>

<p>The second line contains a string consisting of $n$ digits, representing the first row of the machine.</p>

<p>The third line contains a string consisting of $n$ digits, representing the second row of the machine.</p>

<p>There are $q$ lines in the following. The $i$-th of the following line consists of three integers $r_i, c_i$ and $d_i$ ($1\le r_i \le 2$, $1\le c_i\le n$, $0\le d_i\le 9$).</p>

### 출력

<p>Output $q$ lines. In the $i$-th line, output two integers - the $c_i$-th digit of the third row after the query and how many digits of the machine change in the query.</p>

### 힌트

<p>In the example, the initial rows are &quot;<code>01234</code>&quot;, &quot;<code>56789</code>&quot;, &quot;<code>58023</code>&quot;.</p>

<p>After the $1$-st query, the rows are &quot;<code>01234</code>&quot;, &quot;<code>06789</code>&quot;, &quot;<code>08023</code>&quot;.</p>

<p>After the $2$-nd query, the rows are &quot;<code>01234</code>&quot;, &quot;<code>01789</code>&quot;, &quot;<code>03023</code>&quot;.</p>

<p>After the $3$-th query, the rows are &quot;<code>01234</code>&quot;, &quot;<code>01289</code>&quot;, &quot;<code>02523</code>&quot;.</p>

<p>After the $4$-th query, the rows are &quot;<code>01234</code>&quot;, &quot;<code>01239</code>&quot;, &quot;<code>02473</code>&quot;.</p>

<p>After the $5$-th query, the rows are &quot;<code>01234</code>&quot;, &quot;<code>01234</code>&quot;, &quot;<code>02468</code>&quot;.</p>