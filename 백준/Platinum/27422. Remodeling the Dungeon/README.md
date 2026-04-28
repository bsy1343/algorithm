# [Platinum II] Remodeling the Dungeon - 27422

[문제 링크](https://www.acmicpc.net/problem/27422)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 160, 정답: 58, 맞힌 사람: 56, 정답 비율: 40.288%

### 분류

구현, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>The Queen of Icpca resides in a castle peacefully. One day, she heard that many secret agents had been active in other nations, and got worried about the security of the castle.</p>

<p>The castle has a rectangular dungeon consisting of $h$ rows of $w$ square rooms. Adjacent rooms are separated by a wall. Some walls have doorways making the separated rooms intercommunicate. The entrance and the exit of the dungeon are in the rooms located at two diagonal extreme corners. The dungeon rooms form a <em>tree</em>, that is, the exit room is reachable from every room in the dungeon through a unique route that passes all the rooms on the route only once.</p>

<p>In order to enhance the security of the castle, the Queen wants to remodel the dungeon so that the number of rooms on the route from the entrance room to the exit room is maximized. She likes the tree property of the current dungeon, so it must be preserved. Due to the cost limitation, what can be done in the remodeling is to block one doorway to make it unavailable and to construct one new doorway instead on a wall (possibly on the same wall).</p>

<p>Your mission is to find a way to remodel the dungeon as the Queen wants.</p>

### 입력

<p>The input consists of a single test case in the following format.</p>

<blockquote>
<p>$h$ $w$</p>

<p>$c_{1,1}c_{1,2}\cdots c_{1,2w+1}$</p>

<p>$c_{2,1}c_{2,2}\cdots c_{2,2w+1}$</p>

<p>$\vdots$</p>

<p>$c_{2h+1,1}c_{2h+1,2}\cdots c_{2h+1,2w+1}$</p>
</blockquote>

<p>$h$ and $w$ represent the size of the dungeon, each of which is an integer between $2$ and $500$, inclusive. The characters $c_{i,j}$ ($1 &le; i &le; 2h + 1$, $1 &le; j &le; 2w + 1$) represent the configuration of the dungeon as follows:</p>

<ul>
	<li>$c_{2i,2j} =$ <code>&lsquo;.&rsquo;</code> for $1 &le; i &le; h$ and $1 &le; j &le; w$, which corresponds to the room $i$-th from the north end and $j$-th from the west end of the dungeon; such a room is called the room $(i, j)$.</li>
	<li>$c_{2i+1,2j} =$ <code>&lsquo;.&rsquo;</code> or <code>&lsquo;-&rsquo;</code> for $1 &le; i &le; h - 1$ and $1 &le; j &le; w$, which represents the wall between the rooms $(i, j)$ and $(i + 1, j)$; the character <code>&lsquo;.&rsquo;</code> means that the wall has a doorway and <code>&lsquo;-&rsquo;</code> means it has no doorway</li>
	<li>$c_{2i,2j+1} =$ <code>&lsquo;.&rsquo;</code> or <code>&lsquo;|&rsquo;</code> for $1 &le; i &le; h$ and $1 &le; j &le; w - 1$, which represents the wall between the rooms $(i, j)$ and $(i, j + 1)$; the character <code>&lsquo;.&rsquo;</code> means that the wall has a doorway and <code>&lsquo;|&rsquo;</code> means it has no doorway.</li>
	<li>$c_{1,2j} = c_{2h+1,2j} =$ <code>&lsquo;-&rsquo;</code> ($1 &le; j &le; w$) and $c_{2i,1} = c_{2i,2w+1} =$ <code>&lsquo;|&rsquo;</code> ($1 &le; i &le; h$), which correspond to the outer walls of the dungeon.</li>
	<li>$c_{2i+1,2j+1} =$ <code>&lsquo;+&rsquo;</code> for $0 &le; i &le; h$ and $0 &le; j &le; w$, which corresponds to an intersection of walls or outer walls.</li>
</ul>

<p>The entrance and the exit of the dungeon are in the rooms $(1, 1)$ and $(h, w)$, respectively. The configuration satisfies the tree property stated above.</p>

### 출력

<p>Output the maximum length of the route from the entrance room to the exit room achievable by the remodeling, where the length of a route is the number of rooms passed including both the entrance and exit rooms.</p>

### 힌트

<p>In the first sample, if you block the doorway between the rooms $(1, 1)$ and $(1, 2)$ and construct a new doorway between the rooms $(2, 1)$ and $(2, 2)$, then the unique route from $(1, 1)$ to $(2, 3)$ passes all of the $6$ rooms, which is obviously the maximum.</p>

<p>In the second sample, any remodeling keeps the length of the unique route from $(1, 1)$ to $(2, 3)$ to be exactly $4$.</p>

<p>In the third sample, one of the optimal ways is blocking the doorway between the rooms $(4, 2)$ and $(4, 3)$ and constructing a new doorway between the rooms $(2, 4)$ and $(3, 4)$.</p>

<p>The configurations after the remodeling described above are as follows.</p>

<pre>
+-+-+-+    +-+-+-+    +-+-+-+-+-+
|.|...|    |...|.|    |...|...|.|
+.+.+.+    +.+.+.+    +-+.+.+.+.+
|...|.|    |.|...|    |...|.|.|.|
+-+-+-+    +-+-+-+    +.+.+.+.+.+
                      |.|...|.|.|
                      +.+.+-+.+.+
                      |.|.|...|.|
                      +-+.+.+-+.+
                      |...|.....|
                      +-+-+-+-+-+</pre>