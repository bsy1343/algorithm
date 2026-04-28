# [Gold V] Penguin Bashing - 5399

[문제 링크](https://www.acmicpc.net/problem/5399)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 12, 정답 비율: 48.000%

### 분류

브루트포스 알고리즘, 구현, 물리학

### 문제 설명

<p>In a well-known online game you play a yeti whose goal it is to hit a cute and cuddly penguin in such a way that it flies as far as possible. The game is set in sunny Antarctica, where the ground is littered with obstacles left by human and robotic expeditions. The most dangerous obstacles are sharp, pointy, metal objects, known as spikes. These spikes are most definitely not safe for penguins and children under three years of age.</p>

<p>Besides the occasional expedition, there have also been many wars in Antarctica. The result is that besides spikes, penguins (and yetis), one is also likely to encounter mines on the Antarctic surface. While they are not good for the health of a penguin, the explosions do improve the distance he will travel.</p>

<p>The best way to get a high score in this game is by figuring out the optimal strategy in advance. To be able to do this you need to know the following facts:</p>

<ul>
	<li>The yeti always bats at an integral angle between &minus;90 and +90 degrees, &minus;90<sup>◦</sup> is straight down, 0◦ is to the right and +90<sup>◦</sup> is straight up.</li>
	<li>The penguin gets a total velocity of 25 m/s regardless of the angle.</li>
	<li>The yeti hits the 3 kg penguin at exactly one meter above the ground.</li>
	<li>Upon hitting the ground the penguin will slide along the ground, while undergoing friction. This will slow it down by 5 m/s for every meter traveled.</li>
	<li>Upon hitting a mine the penguin will be flung 2 m forward through the air, and also undergo an instant increase in velocity of 4 m/s forward.</li>
	<li>If the penguin hits a spike, the game ends immediately with a score of &minus;100. Otherwise the score will be the horizontal distance traveled in centimeters, rounded to the nearest integer.</li>
	<li>Standard Earth gravity (9.81 m/s<sup>2</sup> ) is used and drag is ignored.</li>
</ul>

### 입력

<p>On the first line of the input is a positive integer, the number of test cases. Then for each test case:</p>

<ul>
	<li>A line with a single integer n &lt; 10<sup>5</sup>, the number of obstacles.</li>
	<li>n lines, each containing:
	<ul>
		<li>A single floating point number x<sub>i</sub>, the position of the obstacle in meters from the start.</li>
		<li>A string describing the obstacle, either &ldquo;mine&rdquo; or &ldquo;spike&rdquo;.</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each test case:</p>

<ul>
	<li>One line containing two integers, the highest possible score, and the angle in degrees at which the yeti needs to hit the penguin to achieve that score. In case of a tie output the lowest angle.</li>
</ul>