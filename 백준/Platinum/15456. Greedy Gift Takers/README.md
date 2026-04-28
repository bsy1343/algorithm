# [Platinum II] Greedy Gift Takers - 15456

[문제 링크](https://www.acmicpc.net/problem/15456)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 303, 정답: 139, 맞힌 사람: 110, 정답 비율: 49.107%

### 분류

이분 탐색, 그리디 알고리즘

### 문제 설명

<p>Farmer John&#39;s nemesis, Farmer Nhoj, has $N$ cows ($1 \leq N \leq 10^5$), conveniently numbered $1 \dots N$. They have unexpectedly turned up at Farmer John&#39;s farm, so the unfailingly polite Farmer John is attempting to give them gifts.</p>

<p>To this end, Farmer John has brought out his infinite supply of gifts, and Nhoj&#39;s cows have queued up in front of him, with cow $1$ at the head of the queue and cow $N$ at the tail. Farmer John was expecting that at every timestep, the cow at the head of the queue would take a gift from Farmer John and go to the tail of the queue. However, he has just realized that Nhoj&#39;s cows are not that polite! After receiving her gift, each cow may not go to the tail of the queue, but rather may cut some number of cows at the tail, and insert herself in front of them. Specifically, cow $i$ will always cut exactly $c_i$ cows ($0 \leq c_i \leq N-1$).</p>

<p>Farmer John knows that some cows might receive multiple gifts; as he has an infinite supply, this does not worry him. But he is worried that some cows might become unhappy if they do not get any gifts.</p>

<p>Help Farmer John find the number of cows who never receive any gifts, no matter how many gifts are handed out.</p>

### 입력

<p>The first line contains a single integer, $N$.</p>

<p>The second line contains $N$ space-separated integers $c_1, c_2, \dots, c_N$.</p>

### 출력

<p>Please output the number of cows who cannot receive any gifts.</p>