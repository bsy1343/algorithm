# [Gold III] Hoax Spreading - 25435

[문제 링크](https://www.acmicpc.net/problem/25435)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 21, 맞힌 사람: 18, 정답 비율: 23.377%

### 분류

자료 구조, 분리 집합, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 정렬, 집합과 맵

### 문제 설명

<p>Pak Dengklek has just developed a social media site. There are $N$ users using the site, numbered $0$ to $N - 1$. There are $S$ hours in one day. All of these users have a fixed usage schedule from day to day. For each $i$ such that $0 &le; i &le; N - 1$, user $i$ will be online $T[i]$ times every day:</p>

<ul>
	<li>from the start of the $A[i][0]$<sup>th</sup> hour to the end of the $B[i][0]$<sup>th</sup> hour,</li>
	<li>from the start of the $A[i][1]$<sup>th</sup> hour to the end of the $B[i][1]$<sup>th</sup> hour</li>
	<li>...</li>
	<li>and from the start of the $A[i][T[i] - 1]$<sup>th</sup> hour to the end of the $B[i][T[i] - 1]$<sup>th</sup> hour.</li>
</ul>

<p>At any time, all users on the site like to share news to all other online users. Unfortunately, one of the $N$ users has a hoax at the start of the first day and will spread it. Hence, all users who meet the user with the hoax will also have the hoax at the end of the first day. Two users are stated to be met if there is at least an hour where the two users are both online.</p>

<p>This hoax will also be spread on the second day. Therefore, all users who meet the user with the hoax at the end of the first day will also have the hoax at the end of the second day. This continued the following days.</p>

<p>There are $Q$ scenarios, each can be represented as an integer $P$. For each scenario, the user who has the hoax at the start of the first day is user $P$. A different scenario might cause a different hoax spreading. Therefore, for each scenario, Pak Dengklek wonders on the number of users with the hoax at the end of the $N$<sup>th</sup> day, where $N$ is the number of users.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; N &le; 200\,000$</li>
	<li>$ 1 &le; S &le; 10^9$</li>
	<li>$ 1 &le; Q &le; 100\,000$</li>
	<li>$ 1 &le; T[i] &le; S$ (for each $i$ such that $0 &le; i &le; N - 1$)</li>
	<li>The sum of all elements of $T$ does not exceed $200\,000$.</li>
	<li>$1 &le; A[i][j] &le; B[i][j] &le; S$ (for each $i$ and $j$ such that $0 &le; i &le; N - 1$ and $0 &le; j &le; T[i] - 1$)</li>
	<li>$B[i][j - 1] &lt; A[i][j]$ (for each $i$ and $j$ such that $0 &le; i &le; N - 1$ and $1 &le; j &le; T[i] - 1$)</li>
	<li>$0 &le; P &le; N - 1$</li>
	<li>The values of $P$ among all scenarios are pairwise distinct.</li>
</ul>