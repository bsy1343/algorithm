# [Platinum IV] Falling Diamonds (Large) - 12326

[문제 링크](https://www.acmicpc.net/problem/12326)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Diamonds are falling from the sky. People are now buying up locations where the diamonds can land, just to own a diamond if one does land there. You have been offered one such place, and want to know whether it is a good deal.</p>

<p>Diamonds are shaped like, you guessed it, diamonds: they are squares with vertices (X-1,&nbsp;Y), (X,&nbsp;Y+1), (X+1,&nbsp;Y) and (X,&nbsp;Y-1) for some X,&nbsp;Y which we call the center of the diamond. All the diamonds are always in the X-Y plane. X is the horizontal direction, Y is the vertical direction. The ground is at Y=0, and positive Y coordinates are above the ground.</p>

<p>The diamonds fall one at a time along the Y axis. This means that they start at (0,&nbsp;Y) with Y very large, and fall vertically down, until they hit either the ground or another diamond.</p>

<p>When a diamond hits the ground, it falls until it is buried into the ground up to its center, and then stops moving. This effectively means that all diamonds stop falling or sliding if their center reaches Y=0.</p>

<p>When a diamond hits another diamond, vertex to vertex, it can start sliding down, without turning, in one of the two possible directions: down and left, or down and right. If there is no diamond immediately blocking either of the sides, it slides left or right with equal probability. If there is a diamond blocking one of the sides, the falling diamond will slide to the other side until it is blocked by another diamond, or becomes buried in the ground. If there are diamonds blocking the paths to the left and to the right, the diamond just stops.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/12325/images-54.png" /></p>

<p>Consider the example in the picture. The first diamond hits the ground and stops when halfway buried, with its center at (0,&nbsp;0). The second diamond may slide either to the left or to the right with equal probability. Here, it happened to go left. It stops buried in the ground next to the first diamond, at (-2,&nbsp;0). The third diamond will also hit the first one. Then it will either randomly slide to the right and stop in the ground, or slide to the left, and stop between and above the two already-placed diamonds. It again happened to go left, so it stopped at (-1,&nbsp;1). The fourth diamond has no choice: it will slide right, and stop in the ground at (2,&nbsp;0).</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> lines follow. Each line contains three integers: the number of falling diamonds <strong>N</strong>, and the position <strong>X,&nbsp;Y</strong> of the place you are interested in. Note the place that you are interested in buying does not have to be at or near the ground.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>-10,000 &le; <strong>X</strong> &le; 10,000.</li>
	<li>0 &le; <strong>Y</strong> &le; 10,000.&nbsp;</li>
	<li><strong>X + Y</strong> is even.</li>
	<li>1 &le; <strong>N</strong> &le; 10<sup>6</sup>.</li>
</ul>

### 출력

<p>For each test case output one line containing &quot;Case #x:&nbsp;p&quot;, where x is the case number (starting from 1) and p is the probability that one of the <strong>N</strong> diamonds will fall so that its center ends up exactly at (<strong>X</strong>,&nbsp;<strong>Y</strong>). The answer will be considered correct if it is within an absolute error of 10<sup>-6</sup> away from the correct answer.</p>