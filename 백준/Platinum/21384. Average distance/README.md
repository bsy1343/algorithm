# [Platinum V] Average distance - 21384

[문제 링크](https://www.acmicpc.net/problem/21384)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 28, 맞힌 사람: 24, 정답 비율: 63.158%

### 분류

수학, 그래프 이론, 그래프 탐색, 트리, 조합론, 깊이 우선 탐색, 확률론, 기댓값의 선형성

### 문제 설명

<p>Given a tree, calculate the average distance between two vertices in the tree. For example, the average distance between two vertices in the following tree is (d<sub>01</sub> + d<sub>02</sub> + d<sub>03</sub> + d<sub>04</sub> + d<sub>12</sub> + d<sub>13</sub> + d<sub>14</sub> + d<sub>23</sub> + d<sub>24</sub> + d<sub>34</sub>)/10 = (6 + 3 + 7 + 9 + 9 + 13 + 15 + 10 + 12 + 2)/10 = 8.6.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21384.%E2%80%85Average%E2%80%85distance/943f2560.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/21384.%E2%80%85Average%E2%80%85distance/943f2560.png" data-original-src="https://upload.acmicpc.net/c59f6a88-ea0c-4caf-8b28-708c25fa40fd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 202px; height: 98px;" /></p>

<p style="text-align: center;">Figure 1: The first sample case</p>

### 입력

<p>On the first line an integer t (1 &le; t &le; 100): the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with an integer n (2 &le; n &le; 10 000): the number of nodes in the tree. The nodes are numbered from 0 to n &minus; 1.</li>
	<li>n &minus; 1 lines, each with three integers a (0 &le; a &lt; n), b (0 &le; b &lt; n) and d (1 &le; d &le; 1 000). There is an edge between the nodes with numbers a and b of length d. The resulting graph will be a tree.</li>
</ul>

### 출력

<p>For each testcase:</p>

<ul>
	<li>One line with the average distance between two vertices. This value should have either an absolute or a relative error of at most 10<sup>&minus;6</sup>.</li>
</ul>