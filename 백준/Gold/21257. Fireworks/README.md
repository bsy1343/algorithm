# [Gold I] Fireworks - 21257

[문제 링크](https://www.acmicpc.net/problem/21257)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 76, 정답: 33, 맞힌 사람: 17, 정답 비율: 32.692%

### 분류

이분 탐색, 미적분학, 수학, 확률론, 삼분 탐색

### 문제 설명

<p>Kotori is practicing making fireworks for the upcoming hanabi taikai(Hanabi taikai: Romaji of the Japanese word, which means the firework... err... party?). It takes her $n$ minutes to make a single firework, and as she is not really proficient in making fireworks, each firework only has a probability of $p \times 10^{-4}$ to be perfect.</p>

<p>After she finishes making a firework, she can just start making the next firework, or take $m$ minutes to light all the remaining fireworks finished before. If there is at least one perfect firework among the lit ones, she will be happy and go to rest. Otherwise, she will continue practicing. Can you tell her the minimum expected practicing time before she goes to rest if she takes the optimal strategy?</p>

<p>Notice that no matter how many fireworks remain, it always takes $m$ minutes to light them all.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ ($1 \le T \le 10^4$) indicating the number of test cases. For each test case:</p>

<p>The first and only line contains three integers $n$, $m$ and $p$ ($1 \le n, m \le 10^9$, $1 \le p \le 10^4$).</p>

### 출력

<p>For each test case, output one line containing one number indicating the minimum expected practicing time.</p>

<p>Your answer will be considered correct if and only if the absolute or relative error does not exceed $10^{-4}$.</p>