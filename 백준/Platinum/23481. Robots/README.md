# [Platinum III] Robots - 23481

[문제 링크](https://www.acmicpc.net/problem/23481)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 133, 정답: 34, 맞힌 사람: 33, 정답 비율: 30.275%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵, 스택

### 문제 설명

<p>There are $N$ robots numbered from $1$ through $N$ and $N$ antennas numbered from $1$ through $N$ in a straight line. The coordinate of the robot $i$ is $a_i$ and the coordinate of the antenna $i$ is $b_i$. All coordinates are distinct.</p>

<p>Currently, all antennas are inactive. You are going to activate them one by one. When you activate an antenna, the nearest robot (if two robots are closest to it, only the left one) moves to the antenna and explodes along with it.</p>

<p>Find an order to activate antennas so that the total distance of robots&#39; moves is minimum possible.</p>

### 입력

<p>Input is given from Standard Input in the following format:</p>

<p>$N$</p>

<p>$a_1$ $a_2$ $\dots$ $a_N$</p>

<p>$b_1$ $b_2$ $\dots$ $b_N$</p>

### 출력

<p>Print the answer in the following format:</p>

<p>$X$</p>

<p>$p_1$ $p_2$ $\dots$ $p_N$</p>

<p>Here, $X$ must be a minimum total distance, and $p_i$ is the index of the antenna that you activate in the $i$-th.</p>

<p>If there are multiple solutions, you can print any of them.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 2 \times 10^5$</li>
	<li>$0 \leq a_1 &lt; a_2 &lt; \dots &lt; a_N \leq 10^9$</li>
	<li>$0 \leq b_1 &lt; b_2 &lt; \dots &lt; b_N \leq 10^9$</li>
	<li>$a_1, a_2, \dots, a_N, b_1, b_2, \dots, b_N$ are all distinct.</li>
	<li>All values in input are integers.</li>
</ul>