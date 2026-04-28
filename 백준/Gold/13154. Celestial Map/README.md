# [Gold III] Celestial Map - 13154

[문제 링크](https://www.acmicpc.net/problem/13154)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 99, 정답: 36, 맞힌 사람: 31, 정답 비율: 41.892%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>In the distant future humanity has developed into a highly evolved race with vast knowledge of the universe. In particular, they now have an exhaustive map of all stars in the universe and know their trajectory as well as their speed.</p>

<p>Bob works at the center for interplanetary communication. This is usually the most boring job on the planet, since you sit around all day waiting for other yet unknown races to send messages. Today however, as Bob comes back from his daily ping-pong session, he sees a red light blinking away in his control station. As the light is very annoying and keeps him from napping, he decides to look up its meaning in his manual. It says:</p>

<blockquote>
<p>Congratulations! You have just made contact with another race. Please submit the coordinates of the newly discovered race to the administration office for proper filing. They can be found on panel 42.</p>
</blockquote>

<p>&ldquo;Neat!&rdquo; Bob thinks and takes a look at panel 42. Unfortunately, something seems to be broken since instead of showing the coordinates it shows two vectors, a number and &ldquo;Warning 54816&rdquo;. Another look at the manual reveals:</p>

<blockquote>
<p>Warning 54816: Something went wrong while calculating the exact coordinates of the message&rsquo;s origin. Instead a plane from which the message must have come from as well as the origin&rsquo;s distance were computed.</p>
</blockquote>

<p>After a quick check, Bob finds out that there are quite a few stars whose trajectories intersect with the plane at the given distance, but none that intersect at a slightly different distance (up to 0.1 lightyears). Also, stars which have not been in the plane at the time of the signal transmission were at a distance of at least 0.1 lightyears to the plane. Furthermore, the trajectories of all stars seem to intersect the given plane at an angle between 10 and 90 degrees.</p>

<p>Since Bob wants to plan his afternoon, he first wants to know how many stars he needs to check individually to find out from which one the message originated.</p>

<p>Can you help Bob figure out how many stars fit the description?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with an integer n (1 &le; n &le; 10<sup>4</sup>) and a real number d (1.0 &le; d &le; 10<sup>5</sup>), where n is the number of stars in the universe and d is the distance from Bob to the message&rsquo;s origin;</li>
	<li>two lines each with three real numbers p<sub>x</sub>, p<sub>y</sub>, and p<sub>z</sub> (0.0 &le; p<sub>x</sub>, p<sub>y</sub>, p<sub>z</sub> &le; 10.0, |(p<sub>x</sub>, p<sub>y</sub>, p<sub>z</sub>)| &ge; 0.1) describing a vector (p<sub>x</sub>, p<sub>y</sub>, p<sub>z</sub>), where the two vectors span a plane from Bob&rsquo;s location in which the message&rsquo;s origin must have been in when the message was sent;</li>
	<li>2n lines describing the stars. Each star is described by:
	<ul>
		<li>one line with three real numbers s<sub>x</sub>, s<sub>y</sub>, and s<sub>z</sub> (&minus;1 &middot; 10<sup>6</sup> &le; s<sub>x</sub>, s<sub>y</sub>, s<sub>z</sub> &le; 10<sup>6</sup>) where (s<sub>x</sub>, s<sub>y</sub>, s<sub>z</sub>) describes the current location of the star;</li>
		<li>one line with three real numbers t<sub>x</sub>, t<sub>y</sub>, and t<sub>z</sub> (0.1 &le; |(t<sub>x</sub>, t<sub>y</sub>, t<sub>z</sub>)| &le; 0.95) where (t<sub>x</sub>, t<sub>y</sub>, t<sub>z</sub>) describes the trajectory of the star. |(t<sub>x</sub>, t<sub>y</sub>, t<sub>z</sub>)| gives the speed at which the star is traveling.</li>
	</ul>
	</li>
</ul>

<p>You can assume the following:</p>

<ul>
	<li>The other civilization&rsquo;s message travels at the speed of light.</li>
	<li>All speeds are given in lightyears per year, and distances are in lightyears.</li>
	<li>Bob&rsquo;s location is fixed at (0, 0, 0).</li>
	<li>Stars never collide.</li>
	<li>There are no intersection points of the given plane and any trajectory at distance d &plusmn; 0.1 lightyears except for intersection points at distance exactly d lightyears.</li>
	<li>Stars which have not been in the plane at the time of the signal transmission were at a distance of at least 0.1 lightyears to the plane.</li>
	<li>All trajectories intersect the given plane at an angle between 10 and 90 degrees.</li>
</ul>

### 출력

<p>Output the number of stars that fit the description.</p>

### 힌트

<p>In the first sample we need to check 2 stars. The star positions in the present as well as the given plane and the trajectories of the stars are shown in figure 1. The plane from which the message originated is given by the vectors (1.0, 0.0, 0.0) and (0.0, 1.0, 0.0), the distance is 2.0. The first star is currently at position (2.0, 0.0, 1.0) and moves in direction (0.0, 0.0, 1.0) with speed 0.5. The second star is currently at position (0.0, 2.0, 1.0) and moves in direction (0.0, 0.0, 1.0) with speed 0.7. After moving the stars back by 2 years the stars&rsquo; positions are as shown in Figure H.2. As we can see, star 1 is in the plane and has the correct distance to Bob, therefore it fits the description. Star 2 is not in the plane and therefore does not fit the description. Hence the correct answer for the first sample is 1.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13154/1.png" style="height:414px; width:419px" /></p>

<p style="text-align: center;">Figure H.1: Star positions in the present for the first sample input.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13154/2.png" style="height:412px; width:419px" /></p>

<p style="text-align: center;">Figure H.2: Star positions two years ago for the first sample input.</p>