# [Platinum III] Urban Planning - 33598

[문제 링크](https://www.acmicpc.net/problem/33598)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 11, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

수학, 조합론, 해 구성하기

### 문제 설명

<p>You are responsible for planning a new city! The city will be represented by a rectangular grid, where each cell is either a park or a built-up area.</p>

<p>The residents will naturally want to go for walks in the city parks. In particular, a <em>rectangular walk</em> is a rectangle consisting of the grid cells, which is at least 2 cells long both horizontally and vertically, such that all cells on the boundary of the rectangle are parks. Note that the cells inside the rectangle can be arbitrary.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33598.%E2%80%85Urban%E2%80%85Planning/e3a7c375.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33598-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 252px; height: 200px;"></p>

<p style="text-align: center;">An example rectangular walk (cells with dark background).</p>

<p>Your favourite number is $k$. To leave a long-lasting signature, you want to design the city in such a way that it has exactly $k$ rectangular walks.</p>

### 입력

<p>The input contains a single integer $k$ ($0 ≤ k ≤ 4 \cdot 10^{12}$).</p>

### 출력

<p>On the first line, print two integers $h$ and $w$ ($1 ≤ h, w ≤ 2025$), the height and width of the grid. On the next $h$ lines, print a string with $w$ characters each, with each character being <code>#</code>, denoting a park, or <code>.</code>, denoting a built-up area.</p>

<p>It is guaranteed that for any value of $k$ within the given limits, there exists a solution with height and width within the given limits. Any city within the given limits and with exactly $k$ rectangular walks will be accepted.</p>