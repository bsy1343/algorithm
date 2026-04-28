# [Platinum IV] Interactive Treasure Hunt - 25363

[문제 링크](https://www.acmicpc.net/problem/25363)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 140, 정답: 48, 맞힌 사람: 44, 정답 비율: 34.109%

### 분류

수학, 애드 혹

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>There is a grid of $n\times m$ cells. Two treasure chests are buried in two different cells of the grid. Your task is to find both of them. You can make two types of operations:</p>

<ul>
	<li><code>DIG</code> $r$ $c$: try to find the treasure in the cell $(r, c)$. The interactor will tell you if you found the treasure or not.</li>
	<li><code>SCAN</code> $r$ $c$: scan from the cell $(r, c)$. The result of this operation is the sum of Manhattan distances from the cell $(r, c)$ to the cells where the treasures are hidden. Manhattan distance from a cell $(r_1, c_1)$ to a cell $(r_2, c_2)$ is calculated as $|r_1 - r_2| + |c_1 - c_2|$.</li>
</ul>

<p>You need to find the treasures in at most 7 operations. This includes both <code>DIG</code> and <code>SCAN</code> operations in total. To solve the test you need to call <code>DIG</code> operation at least once in both of the cells where the treasures are hidden.</p>

### 입력



### 출력

