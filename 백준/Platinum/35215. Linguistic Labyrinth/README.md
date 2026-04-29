# [Platinum I] Linguistic Labyrinth - 35215

[문제 링크](https://www.acmicpc.net/problem/35215)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

3차원 기하학, 기하학, 수학, 조합론

### 문제 설명

<p>It is the 25th of December, 2025. As a Christmas tradition, you gather a group of friends to solve a puzzle. Among your friends are <em>wordcels</em> and <em>shape rotators</em>, who are respectively better at thinking with words and with mental images. This puzzle challenges even the smartest wordcel and the most brilliant shape rotator:</p>

<p>There is a $3$-dimensional grid with points at all integer coordinates $(x,y,z)$ with $1\leq x,y,z\leq n$, and each point has a label associated with it, which is either '<code>B</code>', '<code>A</code>', '<code>P</code>', or '<code>C</code>'. In this grid, you need to find occurrences of the curly word "<code>BAPC</code>". A curly word "<code>BAPC</code>" is a collection of four points in the grid such that:</p>

<ul>
<li>The labels spell out "<code>BAPC</code>" (in this order).</li>
<li>The angle that the triplet "<code>BAP</code>" makes is $90$ degrees: the vectors from <code>B</code> $\to$ <code>A</code> and from <code>A</code> $\to$ <code>P</code> form a $90$-degree angle.</li>
<li>The angle that the triplet "<code>APC</code>" makes is $90$ degrees: the vectors from <code>A</code> $\to$ <code>P</code> and from <code>P</code> $\to$ <code>C</code> form a $90$-degree angle.</li>
</ul>

<p>Note that the two angles do not need to be axis-aligned. As an example, see the third sample case, visualized in Figure L.1.</p>

<p>How many occurrences of the curly word "<code>BAPC</code>" are in the given grid?</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1\leq n\leq 22$), the size of the grid.</li>
<li>$n$ blocks of $n+1$ lines. Each block of $n+1$ lines consists of:
<ul>
<li>One line with a hyphen (<code>-</code>), to make the input more human-readable.</li>
<li>$n$ lines with $n$ characters, each character being either '<code>B</code>', '<code>A</code>', '<code>P</code>', or '<code>C</code>', representing all labels of one horizontal layer of the $3$-dimensional grid.</li>
</ul>
</li>
</ul>

### 출력

<p>Output the number of curly words "<code>BAPC</code>" in the $3$-dimensional grid.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35215.%E2%80%85Linguistic%E2%80%85Labyrinth/30d3b312.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35215-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 202px;"></p>

<p style="text-align: center;">Figure L.1: Visualization of the third sample input. In this grid, there are two curly words "<code>BAPC</code>", using the highlighted letters.</p>