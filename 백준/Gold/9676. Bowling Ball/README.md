# [Gold II] Bowling Ball - 9676

[문제 링크](https://www.acmicpc.net/problem/9676)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 92, 정답: 6, 맞힌 사람: 5, 정답 비율: 7.692%

### 분류

구현, 물리학, 시뮬레이션

### 문제 설명

<p>There are a lot of mountain ranges in the Neverlands. Every mountain range consists of a number of valleys and summits. The slope between two consecutive summit and valley is always either 1 or -1, and all the summits and the valleys have integer heights. A bowling ball is swinging on a part of a mountain range consisting of n valleys and n-1 summits. The ball is always touching down the surface of the mountain range (it does not jump). Mountains before the first and after the last valleys are too high such that the ball can never exit the mountain range. At time t<sub>0</sub> the ball is located in the valley number s moving to the upper-right direction and it has an initial kinetic energy K<sub>0</sub>. The following figure shows a mountain range with 4 valleys and 3 summits, and the ball located in the 2<sup>nd</sup> valley (enumerated from left to right).&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9676.%E2%80%85Bowling%E2%80%85Ball/86cb4198.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9676/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%203.49.55.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:119px; width:500px" /></p>

<p>By the simple physics we know that at any time t the ball has a gravitational potential energy P<sub>t</sub>=mgh and also a kinetic energy K<sub>t</sub>=(1/2)mv<sup>2</sup>, where m is the mass of the ball, g is the constant of the Earth gravity (here equals to 10), and h and v are the height and the velocity of the ball at time t. By the transformation of energy from potential to kinetic or vice versa, the total energy of the ball P<sub>t</sub>+K<sub>t</sub> is fixed during its movements, unless it falls into a valley: at the ith valley (from left), c<sub>i</sub> units of the kinetic energy is lost due to friction or it stops if its kinetic energy is below c<sub>i</sub> but consider no friction in other locations. Note that the ball loses c<sub>s</sub> unit of energy when it leaves the starting valley at time t<sub>0</sub>. You can assume the ball diameter is equal to 0 and its mass is equal to 1. Your task is to find the valley or summit at which the ball will stop.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains three space-separated positive integers n, and s and K<sub>0</sub>(1 &le; n &le; 3000, 1 &le; s &le; n, 1 &le; K<sub>0</sub> &le; 10<sup>15</sup>). Each of the following n lines contains two integers h<sub>i</sub> and c<sub>i</sub>, the height and friction of the i<sup>th</sup> valley. The j<sup>th</sup> line of the next n-1 lines contains H<sub>j</sub>, the height of The j<sup>th</sup> summit from the left (0 &le; h<sub>i</sub>,c<sub>i</sub>,H<sub>j</sub> &le; 10<sup>9</sup>). It is guaranteed that at least one of c<sub>i</sub>s is greater than zero. The input terminates with &ldquo;0 0 0 0&rdquo; which should not be processed.</p>

### 출력

<p>For each test case, output a line conforming one of the following formats depending on whether the ball stops at either a valley or a summit.</p>

<ul>
	<li>If the ball stops at valley number k, output &ldquo;Valley: k&rdquo; (omit the quotes.)</li>
	<li>If the ball stops at Summit number k, output &ldquo;Summit: k (omit the quotes.)</li>
</ul>