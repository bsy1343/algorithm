# [Gold I] Tallest Cow - 6217

[문제 링크](https://www.acmicpc.net/problem/6217)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 209, 정답: 70, 맞힌 사람: 63, 정답 비율: 36.000%

### 분류

애드 혹, 누적 합

### 문제 설명

<p>FJ&#39;s N (1 &lt;= N &lt;= 10,000) cows conveniently indexed 1..N are standing in a line. &nbsp;Each cow has a positive integer height (which is a bit of secret). You are told only the height H (1 &lt;= H &lt;= 1,000,000) of the tallest cow along with the index I of that cow.</p>

<p>FJ has made &nbsp;a list of R (0 &lt;= R &lt;= 10,000) lines of the form &quot;cow 17 sees cow 34&quot;. This means that cow 34 is at least as tall as cow 17, and that every cow between 17 and 34 has a height that is strictly smaller than that of cow 17.</p>

<p>For each cow from 1..N, determine its maximum possible height, such that all of the information given is still correct. It is guaranteed that it is possible to satisfy all the constraints.</p>

### 입력

<ul>
	<li>Line 1: Four space-separated integers: N, I, H and R</li>
	<li>Lines 2..R+1: Two distinct space-separated integers A and B (1 &lt;= A, B &lt;= N), indicating that cow A can see cow B.</li>
</ul>

### 출력

<ul>
	<li>Lines 1..N: Line i contains the maximum possible height of cow i.</li>
</ul>