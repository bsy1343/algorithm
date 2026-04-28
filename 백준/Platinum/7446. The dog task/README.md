# [Platinum IV] The dog task - 7446

[문제 링크](https://www.acmicpc.net/problem/7446)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 11, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

그래프 이론, 최대 유량, 이분 매칭

### 문제 설명

<p>Hunter Bob often walks with his dog Ralph. Bob walks with a constant speed and his route is a polygonal line &nbsp;(possibly self-intersecting) whose vertices are specified by N pairs of integers (X<sub>i</sub>, Y<sub>i</sub>) &ndash; their Cartesian coordinates.</p>

<p>Ralph walks on his own way but always meets his master at the specified N points. The dog starts his journey simultaneously with Bob at the point (X<sub>1</sub>, Y<sub>1</sub>) and finishes it also simultaneously with Bob at the point (X<sub>N</sub>, Y<sub>N</sub>).</p>

<p>Ralph can travel at a speed that is up to two times greater than his master&#39;s speed. While Bob travels in a straight line from one point to another the cheerful dog seeks trees, bushes, hummocks and all other kinds of interesting places of the local landscape which are specified by M pairs of integers (X&#39;<sub>j</sub>, Y&#39;<sub>j</sub>). However, after leaving his master at the point (X<sub>i</sub>, Y<sub>i</sub>) (where 1 &le; i &lt; N) the dog visits at most one interesting place before meeting his master again at the point (X<sub>i+1</sub>, Y<sub>i+1</sub>).</p>

<p>Your task is to find the dog&#39;s route, which meets the above requirements and allows him to visit the maximal possible number of interesting places. The answer should be presented as a polygonal line that represents Ralph&#39;s route. The vertices of this route should be all points (X<sub>i</sub>, Y<sub>i</sub>) and the maximal number of interesting places (X&#39;<sub>j</sub>, Y&#39;<sub>j</sub>). The latter should be visited (i.e. listed in the route description) at most once.</p>

<p>An example of Bob&#39;s route (solid line), a set of interesting places (dots) and one of the best Ralph&#39;s routes (dotted line) are presented in the following picture:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ec1443c8-b8be-40e0-aaa9-c372633a78c5/-/preview/" style="width: 239px; height: 218px;" /></p>

### 입력

<p>The first line of the input file contains two integers N and M, separated by a space (2 &le; N &le; 100, 0 &le; M &le; 100). The second line contains N pairs of integers X<sub>1</sub>, Y<sub>1</sub>, ..., X<sub>N</sub>, Y<sub>N</sub>, separated by spaces, that represent Bob&#39;s route. The third line contains M pairs of integers X&#39;<sub>1</sub>, Y&#39;<sub>1</sub>, ..., X&#39;<sub>M</sub>, Y&#39;<sub>M</sub>, separated by spaces, that represent interesting places.</p>

<p>All points in the input file are different and their coordinates are integers not greater than 1000 by the absolute value.</p>

### 출력

<p>The first line of the output file should contain the single integer K &ndash; the number of vertices of the best dog&#39;s route. The second line should contain K pairs of coordinates X&quot;<sub>1</sub>, Y&quot;<sub>1</sub>, ..., X&quot;<sub>K</sub>, Y&quot;<sub>K</sub> separated by spaces, that represent this route. If there are several such routes, then you may write any of them.</p>