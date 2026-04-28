# [Silver V] Exploration - 6138

[문제 링크](https://www.acmicpc.net/problem/6138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 277, 정답: 163, 맞힌 사람: 134, 정답 비율: 62.617%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>Bessie is traveling on a road teeming with interesting landmarks. The road is labeled just like a number line, and Bessie starts at the &quot;origin&quot; (x = 0). A total of N (1 &lt;= N &lt;= 50,000) landmarks are located at points x_1, x_2, ..., x_N &nbsp;(-100,000 &lt;= x_i &lt;= 100,000). Bessie wants to visit as many landmarks as possible before sundown, which occurs in T (1 &lt;= T &lt;= 1,000,000,000) minutes. She travels 1 distance unit in 1 minute.</p>

<p>Bessie will visit the landmarks in a particular order. Since the landmarks closer to the origin are more important to Farmer John, she always heads for the unvisited landmark closest to the origin. No two landmarks will be the same distance away from the origin.</p>

<p>Help Bessie determine the maximum number of landmarks she can visit before the day ends.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: T and N</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer that is the location of the ith landmark: x_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The maximum number of landmarks Bessie can visit.</li>
</ul>