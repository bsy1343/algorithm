# [Silver IV] Super Paintball - 6127

[문제 링크](https://www.acmicpc.net/problem/6127)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 78, 정답: 68, 맞힌 사람: 53, 정답 비율: 86.885%

### 분류

구현

### 문제 설명

<p>The cows have purchased a Super Paintball Deluxe game set from Tycow, the cow-toy manufacturer. Bessie, knowing you can help, has partitioned the pasture into a set of N x N unit squares (1 &lt;= N &lt;= 100) and compiled a list of the K (1 &lt;= K &lt;= 100,000) locations (1 &lt;= R_i &lt;= N; 1 &lt;= C_i &lt;= N) of every one of her opponents in the Paintball game.</p>

<p>This paintball game features a paintball gun that can shoot paintballs in any of eight directions: north, south, east, west, and the diagonals that split those directions exactly (northeast, southeast, northwest, southwest).</p>

<p>Bessie wants you to tell her the total number of squares she can occupy and still be able to shoot all of her opponents (she can even shoot them if she shares the same square as they occupy!).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and K</li>
	<li>Lines 2..K+1: Line i+1 describes cow i&#39;s location with two space-separated integers: R_i and C_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that tells how many different locations Bessie may occupy if she is to be able to shoot any cow according to the shooting rules.</li>
</ul>

### 힌트

<p>The pasture has 4 rows and 4 columns. Bessie needs to shoot cows at (2,1), (2,3), and (4,1):</p>

<pre>
           . . . .
           C . C .  
           . . . .   &lt;---  Cow locations
           C . . .</pre>

<p>Bessie can occupy any of these cells: (2,1), (2,3), (3,2), (4,1), and (4,3). The diagram below notates possibly shared spaces by &#39;*&#39;:</p>

<pre>
        .. . .           . . . .
        B . B .   ---\    * . * .
        . B . .   ---/    . B . .
        B . B .           * . B .
   Potential Bessie     Bessie &amp;amp; Cows
     Locations</pre>