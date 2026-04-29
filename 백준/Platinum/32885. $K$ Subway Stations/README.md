# [Platinum II] $K$ Subway Stations - 32885

[문제 링크](https://www.acmicpc.net/problem/32885)

### 성능 요약

시간 제한: 1.5 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 110, 정답: 22, 맞힌 사람: 12, 정답 비율: 22.222%

### 분류

그래프 이론, 그리디 알고리즘, 트리, 트리의 지름

### 문제 설명

<p>Seoul City Mayor Hanbyeol plans to build a subway system to alleviate traffic congestion on its jam-packed roads. However, due to budget constraints, only a maximum of $K$ stations can be built, and a single path of roads must connect all the stations.</p>

<p>Specifically, when the layout of Seoul can be represented as a connected graph with $N$ nodes and $N-1$ bidirectional edges, where a node represents a building and an edge represents a road, Hanbyeol must select a simple path of $X$ nodes, where $1 \le X \le K$, and build stations on every node along that path.</p>

<p>Hanbyeol wants to minimize the maximum distance between the buildings to the nearest station. To help Hanbyeol, write a program that determines the best location for the subway stations so that such value is minimized.</p>

### 입력

<p>The first line of input contains two space-separated integers: $N$, denoting the count of the nodes in the city, and $K$, denoting the count of the maximum subway stations that Hanbyeol can build. ($1 \le K \le N \le 300\,000$)</p>

<p>The $i$-th of the next $N-1$ lines of input contains three space-separated integers: $u_i$ and $v_i$, denoting the indices of nodes that the $i$-th road is connecting, and $l_i$, denoting the length of the $i$-th road in kilometers. ($1 \le u_i, v_i \le N;$ $1 \le l_i \le 10^{12};$ $i \ne j \rightarrow \{u_i,v_i\} \ne \{u_j,v_j\}$)</p>

### 출력

<p>Output the maximum distance from any building to the nearest subway station when it is the minimum possible, in kilometers.</p>

### 힌트

<p>(For Sogang students:) Note that this problem is an improvised version that matches the format of a problem in a general programming contest. While in the exam, the original scoring was:</p>

<ul>
	<li>$55$ points for Subtask 1.</li>
	<li>$40$ points for Subtask 2.</li>
	<li>$3$ points for Subtask 3.</li>
	<li>$2$ points for Subtask 4.</li>
</ul>