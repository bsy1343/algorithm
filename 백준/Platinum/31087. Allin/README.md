# [Platinum II] Allin - 31087

[문제 링크](https://www.acmicpc.net/problem/31087)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

애드 혹

### 문제 설명

<p><strong>Texas hold &#39;em</strong> (also known as <strong>Texas holdem</strong>, <strong>hold &#39;em</strong>, and <strong>holdem</strong>) is one of the most popular variants of the card game of poker. <strong>Please read the following rules as they may be different from the regular rules.</strong> <strong>Two</strong> cards, known as <strong>hole cards</strong>, are dealt <strong>face-down</strong> to each player. Each player only knows his own hole cards. And then <strong>five community cards</strong> are dealt in three stages <strong>face-up</strong>. The stages consist of a series of three cards (&quot;the flop&quot;), later an additional single card (&quot;the turn&quot; or &quot;fourth street&quot;), and a final card (&quot;the river&quot; or &quot;fifth street&quot;). All players know the face-up cards that are already dealt. All cards are drawn from a standard 52-card deck. A standard 52-card deck comprises $13$ ranks in each of the four French suits: clubs ($\clubsuit$), diamonds ($\diamondsuit$), hearts ($\heartsuit$) and spades ($\spadesuit$). Each suit includes an Ace (A), a King (K), Queen (Q) and Jack (J), each depicted alongside a symbol of its suit; and numerals or pip cards from the Deuce (Two) to the Ten, with each card depicting that many symbols (pips) of its suit. <strong>No card can be drawn more than once.</strong> </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/903cfac1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/903cfac1.png" data-original-src="https://upload.acmicpc.net/6bd84bf3-2b6f-408b-b45a-735ab66052d1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 616px; height: 223px;" /></p>

<p>Individual cards are ranked as follows (high-to-low): A, K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3, 2. <strong>Each player seeks the best five-card poker hand from any combination of the seven cards -- the five community cards and his two hole cards</strong>.</p>

<p>The following table shows the possible five-card poker hand types in <strong>increasing order</strong> of their values. Each type has a specific ordering of the five cards that is described below. <strong>The following part is describing how to compare two hands, which is the same as the regular rule.</strong></p>

<ul>
	<li><strong>Highcard</strong>: Simple value of the card. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_1&gt;a_2&gt;a_3&gt;a_4&gt;a_5$. ($a_i$ represents the rank of $i$-th card.)</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/add20809.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/add20809.png" data-original-src="https://upload.acmicpc.net/b0adbf5d-59ab-4be9-a986-46dae47f9cf3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 358px; height: 91px;" /></p>

<ul>
	<li><strong>Pair</strong>: Two cards with the same value. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_1=a_2$, $a_3&gt;a_4&gt;a_5$, $a_1 \ne a_3$, $a_1 \ne a_4$, $a_1 \ne a_5$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/4ac60011.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/4ac60011.png" data-original-src="https://upload.acmicpc.net/2f66aec9-f5a3-4d2a-95a0-ac9ad82c74f3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 357px; height: 90px;" /></p>

<ul>
	<li><strong>Two pairs</strong>: Two times two cards with the same value. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_1=a_2$, $a_3=a_4$, $a_1 &gt; a_3$, $a_1 \ne a_5$, $a_3 \ne a_5$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/95f2f976.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/95f2f976.png" data-original-src="https://upload.acmicpc.net/41543192-98bd-441a-b9d5-1ea810f1c40c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 359px; height: 91px;" /></p>

<ul>
	<li><strong>Three of a kind</strong>: Three cards with the same value. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_1=a_2=a_3$,$a_4 &gt; a_5$, $a_1 \ne a_4$, $a_1 \ne a_5$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/21a553a6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/21a553a6.png" data-original-src="https://upload.acmicpc.net/c0a24364-1ba1-4403-b937-5150ee64fc4f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 355px; height: 90px;" /></p>

<ul>
	<li><strong>Straight</strong>: Sequence of 5 cards in increasing value. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_i$ is exactly one rank above $a_{i+1}$ for all $1\le i\le 4$. <strong>Specially, if $a_5$ is Ace, $a_4$ can be $2$. In this case, Ace is considered one rank below 2.</strong></li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/d26d592f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/d26d592f.png" data-original-src="https://upload.acmicpc.net/f2ec378c-aaf4-4d57-ae4c-6cc6bb9defbd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 357px; height: 91px;" /></p>

<ul>
	<li><strong>Flush</strong>: 5 cards of the same suit. The cards are ordered as $a_1a_2a_3a_4a_5$ such that all the five cards have the same suit and $a_1&gt;a_2&gt;a_3&gt;a_4&gt;a_5$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/04fbfce6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/04fbfce6.png" data-original-src="https://upload.acmicpc.net/1671e440-33a8-449f-850f-1ccd099b0dd6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 358px; height: 92px;" /></p>

<ul>
	<li><strong>Full house</strong>: Combination of three of a kind and a pair. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_1=a_2=a_3$, $a_4=a_5$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/1835b6c8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/1835b6c8.png" data-original-src="https://upload.acmicpc.net/80770ff4-b4ee-4ddd-9534-ad08337a8296/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 358px; height: 91px;" /></p>

<ul>
	<li><strong>Four of a kind</strong>:    Four cards of the same value. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_1=a_2=a_3=a_4$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/478965d6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/478965d6.png" data-original-src="https://upload.acmicpc.net/fdb6c490-8217-41c7-95cb-5946009ab841/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 357px; height: 90px;" /></p>

<ul>
	<li><strong>Straight flush</strong>: Straight of the same suit. The cards are ordered as $a_1a_2a_3a_4a_5$ such that all the five cards have the same suit and that $a_i$ is exactly one rank above $a_{i+1}$ for all $1\le i\le 4$. <strong>Specially, if $a_5$ is Ace, $a_4$ can be $2$. In this case, Ace is considered one rank below 2.</strong></li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/c2d2934d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/c2d2934d.png" data-original-src="https://upload.acmicpc.net/ab053e5b-4847-4f9a-9e8a-6c2f93f9bc66/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 354px; height: 90px;" /></p>

<ul>
	<li><strong>Royal flush</strong>: Straight flush from Ten to Ace. The cards are ordered as $a_1a_2a_3a_4a_5$ such that $a_1, a_2, a_3, a_4, a_5$ are Ace, King, Queen, Jack, Ten of the same suit.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/306c0840.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31087.%E2%80%85Allin/306c0840.png" data-original-src="https://upload.acmicpc.net/d9cb2557-60ad-4fc2-bccd-7d079048c04b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 355px; height: 90px;" /></p>

<p>To compare two hands, first, we will compare the type of two hands. For example, one hand is <strong>Four of a kind</strong>, the other hand is <strong>Full house</strong>, <strong>Four of a kind</strong> always win <strong>Full house</strong>.</p>

<p>If the types of two hands are the same, we compare the ranks of the cards. We will order the card as described above, and compare them one by one. Firstly, we will compare the first card. If a hand&#39;s first card has a higher rank, it wins. If the first cards of the two hands have the same rank, we will compare the second card, and so on. If the cards have the same rank in every position, no one wins. The suit of cards never matters. For example, $\clubsuit$ 5, $\diamondsuit$ 5, $\heartsuit$ 5, $\spadesuit$ 2, $\clubsuit$ 2 can win $\diamondsuit$ 3, $\spadesuit$ 3, $\heartsuit$ 3, $\diamondsuit$ A, $\heartsuit$ A. Since they are both <strong>Full house</strong>, and we will compare the ranks of the three cards of a kind at first.</p>

<p>Consider the case that the hole cards of Alice are $\clubsuit$ A, $\diamondsuit$ 4 and the hole cards of Bob are $\heartsuit$ 2, $\spadesuit$ 3. The community cards are $\spadesuit$ A, $\heartsuit$ 4, $\spadesuit$ 5, $\clubsuit$ Q, $\heartsuit$ Q. The best hand of Alice (five cards among her hole cards and the community hards) is $\clubsuit$ A, $\spadesuit$ A, $\clubsuit$ Q, $\heartsuit$ Q, $\spadesuit$ 5, which is <strong>Two pairs</strong>. The best hand of Bob is $\spadesuit$ 5, $\heartsuit$ 4, $\spadesuit$ 3, $\heartsuit$ 2, $\spadesuit$ A, which is <strong>Straight</strong>. Thus, Bob wins.</p>

<p>Players have betting options to check, call, raise, or fold. <strong>In this problem, we do not care about the meanings of these bets.</strong> Rounds of betting take place before the flop is dealt and after each subsequent deal. The player who has the best hand and has not folded by the end of all betting rounds wins all of the money bet for the hand, known as the pot. In certain situations, a &quot;split-pot&quot; or &quot;tie&quot; can occur when two players have hands of equivalent value. This is also called a &quot;chop-pot&quot;. <strong>In this problem, we assume the two players never fold.</strong> So the player with the best five-card poker hand from any combination of the seven cards wins. If the two players have hands of equal values, no one wins.</p>

<p>To simplify the statement, we do not introduce the detailed rules here.</p>

<p>Daddy Dream is a world-famous <strong>Texas hold &#39;em</strong> player. As a strong challenger, Wolf Chicken wants to beat Daddy Dream. Wolf Chicken plays first after &quot;the flop&quot; (three cards are dealt face-up). Both players know the three face-up cards and each player knows his own two hole cards. Wolf Chicken will choose to allin if and only if he will certainly win whatever the &quot;the turn&quot;, &quot;the river&quot; (the remaining two community cards that have not been revealed) and Daddy Dream&#39;s hole cards are. Otherwise, Wolf Chicken will choose to check.</p>

<p>Given Wolf Chicken&#39;s two hole cards and the three flop cards, help him to determine whether he can allin. </p>

### 입력

<p>The first line contains a single integer $T$ ($1\le T \le 100000$) denoting the number of test cases.</p>

<p>For each test case, there is one line containing five strings $h_1, h_2, c_1, c_2, c_3$ separated by single spaces denoting the first hole card, the second hole card, the first community card, the second community card and the third community card.</p>

<p>For each card, the first character of its corresponding string denotes its rank. (Possible ranks are &#39;2&#39; ,&#39;3&#39;,&#39;4&#39;,&#39;5&#39;,&#39;6&#39;,&#39;7&#39;,&#39;8&#39;,&#39;9&#39;,&#39;T&#39;,&#39;J&#39;,&#39;Q&#39;,&#39;K&#39;,&#39;A&#39;. &#39;T&#39; denotes $10$.) The second character denotes its suit. &#39;C&#39; denotes clubs. &#39;D&#39; denotes diamonds. &#39;H&#39; denotes hearts. &#39;S&#39; denotes spades.</p>

<p>It is guaranteed that each card appears at most once in one test case.</p>

### 출력

<p>For each test case, print one line. Print &quot;<code>allin</code>&quot; if Wolf Chicken will certainly win. Otherwise, print &quot;<code>check</code>&quot;.</p>