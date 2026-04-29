# [Gold IV] Photoshoot - 35328

[문제 링크](https://www.acmicpc.net/problem/35328)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 83, 정답: 50, 맞힌 사람: 46, 정답 비율: 60.526%

### 분류

구현, 누적 합, 브루트포스 알고리즘

### 문제 설명

<p>Farmer John is looking at his cows in a magical field and wants to take pictures of subsets of his cows.</p>

<p>The field can be seen as a $N \times N$ grid $(1 \leq N \leq 500)$, with a single stationary cow at each location. Farmer John's camera is capable of taking a picture of any $K \times K$ square that is part of the field $(1 \leq K \leq \min(N, 25))$.</p>

<p>At all times, each cow has a beauty value between $0$ and $10^6$. The attractiveness index of a picture is the sum of the beauty values of the cows contained in the picture.</p>

<p>The beauty value for every cow starts out as $0$, so the attractiveness index of any picture in the beginning is $0$.</p>

<p>At $Q$ times $(1 \leq Q \leq 3\cdot 10^{4})$, the beauty of a single cow will increase by a positive integer due to eating the magical grass that is planted on Farmer John's field.</p>

<p>Farmer John wants to know the maximum attractiveness index of a picture he can take after each of the $Q$ updates.</p>

### 입력

<p>The first line contains integers $N$ and $K$.</p>

<p>The following line contains an integer $Q$.</p>

<p>Each of the following $Q$ lines contains three integers: $r$, $c$, and $v$, which are the row, column, and new beauty value, respectively ($1 \leq r, c \leq N, 1 \leq v \leq 10^6$). It is guaranteed that the new beauty value is greater than the beauty value at that location before.</p>

### 출력

<p>Output $Q$ lines, corresponding to the maximum attractiveness index of a picture after each update.</p>