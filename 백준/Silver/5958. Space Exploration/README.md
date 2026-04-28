# [Silver II] Space Exploration - 5958

[문제 링크](https://www.acmicpc.net/problem/5958)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 475, 정답: 329, 맞힌 사람: 288, 정답 비율: 72.180%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 격자 그래프, 플러드 필

### 문제 설명

<p>Farmer John&#39;s cows have finally blasted off from earth and are now floating around space in their Moocraft. The cows want to reach their fiery kin on Jupiter&#39;s moon of Io, but to do this they must first navigate through the dangerous asteroid belt.</p>

<p>Bessie is piloting the craft through this treacherous N x N (1 &lt;= N &lt;= 1,000) sector of space. Asteroids in this sector comprise some number of 1 x 1 squares of space-rock connected along their edges (two squares sharing only a corner count as two distinct asteroids). Please help Bessie maneuver through the field by counting the number of distinct asteroids in the entire sector.</p>

<p>Consider the 10 x 10 space shown below on the left. The &#39;*&#39;s represent asteroid chunks, and each &#39;.&#39; represents a .vast void of empty space. The diagram on the right shows an arbitrary numbering applied to the asteroids.</p>

<pre>
               ...**.....           ...11.....
               .*........           .2........
               ......*...           ......3...
               ...*..*...           ...3..3...
               ..*****...           ..33333...
               ...*......           ...3......
               ....***...           ....444...
               .*..***...           .5..444...
               .....*...*          ......4...6
               ..*.......          ..7........</pre>

<p>It&#39;s easy to see there are 7 asteroids in this sector.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains row i of the asteroid field: N characters</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer indicating the number of asteroids in the field.</li>
</ul>

<p>&nbsp;</p>