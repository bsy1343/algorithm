# [Silver IV] Deal or No Deal - 33551

[문제 링크](https://www.acmicpc.net/problem/33551)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 46, 정답: 27, 맞힌 사람: 19, 정답 비율: 54.286%

### 분류

구현

### 문제 설명

<p>In the popular television show <em>Deal or No Deal</em>, produced by Endemol, participants have a chance of winning high amounts of money. The game is derived from the Dutch game <em>Miljoenenjacht</em>. It is often played with 26 boxes containing certain sums of money. First, the player selects a random box which he keeps. The contestant then begins choosing boxes that are to be removed from play. The amount inside each chosen box is immediately revealed after the contestant has chosen a box. The amount revealed cannot be inside the case the contestant has initially chosen. Throughout the game, after a predetermined number of cases have been opened, the banker offers the contestant an amount of money to quit the game. The bank has the following simple formula for making a offer: they calculate the average of all amounts of money in the unopened boxes (excluding the chosen box by the contestant) and multiply this average by 0.9. This offer is presented to the player and he then answers the famous question, choosing:</p>

<ul>
	<li><em>deal</em>, accepting the offer presented and ending the game. If the contestant accepts the offer, he or she cannot accept subsequent offers the bank makes later in the game.</li>
	<li><em>no deal</em>, rejecting the offer and continuing the game.</li>
</ul>

<p>This process of removing cases and receiving offers continues, until either the player deals, or all offers have been rejected and the values of all unselected boxes are revealed. Should a player end the game by taking a deal, the game is continued from that point to see how much the player could have won by continuing the game. Depending on subsequent choices and offers, it is determined whether or not the contestant made a good deal, i.e. won more than if the game were allowed to continue.</p>

<p>The game producer keeps good track of the amount of money that has been paid to contestants and the amount of money contestants could have won by playing to the end of the game by refusing every offer the bank makes. Recently, this database got corrupted. Luckily, they found some documents in a hidden archive, describing the progress of each of their games and specifying the choices contestants make. Each documents gives information about a single game. Using this document, it is possible to reconstruct the amount of money that the contestant actually won and could have won by playing to the very end of the game. They hired you to write a program that computes these two amounts of money.</p>

### 입력

<ul>
	<li>On the first line there is one integer $ n $: the number of boxes in the game ($ 1 \leq n \leq 1000 $).</li>
	<li>After that, there are $ n $ space-separated numbers, each describing the amount of money in box $ i $ ($ 0.01 \leq m[i] \leq 5000000 $ where $ m[i] $ is the amount of money in box $ i $).</li>
	<li>After that, there are two space-seperated integers $ a $ and $ q $, $ a $ being the box that is chosen by the contestant (the first box has index 1) and $ q $ being the number of actions that have been executed during the game.</li>
	<li>After that, $ q $ lines follows with each line specifying a possible action during the game. Each action is specified by a single uppercase character. The several actions are:
	<ul>
		<li>The contestant opens a box, specified by the character <em>O</em>. The character is followed by the index of the box that is opened (the first box has index 1).</li>
		<li>The bank makes an offer. This is indicated by the character <em>B</em>, followed by the choice of the contestant (deal or no deal). A <em>D</em> follows if the contestant accepts the offer and a <em>N</em> follows if the contestant refuses the offer.</li>
	</ul>
	</li>
</ul>

### 출력

<p>Two lines with on the first line, the amount of money the contestant could have won by playing to the end of the game. On the second line, output the amount of money that the contestant has actually won. The numbers should be rounded to two decimals.</p>