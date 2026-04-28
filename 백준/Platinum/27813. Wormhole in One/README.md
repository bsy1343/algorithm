# [Platinum I] Wormhole in One - 27813

[문제 링크](https://www.acmicpc.net/problem/27813)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 9, 맞힌 사람: 9, 정답 비율: 34.615%

### 분류

애드 혹, 브루트포스 알고리즘, 기하학, 수학

### 문제 설명

<p>You are participating in an inter-galactic hyperspace golf competition, and you have advanced to the final round! You are really determined to triumph, and so you want to prepare a winning strategy.</p>

<p>In hyperspace golf, just as in conventional golf, you hit a ball with a club, which sends the ball in a direction chosen by you. The playing field in hyperspace golf is a 2-dimensional plane with points representing the different holes. The ball is also represented by a point, and you get to choose where the ball starts, as long as it is not in the same place as a hole.</p>

<p>Since this is hyperspace golf, the players are allowed to turn some pairs of holes into wormholes by linking them together. Each hole can be either left as a normal hole, or linked to at most one other hole (never to itself). Wormholes are undirected links, and can be traversed in either direction.</p>

<p>Because the environment is frictionless, when you hit the ball, it moves in a straight direction that it maintains forever unless it reaches a hole; call that hole h. Upon touching hole h, the ball stops if h is not connected to another hole. If h is connected to another hole h&#39;, then the ball immediately comes out of h&#39; and continues moving in the same direction as before.</p>

<p>You know the location of each hole. You want to maximize the number of distinct holes you can touch with a single hit. With that goal in mind, you want to pick the ball&#39;s starting location, the direction in which to send the ball, and which pairs of holes, if any, to link together as wormholes. The ball cannot start in the same place as a wormhole. When the ball goes through a wormhole, both the hole it goes into and the hole it comes out of are counted towards your total. Each hole is only counted once, even if the ball goes into it or comes out of it (or both) multiple times. If the ball stops in a hole, that hole also counts toward your total.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each case begins with one line containing a single integer <b>N</b>: the total number of holes. The following <b>N</b> lines contain two integers each: <b>X<sub>i</sub></b> and <b>Y<sub>i</sub></b>, representing the X and Y coordinates, respectively, of the i-th hole.</p>

### 출력

<p>For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the maximum number of distinct holes you can touch if you make optimal decisions as described above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>-10<sup>9</sup> &le; <b>X<sub>i</sub></b> &le; 10<sup>9</sup>, for all i.</li>
	<li>-10<sup>9</sup> &le; <b>Y<sub>i</sub></b> &le; 10<sup>9</sup>, for all i.</li>
	<li>(<b>X<sub>i</sub></b>, <b>Y<sub>i</sub></b>) &ne; (<b>X<sub>j</sub></b>, <b>Y<sub>j</sub></b>), for all i &ne; j. (No two holes are at the same coordinates.)</li>
</ul>

### 힌트

<p>In Sample Case #1, we can connect the two holes with a wormhole so that we could touch both of them by sending the ball into either one. Notice that without the wormhole, the ball would just stay in the first hole it touches, so it would be impossible to touch more than one hole.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/205f7f19-50a1-4a22-85dd-9c769301f8e9/-/preview/" /></p>

<p>In Sample Case #2, we can connect the holes at (0, 0) and at (5, 5). We can then hit the ball from position (4.9, 5), for example, in the positive horizontal direction so that it first touches the hole at (5, 5). It goes into that hole and comes out of the hole at (0, 0), retaining its positive horizontal direction of movement. Finally, it touches the hole at (5, 0), and stops (since there is no wormhole linked to that hole).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f5b11e82-89a8-487b-818f-9fd733b724a6/-/preview/" /></p>

<p>In Sample Case #3, we can connect the pair of holes at positions (0, 0) and (5, 0), and also the pair of holes at positions (3, 2) and (5, 5). Hitting the ball from (4, -1) towards the hole at (5, 0) makes it touch the holes at positions (5, 0), (0, 0), (5, 5) and (3, 2), in that order.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5d7ffd6e-d75d-4ed1-9467-872fce016ab5/-/preview/" /></p>

<p>In Sample Case #4, we can connect the pairs of holes at positions (0, 0) and (1, 1), the pair of holes at positions (2, 1) and (11, 2), and also the pair of holes at positions (8, 2) and (14, 2). Hitting the ball from (-1, 0) towards the hole at (0, 0) makes it touch the holes at the following positions, in this order: (0, 0), (1, 1), (2, 1), (11, 2), (14, 2), (8, 2), (11, 2), (2, 1), and (3, 1). Note that although the holes at positions (11, 2) and (2, 1) are touched twice, they are only counted once each for the answer, since the problem asks for a count of distinct holes.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/83b80d89-2d04-4aa7-9c00-5e0636bf81bd/-/preview/" /></p>

<p>In Sample Case #5, there is only one hole, and we can hit the ball into it without needing to consider wormholes at all. (For what it&#39;s worth, we can choose any starting location we want, even outside of the allowable range of coordinates for holes.)</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ce550f08-0336-471b-a2d7-c1c5fd172fce/-/preview/" /></p>