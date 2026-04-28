# [Gold I] Sunscreen - 6134

[문제 링크](https://www.acmicpc.net/problem/6134)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 126, 정답: 65, 맞힌 사람: 52, 정답 비율: 53.608%

### 분류

그리디 알고리즘

### 문제 설명

<p>To avoid unsightly burns while tanning, each of the C (1 &lt;= C &lt;= 2500) cows must cover her hide with sunscreen when they&#39;re at the beach. Cow i has a minimum and maximum SPF rating (1 &lt;= minSPF_i &lt;= 1,000; minSPF_i &lt;= maxSPF_i &lt;= 1,000) that will work. If the SPF rating is too low, the cow suffers sunburn; if the SPF rating is too high, the cow doesn&#39;t tan at all.</p>

<p>The cows have a picnic basket with L (1 &lt;= L &lt;= 2500) bottles of sunscreen lotion, each bottle i with an SPF rating SPF_i (1 &lt;= SPF_i &lt;= 1,000). Lotion bottle i can cover cover_i cows with lotion. A cow may lotion from only one bottle.</p>

<p>What is the maximum number of cows that can protect themselves while tanning given the available lotions?</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: C and L</li>
	<li>Lines 2..C+1: Line i describes cow i&#39;s lotion requires with two integers: minSPF_i and maxSPF_i</li>
	<li>Lines C+2..C+L+1: Line i+C+1 describes a sunscreen lotion bottle i with space-separated integers: SPF_i and cover_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<p>A single line with an integer that is the maximum number of cows that can be protected while tanning</p>