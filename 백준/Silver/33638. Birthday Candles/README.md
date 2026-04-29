# [Silver III] Birthday Candles - 33638

[문제 링크](https://www.acmicpc.net/problem/33638)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 42, 정답: 35, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Minka the Martian is celebrating their birthday with many friends. Similar to Earth birthdays, the occasion is commemorated by blowing candles out on a cake. However, on Mars the candles are placed on the cake differently: each of the $N$ guests attending the party will place $H$ candles on the cake representing the number of hours the Martian has been alive. So the cake will have exactly $N \cdot H$ candles in total. Even more surprising is that each guest hand-crafted the $H$ candles that they placed on the cake, so the candles are not necessarily identical.</p>

<p>Minka is not feeling particularly well today and fears they won’t be able to blow out all candles. Each candle takes a certain effort to blow out, the effort is given as a positive integer. Minka has a capacity $C$ to blow out candles, which may not be enough to blow out all candles.</p>

<p>There is one further complication. Minka wants does not want any guest to feel neglected. When they finish blowing out candles, the number of remaining candles between any two guests should differ by at most one. That is, if for each guest $i$ we let $r_i$ denote the number of their candles remaining after Minka blows some out, then it should be that $|r_i- r_j|≤1$ for any two guests $i$ and $j$.</p>

<p>Determining the maximum number of candles that Minka can blow out such that the total capacity of all extinguished candles is at most $C$ and such that $|r_i-r_j|≤1$ for any two guests $i$ and $j$.</p>

### 입력

<p>The first line of input contains three integers $N$ ($1≤N≤100$), $H$ ($1≤H≤1000$), and $C$ ($1≤C≤10^9$).</p>

<p>The next $N$ lines describe the candles brought by the guests. The $i$’th such line contains $H$ integers indicating the effort to blow out each of the $H$ candles brought by guest $i$. Each of these values is given as a positive integer at most $10^9$.</p>

### 출력

<p>Output a single line indicating the maximum number of candles that Minka can blow out subject to the restrictions mentioned above.</p>