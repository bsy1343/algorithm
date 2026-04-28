# [Platinum II] Towers - 10567

[문제 링크](https://www.acmicpc.net/problem/10567)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 17, 맞힌 사람: 14, 정답 비율: 56.000%

### 분류

백트래킹, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>The Towers puzzle challenges a single player to place towers of varying heights in an n x n grid (3 &le; n &le; 5). The heights of each tower can be any integer between 1 and n, inclusive, but the placement of the n<sup>2</sup> towers must be such that no tower of the same height appears twice within the same row or column. Given no other constraints, there is an exponentially large number of ways to place towers. Take, for example, the 5 x 5 puzzle, where one of the solutions looks like this:</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/puzzle1.png" style="height:176px; width:171px" /></p>

<p>The puzzles become more interesting (and harder to solve) as they further constrain that one or more grid locations be occupied by towers of specified heights. A 5 x 5 puzzle, for instance, might require that the upper left and lower right corners house towers of height 3, and that the center location house a tower of height 5. The puzzle would look like that on the left below, and a solution&mdash;again, one of many&mdash;might look like that presented to its right.</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/puzzle2.png" style="height:160px; width:333px" /></p>

<p>Some puzzles include one or more numbers around the perimeter, where each number specifies the exact number of towers visible when looking into the grid from that direction, with the understanding that taller towers fully conceal shorter ones. For example, the 5 x 5 puzzle presented below and on the left would have the (incidentally unique) solution to its right.</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/puzzle3.png" style="height:157px; width:365px" /></p>

<p>The number above the final column requires that just a single tower be visible when viewing its sequence of five towers from above (which essentially means that the top row of that column must house a 5.) The second row introduces multiple requirements:</p>

<ul>
	<li>the center column must house a 3,</li>
	<li>exactly two towers are visible when viewing its tower sequence from the left, and</li>
	<li>exactly three towers are visible when viewing its two sequence from the right.</li>
</ul>

### 입력

<p>The input starts with a single integer on a line by itself, giving the number of tests; there will be at least 1 but no more than 100 test cases. Each n &times; n puzzle (3 &le; n &le; 5) is expressed as a series of n + 2 lines of length n + 2. The outer perimeter of the grid specifies the visibility constraints (where &lsquo;-&rsquo; expresses there are no constraints for that row or column from the relevant direction looking in; the corners of the perimeter are always &lsquo;-&rsquo;] and the interior of the grid specifies those locations where a tower of a specific height must be placed (where &lsquo;-&rsquo; expresses there is no imposed tower height for that location.)</p>

<p>We guarantee that every character in the grid is either a &lsquo;-&rsquo; or a digit between 1 and n.</p>

### 출력

<p>For each input puzzle, output a solution as a sequence of n lines, each of length n, followed by a blank line. If a puzzle has multiple solutions, then output lexicographically smallest one among them.&nbsp;If a puzzle cannot be solved, simply print the word &ldquo;no&rdquo;, all by itself, without the delimiting double quotes, followed by a blank line.</p>