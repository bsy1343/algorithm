# [Platinum III] Gridception - 27760

[문제 링크](https://www.acmicpc.net/problem/27760)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 많은 조건 분기, 플러드 필

### 문제 설명

<p>The master thief Jom Codd is able to infiltrate the dreams of others. Since dream-viewing technology is not very good yet, Codd sees a dream as a <i>dream grid</i> of unit cells, each of which is white or black.</p>

<p>Given a starting dream grid, Codd can <i>go deeper</i> by replacing each white cell with a 2x2 grid of white cells, and each black cell with a 2x2 grid of black cells; this creates a new dream grid that is four times larger. He can go deeper again from that grid, and so on. For example, given this starting dream grid:</p>

<pre>
<code>BBB
BWB
BBB</code></pre>

<p>then going deeper once produces this new dream grid:</p>

<pre>
<code>BBBBBB
BBBBBB
BBWWBB
BBWWBB
BBBBBB
BBBBBB</code></pre>

<p>and going deeper again produces this new dream grid:</p>

<pre>
<code>BBBBBBBBBBBB
BBBBBBBBBBBB
BBBBBBBBBBBB
BBBBBBBBBBBB
BBBBWWWWBBBB
BBBBWWWWBBBB
BBBBWWWWBBBB
BBBBWWWWBBBB
BBBBBBBBBBBB
BBBBBBBBBBBB
BBBBBBBBBBBB
BBBBBBBBBBBB</code></pre>

<p>and so on.</p>

<p>Codd has just infiltrated a dream and viewed its starting dream grid. He is on a very difficult mission, and he knows that he will need to go deeper many times. To help him navigate, he is looking at various <i>patterns</i> in the starting dream grid. A pattern consists of a single group of cells connected by shared edges (shared corners do not count as connections), plus their colors. A pattern might contain internal gaps (as long as the pattern&#39;s cells are a single connected group); such gaps are not considered part of the pattern. Two patterns are the same if and only if they have the same number and arrangement of cells (not reflected or rotated), with the same colors.</p>

<p>For example, in the grids above, the following 8-cell pattern is present in the starting grid:</p>

<pre>
<code>BBB
B B
BBB</code></pre>

<p>It is not present after going deeper once, but it is present after going deeper twice, and three times, and so on for every deeper dream grid.</p>

<p>Codd wants to find the largest pattern from the starting dream grid that will be present in at least a googol (10<sup>100</sup>) of deeper dream grids. For the given example, the pattern above is the largest such pattern. Even though it is not present after going deeper once, it is present in at least a googol of deeper levels. Other such patterns of smaller sizes also meet this condition, but there is no 9-cell pattern that does; the only such pattern would have to be identical to the entire starting dream grid, and that pattern will never show up in any deeper dream grid, let alone in a googol of them.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each begins with one line with two integers <b>R</b> and <b>C</b>: the numbers of rows and columns, respectively, in the dream grid. Each case continues with <b>R</b> more lines of <b>C</b> characters each; every such character is either <code>B</code> or <code>W</code>. These lines directly represent the dream grid.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the largest possible size of at least one pattern that meets Codd&#39;s requirements, as described above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
</ul>

### 힌트

<p>Sample Case #1 is the one described in the problem statement.</p>

<p>In Sample Case #2, one possible largest pattern is:</p>

<pre>
<code>BBB
WB</code></pre>

<p>Another equally large one is:</p>

<pre>
<code>BBB
W W</code></pre>

<p>In Sample Case #3, the entire starting dream grid is a largest pattern.</p>

<p>In Sample Case #4, note that the five <code>W</code>s would not form a valid pattern, because they are not connected. However, this is a largest pattern:</p>

<pre>
<code>WB
BW</code></pre>

<p>In Sample Case #5, the entire starting dream grid is a largest pattern. Note that even though this grid happens to be what Codd would get by going deeper starting from <code>BW</code>, that is irrelevant; Codd will never &quot;go shallower&quot;.</p>