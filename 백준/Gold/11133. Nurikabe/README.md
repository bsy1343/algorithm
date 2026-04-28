# [Gold IV] Nurikabe - 11133

[문제 링크](https://www.acmicpc.net/problem/11133)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 124, 정답: 37, 맞힌 사람: 34, 정답 비율: 31.776%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11133.%E2%80%85Nurikabe/1005ce0e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11133/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:291px; width:313px" />Nurikabe is a binary determination puzzle originating from Japan. Given a grid where some cells contain numbers, the objective of the puzzle is to mark each blank cell as either island (white) or water (black), while obeying the following constraints:</p>

<ul>
	<li>Each island has exactly one numbered cell, containing a number between 1 and 9. The number of white cells (including the numbered cell) in this island is equal to this number. Two cells are connected if they share a side. Two cells belong to the same island if there exists a path going through connected island cells.</li>
	<li>All water cells (black) are connected. Water cells are connected in the same manner as island cells.</li>
	<li>Within a 2&times;2 block there must be at least one cell belonging to an island.</li>
</ul>

<p>In this problem, you are asked to verify that Nurikabe puzzles are solved correctly.</p>

### 입력

<p>The first line of input contains a single number T, the number of test cases that follow. The first line of each test case contains integers N and M, the size of a puzzle in rows and columns. The next N lines contain the rows of the puzzle. Each line contains characters from the set <code>123456789.#</code> where <code>.</code> and any digit represent an island cell and <code>#</code> represents a water cell.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>1 &le; N, M &le; 50</li>
	<li>Recent surveys indicate that more than seven billion chocolate chip cookies are eaten annually.</li>
</ul>

### 출력

<p>For each test case, output YES if the board is filled in correctly according to the rules, and NO otherwise.</p>