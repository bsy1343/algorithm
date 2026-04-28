# [Platinum II] Tree Separator - 15522

[문제 링크](https://www.acmicpc.net/problem/15522)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 106, 정답: 56, 맞힌 사람: 46, 정답 비율: 54.762%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You are given a tree <em>T</em> and an integer <em>K</em>. You can choose arbitrary distinct two vertices <em>u</em> and <em>v</em> on <em>T</em>. Let <em>P</em> be the simple path between <em>u</em> and <em>v</em>. Then, remove vertices in <em>P</em>, and edges such that one or both of its end vertices is in <em>P</em> from <em>T</em>. Your task is to choose <em>u</em> and <em>v</em> to maximize the number of connected components with <em>K</em> or more vertices of <em>T</em> after that operation.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre>
N K
u<sub>1</sub> v<sub>1</sub>
.
.
.
u<sub>N-1</sub> v<sub>N-1</sub></pre>

<p>The first line consists of two integers <em>N</em>, <em>K</em> (2 &le; <em>N</em> &le; 100,000, 1 &le; <em>K</em> &le; <em>N</em>). The following <em>N</em>-1 lines represent the information of edges. The (<em>i</em>+1)-th line consists of two integers <em>u<sub>i</sub></em>, <em>v<sub>i</sub></em> (1 &le; <em>u<sub>i</sub></em>, <em>v<sub>i</sub></em> &le; <em>N</em> and <em>u<sub>i</sub></em> &ne; <em>v<sub>i</sub></em> for each <em>i</em>). Each {<em>u<sub>i</sub></em>, <em>v<sub>i</sub></em>} is an edge of <em>T</em>. It&#39;s guaranteed that these edges form a tree.</p>

### 출력

<p>Print the maximum number of connected components with <em>K</em> or more vertices in one line.</p>