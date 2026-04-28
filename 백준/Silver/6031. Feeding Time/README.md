# [Silver I] Feeding Time - 6031

[문제 링크](https://www.acmicpc.net/problem/6031)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 311, 정답: 224, 맞힌 사람: 195, 정답 비율: 73.308%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>It&#39;s Bessie&#39;s feeding time, and Farmer John is trying to decide where to put her. FJ has a farm that comprises W x H (1 &lt;= W &lt;= 750; 1 &lt;= H &lt;= 750) squares and is partitioned into one or more separate pastures by rocks both large and small. Every pasture contains some grass and some rocks.</p>

<p>Bessie is a hungry little cow and just loves to eat, eat, eat her grass. She can move from any square to any other square that is horizontally, vertically, or diagonally adjacent. Bessie can&#39;t cross the rocks because they hurt her feet, and, of course, she can&#39;t leave the farm. Bessie wants to know the maximum number of squares of grass that she can eat.</p>

<p>FJ has a map of his farm, where a &#39;.&#39; represents a square of grass, and a &#39;*&#39; represents a rock. Consider this 10x8 map and a detailed breakdown of the extent of each of its three pastures:</p>

<pre>
      ...*....**  |  111*....**   ...*2222**    ...*....**
      ..**....**  |  11**....**   ..**2222**    ..**....**
      ...*....**  |  111*....**   ...*2222**    ...*....**
      ...**.*.**  |  111**.*.**   ...**2*2**    ...**.*.**
      ***.**.***  |  ***1**.***   ***.**2***    ***.**.***
      ...**.*.**  |  111**.*.**   ...**2*2**    ...**.*.**
      ...*.*****  |  111*.*****   ...*2*****    ...*.*****
      ...***..**  |  111***..**   ...***..**    ...***33**</pre>

<p>Pasture 1 has 21 squares; pasture 2 has 18 squares; pasture 3 has 2 squares. Thus Bessie should choose pasture 1 with 21 squares to maximize the grass she can eat.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: W and H</li>
	<li>Lines 2..H+1: Line i+1 describes field row i with W characters (and no spaces), each either &#39;.&#39; or &#39;*&#39;</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that represents the maximum number of squares of grass that Bessie can eat.</li>
</ul>

<p>&nbsp;</p>