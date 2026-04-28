# [Gold IV] Occupy the Cities - 31140

[문제 링크](https://www.acmicpc.net/problem/31140)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>JB is playing a game. There are $n$ cities in the game, numbered as $1, 2, \cdots, n$. The $i$-th city and the $j$-th city are adjacent if and only if $i = j - 1$ or $i = j + 1$. Initially, some of the cities are occupied by JB.</p>

<p>The game runs in rounds. At the beginning of a round, each occupied city can mark at most one adjacent unoccupied city as the target of attack. At the end of the round, all the attack targets marked become occupied. The game ends when all the cities are occupied.</p>

<p>JB wants to occupy all the cities in minimum rounds. Can you help him?</p>

### 입력

<p>There are multiple test cases. The first line of the test case contains a positive integer $T$, indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^6$), indicating the number of cities.</p>

<p>The next line contains a string $s$ of length $n$. It&#39;s guaranteed $s$ only contains &#39;<code>0</code>&#39; and &#39;<code>1</code>&#39;. The $i$-th character describes the initial state of the $i$-th city: if $s_i = $  &#39;<code>1</code>&#39;, the $i$-th city is occupied by JB initially. Otherwise, the $i$-th city is not occupied initially.</p>

<p>It&#39;s guaranteed that the sum of $n$ over all the test cases doesn&#39;t exceed $10^6$. It&#39;s also guaranteed that there is at least one &#39;<code>1</code>&#39; in $s$.</p>

### 출력

<p>For each test case, output one line, containing the minimum number of rounds to occupy all the cities.</p>

### 힌트

<p>For the second test case, the best way is $0100 \rightarrow 0110 \rightarrow 1111$.</p>