# [Platinum I] Figure Eight - 5826

[문제 링크](https://www.acmicpc.net/problem/5826)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 16, 맞힌 사람: 15, 정답 비율: 23.810%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 비트 집합

### 문제 설명

<p>Farmer John&#39;s cows recently received a large piece of marble, which, unfortunately, has a number of imperfections. To describe these, we can represent the piece of marble by an N by N square grid (5 &lt;= N &lt;= 300), where the character &#39;*&#39; represents an imperfection and &#39;.&#39; represents a flawless section of the marble.</p>

<p>The cows want to carve a number &quot;8&quot; in this piece of marble (cows are quite fond of the number &quot;8&quot; since they have cloven hooves on each of their four feet, so they can effectively count up to 8 using their &quot;toes&quot;). However, the cows need your help to determine the optimally placed figure eight in the piece of marble. Here are a few properties that define a valid figure eight:</p>

<p>* A figure eight consists of two rectangles, a top and a bottom. * Both the top and bottom have at least one cell in their interior. * The bottom edge of the top rectangle is a (not necessarily proper) subset of the top edge of the bottom rectangle. * The figure eight can only be carved from flawless regions of the piece of marble.</p>

<p>The aesthetic score of a figure eight is equal to the product of the areas enclosed by its two rectangles. The cows wish to maximize this score.</p>

<p>For example, given this piece of marble</p>

<pre>
...............
...............
...*******.....
.*....*.......*
.*......*....*.
....*..........
...*...****....
...............
..**.*..*..*...
...*...**.*....
*..*...*.......
...............
.....*..*......
.........*.....
...............
</pre>

<p>the optimally placed eight is:</p>

<pre>
..88888888888..
..8.........8..
..8*******..8..
.*8...*.....8.*
.*8.....*...8*.
..8.*.......8..
..8*...****.8..
.88888888888888
.8**.*..*..*..8
.8.*...**.*...8
*8.*...*......8
.8............8
.8...*..*.....8
.8.......*....8
.88888888888888
</pre>

<p>The top rectangle has area 6x9=54, and the bottom rectangle has area 12x6=72. Thus, its aesthetic score is 54x72=3888.</p>

### 입력

<ul>
	<li>Line 1: A single integer N, indicating the side length of the marble.</li>
	<li>Lines 2..N+1: Each line describes a row of the marble, and contains N characters which are each either &#39;*&#39; (an imperfection) or &#39;.&#39; (a flawless section).</li>
</ul>

### 출력

<ul>
	<li>Line 1: The highest aesthetic score of any figure eight which doesn&#39;t use any imperfect squares of the marble. If no figure eight is attainable, then output -1.</li>
</ul>