# [Platinum IV] Coins and Boxes - 24655

[문제 링크](https://www.acmicpc.net/problem/24655)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 157, 정답: 71, 맞힌 사람: 61, 정답 비율: 44.203%

### 분류

그리디 알고리즘

### 문제 설명

<p>There are $N$ boxes and $N$ coins on the coordinate line. The coordinate of the $i$-th box is $B_i$, and the coordinate of the $j$-th coin is $C_j$. You are starting at the point with coordinate $0$, and can move freely along the coordinate line.</p>

<p>If you go to a point with a coin, you can pick up that coin. You can carry as many coins as you like. If you go to a point with the box, you can utilize one coin and open the box (but you are not forced to do that). You cannot pick up the coin that was already picked up, or open the box that is already opened.</p>

<p>You want to open all $N$ boxes. Find the minimum distance you need to travel to achieve your goal.</p>

### 입력

<p>The first line of input contains one integer $N$ ($1 \le N \le 10^5$).</p>

<p>The second line contains $N$ integers $B_1, B_2, \ldots, B_N$. The $i$-th of those integers is coordinate of the $i$-th box ($1 \le B_i \le 10^9$, $B_i &lt; B_{i+1}$ for $1 \le i &lt; N$).</p>

<p>The third line contains $N$ integers $C_1, C_2, \ldots, C_N$. The $i$-th of those integers is coordinate of the $i$-th coin ($1 \le C_i \le 10^9$, $C_i &lt; C_{i+1}$ for $1 \le i &lt; N$).</p>

### 출력

<p>Print one integer: the minimum distance you need to travel to open all boxes.</p>