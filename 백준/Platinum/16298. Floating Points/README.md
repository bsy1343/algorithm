# [Platinum III] Floating Points - 16298

[문제 링크](https://www.acmicpc.net/problem/16298)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 5, 맞힌 사람: 4, 정답 비율: 20.000%

### 분류

브루트포스 알고리즘, 기하학, 선분 교차 판정

### 문제 설명

<p>Your ship has sunk. You want it back.</p>

<p>The best way<sup>1</sup> to salvage a shipwreck is to release a whole bunch of ping pong balls beneath it. The ping pong balls float up to the surface, and their buoyancy takes the sunken ship up towards the surface with them. At least, they do that as long as the ping pong balls actually push the ship up: if they slide off the shipwreck, or float past it entirely, or even surface in an inside air bubble of the ship, they of course do not contribute to pushing the ship out of the water.</p>

<p>You have already released a bunch of ping pong balls beneath your ship, and you want to know how many of the balls actually contribute to the salvage. Fortunately, you know exactly where you have released the balls, and you have a very precise model of the ship. Can you compute how many of the balls are helping you out?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16298.%E2%80%85Floating%E2%80%85Points/0017ec65.png" data-original-src="https://upload.acmicpc.net/7ca59cb0-625a-432b-bd81-a80de43538e2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 424px; height: 238px;" /></p>

<p>Figure 2: The shipwreck from sample 2. The fourth ping pong ball from the left, for instance, will help you out as it gets stuck between the anchor and the ship.</p>

<p>The sea is given as the (x, y)-plane. The surface of the sea is at y = 0, so that the water is where the y-coordinate is less than or equal to zero. The shipwreck is modeled by a 2D polygon in this plane. The ping pong balls are modeled as points (floating points) which are released far below the shipwreck.</p>

<p>A ping pong ball floats straight upwards, unless it surfaces or it is blocked by an edge. If it can float upwards along an edge, it will follow the edge. If it is blocked by a horizontal edge, or by a corner from which there is no edge going upwards, the ball is stuck.</p>

<p>A ball does not push the shipwreck up if it surfaces. If a ball gets trapped below the ship at y = 0, it still contributes to pushing the ship up, and hence is counted in the final answer.</p>

<p><sup>1</sup>This does not work. Do not try this on your own sunken ship.</p>

### 입력

<ul>
	<li>The input starts with a line with integers 3 &le; n &le; 10<sup>3</sup>, the number of vertices of the shipwreck, and 1 &le; b &le; 2 &middot; 10<sup>3</sup>, the number of ping pong balls.</li>
	<li>Then follow n lines, each with two integers &minus;10<sup>5</sup> &le; x, y &le; 10<sup>5</sup>, which give the vertices of the polygon in counter-clockwise order.</li>
	<li>Then one line follows containing b integers x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>b</sub>, indicating the x-coordinates where the ping pong balls were released. It satisfies |x<sub>i</sub>| &le; 10<sup>5</sup>. The original y-coordinate of the ping pong balls is below &minus;10<sup>5</sup>.</li>
</ul>

<p>The shipwreck is a simple polygon: its edges only intersect at vertices, and only two edges intersect at a vertex. Furthermore, no two x-coordinates, both of the points of the boat and of the balls, are the same.</p>

### 출력

<p>The output consists of a single integer: the number of balls which end up pushing the shipwreck up.</p>