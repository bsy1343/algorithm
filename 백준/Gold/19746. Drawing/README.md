# [Gold II] Drawing - 19746

[문제 링크](https://www.acmicpc.net/problem/19746)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

해 구성하기

### 문제 설명

<p>Math class was very boring, so Borya tried to find an entertainment. He had a cross-section paper which was divided into $4n$ rows and $4m$ columns. After each 4 rows he draw a line so paper was divided into $n$ big rows each consisting of 4 small rows. In the same way he split a $4m$ columns into $m$ big ones. So he got paper divided into $nm$ squares, each consisting of 16 small ones.</p>

<p>Borya suggested Misha to write down a number between 4 and 12 inclusive into each big cell. All those preparations were needed for testing Borya&#39;s drawing skills. He wanted to paint some of small cells in the way that some special conditions were satisfied.</p>

<p>Firstly Borya decided that it is too bad that some cells have four neighbors, but some have two or three. So Borya thought that first cell of each row is neighbor of last cell of this row. Similarly first and last cells of each column are neighbors.</p>

<p>All painted cells should form a connected figure. That means that for each two filled cells there should exist a path connecting them of filled cells where each pair of neighbor cells in path are neighbors on the paper (with considering Borya&#39;s decision that for each row and column first and last cells are neighbors).</p>

<p>Furthermore all not painted cells should form a connected figure.</p>

<p>Finally if Misha wrote down number $X$ in some big cell, exactly $X$ small cells should be painted in it.</p>

<p>Borya sure that despite of numbers Misha wrote he could fill out some cells that all conditions were satisfied. Proof that you are as good as Borya in painting!</p>

### 입력

<p>In the first line there are two integers $n$ and $m$ ($1 \le n, m \le 100$). They means that Borya has a paper of size $n$ by $m$ cells.</p>

<p>Next $n$ lines contains $m$ integers $a_{ij}$ $(4 \le a_{ij} \le 12)$ --- number of small cells which should paint Borya in $j$-th big cell of $i$-th row.</p>

### 출력

<p>You are to print $4n$ lines each consisting of $4m$ symbols. About each small cell you should print symbol &lt;&lt;<code>.</code>&gt;&gt;, if Borya must not fill it and symbol &lt;&lt;<code>*</code>&gt;&gt;, if Borya should fill it.</p>

<p>If there are exist more than one solution, print any.</p>