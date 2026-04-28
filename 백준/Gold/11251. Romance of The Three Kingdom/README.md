# [Gold II] Romance of The Three Kingdom - 11251

[문제 링크](https://www.acmicpc.net/problem/11251)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 35, 정답: 14, 맞힌 사람: 12, 정답 비율: 40.000%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 분리 집합, 격자 그래프, 플러드 필

### 문제 설명

<p>In Han dynasty, Chinese is divided to three kingdom: Cao Wei (by Cao Cao), Shu Han (by Liu Bei) and Dong Wu (by Sun Quan). After that, Chinese is merged in one kingdom. In this task, same kingdom is connected in 4 directions: up, down, left and right.</p>

<p>Chinese has R row C column which &#39;.&#39; is sea, &#39;X&#39; (Greater X) is land. e.g. R=6, C=14 shown&nbsp;</p>

<pre>
XXX...........  111...........  111...........
X.X.XXXX......  1.1.2222......  1.1.2222......
XXX.X....XXXXX  111.2....33333  111.2....33333
X.X.X....X.X.X  1.1.2....3.3.3  1.1x2....3.3.3
....XXXX.X.X.X  ....2222.3.3.3  ....2222x3.3.3
.........X.X.X  .........3.3.3  .........3.3.3</pre>

<p>Left image is Chinese land initiation</p>

<p>Middle image describes name of each kingdom</p>

<p>Right image is new Chinese kingdom that cover 2 sea blocks to connect three kingdom.</p>

<p>Write program to find minimum sea block to cover for connect three kingdom.&nbsp;</p>

### 입력

<p>First line integer Q (Q &lt;= 15), number of question</p>

<p>Each question</p>

<p>First line integer R C separated with blank space (1 &lt;= R, C &lt;= 50)&nbsp;</p>

<p>Next R line input Chinese map which &#39;.&#39; is sea, &#39;X&#39; (Greater X) is land.</p>

<p>Guarantee input map has exactly three kingdom.&nbsp;</p>

### 출력

<p>Q line each line show minimum sea block to cover for connect three kingdom.</p>

### 힌트

<p>There are 2 question:</p>

<p>First question describes in task above</p>

<p>Second question Chinese connect with 4 blocks shown&nbsp;</p>

<pre>
..111.....22.
.11111xxx..x.
.111....33333
.111....33333
.111....33333</pre>