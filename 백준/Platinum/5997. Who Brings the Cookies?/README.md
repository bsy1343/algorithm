# [Platinum III] Who Brings the Cookies? - 5997

[문제 링크](https://www.acmicpc.net/problem/5997)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 31, 맞힌 사람: 29, 정답 비율: 85.294%

### 분류

그래프 이론, 최대 유량, 이분 매칭

### 문제 설명

<p>Farmer John&#39;s N (1 &lt;= N &lt;= 1,000) cows conveniently numbered 1..N decided to form M (1 &lt;= M &lt;= 100) study groups. A total of S_i (1 &lt;= S_i &lt;= 19) cows study in group G_i (namely cows G_i1, G_i2, ...). A cow might study in more than one study group.</p>

<p>For each study group, one cow in the group must be chosen to bring cookies to the meeting. Cookies are costly and require time to acquire, so the cows want to divide the work of bringing cookies as fairly as possible.</p>

<p>They decided that if a cow attends meetings with size c_1, c_2, ..., c_K, she is only willing to bring cookies to at most ceil(1/c_1 + 1/c_2 + ... + 1/c_K) meetings.</p>

<p>Figure out which cow brings cookies to each meeting. If this isn&#39;t possible, just output &quot;-1&quot;. Choose any solution if more than one is possible.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..M+1: Line i+1 contains many space-separated integers: S_i, G_i1, G_i2, ...</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..M: If a mapping is possible, line i contains the number of the cow who brings cookies to study group i. Otherwise, line 1 contains just the integer -1.</li>
</ul>

### 힌트

<p>Cow1 can bring cookies to at most 2 meetings, cow2 can bring 2, cow3 can bring 2, cow4 can bring 1, and cow5 can bring 1.</p>