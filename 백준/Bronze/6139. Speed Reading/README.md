# [Bronze II] Speed Reading - 6139

[문제 링크](https://www.acmicpc.net/problem/6139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 468, 정답: 303, 맞힌 사람: 266, 정답 비율: 66.667%

### 분류

수학, 구현, 시뮬레이션

### 문제 설명

<p>All K (1 &lt;= K &lt;= 1,000) of the cows are participating in Farmer John&#39;s annual reading contest. The competition consists of reading a single book with N (1 &lt;= N &lt;= 100,000) pages as fast as possible while understanding it.</p>

<p>Cow i has a reading speed S_i (1 &lt;= S_i &lt;= 100) pages per minute, a maximum consecutive reading time T_i (1 &lt;= T_i &lt;= 100) minutes, and a minimum rest time R_i (1 &lt;= R_i &lt;= 100) minutes. &nbsp;The cow can read at a rate of S_i pages per minute, but only for T_i minute sat a time. After she stops reading to rest, she must rest for R_i minutes before commencing reading again.</p>

<p>Determine the number of minutes (rounded up to the nearest full minute) that it will take for each cow to read the book.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and K</li>
	<li>Lines 2..K+1: Line i+1 contains three space-separated integers: S_i, T_i, and R_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..K: Line i should indicate how many minutes (rounded up to the nearest full minute) are required for cow i to read the whole book.</li>
</ul>

### 힌트

<p>The book has 10 pages; 3 cows are competing. The first cow reads at a rate of 2 pages per minute, can read for at most 4 minutes at a time, and must rest for 1 minute after reading. The second reads at a rate of 6 pages per minute, can read for at most 1 minute at a time, and must rest 5 minutes after reading. The last reads at a rate of 3 pages per minute, can read for at most 3 minutes at a time, and must rest for 3 minutes after reading.</p>

<p>The first cow can read 8 pages in 4 minutes, rest for 1 minute, and read the last 2 pages in a minute. The second reads 6 pages in a minute, rests for 5 minutes, and finishes in the next minute. The last reads 9 pages in 3 minutes, rests for 3 minutes, and finishes in the next minute.</p>