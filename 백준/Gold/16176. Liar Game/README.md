# [Gold II] Liar Game - 16176

[문제 링크](https://www.acmicpc.net/problem/16176)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 28, 맞힌 사람: 18, 정답 비율: 51.429%

### 분류

분할 정복을 이용한 거듭제곱, 수학, 정수론

### 문제 설명

<p>During the ressurection round 2 of Liar Game, Kanzaki Nao was fooled by Fukunaga Yuuji in a &quot;Light vs. Dark&quot; card game, where Kanzaki Nao chose the &quot;Light&quot; and Fukunaga Yuuji chose &quot;Dark&quot;. The game rules is as follows:</p>

<blockquote>Two playing cards are placed inside a bag:
<ol>
	<li>The &quot;Light&quot; card: a regular Joker card with one side printed Joker and a back on the other side.</li>
	<li>The &quot;Dark&quot; card: a misprint card that has a back on both sides.</li>
</ol>
The game consists of multiple rounds, with one round following these steps:

<ol>
	<li>Fukunaga shakes up the bag, and then Kanzaki pulls out a card from the bag.</li>
	<li>If the Joker is face-up when pulled out, it is returned to the bag and proceed to the next round (this round is lost). Otherwise the card is flipped over.</li>
	<li>If the card is the Joker, the &quot;Light&quot; player gets 1 point, otherwise it must be the misprint card and the &quot;Dark&quot; player gets 1 point.</li>
	<li>The card is then returned to the bag and proceed to the next round.</li>
</ol>
</blockquote>

<p>Here we are dealing with a more general &quot;Light vs. Dark&quot; game. Suppose there are N cards in the bag. One of them is the &quot;Light&quot; card, and all of the other cards are the &quot;Dark&quot; cards. Akiyama Shinichi, a mastermind swindler, wants to know the exact probability of Kanzaki Nao getting exactly K points in the game after R rounds.</p>

### 입력

<p>The first line of input contains an integer&nbsp;<i>T</i>&nbsp;(1 &lt;=&nbsp;<i>T</i>&nbsp;&lt;= 2500), the number of test cases follow.</p>

<p>Each testcase is described in one line consisting 3 integers:&nbsp;<i>N</i>,&nbsp;<i>R</i>,&nbsp;<i>K</i>&nbsp;where 1 &lt;=&nbsp;<i>N</i>,<i>R</i>&nbsp;&lt;= 100,000 and 0 &lt;=&nbsp;<i>K</i>&nbsp;&lt;=&nbsp;<i>R</i>.</p>

### 출력

<p>For each testcase, output a single line:&nbsp;<b>(<i>P</i>&nbsp;* (2*<i>N</i>)<sup><i>R</i></sup>) mod 1000003</b>, where&nbsp;<i>P</i>&nbsp;is the probability of Kanzaki Nao gets&nbsp;<i>K</i>&nbsp;points (picked the face-down Joker card&nbsp;<i>K</i>&nbsp;times) in a game consisting of&nbsp;<i>R</i>&nbsp;rounds and&nbsp;<i>N</i>&nbsp;cards.</p>