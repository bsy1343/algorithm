# [Gold III] Meteor Shower - 6166

[문제 링크](https://www.acmicpc.net/problem/6166)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 287, 정답: 80, 맞힌 사람: 69, 정답 비율: 29.237%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프

### 문제 설명

<p>Bessie hears that an extraordinary meteor shower is coming; reports say that these meteors will crash into earth and destroy anything they hit. Anxious for her safety, she vows to find her way to a safe location (one that is never destroyed by a meteor) . She is currently grazing at the origin in the coordinate plane and wants to move to a new, safer location while avoiding being destroyed by meteors along her way.</p>

<p>The reports say that M meteors (1 &lt;= M &lt;= 50,000) will strike, with meteor i will striking point (X_i, Y_i) (0 &lt;= X_i &lt;= 300; 0 &lt;= Y_i &lt;= 300) at time T_i (0 &lt;= T_i &lt;= 1,000). Each meteor destroys the point that it strikes and also the four rectilinearly adjacent lattice points.</p>

<p>Bessie leaves the origin at time 0 and can travel in the first quadrant and parallel to the axes at the rate of one distance unit per second to any of the (often 4) adjacent rectilinear points that are not yet destroyed by a meteor. &nbsp;She cannot be located on a point at any time greater than or equal to the time it is destroyed).</p>

<p>Determine the minimum time it takes Bessie to get to a safe place.</p>

### 입력

<ul>
	<li>Line 1: A single integer: M</li>
	<li>Lines 2..M+1: Line i+1 contains three space-separated integers: X_i, Y_i, and T_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The minimum time it takes Bessie to get to a safe place or -1 if it is impossible.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>There are four meteors, which strike points (0, 0); (2, 1); (1, 1); and (0, 3) at times 2, 2, 2, and 5, respectively.</p>

<pre>
    t = 0                t = 2              t = 5
5|. . . . . . .     5|. . . . . . .     5|. . . . . . .    
4|. . . . . . .     4|. . . . . . .     4|# . . . . . .   * = meteor impact
3|. . . . . . .     3|. . . . . . .     3|* # . . . . .  
2|. . . . . . .     2|. # # . . . .     2|# # # . . . .   # = destroyed pasture
1|. . . . . . .     1|# * * # . . .     1|# # # # . . .   
0|B . . . . . .     0|* # # . . . .     0|# # # . . . .   
  --------------      --------------      -------------- 
  0 1 2 3 4 5 6       0 1 2 3 4 5 6       0 1 2 3 4 5 6 </pre>

<p><br />
Examining the plot above at t=5, the closest safe point is (3, 0) -- but Bessie&#39;s path to that point is too quickly blocked off by the second meteor. The next closest point is (4,0) -- also blocked too soon. &nbsp;Next closest after that are lattice points on the (0,5)-(5,0) diagonal. Of those, any one of (0,5), (1,4), and (2,3) is reachable in 5 timeunits.</p>

<pre>
       5|. . . . . . .   
       4|. . . . . . .   
       3|3 4 5 . . . .    Bessie&#39;s locations over time
       2|2 . . . . . .    for one solution
       1|1 . . . . . .   
       0|0 . . . . . .   
         -------------- 
         0 1 2 3 4 5 6  </pre>