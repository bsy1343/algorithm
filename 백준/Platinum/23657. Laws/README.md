# [Platinum IV] Laws - 23657

[문제 링크](https://www.acmicpc.net/problem/23657)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

수학, 자료 구조, 그래프 이론, 최단 경로, 데이크스트라, 역추적, 덱, 0-1 너비 우선 탐색

### 문제 설명

<p>There are two inhabitants in the Faraway Kingdom: Alyonushka the Peasant and Ivanushka the King. Alyonushka works on a farm, and Ivanushka makes laws.</p>

<p>Alyonushka has $x$ coins. Each day, Alyonushka gets one more coin from the treasury for her work. The amount of coins in the treasury can be considered infinite.</p>

<p>If the number of Alyonushka&#39;s coins divides evenly by two, Ivanushka can make another peasant law, and Alyonushka will be allowed to keep only half of her coins: the other half immediately goes to the treasury. If the number of Alyonushka&#39;s coins divides evenly by three, Ivanushka can make another farm law, and Alyonushka will be allowed to keep only one third of her coins: the other two thirds immediately go to the treasury. Ivanushka can make new laws at any moment, in any order, and do it any number of times.</p>

<p>Today Ivanushka got angry with Alyonushka. Now he wishes Alyonushka to have only one coin left. What is the minimum possible number of days required to achieve that?</p>

### 입력

<p>The first line of input contains an integer $x$: the initial number of Alyonushka&#39;s coins ($1 \le x \le 10^{9}$).</p>

### 출력

<p>On the first line, print $t$: the minimum possible number of days required for Ivanushka to leave Alyonushka with only one coin. On the second line, print a sequence of integers: any possible sequence of events which takes $t$ days and transforms $x$ coins into $1$. The sequence must start with $x$ and end with $1$. Every two consecutive numbers $u$ and $v$ in the sequence must satisfy either $v = u + 1$ (a day has passed), $v = u / 2$ (a new peasant law has been made), or $v = u / 3$ (a new farm law has been made).</p>