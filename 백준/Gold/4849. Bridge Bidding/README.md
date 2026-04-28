# [Gold III] Bridge Bidding - 4849

[문제 링크](https://www.acmicpc.net/problem/4849)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

구현

### 문제 설명

<p>Bridge is a very complicated card game, and the bidding part is particularly difficult to master. The bidding is made even more difficult because players use different bidding conventions (meanings assigned to bids). In this problem, you are asked to write a program that suggests the first bid that should be made. The bidding conventions described below are simplified from those used by a certain person who shall remain nameless.</p>

<p>A bridge hand consists of 13 cards. Each card has a suit (spades, hearts, diamonds, or clubs) and a rank (A, K, Q, J, T, 9, 8, 7, 6, 5, 4, 3, 2). Here, the letter T denotes the card whose rank is 10. Before making a bid, an experienced bridge player studies the number of high card points (hcp) in the hand, as well as the distribution (the number of cards in each suit). The hcp contributed by each card is completely determined by its rank as follows:</p>

<table class="table table-bordered" style="width:20%">
	<thead>
		<tr>
			<th>Rank</th>
			<th>hcp</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>A</td>
			<td>4</td>
		</tr>
		<tr>
			<td>K</td>
			<td>3</td>
		</tr>
		<tr>
			<td>Q</td>
			<td>2</td>
		</tr>
		<tr>
			<td>J</td>
			<td>1</td>
		</tr>
		<tr>
			<td>others</td>
			<td>0</td>
		</tr>
	</tbody>
</table>

<p>For example, if the hand is:</p>

<ul>
	<li>Spades: A, 2</li>
	<li>Hearts: K, J, T, 9, 2</li>
	<li>Diamonds: 3</li>
	<li>Clubs: K, Q, 7, 4, 3</li>
</ul>

<p>Then this hand has 13 hcp and a distribution of 5&minus;5&minus;2&minus;1 (the distribution is usually listed in non&minus;increasing order). A balanced distribution is any one of 4&minus;3&minus;3&minus;3, 4&minus;4&minus;3&minus;2, and 5&minus;3&minus;3&minus;2.</p>

<p>In bridge, an opening bid is either &quot;pass&quot; or consists of a level (1&minus;7) and a trump suit. The trump suits are no trump, spades, hearts, diamonds, clubs ranked in decreasing order. Once a hand has been evaluated, the player applies the following list of (simplified) rules to determine the appropriate opening bid. In cases where multiple rules apply, the first one that applies should be used. An &quot;x&quot; in a distribution can be substituted with any non&minus;negative number. Multiple &quot;x&quot;s in a distribution are not necessarily the same.</p>

<ol>
	<li>With at least 10 hcp and a y&minus;x&minus;x&minus;x distribution (y &gt;= 8), bid the suit with y cards at the 4 level. This is known as a preemptive bid.</li>
	<li>With 10&minus;13 hcp and a 7&minus;x&minus;x&minus;x distribution, bid the suit with 7 cards at the 3&minus;level. This is known as a preemptive bid.</li>
	<li>With 8&minus;9 hcp and a y&minus;x&minus;x&minus;x distribution (y &gt;= 7), bid the suit with y cards at the 2&minus;level if the y&minus;card suit is Spades or Hearts. This is known as a &quot;weak&minus;two&quot; bid.</li>
	<li>With 8&minus;11 hcp and a 6&minus;x&minus;x&minus;x distribution, in which Spades or Hearts is one of the 6&minus;card suits, bid the higher rank suit at the 2 level. This is known as a &quot;weak&minus;two&quot; bid.</li>
	<li>With 11&minus;15 hcp, a distribution of 4&minus;4&minus;4&minus;1 or 5&minus;4&minus;4&minus;0, and at least 4 spades, bid Diamonds at the 2 level. This is called the &quot;Mini Roman Convention&quot;.</li>
	<li>With 15&minus;17 hcp and a balanced distribution, bid No Trump at the 1 level provided that at least 3 suits are &quot;stopped.&quot; A suit is considered stopped if the suit contains at least one of the following:
	<ul>
		<li>an A;</li>
		<li>a K and one other;</li>
		<li>a Q and two others; or</li>
		<li>a J and three others;</li>
	</ul>
	</li>
	<li>With 20&minus;22 hcp and a balanced distribution, bid No Trump at the 2 level.</li>
	<li>With at least 22 hcp, bid Clubs at the 2 level.</li>
	<li>With 13&minus;16 hcp:
	<ol>
		<li>If there is a 5&minus;card or longer suit in Spades or Hearts, bid it at the 1 level. If both bids are possible, bid the longer suit. If both suits have the same length, bid the higher ranking suit.</li>
		<li>Without a 5&minus;card suit in Spades or Hearts, bid the longer of Diamonds or Clubs at the 1 level (whichever one has the most number of cards) . If there is a tie, bid the higher ranking suit.</li>
	</ol>
	</li>
	<li>With at least 17 hcp, bid the longest suit at the 1 level. If there is a tie, bid the lowest ranking suit. This is known as a &quot;reverse&quot;.</li>
	<li>If none of the rules above is applicable, bid Pass.</li>
</ol>

<p>In the example above, rule 9a applies and a bid of 1 Hearts should be made.</p>

### 입력

<p>The input consists of a number of cases. The bridge hand for each case is specified on one line, with a single space separating each of the 13 cards in the hand. Each card is given as a two&minus;character string. The first letter is the suit (S, H, D, C) and the second character is the rank (A, K, Q, J, T, 9, 8, 7, 6, 5, 4, 3, 2). The end of input is terminated by end&minus;of&minus;file.</p>

### 출력

<p>For each case, print the hand number (starting from 1), followed by a colon and a space, and then the suggested bid on a single line (see below for the exact format). Each bid is either &quot;Pass&quot; or a level and a suit (&quot;No Trump&quot;, &quot;Spades&quot;, &quot;Hearts&quot;, &quot;Diamonds&quot;, &quot;Clubs&quot;) separated by a single space.</p>