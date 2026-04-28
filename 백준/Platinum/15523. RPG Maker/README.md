# [Platinum V] RPG Maker - 15523

[문제 링크](https://www.acmicpc.net/problem/15523)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 33, 맞힌 사람: 30, 정답 비율: 53.571%

### 분류

해 구성하기, 그래프 이론

### 문제 설명

<p>You are planning to create a map of an RPG. This map is represented by a grid whose size is <em>H</em> &times; <em>W</em>. Each cell in this grid is either &#39;<code>@</code>&#39;, &#39;<code>*</code>&#39;, &#39;<code>#</code>&#39;, or &#39;<code>.</code>&#39;. The meanings of the symbols are as follows.</p>

<ul>
	<li>&#39;<code>@</code>&#39;: The start cell. The story should start from this cell.</li>
	<li>&#39;<code>*</code>&#39;: A city cell. The story goes through or ends with this cell.</li>
	<li>&#39;<code>#</code>&#39;: A road cell.</li>
	<li>&#39;<code>.</code>&#39;: An empty cell.</li>
</ul>

<p>You have already located the start cell and all city cells under some constraints described in the input section, but no road cells have been located yet. Then, you should decide which cells to set as road cells.</p>

<p>Here, you want a &quot;journey&quot; exists on this map. Because you want to remove the branch of the story, the journey has to be unforked. More formally, the journey is a sequence of cells and must satisfy the following conditions:</p>

<ol>
	<li>The journey must contain as many city cells as possible.</li>
	<li>The journey must consist of distinct non-empty cells in this map.</li>
	<li>The journey must begin with the start cell.</li>
	<li>The journey must end with one of the city cells.</li>
	<li>The journey must contain all road cells. That is, road cells not included in the journey must not exist.</li>
	<li>The journey must be unforked. In more detail, all road cells and city cells except for a cell at the end of the journey must share edges with the other two cells both of which are also contained in the journey. Then, each of the start cell and a cell at the end of the journey must share an edge with another cell contained in the journey.</li>
	<li>You do not have to consider the order of the cities to visit during the journey.</li>
</ol>

<p>Initially, the map contains no road cells. You can change any empty cells to road cells to make a journey satisfying the conditions above. Your task is to print a map which maximizes the number of cities in the journey.</p>

### 입력

<p>The input consists of a single test case of the following form.</p>

<pre>
H W
S<sub>1</sub>
S<sub>2</sub>
.
.
.
S<sub>H</sub></pre>

<p>The first line consists of two integers <em>H</em> and <em>W</em>. <em>H</em> and <em>W</em> are guaranteed to satisfy <em>H</em> = 4<em>n</em> - 1 and <em>W</em> = 4<em>m</em> - 1 for some positive integers <em>n</em> and <em>m</em> (1 &le; <em>n</em>, <em>m</em> &le; 10). The following <em>H</em> lines represent a map without road cells. The (<em>i</em>+1)-th line consists of a string <em>S<sub>i</sub></em> of length <em>W</em>. The <em>j</em>-th character of <em>S<sub>i</sub></em> is either &#39;<code>*</code>&#39;, &#39;<code>@</code>&#39; or &#39;<code>.</code>&#39; if both <em>i</em> and <em>j</em> are odd, otherwise &#39;<code>.</code>&#39;. The number of occurrences of &#39;<code>@</code>&#39; in the grid is exactly one. It is guaranteed that there are one or more city cells on the grid.</p>

### 출력

<p>Print a map indicating a journey. If several maps satisfy the condition, you can print any of them.</p>