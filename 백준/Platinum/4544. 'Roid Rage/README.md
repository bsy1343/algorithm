# [Platinum IV] 'Roid Rage - 4544

[문제 링크](https://www.acmicpc.net/problem/4544)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 11, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

기하학, 선분 교차 판정, 오목 다각형 내부의 점 판정

### 문제 설명

<p>When writing game programs, it is often useful to determine when two polygons intersect one another. This is especially useful in arcade games like Asteroids where one polygon could represent a spaceship while another represents a huge, unyielding chunk of space rock.</p>

<p>Write a program that can determine which polygons of a given set intersect one another.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer n indicating the number of datasets. Each data set consists of the following components:</p>

<ol>
	<li>A line containing a single positive integer m (1 &lt;= m &lt;= 10) indicating the number of polygons to analyze.</li>
	<li>m lines, each representing a single polygon, with the first line describing polygon 1, the second line describing polygon 2, and so on. Each line begins with a single positive integer v (3 &lt;= v &lt;= 20) indicating the number of vertices describing this polygon. This is followed by v (x,y) coordinate pairs (0 &lt;= x, y &lt;= 100), each of which is a vertex of this polygon. The vertices are connected by edges in the order listed with the last vertex connected back to the first by a final edge. All polygons are &quot;simple&quot;; they do not self-intersect.</li>
</ol>

### 출력

<p>For each dataset in the input, output the heading &quot;Data Set #z&quot;, where z is 1 for the first dataset, 2 for the second, etc. If this data set contained no intersecting polygons, output the message &quot;no collisions&quot; on its own line. Otherwise, output the list of all pairs of intersecting polygons, one pair per line, each pair formatted with the lowest-numbered polygon first. Output the polygon pairs in ascending order, sorting first by the lowest-numbered polygon in the set and then the second.</p>

<p>Note: The definition of &quot;intersecting&quot; for the purpose of this problem means that two polygons either share an interior region (i.e., they overlap), or they share boundary points (i.e., they touch at a point or along an edge).</p>