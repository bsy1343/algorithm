# [Gold III] New Year and Ascent Sequence - 18885

[문제 링크](https://www.acmicpc.net/problem/18885)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 158, 정답: 87, 맞힌 사람: 83, 정답 비율: 61.029%

### 분류

이분 탐색, 정렬

### 문제 설명

<p>A sequence $a = [a_1, a_2, \ldots, a_l]$ of length $l$ has an <strong>ascent</strong>&nbsp;if there exists a pair of indices $(i, j)$ such that $1 \le i &lt; j \le l$ and $a_i &lt; a_j$. For example, the sequence $[0, 2, 0, 2, 0]$ has an ascent because of the pair $(1, 4)$, but the sequence $[4, 3, 3, 3, 1]$ doesn&#39;t have an ascent.</p>

<p>Let&#39;s call a concatenation of sequences $p$ and $q$ the sequence that is obtained by writing down sequences $p$ and $q$ one right after another without changing the order. For example, the concatenation of the $[0, 2, 0, 2, 0]$ and $[4, 3, 3, 3, 1]$ is the sequence $[0, 2, 0, 2, 0, 4, 3, 3, 3, 1]$. The concatenation of sequences $p$ and $q$ is denoted as $p+q$.</p>

<p>Gyeonggeun thinks that sequences with ascents bring luck. Therefore, he wants to make many such sequences for the new year. Gyeonggeun has $n$ sequences $s_1, s_2, \ldots, s_n$ which may have different lengths.&nbsp;</p>

<p>Gyeonggeun will consider all $n^2$ pairs of sequences $s_x$ and $s_y$ ($1 \le x, y \le n$), and will check if its concatenation $s_x + s_y$ has an ascent. Note that he may select the same sequence twice, and the order of selection matters.</p>

<p>Please count the number of pairs ($x, y$) of sequences $s_1, s_2, \ldots, s_n$ whose concatenation $s_x + s_y$ contains an ascent.</p>

### 입력

<p>The first line contains the number $n$ ($1 \le n \le 100\,000$) denoting the number of sequences.</p>

<p>The next $n$ lines contain the number $l_i$ ($1 \le l_i$) denoting the length of $s_i$, followed by $l_i$ integers $s_{i, 1}, s_{i, 2}, \ldots, s_{i, l_i}$ ($0 \le s_{i, j} \le 10^6$) denoting the sequence $s_i$.&nbsp;</p>

<p>It is guaranteed that the sum of all $l_i$ does not exceed $100\,000$.</p>

### 출력

<p>Print a single integer, the number of pairs of sequences whose concatenation has an ascent.</p>

### 힌트

<p>For the first example, the following $9$ arrays have an ascent: $[1, 2], [1, 2], [1, 3], [1, 3], [1, 4], [1, 4], [2, 3], [2, 4], [3, 4]$. Arrays with the same contents are counted as their occurences.</p>