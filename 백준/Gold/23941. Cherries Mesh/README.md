# [Gold II] Cherries Mesh - 23941

[문제 링크](https://www.acmicpc.net/problem/23941)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 64, 정답: 39, 맞힌 사람: 37, 정답 비율: 71.154%

### 분류

자료 구조, 분리 집합, 그래프 이론, 최소 스패닝 트리, 트리

### 문제 설명

<p>Your friend is recently done with cooking class and now he wants to boast in front of his school friends by making a nice dessert. He has come up with an amazing dessert called Cherries Mesh. To make the dish, he has already collected cherries numbered 1 to&nbsp;<b>N</b>. He has also decided to connect each distinct and unordered pair of cherries with a sweet strand, made of sugar. Sweet strands are either red or black, depending on the sugar content in them. Each black strand contains one units of sugar, and each red strand contains two units of sugar.</p>

<p>But it turns out that the dessert is now too sweet, and these days his school friends are dieting and they usually like dishes with less sugar. He is really confused now and comes to your rescue. Can you help him find out which all sweet strands he should remove such that each pair of cherries is connected directly or indirectly via a sugar strand, and the dish has the minimum possible sugar content?</p>

### 입력

<p>The first line of input gives the number of test cases,&nbsp;<b>T</b>.</p>

<p>Each test case begins with a line containing two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>M</b>, the number of cherries and the number of&nbsp;<i>black</i>&nbsp;sweet strands, respectively.</p>

<p>Then&nbsp;<b>M</b>&nbsp;lines follow, each describing a pair of cherries connected to a black strand. The i-th line contains cherries numbered&nbsp;<b>C<sub>i</sub></b>&nbsp;and&nbsp;<b>D<sub>i</sub></b>, it indicates that&nbsp;<b>C<sub>i</sub></b>&nbsp;and&nbsp;<b>D<sub>i</sub></b>&nbsp;cherry are connected with a black strand of sugar.</p>

<p>Note: Any other pair of cherries not present in the input means that they are connected by a red strand.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is minimum possible sugar content.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100</li>
	<li><b>M</b>&nbsp;&le;&nbsp;<b>N*(N-1)/2</b></li>
	<li>1 &le;&nbsp;<b>C<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
	<li>1 &le;&nbsp;<b>D<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
	<li><b>C<sub>i</sub></b>&nbsp;&ne;&nbsp;<b>D<sub>i</sub></b>, for all i.</li>
	<li>Every {<b>C<sub>i</sub></b>,&nbsp;<b>D<sub>i</sub></b>} is distinct.</li>
</ul>

### 힌트

<p>In the first sample case, there are two cherries and they are connected with a black strand. Removing any of the strand causes cherries to get disconnected. Hence, the minimum sugar content is 1.</p>

<p>n the second sample case, we can keep the black strand between cherry numbered 2 and cherry numbered 3, and remove any of the red strands, which leads to a minimum sugar content of 3.</p>