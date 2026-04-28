# [Gold II] Animal Farm - 6802

[문제 링크](https://www.acmicpc.net/problem/6802)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 10, 맞힌 사람: 10, 정답 비율: 41.667%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>You are running a farm which has N (1 &le; N &le; 100) animals. You went to the store and bought M = N pre-made pens that will house your animals. Pens satisfy the following conditions:</p>

<ul>
	<li>pens have between 3 and 8 edges;</li>
	<li>an edge that is specified by two pens connects the two pens;</li>
	<li>an edge that is specified only once connects that pen to the outside;</li>
	<li>there is exactly one animal in each pen and no animals outside the pens, initially.</li>
</ul>

<p>The animals, however, have a game they like to play called &ldquo;Escape from the pen.&rdquo; They assign a cost to each edge of the pen, and they determine the minimum cost for all of the animals to meet in the same area by trampling over the edge of various pens. The animals may meet inside a particular pen or outside of all the pens. Also note that once an edge has been trampled, any animal may pass over it without incurring any cost.</p>

<p>You will be given a description of the pens, along with the placement of animals, and you are to figure out what the smallest cost is to move all the animals into the same area.</p>

### 입력

<p>The first line of input will be the integer M, the number of pens. On the next M lines, there will be a description of each pen, with one description per line. The description is composed of three components, with each component separated by one space, as follows:</p>

<ul>
	<li>the first component is an integer e<sub>p</sub> (3 &le; e<sub>p</sub> &le; 8), which describes the number of edges for this particular pen p;</li>
	<li>the second component is a sequence of e<sub>p</sub> integers describing the corners of each pen, where each integer is less than or equal to 1000;</li>
	<li>the third component is a sequence of e<sub>p</sub> integers describing the cost of each edge, where each integer is less than or equal to 5000.</li>
</ul>

<p>For the corner and edge cost description, the descriptions are given in cyclical order. For example, the following description of a pen</p>

<p style="text-align: center;">3 1 2 3 7 4 6</p>

<p>means that there are three corners, and thus, three edges, where the edge (1, 2) has cost 7, the edge (2, 3) has cost 4 and the edge (3, 1) has cost 6.</p>

### 출력

<p>On one line, output the minimal cost that will allow all the animals to gather in one pen or outside all of the pens.</p>