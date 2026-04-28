# [Platinum I] Game With Permutations - 18925

[문제 링크](https://www.acmicpc.net/problem/18925)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 12, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

백트래킹, 많은 조건 분기, 차분 공격, 무작위화

### 문제 설명

<p>This is an interactive problem. </p>

<p>A game with permutations has the following rules. The judge program first generates some permutation $p$ of length $N$ and tells you $N$. This permutation is never changed throughout the game.</p>

<p>Your task is to guess the permutation. For that purpose, you may use permutations of length $N$ as queries. Let&#39;s see how the jury program answers them.</p>

<ul>
	<li>When the jury program receives a permutation $q$, it checks positions $Q_i$ of each integer from 1 to $N$ in this permutation. For example, for permutation $q = (2,3,1,4,5)$, we get $Q = (3,1,2,4,5)$.</li>
	<li>Same calculation is applied to the permutation $p$, and integers $P_1 \ldots P_N$ are calculated. For example, for permutation $p = (5,2,1,4,3)$, we get $P = (3,2,5,4,1)$.</li>
	<li>Finally, the jury program calculates an array $D$ such that $D_i=|P_i-Q_i|$ and returns it to your program <strong>sorted in ascending order</strong>.</li>
	<li>For the example above, $D = (0,1,3,0,4)$, and you will receive these integers in sorted order: $(0,0,1,3,4)$.</li>
</ul>

<p>Note that you can ask no more than 240 queries before you tell the answer.</p>

### 입력



### 출력

