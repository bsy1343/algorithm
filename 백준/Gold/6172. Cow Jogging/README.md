# [Gold I] Cow Jogging - 6172

[문제 링크](https://www.acmicpc.net/problem/6172)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 43, 맞힌 사람: 33, 정답 비율: 76.744%

### 분류

그래프 이론, 데이크스트라, 방향 비순환 그래프

### 문제 설명

<p>Bessie has taken heed of the evils of sloth and has decided to get fit by jogging from the barn to the pond several times a week. She doesn&#39;t want to work too hard, of course, so she only plans to jog downhill to the pond and then amble back to the barn at her leisure.</p>

<p>Bessie also doesn&#39;t want to jog any too far either, so she generally takes the shortest sequence of cow paths to get to the pond. Each of the M (1 &lt;= M &lt;= 10,000) cow paths connects two pastures conveniently numbered 1..N (1 &lt;= N &lt;= 1000). Even more conveniently, the pastures are numbered such that if X&gt;Y then the cow path from pasture X to pasture Y runs downhill. Pasture N is the barn (at the top of the hill) and pasture 1 is the pond (at the bottom).</p>

<p>Just a week into her regimen, Bessie has begun to tire of always taking the same route to get to the pond. She would like to vary her route by taking different cow paths on different days. Specifically, Bessie would like to take exactly K (1 &lt;= K &lt;= 100) different routes for variety. To avoid too much exertion, she wants these to be the K shortest routes from the barn to the pond. Two routes are considered different if they comprise different sequences of cow paths.</p>

<p>Help Bessie determine how strenuous her workout will be by determining the lengths of each of the K shortest routes on the network of pastures. You will be supplied a list of downhill cow paths from X_i to Y_i along with the cow path&#39;s length: (X_i, Y_i, D_i) where (1 &lt;= Y_i &lt; X_i; Y_i &lt; X_i &lt;= N). Cowpath i has length D_i (1 &lt;= D_i &lt;= 1,000,000).</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, M, and K</li>
	<li>Lines 2..M+1: Line i+1 describes a downhill cow path using three space-separated integers: X_i, Y_i, and D_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..K: Line i contains the length of the i-th shortest route or -1 if no such route exists. If a shortest route length occurs multiple times, be sure to list it multiple times in the output.</li>
</ul>

### 힌트

<p>The routes are (5-1), (5-3-1), (5-2-1), (5-3-2-1), (5-4-3-1), (5-4-3-2-1).</p>