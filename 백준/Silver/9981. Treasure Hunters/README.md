# [Silver III] Treasure Hunters - 9981

[문제 링크](https://www.acmicpc.net/problem/9981)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 20, 맞힌 사람: 17, 정답 비율: 68.000%

### 분류

구현, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>You&#39;ve been a treasure hunter for a long time. You&#39;re pretty good at disarming traps, sneaking past the natives, and generally getting the goods while leaving your skin intact. That stuff doesn&#39;t really worry you, but what really raises a sweat is after each expedition there are always very tense arguments about how to split up the loot. You&#39;ve worked with all kinds of characters and nobody ever agrees on what each piece of treasure is actually worth. You need to come up with a way of splitting the booty as fairly as possible.</p>

### 입력

<p>Input to this problem will consist of a (non-empty) series of up to 100 data sets. Each data set will be formatted according to the following description, and there will be no blank lines separating data sets.</p>

<p>A single data set has 5 components:</p>

<ol>
	<li>Start line - A single line, &quot;START&quot;</li>
	<li>Number of Treasures - A single line with a single integer, t, where 1 &lt;= t &lt;= 8, indicating the number of treasures.</li>
	<li>Number of Hunters - A single line with a single integer, h, where 1 &lt;= h &lt;= 6, indicating the number of treasure hunters.</li>
	<li>Treasure Value List - A series of h lines, one for each hunter in sequence (line 1 for hunter 1, line 2 for hunter 2, etc.). Each line contains a space-separated list of estimated treasure values for that hunter. The first estimate on each line is for treasure 1, the second is for treasure 2, etc., and an estimate for each treasure will appear for every hunter. Each estimate will be a positive integer strictly less than 10000.</li>
	<li>End line - A single line, &quot;END&quot;</li>
</ol>

### 출력

<p>For each input data set, there will be exactly one output set, and there will be exactly one blank line separating output sets.</p>

<p>Each output set consists of multiple lines, where each line represents a hunter (listed in the same order as the corresponding input data set). Each line contains a list of the treasures given to that hunter followed by the total perceived cash value (by that hunter), of all the treasures they receive. Treasures will be listed in ascending order by treasure number, and all values on each line will be space-separated.</p>

<p>Treasures will be divided among the hunters in the fairest way possible. The &quot;fairest&quot; way to divide the treasure is defined to be the distribution with the minimum difference between the highest perceived total value and the lowest perceived total value of treasures received by any hunter. In other words, find the distribution that minimizes the difference between the hunter that gets the &quot;most&quot; and the hunter that gets the &quot;least.&quot;</p>

<p>There will not be multiple &quot;fair&quot; distributions.</p>