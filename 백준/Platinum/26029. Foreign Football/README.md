# [Platinum III] Foreign Football - 26029

[문제 링크](https://www.acmicpc.net/problem/26029)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 33, 맞힌 사람: 23, 정답 비율: 41.071%

### 분류

KMP, 문자열

### 문제 설명

<p>You are on vacation in a foreign country. This country has a local football league, and you don&#39;t know any of the team names. However, you have found a table of all the results from this season, and next to every match is the concatenated names of the two teams that played.</p>

<p>There are $n$ teams in total, named $s_1, s_2, \cdots, s_n$. You are given the concatenation $s_i+s_j$ for every ordered pair $i \neq j$. Find the teams names $s_1, s_2, \cdots, s_n$. Team names must be nonempty, but they do not need to be distinct.</p>

### 입력

<p>The first line of input contains the integer $n$ ($2 \leq n \leq 500$). </p>

<p>The following $n$ lines each contain $n$ strings, the table of concatenated team names. The $j$:th string on the $i$:th of these lines will contain the string $s_i + s_j$ if $i \neq j$, and &quot;*&quot; if $i = j$. The concatenated team names will consist of lower case characters a-z.</p>

<p>The total number of characters in concatenated team names is at most $10^6$.</p>

### 출력

<p>If there is no solution, print &quot;NONE&quot;.</p>

<p>If there is more than one solution, print &quot;MANY&quot;.</p>

<p>If there is one unique solution, print &quot;UNIQUE&quot;, followed by $n$ lines containing $s_1, s_2, \cdots, s_n$.</p>