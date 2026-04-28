# [Gold IV] Big Square - 6199

[문제 링크](https://www.acmicpc.net/problem/6199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 153, 정답: 57, 맞힌 사람: 47, 정답 비율: 34.815%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>Farmer John&#39;s cows have entered into a competition with Farmer Bob&#39;s cows. They have drawn lines on the field so it is a square grid with NxN points (2 &lt;= N &lt;= 100), and each cow of the two herds has positioned herself exactly on a gridpoint. Of course, no two cows can stand in the same gridpoint. &nbsp;The goal of each herd is to form the largest square (not necessarily parallel to the gridlines) whose corners are formed by cows from that herd.</p>

<p>All the cows have been placed except for Farmer John&#39;s cow Bessie. Determine the area of the largest square that Farmer John&#39;s cows can form once Bessie is placed on the field (the largest square might not necessarily contain Bessie).</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Line i+1 describes line i of the field with N characters. The characters are: &#39;J&#39; for a Farmer John cow, &#39;B&#39; for a Farmer Bob cow, and &#39;*&#39; for an unoccupied square. There will always be at least one unoccupied gridpoint.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The area of the largest square that Farmer John&#39;s cows can form, or 0 if they cannot form any square.</li>
</ul>

### 힌트

<p>If Bessie could go where Farmer Bob&#39;s cow is, a square of area 8 would be formed. However, cows cannot share a grid-point, so she must go in row 3, column 3 to complete the top-left square of area 4.</p>