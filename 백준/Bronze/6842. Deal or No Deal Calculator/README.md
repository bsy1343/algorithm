# [Bronze I] Deal or No Deal Calculator - 6842

[문제 링크](https://www.acmicpc.net/problem/6842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 84, 정답: 67, 맞힌 사람: 59, 정답 비율: 80.822%

### 분류

수학, 구현

### 문제 설명

<p>&ldquo;Deal or No Deal&rdquo; (TM) is a game show on NBC. (You can play it at http://www.nbc.com/Deal_or_No_Deal/game/flash.shtml)</p>

<p>In the CCC version of the game, there are 10 possible dollar amounts: $100, $500, $1 000, $5 000, $10 000, $25 000, $50 000, $100 000, $500 000, $1 000 000 sealed in imaginary briefcases. These dollar amounts are numbered 1 &ndash; 10 (i.e. 1 ! $100, 2 ! $500, 3 ! $1 000, ..., 10 ! $1 000 000). Before the game starts the contestant will have chosen one of the briefcases as his/hers to possibly keep. During the game, some of the ten possible dollar amounts have been eliminated from the game because the contestant has selected some of the other briefcases and revealed the amounts inside.</p>

<p>At some point, the contestant will stop opening briefcases, and a &ldquo;Banker&rdquo; will offer the contestant cash in exchange for what might be contained in his/her chosen briefcase. Then the contestant is asked: &ldquo;Deal or No Deal?&rdquo;.</p>

<p>Write a program that helps a player decide if he/she should choose &ldquo;deal&rdquo; or &ldquo;no deal&rdquo;, by calculating the average of the remaining amounts (i.e., all unopened briefcases, including his/her &ldquo;own&rdquo; briefcase), and comparing that value to the &ldquo;Banker&rsquo;s&rdquo; offer. If the offer is higher than the average, then the player should &rdquo;deal&rdquo; otherwise, the player should say &ldquo;no deal&rdquo;.</p>

### 입력

<p>The user must input a number n (1  n &lt; 10) which indicates how many cases have been opened so far, followed by a list of n integers between 1 and 10 representing the values in the game that have been eliminated, followed by the &ldquo;Banker&rsquo;s&rdquo; offer. For example: <code>3 2 5 10 300</code> indicates that briefcases containing \$500, \$10 000, and \$1 000 000 have been eliminated and the Banker&rsquo;s offer is \$300. You may assume that no duplicate case numbers are entered for the eliminated values, and you may assume that the &ldquo;Banker&rsquo;s&rdquo; offer is an integer greater than 10.</p>

### 출력

<p>The program will print out one of two statements: &ldquo;deal&rdquo; or &ldquo;no deal&rdquo;.</p>