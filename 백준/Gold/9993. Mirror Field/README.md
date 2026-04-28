# [Gold V] Mirror Field - 9993

[문제 링크](https://www.acmicpc.net/problem/9993)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 271, 정답: 131, 맞힌 사람: 110, 정답 비율: 49.327%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색

### 문제 설명

<p>Farmer John has left some old mirrors sitting outside his house, and his cows, feeling mischievous as always, have stolen them!</p>

<p>The cows have set up the mirrors in a rectangular field measuring N by M squares (1 &lt;= N, M &lt;= 1,000). In each square, they have placed a double sided mirror between two of its opposite corners. These two possible configurations are represented by the &#39;/&#39; character (a mirror connecting the lower-left corner to the upper-right corner) and the &#39;\&#39; character (a mirror connecting the upper-left corner to the lower-right corner).</p>

<p>One evening, Bessie the cow brings a laser pointer out to the mirror field. Standing outside the field, she shines the beam of light either horizontally or vertically along either a row or column of the field, causing it to bounce of some number of mirrors. Since the mirrors are all diagonally oriented, a horizontal beam of light that reflects off a mirror will end up traveling vertically, and vice versa. Bessie wonders what is the maximum number of mirrors on which her beam of light can be reflected at the same time. Given the layout of the mirror field, please help Bessie compute this number.</p>

<p>Due to an ambiguity in the problem statement, there were two answers accepted for this problem: the maximum number of bounces, or the maximum number of mirrors. &nbsp;The test data here contains both numbers in the output, but grading on the USACO server requires only one of them.</p>

### 입력

<ul>
	<li>Line 1: The integers N and M, separated by a space.</li>
	<li>Lines 2..1+N: Each line will contain M &#39;/&#39; or &#39;\&#39; characters, describing a row of the mirror field.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer indicating the maximum number of times a horizontal or vertical beam originating outside the mirror field could be reflected. Please output -1 if it could be reflected indefinitely.</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>Bessie can shine the beam downwards above the middle column of her field to have it reflected 3 times.</p>