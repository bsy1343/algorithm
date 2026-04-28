# [Silver III] Gleb and Two Numbers - 30756

[문제 링크](https://www.acmicpc.net/problem/30756)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 40, 맞힌 사람: 36, 정답 비율: 80.000%

### 분류

문자열, 애드 혹, 해 구성하기

### 문제 설명

<p>When Gleb is not busy with writing long problem statements he enjoys playing with numbers. He picks two integers $l$ and $r$ and tries to find integers $a$ and $b$ such that $l \le a \le b &le; r$ and the Hamming distance between $a$ and $b$ is maximum possible.</p>

<p>The <em>Hamming distance</em> between two integers $x$ and $y$ is defined as the number of decimal places at which they are different. If these integers are of different length, the shorter one is prepended with leading zeroes.</p>

### 입력

<p>The first line of the input contains a single integer $l$ and the second line contains a single integer $r$ ($1 \leq l \leq r \leq 10^{1\,000\,000}$).</p>

### 출력

<p>Print the maximum possible Hamming distance between a pair of integers in range from $l$ to $r$.</p>

### 힌트

<p>In the first sample, one can choose integers $12$ and $16$. In the second sample, $1$ and $10$ form an optimal answer.</p>