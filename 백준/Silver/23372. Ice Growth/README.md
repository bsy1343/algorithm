# [Silver I] Ice Growth - 23372

[문제 링크](https://www.acmicpc.net/problem/23372)

### 성능 요약

시간 제한: 1.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 145, 정답: 70, 맞힌 사람: 64, 정답 비율: 55.652%

### 분류

이분 탐색, 누적 합, 정렬

### 문제 설명

<p>Ice growth is dependent on temperature. A rule of thumb is that every $5$ degrees of frost (on average in a $24$-hour period) contributes to $1$ cm of ice growth, whilst every $5$ degrees above zero removes $1$ cm of ice. For example, if there are three days with average temperatures of $-3$, $1$ and $-7$ degrees Celsius there will be a total of $3 - 1 + 7 = 9$ degrees of frost and thus $1.8$ cm of ice growth at the end of day $3$. Of course, the ice thickness cannot be negative. If there is enough ice, people can skate on it. The required ice thickness depends on the person, as different persons have different perceptions of safety.</p>

<p>There is currently no ice, but the weather report for the next $n$ days has just come in, and a group of $k$ people wants you to figure out how many of these days they can skate on the ice at the end of the day.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers, $n$ ($1\leq n \leq 10^5$) the number of days and $k$ ($1 \leq k \leq 10^5$) the number of people.</li>
	<li>One line with $n$ integers $a_1, \ldots, a_n$ ($-10^6 \leq a_i \leq 10^6$ for all $i$), the average temperature on day $i$.</li>
	<li>One line with $k$ integers $b_1, \ldots, b_k$ ($1 \leq b_j \leq 10^6$ for all $j$), the required minimal ice thickness in cm before person $j$ can skate on the ice.</li>
</ul>

### 출력

<p>Output a line with $k$ integers $c_1, \ldots, c_k$, where $c_j$ is the number of days that person $j$ can skate on the ice at the end of the day.</p>