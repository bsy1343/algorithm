# [Gold III] Eventual Journey - 23671

[문제 링크](https://www.acmicpc.net/problem/23671)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

많은 조건 분기

### 문제 설명

<p>LCR is really an incredible being.</p>

<p>Thinking so, sitting on the plane and looking at the sea, Rikka savours the fantastic journey. A fire never happened. It must be interesting to share it with her mates, and another travel is also fascinating.</p>

<p>But before all, home is the best.</p>

<p>She travels by the JR lines. There are $n$ stations in total, and $m$ public bidirectional railway lines are built among them. Each station belongs to either JR West or JR East. Both JR West and JR East have their own private railways connecting all stations owned by themselves.</p>

<p>Rikka has some through tickets and two types of special passes: ICOCA for JR West and Suica for JR East. She pays a through ticket each time and does one of the following:</p>

<ol>
	<li>Travel from one terminal to another via a public railway line.</li>
	<li>Travel to any station which has the same owner as the current one, using one of her special passes. A pass can be used for multiple times.</li>
</ol>

<p>Rikka wonders, for each start station, the sum of the minimal numbers of tickets she needs to pay to reach every possible one of the other stations.</p>

### 입력

<p>The first line contains two integers $n, m (1 \leq n \leq 10^5, 0 \leq m \leq 10^5)$, the numbers of stations and public railways.</p>

<p>The next line contains $n$ integers $A_i (A_i \in \{0,1\}, i = 1, 2, \dots, n)$, separated by spaces, describing the owner of each station. $A_i = 0$ if the station $i$ belongs to JR west, and vice versa.</p>

<p>The following $m$ lines describe all the public railways, each of which contains two integers $u, v (1 \leq u, v \leq n, u \neq v)$, representing a bidirectional railway connecting $u$ and $v$. It is guaranteed that no two public railways connect the same pair of stations, and Rikka is able to travel between every pair of stations. Notice that the private railways are not given directly in the input, and Rikka may have to use her passes rather than traveling only through the public railways.</p>

### 출력

<p>Output $n$ integers in one line, separated by spaces. The $i$-th integer is $\sum_{j=1}^n D(i, j)$ , where $D(u, v)$ is the minimal number of tickets needed to travel from $u$ to $v$.</p>