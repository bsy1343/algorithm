# [Platinum II] The Islands - 7994

[문제 링크](https://www.acmicpc.net/problem/7994)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 11, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

자료 구조, 스위핑, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Byteotia is an island surrounded by ocean. There are lakes in Byteotia. On these lakes there are isles which themselves contain lakes on which in turn there are further isles and so on. The ocean has degree 0. Byteotia has degree 1. The lakes situated on the Byteotian Isles have degree 2 etc., so a lake has degree i+1 if it is situated on an island of degree i and and island has a degree l+1 if it lies on a lake of degree l. It follows that the degrees of all islands are odd whereas the degrees of lakes and the ocean are always even. All lakes and islands have coastlines in shape of polygons whose each edge is perpendicular to its neighbours (the edges are parallel to the axes OX, OY) and their vertices have integer coordinates. No two coastlines meet or intersect. Having been given the contours of the coastlines calculate the maximum degree of lake/island in Byteotia.</p>

<p>Write a programme which:</p>

<ul>
	<li>reads from the standard input a description of the coastlines of islands and lakes,</li>
	<li>calculates the maximum degree of island/lake,</li>
	<li>writes the results to standard output.</li>
</ul>

### 입력

<p>In the first line there is one integer n, the number of coastlines, 1 &le; n &le; 40,000. The coastlines are described in the following lines, a single coastline per line. Each of the lines contains non-negative integers separated by single spaces. The first number in each line, k, signifies the even number of points comprising the coastline, 4 &le; k &le; 10,000. Next there are k numbers: x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>k</sub>, 0 &le; x<sub>i</sub> &le; 10<sup>8</sup>. The points forming the coastline are (x<sub>1</sub>,x<sub>2</sub>),(x<sub>3</sub>,x<sub>2</sub>),(x<sub>3</sub>,x<sub>4</sub>)(x<sub>5</sub>,x<sub>4</sub>),&hellip;,(x<sub>k-1</sub>,x<sub>k</sub>),(x<sub>1</sub>,x<sub>k</sub>). They are given in the cartesian coordinates and anticlockwise (so while going from i to i+1 we always have the interior on the left side). The coastlines are given in such order that:</p>

<ul>
	<li>the coastline of each lake is given after the coastline of the island it is situated on,</li>
	<li>the coastline of each island is given after the coastline of the lake it is situated on.</li>
</ul>

<p>To describe the whole map no more than 200,000 points have been used.</p>

### 출력

<p>Your programme should write in the first and only line a single integer - the maximum degree of island/lake.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7994.%E2%80%85The%E2%80%85Islands/7eeba739.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7994/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:191px; width:250px" /></p>