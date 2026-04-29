# [Platinum II] Egyptian Equality - 35220

[문제 링크](https://www.acmicpc.net/problem/35220)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Friendly but competing archaeologists Ameena and Bilal are searching for the lost entrance to the <em>Nomarch's Celestial Pyramid of Cauris</em>. Over the Millennia, much of the outer layer has been stripped away, so the entrance must lie behind one of the remaining "casing" stones -- the smooth limestone blocks that once covered the entire monument -- on the north face of the pyramid.</p>

<p>To avoid interference between their sensor arrays, Ameena and Bilal will divide the north face into two connected regions and scan one region each. For fairness, each region must contain the same number of casing stones.</p>

<p>They model the pyramid's north face as a triangular grid. The grid has $N$ rows and $2N - 1$ columns, with the pyramid occupying a subset of these cells: the middle cell of the first row, the middle three cells of the second row, the middle five of the third row, and so on. A nonempty subset of the cells in the pyramid are casing stones.</p>

<p>Your task is to partition the pyramid into two regions $A$ and $B$ such that:</p>

<ul>
<li>Every cell in the pyramid belongs to exactly one region.</li>
<li>Each region is connected. (A region is connected if it is possible to walk between any two of its cells by moving between adjacent cells. Two cells are adjacent if they share a side.)</li>
<li>The two regions contain the same number of casing stones.</li>
</ul>

### 입력

<p>The first line consists of the integer $N$ ($2 \leq N \leq 300$). The following $N$ lines each contain a string of $2N - 1$ characters. These strings describe where the casing stones are. The character <code>#</code> represents a cell that does not belong to the pyramid, <code>.</code> is a cell that is not a casing stone, and <code>C</code> is a casing stone. There will be at least one casing stone in the pyramid.</p>

### 출력

<p>If it is impossible to partition the pyramid in a valid way, print <code>impossible</code>. Otherwise, print $N$ lines where each line contains a string of length $2N - 1$. These lines describe the partition of the pyramid. The character <code>#</code> represents a cell that does not belong to the pyramid, <code>A</code> represents a cell that belongs to Ameena, and <code>B</code> represents a cell that belongs to Bilal. If there are multiple valid solutions, you can print any one of them.</p>