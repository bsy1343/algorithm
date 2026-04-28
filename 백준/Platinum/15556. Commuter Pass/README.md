# [Platinum I] Commuter Pass - 15556

[문제 링크](https://www.acmicpc.net/problem/15556)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 288, 정답: 139, 맞힌 사람: 119, 정답 비율: 48.571%

### 분류

다이나믹 프로그래밍, 그래프 이론, 최단 경로, 데이크스트라, 방향 비순환 그래프

### 문제 설명

<p>JOI-kun is living in a city with N stations. The stations are numbered from 1 to N. There are M railways numbered from 1 to M. The railway i (1 &le; i &le; M) connects the station A<sub>i</sub> and the station B<sub>i</sub> in both directions, and the fare is C<sub>i</sub> yen.</p>

<p>JOI-kun is living near the station S, and goes to the IOI high school near the station T. He is planning to buy a commuter pass connecting these two stations. When he buys a commuter pass, he needs to choose a route between the station S and the station T with minimum cost. Using this commuter pass, he can take any railways contained in a chosen route in any directions without additional costs.</p>

<p>JOI-kun often goes to bookstores near the station U and the station V. Therefore, he wants to buy a commuter pass so that the cost from the station U to the station V is minimized.</p>

<p>When he moves from the station U to the station V, he first choose a route from the station U to the station V. Then the fare he has to pay is</p>

<ul>
	<li>0 yen if the railway i is contained in a route chosen when he buys a commuter pass, or</li>
	<li>C<sub>i</sub> yen if the railway i is not contained in a route chosen when he buys a commuter pass.</li>
</ul>

<p>The sum of the above fare is the cost from the station U to the station V.</p>

<p>He wants to know the minimum cost from the station U to the station V if he chooses a route appropriately when he buys a commuter pass.</p>

<p>Write a program which calculates the minimum cost from the station U to the station V if he chooses a route appropriately when he buys a commuter pass.</p>

### 입력

<p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of input contains two space separated integers N, M. This means the city JOI-kun lives in has N stations and M railways.</li>
	<li>The second line contains two space separated integers S, T. This means JOI-kun is planning to buy a commuter pass from the station S to the station T.</li>
	<li>The third line contains two space separated integers U, V. This means JOI-kun wants to minimize the cost from the station U to the station V.</li>
	<li>The i-th line (1 &le; i &le; M) of the following M lines contains three space separated integers A<sub>i</sub>, B<sub>i</sub>, C<sub>i</sub>. The railway i connects the station A<sub>i</sub> and the station B<sub>i</sub> in both directions, and the fare is C<sub>i</sub> yen.</li>
</ul>

### 출력

<p>Write one line to the standard output. The output should contain the minimum cost from the station U to the station V if he chooses a route appropriately when he buys a commuter pass.</p>

### 제한

<ul>
	<li>2 &le; N &le; 100 000.</li>
	<li>1 &le; M &le; 200 000.</li>
	<li>1 &le; S &le; N.</li>
	<li>1 &le; T &le; N.</li>
	<li>1 &le; U &le; N.</li>
	<li>1 &le; V &le; N.</li>
	<li>S &ne; T.</li>
	<li>U &ne; V.</li>
	<li>S &ne; U or T &ne; V.</li>
	<li>JOI-kun can move from any stations to any other stations taking railways.</li>
	<li>1 &le; A<sub>i</sub> &lt; B<sub>i</sub> &le; N (1 &le; i &le; M).</li>
	<li>For every 1 &le; i &lt; j &le; M, either A<sub>i</sub> &ne; A<sub>j</sub> or B<sub>i</sub> &ne; B<sub>j</sub>.</li>
	<li>1 &le; C<sub>i</sub> &le; 1 000 000 000 (1 &le; i &le; M).</li>
</ul>