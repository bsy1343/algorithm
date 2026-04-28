# [Platinum I] Arranging Heaps - 5668

[문제 링크](https://www.acmicpc.net/problem/5668)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 27, 맞힌 사람: 25, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 분할 정복, 볼록 껍질을 이용한 최적화, 분할 정복을 사용한 최적화

### 문제 설명

<p>A mining company extracts terbium, a rare metal used for constructing lightweight magnets, from river sand. They mine the Long River at N mining points, each of them identified by its distance from the river source. At each mining point, a relatively small but highly valued heap of mineral ore is extracted from the river.</p>

<p>To collect the mineral ore, the company regroups the N produced heaps into a smaller number of K heaps, each located at one of the initial mining points. The newly formed heaps are then collected by trucks.</p>

<p>To regroup the N heaps, they use a barge, which in practice can carry any amount of mineral ore because it is very large. The barge starts at the river source and can only travel downriver, so the heap produced at a mining point X can be taken to a mining point Y only if Y &gt; X. Each heap is moved completely to another mining point, or not moved at all. The cost of moving a heap of weight W from a mining point X to a mining point Y is W &times; (Y &minus; X). The total cost of the regrouping is the sum of the costs for each heap movement. Notice that a heap which is not moved has no influence on the total cost.</p>

<p>Given the values for N and K, the N mining points, and the weight of the heap each mining point produced, write a program that calculates the minimum total cost to regroup the N initial heaps into K heaps.</p>

### 입력

<p>Each test case is described using several lines. The first line contains two integers N and K denoting respectively the number of initial heaps and the desired number of heaps after regrouping (1 &le; K &lt; N &le; 1000). Each of the next N lines describes one of the initial heaps with two integers X and W indicating that the mining point X produced a heap of weight W (1 &le; X, W &le; 10<sup>6</sup>). Within each test case the heaps are given in strictly ascending order considering their mining points.</p>

### 출력

<p>For each test case output a line with an integer representing the minimum total cost to regroup the N initial heaps into K heaps.</p>