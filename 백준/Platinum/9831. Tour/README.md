# [Platinum V] Tour - 9831

[문제 링크](https://www.acmicpc.net/problem/9831)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>A tourist is holding an R &times; C grid map of Singapore (1 &le; R, C &le; 20) where &lsquo;<code>~</code>&rsquo; (tilde character) is water, &lsquo;<code>.</code>&rsquo; is land, &lsquo;<code>2</code>&rsquo;, &lsquo;<code>3</code>&rsquo;, . . ., &lsquo;<code>9</code>&rsquo; are attractive spots, and &lsquo;<code>C</code>&rsquo; is Changi. The figure below is an example of a 3 &times; 5 grid map with one &lsquo;<code>C</code>&rsquo; and two attractive spots labeled with &lsquo;<code>5</code>&rsquo; and &lsquo;<code>6</code>&rsquo;.</p>

<pre>
~.~.~
6.~5.
~..C~</pre>

<p>There can be up to N (0 &le; N &le; 14) attractive spots in Singapore. The label of each attractive spot i is its satisfaction point S<sub>i</sub> (2 &le; S<sub>i</sub> &le; 9), for example, an attractive spot labeled with &lsquo;<code>5</code>&rsquo; has S<sub>i</sub> = 5. If the tourist visits spot i, he will gain S<sub>i</sub> points.</p>

<p>The tourist can only travel in the four directions (N/E/S/W) but only over the land (denoted with &lsquo;<code>.</code>&rsquo;). As Singapore is a modern city, it is always possible to reach all other land (&lsquo;<code>.</code>&rsquo;) cells from any land (&lsquo;<code>.</code>&rsquo;) cell. Traveling is tiring, so every step contributes to dissatisfaction (or negative satisfaction). The tourist says that each step contributes &minus;2 satisfaction points. In the example above, if he travels as directly as possible from Changi &lsquo;<code>C</code>&rsquo; on row 2 column 3 to spot &lsquo;<code>6</code>&rsquo; on row 1 column 0 (0-based indexing), he must use 4 steps with 4 &times;&nbsp;&minus;2 = &minus;8 satisfaction points.</p>

<p>This tourist lands on Changi &lsquo;<code>C</code>&rsquo;, wants to visit these attractive spots, and then finally goes back to Changi &lsquo;<code>C</code>&rsquo; to fly home. Each point on land (including attractive spots) can be visited multiple times, but the satisfaction points for each attractive spots can be collected only once. What is the maximal number of satisfaction points achievable by the tourist, using a given map of Singapore? If his tour is &lsquo;<code>C</code>&rsquo; &rarr; &lsquo;<code>6</code>&rsquo; &rarr; &lsquo;<code>5</code>&rsquo; &rarr; &lsquo;<code>C</code>&rsquo;, he will get: 4 &times; (&minus;2) + 6 + 5 &times; (&minus;2) + 5 + 1 &times; (&minus;2) = &minus;8 + 6 + &minus;10 + 5 &minus; 2 = &minus;9 satisfaction points. If his tour is &lsquo;<code>C</code>&rsquo; &rarr; &lsquo;<code>5</code>&rsquo; &rarr; &lsquo;<code>C</code>&rsquo;, he will get: 1 &times; (&minus;2) + 5 + 1 &times; (&minus;2) = &minus;2 + 5&minus;2 = 1 satisfaction point (this is the maximum over all possibilities), i.e. this tourist skips &lsquo;<code>6</code>&rsquo; as it is not worth his time.</p>

### 입력

<p>The input (from standard input) starts with two integers R, C in one line. Then, R lines with exactly C characters per line will appear next. There is always exactly one &lsquo;<code>C</code>&rsquo; and between zero and fourteen attractive spots in the input.</p>

### 출력

<p>Your program should output a single integer (to standard output), which represents the maximum number of satisfaction points achievable, using the given map of Singapore.</p>