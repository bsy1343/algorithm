# [Platinum V] Number Game - 6329

[문제 링크](https://www.acmicpc.net/problem/6329)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 비트마스킹, 게임 이론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Christine and Matt are playing an exciting game they just invented: the Number Game. The rules of this game are as follows.</p>

<p>The players take turns choosing integers greater than 1. First, Christine chooses a number, then Matt chooses a number, then Christine again, and so on. The following rules restrict how new numbers may be chosen by the two players:</p>

<ul>
	<li>A number which has already been selected by Christine or Matt, or a multiple of such a number, cannot be chosen.</li>
	<li>A sum of such multiples cannot be chosen, either.</li>
</ul>

<p>If a player cannot choose any new number according to these rules, then that player loses the game.</p>

<p>Here is an example: Christine starts by choosing 4. This prevents Matt from choosing 4, 8, 12, etc. Let&rsquo;s assume that his move is 3. Now the numbers 3, 6, 9, etc. are excluded, too; furthermore, numbers like: 7 = 3 + 4; 10 = 2  3 + 4; 11 = 3 + 2  4; 13 = 3  3 + 4;::: are also not available. So, in fact, the only numbers left are 2 and 5. Christine now selects 2. Since 5 = 2+3 is now forbidden, she wins because there is no number left for Matt to choose.</p>

<p>Your task is to write a program which will help play (and win!) the Number Game. Of course, there might be an infinite number of choices for a player, so it may not be easy to find the best move among these possibilities. But after playing for some time, the number of remaining choices becomes finite, and that is the point where your program can help. Given a game position (a list of numbers which are not yet forbidden), your program should output all winning moves.</p>

<p>A winning move is a move by which the player who is about to move can force a win, no matter what the other player will do afterwards. More formally, a winning move can be defined as follows.</p>

<ul>
	<li>A winning move is a move after which the game position is a losing position.</li>
	<li>A winning position is a position in which a winning move exists. A losing position is a position in which no winning move exists.</li>
	<li>In particular, the position in which all numbers are forbidden is a losing position. (This makes sense since the player who would have to move in that case loses the game.)</li>
</ul>

### 입력

<p>The input file consists of several test cases. Each test case is given by exactly one line describing one position.</p>

<p>Each line will start with a number n (1 &le; n &le; 20), the number of integers which are still available. The remainder of this line contains the list of these numbers a<sub>1</sub> ;:::; a<sub>n</sub> (2 &le; a<sub>i</sub> &le; 20).</p>

<p>The positions described in this way will always be positions which can really occur in the actual Number Game. For example, if 3 is not in the list of allowed numbers, 6 is not in the list, either.</p>

<p>At the end of the input file, there will be a line containing only a zero (instead of n); this line should not be processed.</p>

### 출력

<p>For each test case, your program should output &ldquo;Test case #m&rdquo;, where m is the number of the test case (starting with 1). Follow this by either &ldquo;There&rsquo;s no winning move.&rdquo; if this is true for the position described in the input file, or &ldquo;The winning moves are: w<sub>1</sub> w<sub>2</sub> ::: w<sub>k</sub>&rdquo; where the wi are all winning moves in this position, satisfying w<sub>i</sub> &lt; w<sub>i+1</sub> for 1 &le; i &lt; k. After this line, output a blank line.</p>