# [Silver II] The Eating Puzzle - 6211

[문제 링크](https://www.acmicpc.net/problem/6211)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 479, 정답: 330, 맞힌 사람: 285, 정답 비율: 71.072%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Bessie is on a diet where she can eat no more than C (10 &lt;= C &lt;= 35,000) calories per day. Farmer John is teasing her by putting out B (1 &lt;= B &lt;= 21) buckets of feed, each with some (potentially non-unique) number of calories (range: 1..35,000). Bessie has no self-control: once she starts on a feed bucket, she consumes all of it.</p>

<p>Bessie is not so good at combinatorics. Determine the optimal combination of feed buckets that gives Bessie as many calories without exceeding the limit C.</p>

<p>As an example, consider a limit of 40 calories and 6 buckets with 7, 13, 17, 19, 29, and 31 calories. Bessie could eat 7 + 31 = 38 calories but could eat even more by consuming three buckets: 7 + 13 + 19 = 39 calories. She can find no better combination.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: C and B</li>
	<li>Line 2: B space-separated integers that respectively name the number of calories in bucket 1, 2, etc.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single line with a single integer that is largest number of calories Bessie can consume and still stay on her diet.</li>
</ul>