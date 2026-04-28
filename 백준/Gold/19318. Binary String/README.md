# [Gold II] Binary String - 19318

[문제 링크](https://www.acmicpc.net/problem/19318)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

조합론, 수학

### 문제 설명

<p>Rikka has a binary string with $n$ bits.</p>

<p>We don&#39;t know the string. The thing we know for sure is, for each $i \in \{1, 2, \ldots, m\}$, at least one of the following is true: &quot;there are exactly $x_i$ ones in the first $y_i$ bits&quot; or &quot;there are exactly $y_i$ ones in the last $x_i$ bits&quot;.</p>

<p>Find the number of possible binary strings modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains an integer $T$ which denotes the number of test cases ($1 \leq T \leq 5$).&nbsp;</p>

<p>For each test case, the first line contains two integers $n$ and $m$ ($1 \leq n \leq 5000$, $0 \leq m \leq 1000$).</p>

<p>The $i$-th of the following $m$ lines contains two integers $x_i$ and $y_i$ ($0 \leq x_i, y_i \leq n$, $x_i \neq 0$ or $y_i \neq 0$).</p>

### 출력

<p>For each test case, print an integer which denotes the number of binary strings satisfying the constraints, modulo $998\,244\,353$.</p>