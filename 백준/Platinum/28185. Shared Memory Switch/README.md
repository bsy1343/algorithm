# [Platinum I] Shared Memory Switch - 28185

[문제 링크](https://www.acmicpc.net/problem/28185)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Your task is to build an optimal algorithm for the shared memory switch.</p>

<p>A shared memory switch is one of the simplest nontrivial buffering architectures considered in the field of algorithms for networking. In this problem we consider a shared memory switch with multiple output queues and uniform (identical) packets. Incoming packets in this model are destined to one of the several output queues, which share a common buffer of finite size $B$. At the end of each second all nonempty queues transmit one packet each. When the buffer overflows your algorithm must decide which packet to drop. Your goal is to design an algorithm achieving maximal throughput (equivalently, dropping as few packets as possible).</p>

<p>You will be given $n$ queries in the following format:</p>

<ul>
	<li>$-1$: a single second passes.</li>
	<li>$k$ ($1 \leq k \leq n$): a packet arrives to the $k$-th queue.</li>
</ul>

<p>You can assume that all packets remaining in the buffer after all queries will be sent as well or, equivalently, that there is an infinite number of $-1$ queries that follow the queries in the input.</p>

### 입력

<p>The first line contains contains two non-negative integers $n$ and $B$ ($n, B \leq 2 \cdot 10^5$): the number of queries and the amount of memory available to the switch correspondingly.</p>

<p>The second line contains $n$ queries in the format described above.</p>

### 출력

<p>On the first line, output the only integer: the number of transmitted packets.</p>

<p>On the second line, output the numbers of queries ($1$-based) with arrivals of the packets that were transmitted. You can output these numbers in any order.</p>