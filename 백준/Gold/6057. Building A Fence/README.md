# [Gold III] Building A Fence - 6057

[문제 링크](https://www.acmicpc.net/problem/6057)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 41, 맞힌 사람: 37, 정답 비율: 67.273%

### 분류

수학, 다이나믹 프로그래밍, 브루트포스 알고리즘

### 문제 설명

<p>Industrious Farmer John wants a build a four-sided fence to enclose the cows. He has one plank of wood of integer length N (4 &lt;= N &lt;= 2,500) that he wants to cut at three points to make four integer-length pieces.</p>

<p>The four pieces can be of any positive integer length as long as Farmer John can form a quadrilateral fence with them. How many different ways can he cut the plank of wood so that he can make a complete fence?</p>

<p>NOTES:</p>

<ul>
	<li>Two ways of cutting are different if one has a cut at a spot that the other doesn&#39;t. Don&#39;t worry about eliminating symmetries or other complexities like that.</li>
	<li>Do make sure, though, that the fence has greater than 0 area.</li>
	<li>Rejoice that the answer will always fit into a signed 32-bit integer.</li>
</ul>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of ways that Farmer John can cut the plank of wood into four pieces such that they form a valid quadrilateral.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The plank of wood has length 6.</p>

<p>Farmer John can cut the plank 10 ways into four pieces: (1, 1, 1, 3); (1, 1, 2, 2); (1, 1, 3, 1); (1, 2, 1, 2); (1, 2, 2, 1); (1, 3, 1, 1); (2, 1, 1, 2); (2, 1, 2, 1); (2, 2, 1, 1); or (3, 1, 1, 1). Four of these -- (1, 1, 1, 3), (1, 1, 3, 1), (1, 3, 1, 1), and (3, 1, 1, 1) -- cannot be used to form a quadrilateral, though.</p>

<p>&nbsp;</p>