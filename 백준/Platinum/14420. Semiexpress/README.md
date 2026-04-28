# [Platinum III] Semiexpress - 14420

[문제 링크](https://www.acmicpc.net/problem/14420)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 117, 정답: 82, 맞힌 사람: 71, 정답 비율: 68.932%

### 분류

수학, 구현, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>The JOI Railways is the only railway company in the Kingdom of JOI. There are N stations numbered from 1 to N along a railway. Currently, two kinds of trains are operated; one is express and the other one is local.</p>

<p>A local train stops at every station. For each i (1 &le;&nbsp; i &lt; N), by a local train, it takes A minutes from the station i to the station (i + 1).</p>

<p>An express train stops only at the stations S<sub>1</sub>, S<sub>2</sub>, ..., S<sub>M</sub> (1 = S<sub>1</sub> &lt; S<sub>2</sub> &lt; ...&nbsp;&lt; S<sub>M </sub>= N). For each i (1 &le; i &lt; N), by an express train, it takes B minutes from the station i to the station (i + 1).</p>

<p>The JOI Railways plans to operate another kind of trains called &ldquo;semiexpress.&rdquo; For each i (1 i &lt; N), by a semiexpress train, it takes C minutes from the station i to the station (i + 1). The stops of semiexpress trains are not yet determined. But they must satisfy the following conditions:</p>

<ul>
	<li>Semiexpress trains must stop at every station where express trains stop.</li>
	<li>Semiexpress trains must stop at K stations exactly.</li>
</ul>

<p>The JOI Railways wants to maximize the number of stations (except for the station 1) to which we can travel from the station 1 within T minutes. The JOI Railways plans to determine the stops of semiexpress trains so that this number is maximized. We do not count the standing time of trains.</p>

<p>When we travel from the station 1 to another station, we can take trains only to the direction where the numbers of stations increase. If several kinds of trains stop at the station i (2 ≦ i ≦ N&nbsp;- 1), you can transfer between any trains which stop at that station.</p>

<p>When the stops of semiexpress trains are determined appropriately, what is the maximum number of stations (except for the station 1) to which we can travel from the station 1 within T minutes?</p>

<p>Given the number of stations of the JOI Railways, the stops of express trains, the speeds of the trains, and maximum travel time, write a program which calculates the maximum number of stations which satisfy the condition on the travel time.</p>

### 입력

<p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of input contains three space separated integers N, M, K. This means there are N stations of the JOI Railways, an express train stops at M stations, and a semiexpress train stops at K stations,</li>
	<li>The second line of input contains three space separated integers A, B, C. This means it takes A, B, C minutes by a local, express, semiexpress train to travel from a station to the next station, respectively.</li>
	<li>The third line of input contains an integer T. This means the JOI Railways wants to maximize the number of stations (except for the station 1) to which we can travel from the station 1 within T minutes.</li>
	<li>The i-th line (1 ≦ i ≦ M) of the following M lines contains an integer S<sub>i</sub>. This means an express train stops<br />
	at the station S<sub>i</sub>.</li>
</ul>

### 출력

<p>Write one line to the standard output. The output contains the maximum number of stations satisfying the condition on the travel time.</p>

### 제한

<p>All input data satisfy the following conditions.</p>

<ul>
	<li>2&nbsp; &le; N &le; 1 000 000 000.</li>
	<li>2 &le; M &le; K &le; 3 000.</li>
	<li>K &le; N.</li>
	<li>1 &le; B &lt; C &lt; A &le; 1 000 000 000.</li>
	<li>1 &le; T &le; 10<sup>18</sup>.</li>
	<li>1 = S<sub>1</sub> &lt; S<sub>2</sub> &lt; ... &lt; S<sub>M </sub>= N.</li>
</ul>