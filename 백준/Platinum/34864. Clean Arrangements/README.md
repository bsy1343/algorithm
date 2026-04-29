# [Platinum IV] Clean Arrangements - 34864

[문제 링크](https://www.acmicpc.net/problem/34864)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 60, 정답: 45, 맞힌 사람: 41, 정답 비율: 77.358%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>In graph drawing, a <em>linear arrangement</em> of a rooted (connected) tree $T = (V, E)$ of $n$ vertices is a planar drawing where $n$ vertices of the tree are placed on a horizontal line, say the $x$-axis, and $(n − 1)$ edges are drawn as semicircular arcs above the line connecting their end vertices as shown in Figure 1. Such linear arrangement $π$ maps each vertex to a distinct integer from $1$ to $n$, representing its coordinate along the $x$-axis.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34864.%E2%80%85Clean%E2%80%85Arrangements/dc362b3f.png" data-original-src="https://boja.mercury.kr/assets/problem/34864-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 653px; height: 170px;"></p>

<p style="text-align: center;"><strong>Figure 1</strong>. (Left) A rooted tree $T$ of nine vertices with the vertex $1$ as a root.</p>

<p style="text-align: center;">(Middle) A clean arrangement of $T$.</p>

<p style="text-align: center;">(Right) An unclean arrangement of $T$ because of the red edge $(3, 7)$ covering the root.</p>

<p>In a linear arrangement $π$, the distance $d(u, v)$ between two vertices $u$ and $v$ is defined as the difference of their $x$-coordinates, i.e., $d(u, v) = |π(u) − π(v)|$. Formally, for a rooted tree $T = (V, E)$, the cost of a linear arrangement $π$ of $T$ is defined as $\sum_{(u,v) \in E} {d(u,v)}$.</p>

<p>A <em>clean arrangement</em> $π$ of a rooted tree $T$ is a special linear arrangement $π$ satisfying both conditions:</p>

<ol>
<li>$π$ has no edge crossings except at common end vertices of edges.</li>
<li>No edge covers the root vertex $r$ of $T$, that is, there is no edge $(u, v)$ such that $π(u) &lt; π(r) &lt; π(v)$.</li>
</ol>

<p>For example, the middle in Figure 1 is a clean arrangement of $T$ in the left, but the right is not clean because the edge $(3, 7)$ covers the root vertex $1$. The cost of the clean arrangement in the middle is $11$, where there are three edges of distance two and five edges of distance one. This cost is the minimum among all clean arrangements of $T$.</p>

<p>Given a rooted tree with the vertex $1$ as a root, write a program to output the minimum possible cost of clean arrangements of the tree.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing $n$ ($2 ≤ n ≤ 5\,000$), where $n$ is the number of vertices of the rooted tree. The vertices are numbered from $1$ to $n$, and the root vertex is $1$. In the following $(n − 1)$ lines, each line contains two positive integers $u$ and $v$ which are end vertices of an (undirected) edge $(u, v)$ of the tree, where $u$ and $v$ are distinct integers between $1$ and $n$.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the minimum cost of clean arrangements of the tree with root vertex $1$.</p>