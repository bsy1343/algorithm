# [Gold IV] Lightning Rod - 19691

[문제 링크](https://www.acmicpc.net/problem/19691)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 10, 맞힌 사람: 9, 정답 비율: 33.333%

### 분류

그리디 알고리즘, 정렬, 기하학

### 문제 설명

<p>Singapore has anywhere between 171 and 186 lightning days on average a year. Each square kilometer of land in Singapore can be struck up to 16 times annually. This makes Singapore one of the lightning capitals of the world.</p>

<p>Gug the architect surveys N buildings from left to right, and notices that the top of building i, from left to right, has coordinates (X<sub>i</sub>, Y<sub>i</sub>). Gug wants to protect all the buildings by planting lightning rods on top of some buildings. A lightning rod protects the building it is planted on, and all buildings that lie on or under the 45<sup>◦</sup> line of depression leftwards and rightwards. In other words, a lightning rod on building i protects building j if and only if |X<sub>i</sub> &minus; X<sub>j</sub>| &le; Yi &minus; Y<sub>j</sub>.</p>

<p>Help Gug find out the minimum number of lightning rods required to protect all buildings.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The input starts with a single integer, N, in a single line. N denotes the total number of buildings.</p>

<p>N lines will then follow with 2 integers each, the i<sup>th</sup> line will contain X<sub>i</sub> and Y<sub>i</sub>. This indicates that the peak of the i<sup>th</sup> building is at (X<sub>i</sub>, Y<sub>i</sub>). You can assume X<sub>i</sub> &le; X<sub>i+1</sub>, in other words, X<sub>i</sub> is increasing.</p>

<p>Note: The input size is extremely large, so it is only possible to obtain full credit using C++ fast input. The submit page consists of a template that uses C++ fast input to read from standard input.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>Output a single integer, denoting the minimum number of lightning rods required to protect all buildings.</p>

### 제한

<ul>
	<li>2 &le; N &le; 10 000 000</li>
	<li>0 &le; X<sub>i</sub>, Y<sub>i</sub> &le; 10<sup>9</sup></li>
</ul>