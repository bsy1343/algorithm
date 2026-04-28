# [Silver III] Trampler - 23591

[문제 링크](https://www.acmicpc.net/problem/23591)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 12, 정답: 12, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Trampler the Jackrabbit loves trampling fields. He&#39;s just found a good new field. As seen on the map, the field is a rectangle $H$ cells high and $W$ cells wide. When Trampler gets into a cell, he tramples it down to the last twig. It takes him a while to do that, and that time is defined for each specific cell.</p>

<p>Trampler is not sure where to begin, but he&#39;s already figured out the sequence of moves. He&#39;s scribbled it down on a piece of paper, marking each elemental move with a letter.</p>

<p><img alt="" src="https://upload.acmicpc.net/758ef36e-72ce-4643-9dbc-7292e9060d6e/-/preview/" style="width: 200px; height: 150px; float: right;" />There are different kinds of moves:</p>

<ul>
	<li>letter <code>&#39;U&#39;</code>: move from the current field cell to the cell directly adjacent above;</li>
	<li>letter <code>&#39;R&#39;</code>: move to the adjacent cell on the right;</li>
	<li>letter <code>&#39;L&#39;</code>: move to the adjacent cell on the left;</li>
	<li>letter <code>&#39;D&#39;</code>: move to the adjacent cell below.</li>
</ul>

<p>For each cell, Trampler needs to know the time necessary to implement his plan, should he begin his trampling route from that cell. He will spend some time in the initial cell and in each consecutive cell, even if that cell will have been trampled already.</p>

<p>He is not planning to leave the field until he is done. If starting at a certain cell means having to leave the field eventually, this cell is no good for a starting point. Trampler wants such cells marked with 0.</p>

### 입력

<p>The first line of the input file defines an integer $T$ --- the number of test cases ($1 \le T \le 100$). It is followed by $T$ blocks.</p>

<p>The first line of a block contains two integers &nbsp;$H$ and $W$ --- the height and width of the field, respectively ($1 \le H, W \le 100$).</p>

<p>The second line of the block contains a non-emty sequence of moves. Each move is represented by one of the symbols &#39;L&#39;, &#39;R&#39;, &#39;U&#39;, &#39;D&#39;. The number of moves is less than or equals $100$.</p>

<p>Each of the following $H$ lines contains $W$ integers --- the time the jackrabbit spends in a specific field cell. These numbers fall in the range from $1$ through $1\,000$.</p>

<p>The total number of cells in all test cases is less than or equals $10^5$.</p>

### 출력

<p>For each test case, print $H$ lines of $W$ integers --- the answers for each of the field cells.</p>

### 힌트

<p>The illustration in the problem statement shows the field from the first example and the directions of moves.</p>