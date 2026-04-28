# [Gold IV] Trail - 26573

[문제 링크](https://www.acmicpc.net/problem/26573)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 격자 그래프

### 문제 설명

<p>Ann works for a shipping company in the wild frontier. Her job is simple; she must deliver a package to the West before a certain deadline. You are to determine when Ann will reach her destination and whether or not Ann is late.</p>

<p>You will be given a top-down map of the area Ann must traverse and the number of days until the deadline that Ann must deliver the package by. It will take Ann 3 days to cross a normal area of land, 5 days to cross a wooded area, and 8 days to cross a body of water. Ann cannot cross over rocks because it will break her wagon. Her goal is to get to the West, which is simply the far left column on the map. She can travel in any of the four directions: north, east, south, and west (no diagonals). On some maps it may be impossible for Ann to reach the West.</p>

<p>Note: The far left column will contain only . (periods) and is not included in the overall time.</p>

### 입력

<p>The first line of input will contain a single integer n that indicates the number of data sets to follow. Each data set will consist of:</p>

<ul>
	<li>A line containing two integers: rows and cols, indicating the number of rows and columns, respectively. The value of rows and cols will both be between 1 and 50, inclusive.</li>
	<li>The next rows lines of cols characters will be the map of the area. Each character will be one of the following:
	<ul>
		<li>. (period) &ndash; a normal area of land</li>
		<li>W &ndash; an area of water</li>
		<li>R &ndash; a rock</li>
		<li>F &ndash; a wooded area</li>
		<li>S &ndash; Ann&rsquo;s starting location, there will only be one of these</li>
	</ul>
	</li>
	<li>The next line will contain a single integer, between 1 and 300 inclusive, which represents the number of days until the deadline.</li>
</ul>

### 출력

<p>You are to output the result of Ann&rsquo;s trip. If Ann is able to get to the West by the deadline print &ldquo;The Package arrived with d day(s) to spare.&rdquo; where d is the number of days still left until the original deadline. If Ann cannot deliver the package in time, simply print &ldquo;The Package was not delivered in time.&rdquo;</p>