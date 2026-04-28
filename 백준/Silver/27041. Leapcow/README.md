# [Silver V] Leapcow - 27041

[문제 링크](https://www.acmicpc.net/problem/27041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 113, 정답: 85, 맞힌 사람: 70, 정답 비율: 74.468%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Like everyone else, the cows like to bury each other in sand while at the beach. On this beach, the cows are only buried on the integer coordinates of a one-dimensional number line. Bessie wants to travel from one end of the beach (i.e., coordinate 0) to the other end (coordinate E, 5 &le; E &le; 40,000) without stepping on any buried cows. Bessie travels only by leaps, each of which has some length in the range 1..L (3 &le; L &le; 50).</p>

<p>Given the locations (1..E-1) of the B (1 &le; B &le; 500) buried cows, figure out the least number of leaps Bessie can use to get from one side to the other. It is guaranteed that an answer exists.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: E, L, and B.</li>
	<li>Lines 2..B+1: Each line contains a single integer telling the coordinate of a buried cow.</li>
</ul>

### 출력

<p>A single line with an integer that is the smallest number of &quot;legal&quot; leaps that are required for Bessie to reach coordinate E.</p>

### 힌트

<p>A single line with an integer that is the smallest number of &quot;legal&quot; leaps that are required for Bessie to reach coordinate E.</p>

<p>Here&#39;s a diagram of the beach and leaps:</p>

<pre>
# # c c # #   &lt;--- cow denoted by &#39;c&#39;
0 1 2 3 4 5   &lt;--- location numbers
  1     2 3   &lt;--- where leaps 1, 2, and 3 end
</pre>