# [Gold III] First Orchard - 24781

[문제 링크](https://www.acmicpc.net/problem/24781)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 12, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/e18d5882-2311-4f4a-999b-d63848cf4ae4/-/preview/" style="width: 374px; height: 250px; float: right;" />First Orchard is a cooperative game for children 2 years and up. In this simple game, the players pick colored fruits from trees in an orchard and place them into a basket. &nbsp;To make the game more interesting, a raven tries to reach the orchard to steal the fruits. If the players are successful in moving all fruits into the basket before the raven can get to the orchard, they&#39;ll win. &nbsp;If the raven gets there first, the players lose!</p>

<p>Your task is to determine the probability with which the players will win!</p>

<p>The game is played as follows. There are 4 trees in the orchard, each bearing a different type of fruit: red apples, green apples, blue plums, and yellow pears. The raven tries to reach the orchard through a pathway containing one or more steps.</p>

<p>At each turn, the players roll a six-sided die. &nbsp;Four of the faces show a color (red, green, yellow, blue), the fifth face shows a fruit basket, and the sixth face shows a raven. All six faces can appear with equal probability.&nbsp;</p>

<ul>
	<li><em>Red</em>, <em>Green</em>, <em>Yellow</em>, <em>Blue</em>.&nbsp; In these cases, a fruit with the corresponding color is placed into the basket, provided the tree corresponding to this color still has any fruits left to pick. Otherwise, the players move on to the next turn.</li>
	<li><em>Fruit Basket</em>. If the players roll the &#39;basket&#39; face, they will&nbsp; pick a fruit from the tree that has the largest number of fruits left. &nbsp;If there are multiple such trees with the same number of&nbsp; fruits, any of the trees can be chosen.</li>
	<li><em>Raven</em>. If the &#39;raven&#39; face appears on the die, then the raven moves&nbsp; one step closer towards the orchard. &nbsp;</li>
</ul>

<p>The game is over if either the players have picked all fruits, or if the raven reaches the orchard, whichever happens first. If the raven reaches the orchard before the players have placed all fruits into the basket, the players lose.</p>

### 입력

<p>The input consists of a single test case with a single line of input. The input contains five integer numbers: <code>R G B Y S</code>. $R, G, B, Y$ denote the number of red, green, blue, and yellow fruits initially on each tree, respectively, $S$ denotes the number of steps on the raven&#39;s pathway. Since the game is intended for young children, there will be at most 4 fruits of each color: $0 \le R, G, B, Y \le 4$. There will be at least one fruit overall: $0 &lt; R + G + B + Y$. The raven will require at least $1$ and at most $8$ steps: $1 \le S \le 8$. The number of steps is equal to the number of times the raven must appear on the die for the players to lose.</p>

### 출력

<p>Output the probability that the players will win as a floating point number. The absolute error of your result should be less than $10^{-5}$.</p>