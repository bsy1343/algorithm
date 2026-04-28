# [Gold I] Grid Nim - 5232

[문제 링크](https://www.acmicpc.net/problem/5232)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>While hiding out in the Outlands, Sam and Quorra are getting bored and start playing a game called <em>grid nim</em> which is a complex variation on the classic game of <em>nim</em>. The game board consists of n heaps arranged in a sequence, each containing a number of identical coins (see figure). The two players move alternately. When a player moves, he or she chooses a heap from either the left end or the right end of the sequence, and removes it from the sequence. The game is made more complex by the restriction that a player cannot select three consecutive heaps in three consecutive turns (this restriction does not apply when there is only one heap left at the end of the game). The game is over when the board is exhausted. The first player to play wins if the total number of coins he or she has selected is at least as much as the total number of coins collected by the second player. Otherwise the second player wins.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5232.%E2%80%85Grid%E2%80%85Nim/086994ba.png" data-original-src="https://upload.acmicpc.net/158871e7-bafb-41b2-96ec-ff9253e169fa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 502px; height: 143px;" /></p>

<p>Here is one possible way the game may proceed in the example shown in the figure, assuming Sam moves first.</p>

<ul>
	<li>Sam takes heap 1 from left end (7 coins)</li>
	<li>Quorra takes heap 5 from right end (5 coins)</li>
	<li>Sam takes heap 4 from right end (3 coins)</li>
	<li>Quorra takes heap 3 from right end (4 coins)</li>
	<li>Sam takes heap 2 (0 coins)</li>
</ul>

<p>At the end, Sam has 7 + 3 = 10 coins which is more than Quorra, and hence Sam wins this game. In fact, Sam can win no matter what Quorra does &ndash; if she chooses the heap 2 with 0 coins, then Sam can take the heap with 5 coins, and end up with a higher total score of 15 or 16 coins.</p>

<p>The restriction mentioned above does not come up in this example. However, consider an example where there are a large number of heaps, and consider an initial sequence of moves:</p>

<p style="text-align: center;">Sam - Left, Quorra - Right, Sam - Left, Quorra - Right</p>

<p>In the next turn, Sam cannot choose from the left end again, and must take the heap from the right end. Now the sequence of moves is:</p>

<p>Sam - Left, Quorra - Right, Sam - Left, Quorra - Right, Sam - Right</p>

<p>Now, although Quorra chose from the Right end last two times, she can choose either from the Right or the Left end. Since Sam just chose from the Right end, Quorra will not be taking a 3rd consecutive heap and hence she can choose from the Right end.</p>

<p>Quorra is very good at playing this game and always makes the best possible move. To account for this, she allows Sam to play first. Your goal is to help Sam win. Specifically, given an input board, your goal is to find out whether Sam (playing first) has a winning strategy assuming Quorra always makes the best possible move at every turn.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&le; 50). After that, each line contains one test case. The test case begins with the number of elements in the sequence, k, and then we have k numbers which specify the numbers of coins in the heaps in the sequence. Assume all numbers are &ge; 0, and &lt; 2<sup>30</sup>.</p>

### 출력

<p>For each test case, you are to output &ldquo;YES&rdquo; (if Sam, playing first, has a winning strategy), or &ldquo;NO&rdquo; (if he does not).</p>