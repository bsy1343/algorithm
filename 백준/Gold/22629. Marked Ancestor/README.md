# [Gold II] Marked Ancestor - 22629

[문제 링크](https://www.acmicpc.net/problem/22629)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 120, 정답: 42, 맞힌 사람: 33, 정답 비율: 29.730%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 트리, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>You are given a tree&nbsp;<i>T</i>&nbsp;that consists of&nbsp;<i>N</i>&nbsp;nodes. Each node is numbered from 1 to&nbsp;<i>N</i>, and node 1 is always the root node of&nbsp;<i>T</i>. Consider the following two operations on&nbsp;<i>T</i>:</p>

<ul>
	<li>M v: (Mark) Mark node&nbsp;v.</li>
	<li>Q v: (Query) Print the index of the nearest marked ancestor of node&nbsp;v&nbsp;which is nearest to it. Initially, only the root node is marked. Note that a node is an ancestor of itself.</li>
</ul>

<p>Your job is to write a program that performs a sequence of these operations on a given tree and calculates the value that each Q operation will print. To avoid too large output file, your program is requested to print the sum of the outputs of all query operations. Note that the judges confirmed that it is possible to calculate every output of query operations in a given sequence.</p>

### 입력

<p>The first line of the input contains two integers&nbsp;<i>N</i>&nbsp;and&nbsp;<i>Q</i>, which denotes the number of nodes in the tree&nbsp;<i>T</i>&nbsp;and the number of operations, respectively. These numbers meet the following conditions: 1 &le;&nbsp;<i>N</i>&nbsp;&le; 100000 and 1 &le;&nbsp;<i>Q</i>&nbsp;&le; 100000.</p>

<p>The following&nbsp;<i>N</i>&nbsp;- 1 lines describe the configuration of the tree&nbsp;<i>T</i>. Each line contains a single integer&nbsp;<i>p<sub>i</sub></i>&nbsp;(<i>i</i>&nbsp;= 2, ... ,&nbsp;<i>N</i>), which represents the index of the parent of&nbsp;<i>i</i>-th node.</p>

<p>The next&nbsp;<i>Q</i>&nbsp;lines contain operations in order. Each operation is formatted as &quot;M v&quot; or &quot;Q v&quot;, where&nbsp;<i>v</i>&nbsp;is the index of a node.</p>

### 출력

<p>Print the sum of the outputs of all query operations in one line.</p>