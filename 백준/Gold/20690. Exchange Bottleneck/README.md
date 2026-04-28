# [Gold II] Exchange Bottleneck - 20690

[문제 링크](https://www.acmicpc.net/problem/20690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 54, 맞힌 사람: 45, 정답 비율: 51.724%

### 분류

그래프 이론, 애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>The country of Bazbesonin currently has N cities (numbered from 1 to N) connected by bidirectional roads. When a pair of cities, u and v, would like to exchange a message, the latency is defined as the minimum number of roads required to go from u to v.</p>

<p>These cities have a long history in the past. Initially, city 1 is constructed in the middle of Bazbesonin. Thereafter, the rest of the cities are constructed one after another from city 2 to city N. When constructing city x, one or more bidirectional roads were also constructed depending on the economic condition of Bazbesonin at that time.</p>

<ul>
	<li>If city x was constructed when the economy was good, the roads connecting city x and all cities constructed previously were constructed. In other words, the roads connecting city x and city y were constructed, for all 1 &le; y &lt; x.</li>
	<li>If city x was constructed when the economy was bad, only the road connecting city x and city x &minus; 1 was constructed.</li>
</ul>

<p>The economic condition of Bazbesonin is represented by the binary array E<sub>1...N&minus;1</sub>. If the economy was good when city x was constructed, then the value of E<sub>x&minus;1</sub> is 1. Otherwise, the value of E<sub>x&minus;1</sub> is 0.</p>

<p>Back to the present day, each of the N cities would like to exchanges a message with every other city. The bottleneck of the exchange is the maximum latency among all pairs of cities. We would like to compute the bottleneck of the message exchange.</p>

<p>For example, let N = 5 and B<sub>1...4</sub> = [1, 0, 1, 0]. The cities and roads in Bazbesonin can be illustrated by the following figure:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20690.%E2%80%85Exchange%E2%80%85Bottleneck/d2414268.png" data-original-src="https://upload.acmicpc.net/95ff3402-5fc9-4bf2-817b-583c7dbe1104/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 124px;" /></p>

<ul>
	<li>The latency of city 1 and city 2 is 1.</li>
	<li>The latency of city 1 and city 3 is 2.</li>
	<li>The latency of city 1 and city 4 is 1.</li>
	<li>The latency of city 1 and city 5 is 2.</li>
	<li>The latency of city 2 and city 3 is 1.</li>
	<li>The latency of city 2 and city 4 is 1.</li>
	<li>The latency of city 2 and city 5 is 2.</li>
	<li>The latency of city 3 and city 4 is 1.</li>
	<li>The latency of city 3 and city 5 is 2.</li>
	<li>The latency of city 4 and city 5 is 1.</li>
</ul>

<p>Therefore, the bottleneck in this example is 2.</p>

### 입력

<p>Input begins with a line containing an integer: N (2 &le; N &le; 100 000) representing the number of cities in Bazbesonin. The next line contains N &minus; 1 integers: E<sub>i</sub> (E<sub>i</sub> &isin; {0, 1}) representing the economic condition of Bazbesonin.</p>

### 출력

<p>Output in a line an integer representing the bottleneck of the message exchange.</p>