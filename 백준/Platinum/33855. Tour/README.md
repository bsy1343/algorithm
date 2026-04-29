# [Platinum I] Tour - 33855

[문제 링크](https://www.acmicpc.net/problem/33855)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 73, 정답: 13, 맞힌 사람: 11, 정답 비율: 17.742%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>There are many tourist attractions in Toruń. Our tour guides prepared a list of $m$ one-way walks connecting $n$ meeting points in the city center. The walks are numbered from $1$ to $m$ and similarly the meeting points are numbered from $1$ to $n$. Each walk leads from one meeting point to another and allows the participants to see a single attraction on the way. It might be possible to see the same attraction on different walks and there might be mutliple walks between the same pair of meeting points. We would like to organise an <em>interesting tour</em> on our day off.</p>

<p>A <em>tour</em> is a sequence of walks, such that every walk starts at the meeting point where the previous one ends. Furthermore, the last walk ends at the meeting point where the very first walk begins.</p>

<p>We call such a tour <em>interesting</em> if it doesn’t contain the same attraction twice in a row. In other words, every two consecutive walks from the tour allow us to see different attractions, and additionally the very first and very last walks from the tour allow us to see different attractions as well. Note that we do not mind if some non-consecutive walks allow us to see the same attraction. In particular, the same walk might be used multiple times on the tour (but not twice in a row).</p>

<p>Your task is to check if it is possible to form an interesting tour, and if so to find one. You can output any interesting tour that consists of at most $m$ walks. It can be proven that if there exists an interesting tour, then there exists one consisting of at most $m$ walks.</p>

### 입력

<p>The first line contains a positive integer $t$ ($1 ≤ t ≤ 5 \cdot 10^5$) denoting the number of test cases.</p>

<p>The first line of each test case contains positive integers $n$ and $m$ ($2 ≤ n$, $1 ≤ m$) denoting the number of meeting points and walks, respectively.</p>

<p>Each of the subsequent $m$ lines describes one of the $m$ walks. The $i$-th line contains three positive integers $x_i$, $y_i$ and $c_i$ ($1 ≤ x_i , y_i ≤ n$, $x_i \ne y_i$, $1 ≤ c_i ≤ m$), which indicate that the $i$-th walk starts at the meeting point $x_i$, ends at the meeting point $y_i$, and allows us to see the attraction $c_i$.</p>

<p>Let $N$ and $M$ denote the sum of $n$ and $m$, respectively, over all test cases. You can assume that $N, M ≤ 10^6$.</p>

### 출력

<p>For each test case, in the first line you should output <code>YES</code> if it is possible to organise an interesting tour and <code>NO</code> otherwise. In the former case, the second line should first contain a positive integer $k$ ($2 ≤ k ≤ m$) denoting the number of walks forming the interesting tour. This should be followed by $k$ integers $p_1, p_2, \dots , p_k$ separated by single spaces. These numbers should describe an interesting tour, where we first follow walk $p_1$, then $p_2$, and so on, and finally we follow walk $p_k$ returning to the original meeting point.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33855.%E2%80%85Tour/1647da81.png" data-original-src="https://boja.mercury.kr/assets/problem/33855-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 355px; height: 300px;"></p>

<p style="text-align: center;">Illustration of the 4th test case from the example. The arrows represent the walks between meeting points.</p>