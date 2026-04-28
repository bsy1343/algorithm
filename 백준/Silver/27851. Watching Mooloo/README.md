# [Silver III] Watching Mooloo - 27851

[문제 링크](https://www.acmicpc.net/problem/27851)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 832, 정답: 401, 맞힌 사람: 353, 정답 비율: 49.302%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bessie likes to watch shows on Mooloo. Because Bessie is a busy cow, she has planned a schedule for the next $N$ ($1 \leq N \leq 10^5$) days that she will watch Mooloo. Because Mooloo is a paid subscription service, she now needs to decide how to minimize the amount of money she needs to pay.</p>

<p>Mooloo has an interesting subscription system: it costs $d + K$ ($1\le K\le 10^9$) moonies to subscribe to Mooloo for $d$ consecutive days. You can start a subscription at any time, and you can start a new subscription as many times as you desire if your current subscription expires. Given this, figure out the minimum amount of moonies Bessie needs to pay to fulfill her schedule.</p>

### 입력

<p>The first line contains integers $N$ and $K$.</p>

<p>The second line contains $N$ integers describing the days Bessie will watch Mooloo: $1\le d_1&lt;d_2&lt;\dots&lt;d_N\le 10^{14}$.</p>

### 출력

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a &quot;long long&quot; in C/C++).</strong></p>