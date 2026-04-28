# [Platinum II] Custodial Cleanup - 28028

[문제 링크](https://www.acmicpc.net/problem/28028)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 87, 정답: 31, 맞힌 사람: 20, 정답 비율: 35.088%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색

### 문제 설명

<p>Due to the disorganized structure of his mootels (much like motels but with bovine rather than human guests), Farmer John has decided to take up the role of the mootel custodian to restore order to the stalls.</p>

<p>Each mootel has $N$ stalls labeled $1$ through $N$ ($1 \le N \le 10^5$) and $M$ ($0 \le M \le 10^5$) corridors that connect pairs of stalls to each other bidirectionally. The $i$th stall is painted with color $C_i$ and initially has a single key of color $S_i$ in it. FJ will have to rearrange the keys to appease the cows and restore order to the stalls.</p>

<p>FJ starts out in stall $1$ without holding any keys and is allowed to repeatedly do one of the following moves:</p>

<ul>
	<li>Pick up a key in the stall he is currently in. FJ can hold multiple keys at a time.</li>
	<li>Place down a key he is holding into the stall he is currently in. A stall may hold multiple keys at a time.</li>
	<li>Enter stall $1$ by moving through a corridor.</li>
	<li>Enter a stall other than stall $1$ by moving through a corridor. He can only do this if he currently holds a key that is the same color as the stall he is entering.</li>
</ul>

<p>Unfortunately, it seems that the keys are not in their intended locations. To restore order to FJ&#39;s mootel, the $i$th stall requires that a single key of color $F_i$ is in it. It is guaranteed that $S$ is a permutation of $F$.</p>

<p>For $T$ different mootels ($1 \le T \le 100$), FJ starts in stall $1$ and needs to place every key in its appropriate location, ending back in stall $1$. For each of the $T$ mootels, please answer if it is possible to do this.</p>

### 입력

<p>The first line contains $T$, the number of mootels (test cases).</p>

<p>Each test case will be preceded by a blank line. Then, the first line of each test case contains two integers $N$ and $M$.</p>

<p>The second line of each test case contains $N$ integers. The $i$-th integer on this line, $C_i$, means that stall $i$ has color $C_i$ ($1 \le C_i \le N$).</p>

<p>The third line of each test case contains $N$ integers. The $i$-th integer on this line, $S_i$, means that stall $i$ initially holds a key of color $S_i$ ($1 \le S_i \le N$).</p>

<p>The fourth line of each test case contains $N$ integers. The $i$-th integer on this line, $F_i$, means that stall $i$ needs to have a key of color $F_i$ in it ($1 \le F_i \le N$).</p>

<p>The next $M$ lines of each test case follow. The $i$-th of these lines contains two distinct integers, $u_i$ and $v_i$ ($1 \le u_i, v_i \le N$). This represents that a corridor exists between stalls $u_i$ and $v_i$. No corridors are repeated.</p>

<p>The sum of $N$ over all mootels will not exceed $10^5$, and the sum of $M$ over all mootels will not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each mootel, output YES on a new line if there exists a way for FJ to return a key of color $F_i$ to each stall $i$ and end back in stall $1$. Otherwise, output NO on a new line.</p>