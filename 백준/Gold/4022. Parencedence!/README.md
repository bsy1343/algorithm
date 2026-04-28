# [Gold I] Parencedence! - 4022

[문제 링크](https://www.acmicpc.net/problem/4022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Parencedence is a brand new two-player game that is sweeping the country (that country happens to be Liechtenstein, but no matter). The game is played as follows: a computer produces an arithmetic expression made up of integer values and the binary operators &lsquo;+&rsquo;, &lsquo;-&rsquo; and &lsquo;*&rsquo;. There are no parentheses in the expression. If Player 1 goes first he/she can put parentheses around any one operator and its two operands; the parenthesized expression is evaluated and its value is used in its place. Player 2 then does the same, and the game proceeds accordingly, Player 1 and Player 2 alternating turns. Player 1&rsquo;s object is to maximize the final value, while Player 2&rsquo;s object is to minimize it. A sample round might go as follows:</p>

<pre>
Initial expression: 3-6*4-7+12
Player 1&rsquo;s move: 3-6*(4-7)+12 &rarr; 3-6*-3+12
Player 2&rsquo;s move: (3-6)*-3+12 &rarr; -3*-3+12
Player 1&rsquo;s move: (-3*-3)+12 &rarr; 9+12
Player 2&rsquo;s move: (9+12) &rarr; 21</pre>

<p>A game of Parencedence is played in two rounds, each using the same initial unparenthesized expression: in the first round, Player 1 goes first, and in the second, Player 2 goes first (Player 1 is always trying to maximize the result and Player 2 is always trying to minimize the result in both rounds, regardless of who goes first). Let r<sub>1</sub> be the result of the first round and r<sub>2</sub> the result of the second round. If r<sub>1</sub> &gt; &minus;r<sub>2</sub>, then Player 1 wins; if r<sub>1</sub> &lt; &minus;r<sub>2</sub> then Player 2 wins; otherwise the game ends in a tie. Your job is to write a program to determine the final result assuming both players play as well as possible.</p>

### 입력

<p>The first line of the input file will contain an integer n indicating the number of test cases. The test cases will follow, one per line, each consisting of a positive integer m &le; 9 followed by an arithmetic expression. The value of m indicates the number of binary operators in the arithmetic expression. The only operators used will be &lsquo;+&rsquo;, &lsquo;-&rsquo; and &lsquo;*&rsquo;. The &lsquo;-&rsquo; operator can appear as both a unary and a binary operator. All binary operators will be surrounded by a single space on each side. There will be no space after any unary &lsquo;-&rsquo;. No combination of parentheses will ever result in an integer overflow or underflow.</p>

### 출력

<p>For each test case, output the case number followed by three lines. The first contains the first set of operands and operator to be parenthesized in round 1 (when Player 1 goes first) and r1. The second line contains the analagous output for round 2. The third line contains either the phrase &ldquo;Player 1 wins&rdquo;, &ldquo;Player 2 wins&rdquo; or &ldquo;Tie&rdquo; depending on the values of r<sub>1</sub> and r<sub>2</sub>. In the first two output lines if there is a choice between which operator should be parenthesized first, use the one which comes earliest in the original expression. Follow the format used in the examples.</p>