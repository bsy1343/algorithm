# [Gold III] Cows on Ice - 6025

[문제 링크](https://www.acmicpc.net/problem/6025)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 23, 맞힌 사람: 21, 정답 비율: 75.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Bessie is ice skating on a large frozen lake modelled as a 2-dimensional grid with coordinates in the range -1,000,000,000..1,000,000,000. N (1 &lt;= N &lt;= 20,000) of the lake&#39;s grid cells contain rocks (conveniently numbered 1..N). The other cells contain slippery ice.</p>

<p>Since Bessie is not a very good skater, she traverses the lake&#39;s cells by pushing herself away from her current position near a rock and sliding continuously in the same direction until she hits another rock (stopping in the square before she hits the rock, of course). Never good with complicated angles, Bessie can push herself only straight north, east, south, or west. She can&#39;t push herself through the rock, of course, and thus generally has only three possible directions to move.</p>

<p>Sliding is not without risks. Bessie must hit a rock or might end up sliding for a very long time. She must aim her pushes carefully.</p>

<p>Consider the situation depicted below; Bessie wants to get to location (x=5,y=1), which is east of her current location (. = ice, * = rock, B = Bessie, G = goal). If she slides directly to the east, she will slide past the location since she can stop only by encountering a rock head on. One way to get to (5,1) is the following:</p>

<pre>
   (a)              (b)             (c)              (d)
4 .....*.         .....*.         .....*.          .....*.
3 ..*....  slide  ..*....  slide  ..*....   slide  ..*....
2 ......*  north  ..B...*  east   .....B*   south  ......*
1 .*B..G. ------&gt; .*...G. ------&gt; .*...G.  ------&gt; .*...B.
0 *....*.         *....*.         *....*.          *....*.
  0123456</pre>

<p>Bessie could slide north, east, or south in situation (a), but only north has a rock for stopping. For situation (b), she can slide only east for the same reason.</p>

<p>For the input, rock i is located at cell X_i,Y_i (-1,000,000,000 &lt;= X_i &lt;= 1,000,000,000; -1,000,000,000 &lt;= Y_i &lt;= 1,000,000,000), and no two rocks occupy the same position. Bessie starts at Bx,By (which is next to a rock) (-1,000,000,000 &lt;= Bx &lt;= 1,000,000,000; -1,000,000,000 &lt;= By &lt;= 1,000,000,000). Bessie&#39;s goal is Gx,Gy (-1,000,000,000 &lt;= Gx &lt;= 1,000,000,000; -1,000,000,000 &lt;= Gy &lt;= 1,000,000,000). Bessie can always reach the goal one way or another.</p>

<p>Bessie doesn&#39;t mind sliding. However, pushing herself away from a rock is very tiring. To prepare her, FJ would like to know the minimum number of pushes Bessie needs to do.</p>

### 입력

<ul>
	<li>Line 1: Five space separated integers: N, Bx, By, Gx, and Gy</li>
	<li>Lines 2..N+1: Line i+1 describes a rock location with space separated integers: X_i and Y_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum number of pushes for Bessie to get to her goal</li>
</ul>

<p>&nbsp;</p>