# [Silver V] Long Distance Racing - 6169

[문제 링크](https://www.acmicpc.net/problem/6169)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 291, 정답: 183, 맞힌 사람: 161, 정답 비율: 64.919%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Bessie is training for her next race by running on a path that includes hills so that she will be prepared for any terrain. She has planned a straight path and wants to run as far as she can -- but she must be back to the farm within M seconds (1 &lt;= M &lt;= 10,000,000).</p>

<p>The entire path she has chosen is T units (1 &lt;= T &lt;= 100,000) in length and consists of equal-length portions that are uphill, flat, or downhill. The input data describes path segment i with a single character S_i that is u, f, or d, indicating respectively uphill, flat, or downhill.</p>

<p>Bessie takes U seconds (1 &lt;= U &lt;= 100) to run one unit of uphill path, F (1 &lt;= F &lt;= 100) seconds for a unit of flat path, and D (1 &lt;= D &lt;= 100) seconds for a unit of downhill path. &nbsp;Note that, when returning home, uphill paths become downhill paths and downhill paths become uphill paths.</p>

<p>Find the farthest distance Bessie can get from the farm and still make it back in time.</p>

### 입력

<ul>
	<li>Line 1: Five space-separated integers: M, T, U, F, and D</li>
	<li>Lines 2..T+1: Line i+1 describes path segment i with a single letter: S_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the farthest distance (number of units) that Bessie can get from the farm and make it back in time.</li>
</ul>

<p>&nbsp;</p>