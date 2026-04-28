# [Platinum V] Ranking the Cows - 6232

[문제 링크](https://www.acmicpc.net/problem/6232)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 38, 맞힌 사람: 37, 정답 비율: 63.793%

### 분류

그래프 이론, 그래프 탐색, 최단 경로, 깊이 우선 탐색

### 문제 설명

<p>Each of Farmer John&#39;s N cows (1 &lt;= N &lt;= 1,000) produces milk at a different positive rate, and FJ would like to order his cows according to these rates from the fastest milk producer to the slowest.</p>

<p>FJ has already compared the milk output rate for M (1 &lt;= M &lt;= 10,000) pairs of cows. &nbsp;He wants to make a list of C additional pairs of cows such that, if he now compares those C pairs, he will definitely be able to deduce the correct ordering of all N cows. &nbsp;Please help him determine the minimum value of C for which such a list is possible.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..M+1: Two space-separated integers, respectively: X and Y. Both X and Y are in the range 1...N and describe a comparison where cow X was ranked higher than cow Y.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum value of C.</li>
</ul>

### 힌트

<p>FJ is comparing 5 cows and has already determined that cow 2 &gt; cow 1, cow 1 &gt; cow 5, cow 2 &gt; cow 3, cow 1 &gt; cow 4, and cow 3 &gt; cow 4 (where the &#39;&gt;&#39; notation means &quot;produces milk more quickly&quot;).</p>

<p>From the information in the 5 test results, Farmer John knows that since cow 2 &gt; cow 1 &gt; cow 5 and cow 2 &gt; cow 3 &gt; cow 4, cow 2 has the highest rank. However, he needs to know whether cow 1 &gt; cow 3 to determine the cow with the second highest rank. Also, he will need one more question to determine the ordering between cow 4 and cow 5. After that, he will need to know if cow 5 &gt; cow 3 if cow 1 has higher rank than cow 3. He will have to ask three questions in order to be sure he has the rankings: &quot;Is cow 1 &gt; cow 3? &nbsp;Is cow 4 &gt; cow 5? Is cow 5 &gt; cow 3?&quot;</p>