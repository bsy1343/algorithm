# [Platinum I] Collecting Stamps 3 - 18433

[문제 링크](https://www.acmicpc.net/problem/18433)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 233, 정답: 104, 맞힌 사람: 89, 정답 비율: 47.090%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Republic of IOI, where JOI-kun lives, is famous for a large lake. Today, a stamp rally event takes place around the lake.</p>

<p>There are N types of stamps situated around the lake. These stamps are numbered from 1 to N, in clockwise order. The perimeter of the lake is L, and the i-th stamp (1 &le; i &le; N) is located at X<sub>i</sub> meters clockwise from the starting point of the stamp rally.</p>

<p>Each participant stands at the starting point of the stamp rally. After the rally starts, each participant can move around the lake, both clockwise and counter-clockwise. Each participant can collect the i-th stamp (1 &le; i &le; N) only if they arrive at where the i-th stamp is located within T<sub>i</sub> seconds (inclusive) since the rally starts.</p>

<p>JOI-kun is a participant of the stamp rally. He takes 1 second to move 1 meter. You can ignore all the other times which he takes.</p>

<p>Write a program that, given the number of types of stamps, the perimeter of the lake, where each stamp is located, and the time until which JOI-kun can collect each stamp, calculates the maximum number of types of stamps he can collect in total.</p>

### 입력

<p>Read the following data from the standard input. Given values are all integers.</p>

<pre>
N L
X<sub>1</sub> . . . X<sub>N</sub>
T<sub>1</sub> . . . T<sub>N</sub></pre>

### 출력

<p>Write the answer in one line to the standard output.</p>

### 제한

<ul>
	<li>1 &le; N &le; 200.</li>
	<li>2 &le; L &le; 1 000 000 000.</li>
	<li>1 &le; X<sub>i</sub> &lt; L (1 &le; i &le; N).</li>
	<li>X<sub>i</sub> &lt; X<sub>i+1</sub> (1 &le; i &le; N &minus; 1).</li>
	<li>0 &le; T<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; N).</li>
</ul>