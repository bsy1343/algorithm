# [Gold III] Pearl Pairing - 6173

[문제 링크](https://www.acmicpc.net/problem/6173)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 248, 정답: 91, 맞힌 사람: 73, 정답 비율: 33.641%

### 분류

자료 구조, 그리디 알고리즘, 애드 혹, 해 구성하기, 우선순위 큐

### 문제 설명

<p>At Bessie&#39;s recent birthday party, she received N (2 &lt;= N &lt;= 100,000; N%2 == 0) pearls, each painted one of C different colors (1 &lt;= C &lt;= N).</p>

<p>Upon observing that the number of pearls N is always even, her creative juices flowed and she decided to pair the pearls so that each pair of pearls has two different colors.</p>

<p>Knowing that such a set of pairings is always possible for the supplied testcases, help Bessie perform such a pairing. If there are multiple ways of creating a pairing, any solution suffices.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and C</li>
	<li>Lines 2..C + 1: Line i+1 tells the count of pearls with color i: C_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N/2: Line i contains two integers a_i and b_i indicating that Bessie can pair two pearls with respective colors a_i and b_i.</li>
</ul>

### 힌트

<p>Bessie pairs each pearl of color III with one of color I and II.</p>