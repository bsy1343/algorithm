# [Silver II] Solitaire - 11335

[문제 링크](https://www.acmicpc.net/problem/11335)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 56, 정답: 13, 맞힌 사람: 13, 정답 비율: 31.707%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You have a deck of N cards valued from 1 to N. The game starts with cards facing down in the &quot;initial&quot; location. There are also three other locations where you can play your cards face up (once they are face up at the top of any of the other piles): &quot;goal&quot;, &quot;helper&quot; and &quot;pile&quot;. You win the game once all the cards are placed on the goal in ascending order (N on the top). Rules:</p>

<ol>
	<li>you can play cards onto &quot;goal&quot; only if the top &quot;goal&quot; card&#39;s value is one less than the value of the card you are trying to place (if &quot;goal&quot; is empty, you can only play the card with value 1(one) there). E.g. if the top card in &quot;goal&quot; is 3, you can only play 4 to &quot;goal&quot;.</li>
	<li>you can play cards onto &quot;helper&quot; only if the top &quot;helper&quot; card&#39;s value is one more than the value of the card you are trying to place (if &quot;helper&quot; is empty, you can only play the card with value N there). E.g. if the top card in &quot;helper&quot; is 8, you can only play 7 to &quot;helper&quot;.</li>
	<li>you can only move a card onto the &quot;pile&quot; from the top of the &quot;initial&quot; deck by turning that card over(remember? cards in the initial deck are facing down).</li>
	<li>once all cards are facing up (&quot;initial&quot; deck is empty) and if the game is not finished yet, take the cards from the &quot;pile&quot; and turn all of them over onto the &quot;initial&quot; position. This will be your new &quot;initial deck&quot;. To clarify - the top card in &quot;pile&quot; (facing up) will become the bottom card in &quot;initial&quot; (facing down)</li>
</ol>

<p>What is the minimum number of type 4 moves you need to finish the game?</p>

### 입력

<p>First line of the input contains an integer T (1 &lt;= T &lt;= 100) - the number of test cases. Each test case consists of two lines:</p>

<p>First line contains an integer N ( 1 &lt;= N &lt;= 1000)</p>

<p>Second line contains description of the &quot;initial&quot; deck. The first number is the value of the card at the bottom of the initial deck facing down (so the last card will be played first onto &quot;pile&quot;). This will be a permutation of the list of integers from 1 to N.</p>

### 출력

<p>For each test case print the minimum number of type 4 moves you neeed to &quot;win&quot; the game on a separate line.</p>