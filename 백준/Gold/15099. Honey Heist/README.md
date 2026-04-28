# [Gold IV] Honey Heist - 15099

[문제 링크](https://www.acmicpc.net/problem/15099)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 13, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>0x67 is a scout ant searching for food and discovers a beehive nearby. As it approaches the honeycomb, 0x67 can sense an area inside packed with dried honey that can be easily carried back to the nest and stored for winter. However, it must burrow through the honeycomb to reach the cell containing the sweet loot. If 0x67 can create a passage to the honey to help the other ants find it, it will do so before returning to the nest.</p>

<p>The cells of the honeycomb are numbered in row major order, so cell IDs can be assigned as shown below:</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15099/1.png" style="height:164px; width:162px" /></p>

<p>When 0x67 discovers the opening to the honeycomb, it enters the cell. Some ants are stronger than others, depending on their age, so 0x67 can only chew through at most N cells before its jaw wears out and must return to the nest to recuperate. The honeycomb is hexagonal, and each edge length is R cells. 0x67 enters through a hole at location A and must get to the honey at location B by chewing a path through no more than N adjacent cells. Because ants can be competitive, 0x67 wants to reach the honey by chewing through the fewest possible cells. 0x67 can also sense some of the cells are hardened with wax and impossible to penetrate, so it will have to chew around those to reach the cell at location B.</p>

<p>Scout ants have rudimentary computational skills, and before 0x67 begins to chew, it will work out where it needs to go, and compute K, the least number of cells it needs to chew through to get from A to B, where B is the Kth cell. If K &gt; N, 0x67 will not be strong enough to make the tunnel. When 0x67 returns to the nest, it will communicate to its nestmates how many cells it chewed through to get to B, or will report that it could not get to the honey.</p>

### 입력

<p>The input contains two lines. The first line contains five blank separated integers: R N A B X</p>

<ul>
	<li>R: the length (number of cells) of each edge of the grid, where 2 &le; R &le; 20. The total number of cells in the grid can be determined by taking a difference of cubes, R<sup>3</sup> &minus; (R &minus; 1)<sup>3</sup>.</li>
	<li>N: the maximum number of cells 0x67 can chew through, where 1 &le; N &lt; R<sup>3</sup> &minus; (R &minus; 1)<sup>3</sup>.</li>
	<li>A: the starting cell ID, This cell is located on one of the grid edges: The cell has fewer than six neighbors.</li>
	<li>B: the cell ID of the cell containing the honey, where 1 &le; B &le; R<sup>3</sup> &minus; (R &minus; 1)<sup>3</sup>.</li>
	<li>X: the number of wax-hardened cells, where 0 &le; X &lt; (R<sup>3</sup> &minus; (R &minus; 1)<sup>3</sup> ) &minus; 1.</li>
</ul>

<p>The second line contains X integers separated by spaces, where each integer is the ID of a wax-hardened cell.</p>

<p>The ID&rsquo;s, A, B, and all the ID&rsquo;s on the second line, are distinct positive integers less than or equal to R<sup>3</sup> &minus; (R &minus; 1)<sup>3</sup>.</p>

### 출력

<p>A single integer K if 0x67 reached the honey at cell B, where B is the Kth cell, otherwise the string No if it was impossible to reach the honey by chewing through N cells or less.</p>

### 힌트

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15099/2.png" style="height:242px; width:252px" /></p>

<p style="text-align:center">Figure E.1: K=6</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15099/3.png" style="height:249px; width:256px" /></p>

<p style="text-align:center">Figure E.2: No</p>