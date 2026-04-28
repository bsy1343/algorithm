# [Platinum IV] Cow Photography - 5914

[문제 링크](https://www.acmicpc.net/problem/5914)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 330, 정답: 164, 맞힌 사람: 134, 정답 비율: 54.251%

### 분류

정렬

### 문제 설명

<p>The cows are in a particularly mischievous mood today! All Farmer John wants to do is take a photograph of the cows standing in a line, but they keep moving right before he has a chance to snap the picture.</p>

<p>Specifically, each of FJ&#39;s N (1 &lt;= N &lt;= 20,000) cows has a unique integer ID number. FJ wants to take a picture of the cows standing in a line in a very specific ordering, represented by the contents of an array A[1...N], where A[j] gives the ID number of the jth cow in the ordering. He arranges the cows in this order, but just before he can press the button on his camera to snap the picture, a group of zero or more cows (not necessarily a contiguous group) moves to a set of new positions in the lineup. More precisely, a group of zero or more cows steps away from the line, with the remaining cows shifting over to close the resulting gaps in the lineup. The cows who stepped away then re-insert themselves at different positions in the lineup (not necessarily at the locations they originally occupied). Frustrated but not deterred, FJ again arranges his cows according to the ordering in A, but again, right before he can snap a picture, a different group of zero or more cows moves to a set of new positions in the lineup.</p>

<p>The process above repeats for a total of five photographs before FJ gives up. Given the contents of each photograph, see if you can reconstruct the original intended ordering A. Each photograph shows an ordering of the cows that differs from A in that some group of zero or more cows has moved. However, a cow only moves in at most one photograph: if a cow is part of the group that moves in one photograph, she will not actively move in any of the other four photographs (although she could end up at a different index as a consequence of other cows around her moving, of course).</p>

### 입력

<ul>
	<li>Line 1: The number of cows, N (1 &lt;= N &lt;= 20,000).</li>
	<li>Lines 2..5N+1: The next 5N lines describe five orderings, each one a block of N contiguous lines. Each line contains the ID of a cow, an integer in the range 0...1,000,000,000.</li>
</ul>

### 출력

<ul>
	<li>Lines 1..N: The intended ordering A, one ID per line.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>There are 5 cows, with IDs 10, 20, 30, 40, and 50. In each of the 5 photos, a different cow moves to the front of the line (at most one cow moves in each photo here, but it is possible in other inputs that multiple cows could move in a particular photo).</p>

<h4>Output Details</h4>

<p>The correct original ordering A[1..5] is 10, 20, 30, 40, 50.</p>

<p> </p>