# [Gold II] Visiting Cows - 5934

[문제 링크](https://www.acmicpc.net/problem/5934)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 282, 정답: 186, 맞힌 사람: 175, 정답 비율: 67.050%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>After many weeks of hard work, Bessie is finally getting a vacation! Being the most social cow in the herd, she wishes to visit her N (1 &lt;= N &lt;= 50,000) cow friends conveniently numbered 1..N. The cows have set up quite an unusual road network with exactly N-1 roads connecting pairs of cows C1 and C2 (1 &lt;= C1 &lt;= N; 1 &lt;= C2 &lt;= N; C1 != C2) in such a way that there exists a unique path of roads between any two cows.</p>

<p>FJ wants Bessie to come back to the farm soon; thus, he has instructed Bessie that if two cows are directly connected by a road, she may not visit them both. Of course, Bessie would like her vacation to be as long as possible, so she would like to determine the maximum number of cows she can visit.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N: Each line describes a single road with two space-separated integers: C1 and C2</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the maximum number of cows that Bessie can visit.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Bessie knows 7 cows. Cows 6 and 2 are directly connected by a road, as are cows 3 and 4, cows 2 and 3, etc. The illustration below depicts the roads that connect the cows:</p>

<pre>
                       1--2--3--4
                          |
                       5--6--7</pre>

<p>Bessie can visit four cows. The best combinations include two cows on the top row and two on the bottom. She can&#39;t visit cow 6 since that would preclude visiting cows 5 and 7; thus she visits 5 and 7. She can also visit two cows on the top row: {1,3}, {1,4}, or {2,4}.</p>

<p>&nbsp;</p>