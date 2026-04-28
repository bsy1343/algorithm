# [Gold II] Game on two heaps - 24285

[문제 링크](https://www.acmicpc.net/problem/24285)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 84, 정답: 30, 맞힌 사람: 20, 정답 비율: 34.483%

### 분류

유클리드 호제법, 게임 이론, 수학, 정수론

### 문제 설명

<p>Two players are playing the following game:</p>

<p>They sit in front of two non-empty heaps of balls. For clarity, let us denote by A the less (or mostly equal) count of balls in the heaps. The other one is denoted by B (i.e., A &le; B). <u>The starting ratio A : B = &alpha;</u> is important throughout the course of the concrete game and remains intact, no matter how the numbers in the heaps change. The players move consecutively, <u>taking at least one ball from at least one of the heaps</u>. The one of them who cannot make a move, or makes a wrong move, loses the game. So the one, who has played the last correct move, wins.</p>

<p>Let us denote by x the number of balls, taken from one of the heaps, and by y the number of balls, taken from the other heap. We assume denoted by x the less (or mostly equal to the other) count of taken balls. So we can state a simple rule for a move to be correct:</p>

<ul>
	<li><strong>A move is correct only if x : y &ne; &alpha;, where 0 &le; x &le; y and y &gt; 0;</strong></li>
	<li><strong>There is, naturally, no way to take from a heap more balls than those left in it.</strong></li>
</ul>

<p>Let us consider an example, where A=12, B=18. <u>In this concrete game</u> <u><strong>the wrong</strong></u> ratio of taken balls is x:y = &alpha; = 12:18 = 2:3. Every other ratio of taken balls is correct. Here are some <strong>wrong</strong> (and therefore &ndash; losing) moves for the first player:</p>

<ol>
	<li>To take all balls, i. e. x=12, y=18. This move is obviously wrong, because x:y = 12:18 = 2:3 = &alpha;.</li>
	<li>To take three balls from heap A, leaving there 9, and two balls from heap B, leaving in it 16 balls. This move is wrong, because by it x=2, y=3 and x:y = 2:3 = &alpha;. ATTENTION! After a move of this kind the ratio of the balls in the heaps would become 9:16, but this DOES NOT CHANGE the fixed ratio &alpha;, it remains 2:3, the same as before the start of this concrete game!</li>
	<li>To take 8 balls from A and 12 from B, i. e. x=8, y=12, x:y=8:12=2:3. After this move the balls in A would become 4, and in B &ndash; 6. (The balls&rsquo; ratio in the heaps after this move does not change &ndash; 4:6=2:3. But we emphasize again that the moves do not influence the important ratio &alpha; for this concrete game, which is defined before its first move and stays constant until its end.)</li>
</ol>

<p>We can indicate many correct moves for the first player: to take one ball from any heap (0:1 = 0 &ne; &alpha;); to take a whole heap (for example &ndash; the second one, 0:18 = 0 &ne; &alpha;); to take maximum balls (12) from each heap (12:12 = 1 &ne; &alpha;); to take 10 balls from A and 5 from B (5:10 = 1:2 &ne; &alpha;) etc. Of course, it is wrong if the player wants to take from a heap more balls than those left in it. And do not forget to take at least one ball from any heap. The &ldquo;move&rdquo; x = y = 0 (i.e., &ldquo;I am leaving the situation intact.&rdquo;) is wrong (hence losing).</p>

<p>Design a program arelgame, which calculates the number of the winning first moves for the first player. A move is said to be &ldquo;winning&rdquo; if it leads to success, no matter how good or bad are the moves of the opponent.</p>

### 입력

<p>One line is read from the standard input, which contains only two space separated positive integers. These are the number of balls in the first, and the number of balls in the second heap, respectively.</p>

### 출력

<p>The program should send to the standard output one line, containing only one non-negative integer: the number of the winning first moves for the first player.</p>

### 제한

<p>The number of balls in each heap does not exceed 10<sup>18</sup>.</p>