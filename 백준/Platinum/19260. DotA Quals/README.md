# [Platinum II] DotA Quals - 19260

[문제 링크](https://www.acmicpc.net/problem/19260)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 20, 정답: 14, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

수학, 조합론, 확률론, 임의 정밀도 / 큰 수 연산, 기댓값의 선형성

### 문제 설명

<p>Today, instead of studying for the coming exams, a student with a nickname &quot;Idned&quot; has decided to take part in an open qualification for a huge DotA (Development of the Algorithms) tournament. The qualification is going to be a single-elimination tournament with $2^n$ participants, and Idned is one of them. There will be $n$ rounds in total. All other remaining participants will be randomly divided into pairs for each round with equal chances for any possible division. In each pair, the participants will play against each other, and the loser will quit the tournament (and will not participate in the further rounds).</p>

<p>Each participant has a unique rating, and Idned&#39;s rating is $k$-th highest. Idned is sure that the outcome of each game is fully determined by the ratings of two participants, and whoever has a higher rating will win. Using this assumption, can you determine the expected number of rounds in which Idned will take part?</p>

### 입력

<p>The input contains two integers $n$ and $k$: the total number of rounds and Idned&#39;s position in the overall rating ($1 \le n \le 10$; $1 \le k \le 2^n$).</p>

### 출력

<p>Output the expected number of rounds.</p>

<p>Your answer must be correct to within an absolute or relative error of $10^{-9}$. Formally, let your answer be $a$, and the jury&#39;s answer be $b$. Your answer will be considered correct if $\frac{|a-b|}{\max(1, |b|)} \le 10^{-9}$.</p>