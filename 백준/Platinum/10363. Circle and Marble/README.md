# [Platinum II] Circle and Marble - 10363

[문제 링크](https://www.acmicpc.net/problem/10363)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 99, 정답: 63, 맞힌 사람: 51, 정답 비율: 72.857%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 게임 이론, 그래프 이론, 그래프 탐색, 스프라그–그런디 정리, 트리

### 문제 설명

<p>Adi has fallen in love with Putri and they have been in relationship for years. Adi is now ready to propose Putri and ask her to marry him. However, Putri doesn&rsquo;t seem want to make things easy for Adi. She asked Adi to play a game with her, and if he can win against her, then she will marry him.</p>

<p>At first, Putri drew one circle and put some marbles inside it. Next, she drew another circle and put some marbles inside it. She also drew one arrow from the previous drawn circle which point to this new circle. After that, she drew another circle, put some marbles inside it, and drew one arrow from one of the previously drawn circle to this new circle. These steps are repeated until she drew N circles, each with marbles (some circles might be empty). Note that no circles intersect each others and no circle contains another circle. After she had drawn those N circles, Putri then said &ldquo;Let&rsquo;s play a game&rdquo;.</p>

<p>&ldquo;We alternately take turn in this game. In each turn, the player should choose one circle &hellip; let say it&rsquo;s the chosen circle. Take exactly one marble from the chosen circle, and move that marble to one of the circles which is pointed by the arrow originated from the chosen circle,&rdquo; she explained. &ldquo;The one who cannot make his or her move, lose&rdquo;, she added. Wondering about this game, Adi then asked, &ldquo;How about those circles which do not have any arrow originated from them? Can we take marble from those circles?&rdquo; Putri then replied, &ldquo;Ahh.. no, you cannot choose those circles. It&rsquo;s a mandatory that you move one marble to another circle. Since you cannot move any marble from those circles, then you cannot choose them.&rdquo; Putri then added, &ldquo;Remember, you should move exactly one marble in your move, so obviously you cannot choose circles which do not have any marble inside it. Oh, by the way, the rule also applies to me&rdquo;.</p>

<p>Adi realized that this kind of game has a fool-proof strategy. It means if both players play optimally, then the outcome of the game depends only on the initial configuration. Adi then asked Putri one crucial information, &ldquo;So&hellip; who moves first?&rdquo;. Putri replied, &ldquo;I&rsquo;ll let you decide that&rdquo;. Adi then put a big smile on his face.</p>

<p>Given the initial game configuration, determine whether Adi should be the first player or the second player to be able to win the game. Assume Putri play optimally; in other words, Putri will surely beat Adi whenever she sees the chance.</p>

### 입력

<p>The first line of input contains an integer T (T &le; 100) denoting the number of cases. Each case begins with an integer N (3 &le; N &le; 20,000) representing the number of circles drawn by Putri. The circles are numbered from 1 to N. The next line contains N integers Mi (0 &le; Mi &le; 1,000,000) denoting the number of marbles in ith circle respectively (1 &le; i &le; N). The following line contains N integers P<sub>i</sub> (1 &le; P<sub>i</sub> &lt; i &le; N) denoting which circle has an arrow pointing to it. P<sub>1</sub> is always 0, as it is the first circle drawn by Putri. This means no circle points to circle 1.</p>

### 출력

<p>For each case, output in a line &quot;Case #X: Y&quot; (without quotes) where X is the case number starting from 1, followed by a single space, and Y is &ldquo;first&rdquo; (without quotes) if Adi should take the first move in order to win the game, or &ldquo;second&rdquo; (without quotes) if he should play as second player.</p>

### 힌트

<p>For ease of explanation, let&rsquo;s define some notations:</p>

<ul>
	<li>move(a, b) as moving one marble from circle a to circle b.</li>
	<li>&lang;m0, m1, m2, &hellip;, &rang; as the number of marbles in circle 1, 2, 3, &hellip;, respectively.</li>
</ul>

<p>Explanation for 1st sample input</p>

<p>First player plays move(2, 3) resulting &lang;1, 0, 3&rang;. Second player has no choice but to response with move(1, 2) resulting &lang;0, 1, 3&rang;. First player win the game with move(2, 3) resulting &lang;0, 0, 4&rang;.</p>

<p>Explanation for 2nd sample input</p>

<p>No matter what the first player does, he/she cannot win this game. There are 2 moves that can be played by the first player:</p>

<ul>
	<li>move(1, 2), resulting &lang;0, 3, 2&rang;; the two players then take turn moving marbles on circle 2 to circle 3, and this game will be won by the second player.</li>
	<li>move(2, 3), resulting &lang;1, 1, 3&rang;; the second player then counter with move(2, 3) leaving &lang;1, 0, 4&rang;. The first player has no choice but to play move(1, 2), which continued by the second player with move(2, 3) to conclude the game.</li>
</ul>

<p>Therefore, in this game, Adi should be the second player in order to win.</p>

<p>Explanation for 3rd sample input</p>

<p>The following figure corresponds to the game configuration.</p>

<p><img alt="" src="/upload/images2/cnm.png" style="height:176px; width:138px" /></p>

<p>First player plays move(1, 2) resulting &lang;0, 2, 2, 3&rang;. Second player has no choice but to response with move(3, 4) resulting &lang;0, 2, 1, 4&rang;. First player then move the only marble in circle 3 to circle 4 and win the game.</p>