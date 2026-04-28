# [Platinum II] Billiards - 32051

[문제 링크](https://www.acmicpc.net/problem/32051)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 19, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

구현, 자료 구조, 이분 탐색, 집합과 맵, 시뮬레이션, 많은 조건 분기, 트리를 사용한 집합과 맵

### 문제 설명

<p>You are challenging a game with prizes, which is similar to billiards. This game uses a kind of billiard table, several balls of the same size, and a prize coin. The top of the table has a flat rectangular cloth-covered area bounded by elastic bumpers, called <em>cushions.</em> The balls can move on this area. The cushions limit the moves so that the centers of the balls are restricted to stay within a rectangular area of width <i>a</i> and length <i>b,</i> called the <em>movable area.</em></p>

<p>Let the coordinates of the four corners of the movable area be (0, 0), (<i>a,</i> 0), (<i>a, b</i>), and (0, <i>b</i>). At the start of a game, all the balls and the coin are placed on the table so that their centers are at distinct inner lattice points on the movable area, that is, not on its boundaries. As the balls and the coin are small enough, they do not touch each other unless a ball goes toward the center of another ball or the coin.</p>

<p>The challenger chooses one of the balls, and strikes it with a cue to the direction with an angle of 45 degrees to the edges of the boundary of the movable area. The direction is such that both <i>x-</i> and <i>y-</i>coordinates increase. The struck ball will move straight until it reaches a boundary of the movable area, hits another ball, or drops into one of the holes placed at four corners. When the ball reaches a boundary, it bounces on the cushion at the reflection angle equal to its incident angle and continues its straight move. When it hits another ball or drops into a corner hole, the game is over. If it hits the coin before hitting another ball or dropping into a hole, the challenger will win the coin.</p>

<p>Which ball should you strike to win the coin? You want to know all the balls bringing you the coin.</p>

<p>Figure F-1 depicts the first and the second datasets of Sample Input.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32051.%E2%80%85Billiards/a0dcb2c0.png" data-original-src="https://upload.acmicpc.net/1a6452d9-80b6-431d-b0f5-7dcc3522d5b8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 366px; height: 366px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32051.%E2%80%85Billiards/315edc6a.png" data-original-src="https://upload.acmicpc.net/a7efb26d-732c-4c49-b5a4-88f6f817f375/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 367px;" /></p>

<p style="text-align: center;">Figure F-1: The first and the second datasets of Sample Input</p>

<p>For the first dataset, when the ball No.&thinsp;2 is struck, it goes directly toward the coin. The ball No.&thinsp;4 hits the coin after bouncing on the right-side cushion. As the ball No.&thinsp;1 hits the ball No.&thinsp;2, and the ball No.&thinsp;3 drops in the upper right hole, striking them will not be awarded a coin.</p>

<p>For the second dataset, when the only ball No.&thinsp;1 is struck, after bouncing on the cushions 5 times, it will pass through its original position, and then after bouncing twice more, it reaches the coin.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<blockquote>
<p><i>a</i> <i>b</i> <i>x</i> <i>y</i> <i>n</i></p>

<p><i>x</i><sub>1</sub> <i>y</i><sub>1</sub></p>

<p>⋮</p>

<p><i>x<sub>n</sub> y<sub>n</sub></i></p>
</blockquote>

<p>The first line has five integers. <i>a</i> and <i>b</i> are the width and the length of the movable area, respectively, satisfying 2 &le; <i>a</i> &le; 10<sup>6</sup> and 2 &le; <i>b</i> &le; 10<sup>6</sup>. <i>x</i> and <i>y</i> give the coordinates (<i>x, y</i>) of the position of the coin, satisfying 1 &le; <i>x</i> &lt; <i>a</i> and 1 &le; <i>y</i> &lt; <i>b.</i> <i>n</i> is the number of balls, satisfying 1 &le; <i>n</i> &le; 10<sup>5</sup>.</p>

<p>The balls are numbered from 1 to <i>n,</i> and the <i>i</i>-th line in the following <i>n</i> lines has the coordinates of the ball <i>i.</i> The line contains two integers <i>x<sub>i</sub></i> and <i>y<sub>i</sub></i> meaning that the coordinates of the center of the ball <i>i</i> are (<i>x<sub>i</sub>, y<sub>i</sub></i>). They satisfy 1 &le; <i>x<sub>i</sub></i> &lt; <i>a</i> and 1 &le; <i>y<sub>i</sub></i> &lt; <i>b.</i> The positions of the coin and all the balls are mutually different.</p>

<p>The end of the input is indicated by a line consisting of five zeros. The number of datasets does not exceed 50. The sum of <i>n</i> of all the datasets does not exceed 5&times;10<sup>5</sup>.</p>

### 출력

<p>For each dataset, output in a line all the ball numbers that you should strike to win the coin, separated by a single space. The ball numbers should be in ascending order. When there are no such balls, output &quot;No&quot; in one line.</p>