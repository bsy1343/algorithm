# [Platinum V] Fragmented Nim - 35044

[문제 링크](https://www.acmicpc.net/problem/35044)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 30, 정답: 22, 맞힌 사람: 20, 정답 비율: 76.923%

### 분류

게임 이론

### 문제 설명

<p>The classical game of Nim goes as follows. There are $n$ piles of stones, and pile $i$ initially consists of $a_i$ stones. Alice and Bob take turns; Alice goes first. On their turn, a player chooses any non-empty pile and removes any positive number of stones from it. The player who takes the last stone wins.</p>

<p>After playing a lot of Nim, Alice and Bob decided to vary the rules a little bit. In this variation, the player whose turn it is does not choose a pile --- <em>their opponent</em> does it for them! However, the player still gets to decide the number of stones to remove from that pile.</p>

<p>Alice still moves first. On Alice's turn Bob chooses any non-empty pile, and then Alice removes any positive number of stones from it. Similarly, on Bob's turn Alice chooses any non-empty pile, and then Bob removes any positive number of stones from it.</p>

<p>For the given configuration of stones in the piles, determine who will win if both players follow the optimal strategy.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$, denoting the number of piles ($1 \le n \le 2 \cdot 10^5$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$, denoting the number of stones in the piles ($1 \le a_i \le 10^9$).</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, print the name of the winner of the game if both players follow the optimal strategy: "<code>Alice</code>" or "<code>Bob</code>".</p>

### 힌트

<p>In the first test case, here's one possible way the game could proceed:</p>

<ul>
<li>Bob chooses the first pile. Alice removes $1$ stone from it.</li>
<li>Alice chooses the third pile. Bob removes $2$ stones from it.</li>
<li>Bob chooses the third pile. Alice removes $1$ stone from it.</li>
<li>Alice chooses the second pile. Bob removes $2$ stones from it and wins.</li>
</ul>

<p>In the second test case, Bob chooses the only pile, and Alice wins by removing the only stone from it.</p>