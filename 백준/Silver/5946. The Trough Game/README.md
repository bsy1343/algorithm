# [Silver I] The Trough Game - 5946

[문제 링크](https://www.acmicpc.net/problem/5946)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 154, 정답: 87, 맞힌 사람: 77, 정답 비율: 61.600%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>Farmer John and Bessie are playing games again. This one has to do with troughs of water.</p>

<p>Farmer John has hidden N (1 &lt;= N &lt;= 20) troughs behind the barn, and has filled some of them with food. Bessie has asked M (1 &lt;= M &lt;= 100) questions of the form, &quot;How many troughs from this list (which she recites) are filled?&quot;.</p>

<p>Bessie needs your help to deduce which troughs are actually filled.</p>

<p>Consider an example with four troughs where Bessie has asked these questions (and received the indicated answers):</p>

<pre>
    1) &quot;How many of these troughs are filled: trough 1&quot;
       --&gt;  1 trough is filled

    2) &quot;How many of these troughs are filled: troughs 2 and 3&quot;
       --&gt;  1 trough is filled

    3) &quot;How many of these troughs are filled: troughs 1 and 4&quot;
       --&gt;  1 trough is filled

    4) &quot;How many of these troughs are filled: troughs 3 and 4&quot;
       --&gt;  1 trough is filled</pre>

<ul>
	<li>From question 1, we know trough 1 is filled.</li>
	<li>From question 3, we then know trough 4 is empty.</li>
	<li>From question 4, we then know that trough 3 is filled.</li>
	<li>From question 2, we then know that trough 2 is empty.</li>
</ul>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..M+1: A subset of troughs, specified as a sequence of contiguous N 0&#39;s and 1&#39;s, followed by a single integer that is the number of troughs in the specified subset that are filled.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single line with:
	<ul>
		<li>The string &quot;IMPOSSIBLE&quot; if there is no possible set of filled troughs compatible with Farmer John&#39;s answers.</li>
		<li>The string &quot;NOT UNIQUE&quot; if Bessie cannot determine from the given data exactly what troughs are filled.</li>
		<li>Otherwise, a sequence of contiguous N 0&#39;s and 1&#39;s specifying which troughs are filled.</li>
	</ul>
	</li>
</ul>

<p>&nbsp;</p>