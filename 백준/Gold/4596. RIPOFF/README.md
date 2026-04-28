# [Gold V] RIPOFF - 4596

[문제 링크](https://www.acmicpc.net/problem/4596)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 80, 정답: 57, 맞힌 사람: 38, 정답 비율: 84.444%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Business has been slow at Gleamin&rsquo; Lemon Used Auto Sales. &nbsp;In an effort to bring in new customers, management has created the Rebate Incentive Program Of Fabulous Fun (or RIPOFF). &nbsp;This is a simple game which allows customers to try and win a rebate on an automobile purchase. &nbsp;The RIPOFF game is a board game where each square is labeled with a rebate amount. &nbsp;The customer advances through the board by spinning a spinner. &nbsp;Each square he lands on adds to his total rebate amount. &nbsp;When he reaches the end of the board he is rewarded with the total rebate amount.</p>

<p>Of course, given the company involved, it should come as no surprise that there are a couple of catches written in the fine print. &nbsp;The first is that there is a limit to the number of turns the customer has to finish the game; if he doesn&rsquo;t reach the end within the allotted number of turns then he loses his rebate. &nbsp;The second is that some of the squares actually have a negative amount which subtract from the rebate instead of adding to it. &nbsp;A particularly unlucky customer might even come out of the game with a negative rebate.</p>

<p>Even with these catches, the management of Gleamin&rsquo; Lemon is concerned that someone might win a particularly large rebate&mdash;something they would like to avoid at all costs. &nbsp;Your job is to take a particular configuration for the RIPOFF game and decide the maximum rebate a customer could possibly obtain.</p>

<p>Consider, for example, the game board below. &nbsp;Assume we have 5 turns to finish the game, and each turn we can move between 1 and 4 spaces depending on what we spin. &nbsp;Notice that we must start just before the board begins, so spinning a 1 causes us to land on the first square. &nbsp;Also notice we must end by landing past the end of the last square. &nbsp;It does not have to be exact; any number that gets us off of the board will work.</p>

<p style="text-align:center"><img alt="" src="/upload/images2/ripoff1.png" style="height:74px; width:543px" /></p>

<p style="text-align:center">Figure 1</p>

<p>The illustration shows two different possible ways the game might go. &nbsp;Following the arrows on the top, if we spin a 2, 3, 4, 1, and 1 respectively, we will win a total rebate of 50 + 30 + 20 + 70 = \$170. &nbsp;However, the best possible rebate we could win would be \$220. &nbsp;We would win this amount if we spun a 1, 3, 2, 4, and 1 respectively, as shown by the lower path. &nbsp;Notice that we did not land on every square with a positive number; if we had we wouldn&rsquo;t have been able to make it to the end of the board before the 5 turns was up.</p>

<p style="text-align:center"><img alt="" src="/upload/images2/ripoff2.png" style="height:74px; width:543px" /></p>

<p style="text-align:center">Figure 2</p>

<p>The illustration in Figure 2 shows a game where we have 4 turns to finish the game, and can move up to 3 spaces each turn. &nbsp;Again, two different paths are shown, the one on top earning a rebate of -\$150, and the one on bottom earning a rebate of -\$100. &nbsp;In fact, -\$100 is the highest possible rebate we could earn for this game (a fact that would no doubt please the management of Gleamin&rsquo; Lemon). &nbsp;Of course, there also might be a sequence of moves in which we do not reach the end before the turn limit&mdash;e.g. spinning a 1 every time. &nbsp;Although not finishing would actually be preferable to finishing with a negative rebate, in this problem we are only going to consider sequences of moves which allow us to reach the end before the turn limit.</p>

### 입력

<p>The input consists of one to twenty data sets, followed by a line containing only 0.</p>

<p>The first line of a data set contains three space separated integers N S T, where</p>

<ul>
	<li>N is the total number of squares on the board, 2 &le; N &le; 200.</li>
	<li>S is the maximum number of spaces you may advance in each turn, 2 &le; S &le; 10.</li>
	<li>T is the maximum number of turns allowed, where N + 1 &le; ST and T &le; N + 1.</li>
</ul>

<p>The data set ends with one or more lines containing a total of N integers, the numbers on the board. &nbsp;Each number has magnitude less than 10000.</p>

### 출력

<p>The output for each data set is one line containing only the maximum possible rebate that can be earned by completing the game.</p>

<p>To complete the game you must advance a total of N + 1 spaces in at most T turns, each turn advancing from 1 to S spaces inclusive. &nbsp;It will always be possible to complete a game. &nbsp;However, there may be a very large number of different turn sequences that will finish, so you will need to be careful in choosing your algorithm.</p>

<p>The sample input data corresponds to the games in the Figures.</p>