# [Gold III] Burnished Security Updates - 21128

[문제 링크](https://www.acmicpc.net/problem/21128)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 30, 맞힌 사람: 30, 정답 비율: 57.692%

### 분류

이분 그래프, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Alexander is going to install an important update package called <em>Burnished Security Updates</em> (BSU) on his computers. He owns a network which consists of $n$ computers connected by $m$ bidirectional cables.</p>

<p>Eventually, BSU will be installed on every computer in the network. But Alexander doesn&#39;t know how the system will behave after the update, so he will first install the update on some non-empty set of computers that satisfies the following conditions:</p>

<ul>
	<li>no two updated computers are connected directly by a cable;</li>
	<li>each cable must have at least one updated computer as its endpoint;</li>
	<li>the set of the updated computers must be as small as possible.</li>
</ul>

<p>Formally speaking, if we represent the computer network as a graph, Alexander wants to find an independent set of the graph such that it forms a vertex cover of the same graph. Among all possible sets, he wants to choose one with the least possible size.</p>

<p>Now, you need to help Alexander and find the number of computers on which BSU will be installed. Note that sometimes it can be impossible to find a set satisfying the conditions above at all.</p>

### 입력

<p>The first line contains two integers $n$ and $m$, the number of computers and the number of cables ($2 \le n \le 3 \cdot 10^5$, $1 \le m \le 3 \cdot 10^5$).</p>

<p>Each of the following $m$ lines contains two integers $x_i$ and $y_i$, the endpoints of the $i$-th cable ($1 \le x_i, y_i \le n$, $x_i \ne y_i$).</p>

<p>It is guaranteed that each pair of computers is connected by no more than one cable.</p>

### 출력

<p>If there is no such set, print a single integer $-1$.</p>

<p>Otherwise, print the size of a required set of computers.</p>