# [Platinum IV] Beauty of tree - 23911

[문제 링크](https://www.acmicpc.net/problem/23911)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 29, 맞힌 사람: 25, 정답 비율: 64.103%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 자료 구조, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 확률론, 방향 비순환 그래프, 희소 배열, 기댓값의 선형성

### 문제 설명

<p>Amadea and Bilva are decorating a rooted tree containing&nbsp;<b>N</b>&nbsp;nodes, labelled from 1 to&nbsp;<b>N</b>. Node 1 is the root of the tree, and all other nodes have a node with a numerically smaller label as their parent.</p>

<p>Amadea and Bilva&#39;s decorate the tree as follows:</p>

<ul>
	<li>Amadea picks a node of the tree uniformly at random and paints it. Then, she travels up the tree painting every&nbsp;<b>A</b>-th node until she reaches the root.</li>
	<li>Bilva picks a node of the tree uniformly at random and paints it. Then, she travels up the tree painting every&nbsp;<b>B</b>-th node until she reaches the root.</li>
</ul>

<p>The&nbsp;<i>beauty</i>&nbsp;of the tree is equal to the number of nodes painted&nbsp;<i>at least once</i>&nbsp;by either Amadea or Bilva. Note that even if they both paint a node, it only counts once.</p>

<p>What is the&nbsp;<a href="https://en.wikipedia.org/wiki/Expected_value">expected</a>&nbsp;beauty of the tree?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the three integers&nbsp;<b>N</b>,&nbsp;<b>A</b>&nbsp;and&nbsp;<b>B</b>. The second line contains&nbsp;<b>N</b>-1 integers. The i-th integer is the parent of node i+1.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the expected beauty of the tree.</p>

<p><code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>A</b>&nbsp;&le;&nbsp;<b>N</b>.</li>
	<li>1 &le;&nbsp;<b>B</b>&nbsp;&le;&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>The trees for each sample case are shown in the diagram below.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7bd696a4-7a95-4ac6-a94c-6971bc153f2a/sample.svg" style="width: 900px; height: 348px;" /></p>

<p>A few example colourings for sample case #1 are shown below.</p>

<ul>
	<li>If Amadea picks node 5 and Bilva picks node 8, then together they paint 4 unique nodes: Amadea paints nodes 5 and 3, while Bilva paints nodes 8 and 1.</li>
	<li>If Amadea picks node 7 and Bilva picks node 6, then together they paint 3 unique nodes: Amadea paints nodes 7 and 1, while Bilva paints nodes 6 and 1 (note that Amadea painted node 1 as well).</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e40de001-61de-449a-9ee3-956eaf66e599/sample1.svg" style="width: 600px; height: 391px;" /></p>