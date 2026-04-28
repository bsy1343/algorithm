# [Gold III] Checkers - 6079

[문제 링크](https://www.acmicpc.net/problem/6079)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 30, 맞힌 사람: 28, 정답 비율: 71.795%

### 분류

구현, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>The cows have taken up the game of checkers with a vengeance. Unfortunately, despite their infinite enjoyment of playing, they are terrible at the endgame. They want your help.</p>

<p>Given an NxN (4 &lt;= N &lt;= 30) checkboard, determine the optimal set of moves to end the game on the next move. Checkers move only on the &#39;+&#39; squares and capture by jumping &#39;over&#39; an opponent&#39;s piece. The piece is removed as soon as it is jumped. See the example below where N=8:</p>

<pre>
- + - + - + - +  The K&#39;s mark Bessie&#39;s kings; the o&#39;s represent the
+ - + - + - + -  opponent&#39;s checkers. Bessie always moves next. The
- + - K - + - +  Kings jump opponent&#39;s checkers successively in any
+ - + - + - + -  diagonal direction (and removes pieces when jumped).
- o - o - + - +
+ - K - + - + -  For this board, the solution requires the lower left
- o - + - + - +  King to jump successively across all three of the
+ - K - + - K -  opponents&#39; checkers, thus ending the game (moving K
                 marked as &gt;K&lt;):</pre>

<pre>
   Original          After move 1       After move 2        After move 3
- + - + - + - +     - + - + - + - +    - + - + - + - +     - + - + - + - +
+ - + - + - + -     + - + - + - + -    + - + - + - + -     + - + - + - + -
- + - K - + - +     - + - K - + - +    - + - K - + - +     - + - K - + - +
+ - + - + - + -     + - + - + - + -    + -&gt;K&lt;- + - + -     + - + - + - + -
- o - o - + - +     - o - o - + - +    - + - o - + - +     - + - + - + - +
+ - K - + - + -    &gt;K&lt;- K - + - + -    + - K - + - + -     + - K -&gt;K&lt;- + -
- o - + - + - +     - + - + - + - +    - + - + - + - +     - + - + - + - +
+ -&gt;K&lt;- + - K -     + - + - + - K -    + - K - + - K -     + - K - + - K -</pre>

<p>The moves traversed these squares:</p>

<pre>
  1 2 3 4 5 6 7 8           R C
1 - + - + - + - +    start: 8 3
2 + - + - + - + -    move:  6 1
3 - + - K - + - +    move:  4 3
4 + - * - + - + -    move:  6 5
5 - o - o - + - +
6 * - K - * - + - 
7 - o - + - + - + 
8 + - K - + - K - </pre>

<p>Write a program to determine the (unique, as it turns out) game-ending sequence for an NxN input board if it exists. There is at least a king and at least one opponent piece on the board.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains N characters (each one of: &#39;-&#39;, &#39;+&#39;, &#39;K&#39;, or &#39;o&#39;) that represent row i of a proper checkboard.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..?: If this sequence of moves is impossible, output &quot;impossible&quot; on a line by itself. If such a sequence exist, each line contains two space-separated integers that represent successive locations of a king whose moves will win the game.</li>
</ul>

<p>&nbsp;</p>