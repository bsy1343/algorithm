# [Platinum I] Rows of Stars - 35361

[문제 링크](https://www.acmicpc.net/problem/35361)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

구현, 누적 합, 슬라이딩 윈도우

### 문제 설명

<p>You’re an amateur astronomer! Lately, you’ve been studying one particular sequence of $n$ stars in the sky observed at $n$ spots. Each star has a fixed brightness value, but their positions rotate counterclockwise by $k$ spots each day and wrap around.</p>

<p>For example, if the original sequence of stars had brightness values $[1,2,3,4,5]$ on day $1$ and $k = 2$, then on day $2$ the sequence would appear as $[3,4,5,1,2]$. The image below illustrates how the stars would appear over the next $n = 5$ days.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35361.%E2%80%85Rows%E2%80%85of%E2%80%85Stars/a8c34cad.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35361-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 232px; height: 225px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: Illustration of the first sample case. The stars at spots $[1,3]$ over days $[2,3]$ have a maximum sum of brightness of $20$.</p>

<p>You believe something good will happen on the days when the stars are brightest. Thus, you are planning a $d$-day trip to observe the stars from $s$ consecutive spots. You want to choose the spots and days so that the sum of brightness of the stars at those spots over those days is maximized. In other words, you want to find the largest possible sum of brightness of the stars at any $s$ consecutive spots across any $d$ consecutive days over the next $n$ days. Note that the $s$ spots you choose cannot wrap around.</p>

### 입력

<p>The first line of input contains four integers $n$, $k$, $d$, and $s$ ($1 \leq n \leq 2 \cdot 10^5$, $0 \leq k \leq 10^9$, $1 \leq d, s \leq n$).</p>

<p>The next $n$ lines each contain an integer between $-10^7$ and $10^7$, inclusive. The integer on the $i$th line is the brightness value of the $i$th star on the first day.</p>

### 출력

<p>Output a single integer, the largest possible sum of brightness of the stars at any $s$ consecutive spots across any $d$ consecutive days over the next $n$ days.</p>