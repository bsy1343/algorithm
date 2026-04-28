# [Platinum II] Missing Piece 2001 - 9985

[문제 링크](https://www.acmicpc.net/problem/9985)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 151, 정답: 75, 맞힌 사람: 47, 정답 비율: 43.925%

### 분류

브루트포스 알고리즘, 자료 구조, 해시를 사용한 집합과 맵, 중간에서 만나기, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9985.%E2%80%85Missing%E2%80%85Piece%E2%80%852001/6da954ef.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9985/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:218px; width:225px" /></p>

<p>Remember those wacky number puzzles you used to win at birthday parties as a kid? Well, they&#39;re back, but this time with a digital twist. As with everything else, kids today are spoiled, having access to technology to make things easier for them. And why should games be any different?</p>

<p>With this in mind Wiltin&#39; Badley has decided to release a 21st Century version of this old puzzle favorite and call it Missing Piece 2001. Since this is a modern version of the game, it will be accompanied with a software supplement to give the player an idea of the skill level necessary to solve the puzzle. The software supplement will allow the player to enter in the initial board configuration along with the expected final board configuration, and the software will tell the player whether it is solvable within a certain number of moves. If the puzzle is solvable within the selected number of moves, the software will then give the optimal number of moves necessary to solve the puzzle. You have been hired by Wiltin&#39; Badley as a Software Engineer to write this very software.</p>

<p>As with any good software, the ability of your software to be flexible is a must. Therefore, you are to design this software to allow the user to enter the dimensions of the game board, the desired number of moves in which the puzzle is to be solved, the initial board configuration, and the final board configuration. This user input will take into account different game board sizes (different-sized game boards sold separately, for a nominal fee of course), different number of moves necessary to solve the puzzle (so the player can tell if the puzzle is solvable given his/her skill level), as well as any solution set the player may want to try.</p>

<p>Game Piece Movement</p>

<p>A valid move consists of moving a game piece (number) which is adjacent to the missing piece (&#39;X&#39;) in the direction of the missing piece. Note that only game pieces that are adjacent to the missing piece may be moved, and the only valid directions of movement are UP, DOWN, LEFT, or RIGHT (depending on the placement of the game piece in relation to the missing piece).</p>

### 입력

<p>Input to this problem will consist of a (non-empty) series of up to 10 data sets. Each data set will be formatted according to the following description, and there will be no blank lines separating data sets.</p>

<p>Each data set consists of 4 components:</p>

<ol>
	<li>Start Line - A single line, &quot;START D N&quot;, where 3 &lt;= D &lt;= 10 and 0 &lt;= N &lt;= 15</li>
	<li>Initial Board Layout - Consists of a D x D matrix of integers ranging from 1 to (D2 - 1) inclusive (where D is the Board Dimension), and an &#39;X&#39; to denote the missing piece. This matrix represents the layout of the game board prior to the solution attempt.</li>
	<li>Solved Board Layout - Consists of a D x D matrix of integers ranging from 1 to (D2 - 1) inclusive (where D is the Board Dimension), and an &#39;X&#39; to denote the missing piece. This matrix represents the final layout of the game board necessary to successfully solve the puzzle.</li>
	<li>End Line - A single line, &quot;END&quot;</li>
</ol>

<p>Notes:</p>

<ul>
	<li>On the &quot;Start&quot; line of the data set, D represents the dimensions of the puzzle board.</li>
	<li>On the &quot;Start&quot; line of the data set, N represents the number of moves the player wants to be able to solve the puzzle within.</li>
	<li>Both game board layout matrices will contain ALL numbers within the range mentioned above (inclusive), with no missing or repeated numbers, and one &#39;X&#39; (missing piece).</li>
</ul>

### 출력

<p>For each data set, there will be exactly one output set, and there will be a single blank line separating output sets.</p>

<p>An output set consists of a string telling the player whether the puzzle is solvable within the number of moves specified in the input, along with the optimal number of moves necessary to obtain the Solution Board Layout if the puzzle is solvable within the number of specified moves. If the puzzle is not solvable within the specified number of moves, the number of specified moves is echoed back to the output. The output for each data set will consist of a single line, specified by the following format:</p>

<pre>
&lt;Answer String&gt; &quot;WITHIN&quot; [Number Moves] &quot;MOVES&quot;</pre>

<p>Notes:</p>

<p>IF the puzzle is able to be solved within the specified number of moves:</p>

<pre>
Answer String = &quot;SOLVABLE&quot;
Number Moves = &lt;An integer representing the optimal number of moves&gt;</pre>

<p>ELSE</p>

<pre>
Answer String = &quot;NOT SOLVABLE&quot;
Number Moves = &lt;An integer representing the number of moves specified as input&gt;</pre>