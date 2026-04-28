# [Platinum V] Cowtography - 27095

[문제 링크](https://www.acmicpc.net/problem/27095)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 8, 맞힌 사람: 5, 정답 비율: 17.241%

### 분류

구현, 그래프 이론, 그래프 탐색, 재귀, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Farmer John wants to draw a map of his land, which is divided into rectangular fields. Each field is colored with a number (an integer in [1..1,000,000]).  His goal is to design a map in which every adjacent pair of fields is colored differently.</p>

<p>Unfortunately, Farmer John&#39;s land is described in a rather unusual manner.  His entire farm is a square, 1 kilometer on a side.  The description of the layout of his farm is given by a sequence of lines, each of which contains one word or number per line.</p>

<p>The 1-by-1 kilometer square comprising the entire farm is described in the file as a series of one or more regions.  A region can be specified by either:</p>

<ul>
	<li>A number giving the color of the region under consideration</li>
	<li>The number &quot;-1&quot;, indicating that the region under consideration is to be split evenly in half with a vertical line.  Following the &quot;-1&quot; command will be descriptions of the left and then right halves, each described as a region.</li>
	<li>The number &quot;-2&quot;, indicating that the region under consideration is to be split evenly in half with a horizontal line.  Following the &quot;-2&quot; command will be a description of the upper and then lower halves, each described as a region.</li>
</ul>

<p>There are no more than 100 regions on Farmer John&#39;s property.</p>

<p>Your task is to determine the greatest number of adjacent regions colored with the same color.</p>

### 입력

<p>As above, a series of lines containing a number, the string &#39;hsplit&#39;, or the string &#39;vsplit&#39;.</p>

### 출력

<p>A single line with an integer that tells the greatest number of adjacent fields have the same color.</p>

### 힌트

<p>The farm would resemble something like this:</p>

<pre>
+----------+------+-----+
|          |      |     |
|          |      |     |
|          |      |     |
|          |  37  |  6  |
|          |      |     |
|          |      |     |
|    5     +------+-----+
|          |            |
|          |            |
|          |      5     |
|          |            |
|          |            |
|          |            |
+----------+------------+</pre>