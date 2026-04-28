# [Platinum V] The Agglomerator - 11532

[문제 링크](https://www.acmicpc.net/problem/11532)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

기하학, 구현, 시뮬레이션, 삼분 탐색

### 문제 설명

<p>In this problem, we are simulating the dynamics of moving objects. The objects are droplets that are modeled in two dimensions as circles of various sizes, each moving at a constant velocity. When two circles touch they combine (i.e., agglomerate) into a single circular droplet with an area equal to the sum of the areas of the two combining droplets. The newly formed droplet&rsquo;s position is the area-weighted average position of the two droplets at the time of contact and its velocity is the area-weighted average velocity of the two circles. (See the following example.)</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11532.%E2%80%85The%E2%80%85Agglomerator/d61843bc.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11532/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:317px; width:258px" />The figure to the right illustrates the process of agglomeration. In the top panel of that figure, we see the leftmost droplet with radius 4 centered at position (&minus;14, 0) and with velocity (1, 0) moving toward a stationary droplet of radius 3 centered at the origin. The two droplets make contact at time t = 7.0 as shown in the middle panel of the figure.</p>

<p>The droplet with radius 4 is centered at (&minus;7, 0) at the time that the two droplets agglomerate into a single new droplet. The two original droplets have areas 16&pi; and 9&pi;, respectively, and thus the new droplet has area 25&pi; and thus radius 5. The x-coordinate of the aggolomerated droplet is equal to 16/25 &middot; (&minus;7.0) + 9/25 &middot; 0.0 = &minus;4.48. The y-coordinate is 16/25 &middot; 0.0 + 9/25 &middot; 0.0 = 0.0. By similar calculations, the velocity of the aggolomeration is (0.64, 0).</p>

<p>Given an initial configuration of droplets, your goal is to simulate their motion until reaching the final time at which an agglomeration occurs (if any). All test sets have been crafted to assure that:</p>

<ul>
	<li>The original droplets do not touch each other.</li>
	<li>When a new droplet is formed from an agglomeration, the new droplet will not immediately be touching any other droplets. (In fact, it will be at least 0.001 away from any other droplets.)</li>
	<li>No two droplets will ever pass each other with only a single point of intersection. (In fact, changing the radius of any drop by &plusmn;0.001 will not effect whether it collides with another.)</li>
	<li>No two pairs of droplets will ever collide at precisely the same time. (In fact, all agglomerations will be separated in time by at least 0.001.)</li>
	<li>No agglomerations will occur beyond time t = 109</li>
</ul>

### 입력

<p>The input consists of a description of the original configuration. The first line contains the original number of droplets, 2 &le; N &le; 100. This is followed by N lines of data, each containing five integers, x, y, v<sub>x</sub>, v<sub>y</sub>, r, respectively specifying the x-coordinate of the center, the y-coordinate of the center, the x-component of the velocity, the y-component of the velocity, and the radius. These quantities are bounded such that &minus;10 000 &le; x, y, v<sub>x</sub>, v<sub>y</sub> &le; 10 000 and 1 &le; r &le; 100.</p>

### 출력

<p>Output a single line with two values k and t, where k is the number of droplets in the final configuration and t is the time at which the final agglomeration occurred. If a data set results in no agglomerations, k will be the original number of droplets and 0 should be reported as the time. The value of time should be reported to have an absolute or relative error of no more than 10<sup>&minus;3</sup>.</p>