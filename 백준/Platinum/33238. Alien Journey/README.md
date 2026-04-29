# [Platinum V] Alien Journey - 33238

[문제 링크](https://www.acmicpc.net/problem/33238)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

격자 그래프, 그래프 이론, 그래프 탐색, 매개 변수 탐색, 이분 탐색

### 문제 설명

<p>While wandering around Delft, after a long time in isolation, convinced that nothing could surprise you anymore (after the roller-coaster this year has already been), you encounter yet another peculiarity. From behind a bush, a tiny, friendly-looking alien, reveals himself. Rather confused, he kindly asks you for some help with his new, square shaped spaceship. After bragging about the spaceship’s brand new features, the little alien expresses his worries about the costs of traveling nowadays: "Extraterrestrial economy is down as well, my dear human being!" he protested. "I need to make it to the interdimensional gateway which is across the town but I have scarcely any fuel left in my tank. Could you help me get back home?" Knowing that you are a master of algorithms, he pleads you to compute the minimum amount of power he would need to traverse the city, given that each unit of fuel can lift the spaceship one unit in height.</p>

<p>In order for the spaceship to travel above an area of the city, it should fly overhead all the cells underneath it while going in either of the 4 directions: North, South, East and West.</p>

<p>You also find out that moving the spaceship in any of the cardinal directions does not consume any fuel and that the entirety of the spaceship should be within the map at any given moment (otherwise the alien gets disoriented).</p>

<p>Animated by the desire to help your newly found friend, you get to coding in a heartbeat. Guided by the adventurous computer scientist that you are,  you can quickly assess that both the map and the spaceship should be seen as square grids and that each cell of the map has a height (computed relatively to the sea level).</p>

<p>You make the further observations:</p>

<ul>
	<li>Initially, the spaceship lies on the ground.</li>
	<li>For the spaceship to be above the ground, the bottom of the spaceship should be strictly higher than the height of all the ground cells beneath.</li>
	<li>All 4 edges of the square spaceship are aligned with the grid-like map of the city.</li>
	<li>The top-left corner cell of the spaceship overlays the top-left corner of the map.</li>
	<li>The area of the map the spaceship initially lies on is guaranteed to be at height 0.</li>
	<li>The ship can only be lifted an integer number of units in height.</li>
	<li>The final destination of the spaceship is reached when the bottom-right corner cell of the spaceship is floating above the bottom-right corner cell of the map.</li>
</ul>

<p> </p>

### 입력

<ul>
	<li>One line with three integers: $ 1 \leq h \leq 500 $ and $ 1 \leq w \leq 500 $: the height and width of the city map and $1 \leq l &lt; \min(h, w)$ the length of the spaceship edges.</li>
	<li>$ h $ lines, each with $ w $ positive integers in the range $[0, 10^9]$. Each of these integers describes the height above the ground of a $1 \times 1$ section of the map.</li>
</ul>

### 출력

<p>The minimum amount of power units that the alien needs for traversing the city with the spaceship.</p>