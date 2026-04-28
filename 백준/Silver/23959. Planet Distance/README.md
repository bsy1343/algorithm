# [Silver I] Planet Distance - 23959

[문제 링크](https://www.acmicpc.net/problem/23959)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 26, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>There are&nbsp;<b>N</b>&nbsp;planets in the universe, and Google&#39;s Space division has installed&nbsp;<b>N</b>&nbsp;vacuum tubes through which you can travel from one planet to another. The tubes are bidirectional; travelers may use a tube between two planets to travel from either of those planets to the other. Each vacuum tube connects two planets and no two vacuum tubes connect the same pair of planets. These tubes connect the planets such that it is possible to travel from any planet to any other planet using one or more of them. Some of these tubes are connected such that there exists exactly one cycle in the universe. Google has hidden gifts in all the planets that are part of this cycle. Now, Google wants to know how far away each of the planets in the universe is from the gifts.</p>

<p>Your task is to find the minimum distance (in terms of the number of vacuum tubes) between each planet and a planet that is part of the cycle. Planets that are part of the cycle are assumed to be at distance 0.</p>

### 입력

<p>The first line contains an integer&nbsp;<b>T</b>, the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case contains an integer&nbsp;<b>N</b>, the number of planets and vacuum tubes. The planets are numbered from 1 to&nbsp;<b>N</b>.</p>

<p><b>N</b>&nbsp;lines follow, the i-th of these lines contains two integers&nbsp;<b>x<sub>i</sub></b>&nbsp;and&nbsp;<b>y<sub>i</sub></b>, indicating that the i-th vacuum tube connects planet&nbsp;<b>x<sub>i</sub></b>&nbsp;and planet&nbsp;<b>y<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a list of&nbsp;<b>N</b>&nbsp;space-separated values in which the i-th value represents the minimum distance between the i-th planet and a planet in the cycle.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>x<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
	<li>1 &le;&nbsp;<b>y<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
	<li><b>x<sub>i</sub></b>&nbsp;&ne;&nbsp;<b>y<sub>i</sub></b>, for all i.</li>
	<li>(<b>x<sub>i</sub></b>,&nbsp;<b>y<sub>i</sub></b>) &ne; (<b>x<sub>j</sub></b>,&nbsp;<b>y<sub>j</sub></b>), for all i &ne; j.</li>
	<li>The graph in which planets are nodes and tubes are edges is connected and has exactly one cycle.</li>
</ul>

### 힌트

<p>In Sample Case #1, the cycle consists of planets 2, 3, and 4. Therefore, the distances for planets 2, 3, and 4 are 0. There is a vacuum tube between 1 and 2, and another vacuum tube between 3 and 5. Thus, planets 1 and 5 are at a distance 1 from the cycle.</p>

<p>In Sample Case #2, all the planets are part of the cycle. Hence, their distances are 0.</p>