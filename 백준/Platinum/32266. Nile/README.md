# [Platinum I] Nile - 32266

[문제 링크](https://www.acmicpc.net/problem/32266)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 148, 정답: 54, 맞힌 사람: 46, 정답 비율: 38.017%

### 분류

자료 구조, 세그먼트 트리, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>You want to transport $N$ artifacts through the Nile. The artifacts are numbered from $0$ to $N - 1$. The weight of artifact $i$ ($0 &le; i &lt; N$) is $W[i]$.</p>

<p>To transport the artifacts, you use specialized boats. Each boat can carry <strong>at most two</strong> artifacts.</p>

<ul>
	<li>If you decide to put a single artifact in a boat, the artifact weight can be arbitrary.</li>
	<li>If you want to put two artifacts in the same boat, you have to make sure the boat is balanced evenly. Specifically, you can send artifacts $p$ and $q$ ($0 &le; p &lt; q &lt; N$) in the same boat only if the absolute difference between their weights is at most $D$, that is $|W[p] - W[q]| &le; D$.</li>
</ul>

<p>To transport an artifact, you have to pay a cost that depends on the number of artifacts carried in the same boat. The cost of transporting artifact $i$ ($0 &le; i &lt; N$) is:</p>

<ul>
	<li>$A[i]$, if you put the artifact in its own boat, or</li>
	<li>$B[i]$, if you put it in a boat together with some other artifact.</li>
</ul>

<p>Note that in the latter case, you have to pay for both artifacts in the boat. Specifically, if you decide to send artifacts $p$ and $q$ ($0 &le; p &lt; q &lt; N$) in the same boat, you need to pay $B[p] + B[q]$.</p>

<p>Sending an artifact in a boat by itself is always more expensive than sending it with some other artifact sharing the boat with it, so $B[i] &lt; A[i]$ for all $i$ such that $0 &le; i &lt; N$.</p>

<p>Unfortunately, the river is very unpredictable and the value of $D$ changes often. Your task is to answer $Q$ questions numbered from $0$ to $Q - 1$. The questions are described by an array $E$ of length $Q$. The answer to question $j$ ($0 &le; j &lt; Q$) is the minimum total cost of transporting all $N$ artifacts, when the value of $D$ is equal to $E[j]$.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; N &le; 100\, 000$</li>
	<li>$1 &le; Q &le; 100\, 000$</li>
	<li>$1 &le; W[i] &le; 10^9$ for each $i$ such that $0 &le; i &lt; N$</li>
	<li>$1 &le; B[i] &lt; A[i] &le; 10^9$ for each $i$ such that $0 &le; i &lt; N$</li>
	<li>$1 &le; E[j] &le; 10^9$ for each $j$ such that $0 &le; j &lt; Q$</li>
</ul>