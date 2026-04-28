# [Platinum I] Best Solution Unknown - 21132

[문제 링크](https://www.acmicpc.net/problem/21132)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 100, 정답: 57, 맞힌 사람: 47, 정답 비율: 56.627%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 분리 집합, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>You are the responsible holder of a competition called <em>Best Solution Unknown</em> (BSU). The rules of this competition are simple but rather quirky.</p>

<p>First, all the $n$ participants stand in a row. Then, $n-1$ matches are held. In each match, jury chooses two <em>adjacent</em> players. The chosen players are given an NP-hard problem, and they try their best to come up with a good solution. The one who provides a better solution wins a round, the other one leaves the competition. After that, players shift to form a valid row again, so the player adjacent to the player that has left the competition becomes adjacent to the winner of the round. As you can see, after all the $n-1$ matches, only one player remains, and this player is declared a winner of the competition.</p>

<p>You know the competitors well, so you know the <em>strength</em> of each player before the competition. The strength of the $i$-th player, counting from the left of the row, is $a_i$. You also know that a player with greater strength wins the match. If the players have equal strength, both have a chance to win. You have noticed that victories motivate the players, so the strength of the winner of a match increases by one.</p>

<p>However, you do not know who plays in each match and who wins a match in case of equal strengths. So, you are wondering who can become the winner of the competition. You thought it was a good problem for the participants of BSU, but, unfortunately, it is not NP-hard, so you have to solve it yourself.</p>

### 입력

<p>The first line contains an integer $n$, denoting the number of participants of BSU ($1 \le n \le 10^6$).</p>

<p>The second line contains $n$ integers $a_i$, where $a_i$ is the initial strength of the $i$-th participant ($1 \le a_i \le 10^9$).</p>

### 출력

<p>The first line should contain an integer $k$, the number of participants that can possibly win the competition ($1 \le k \le n$).</p>

<p>The second line should contain $k$ integers $b_i$ in strictly increasing order, the indices of these participants ($1 \le b_1 &lt; b_2 &lt; \ldots &lt; b_k \le n$).</p>