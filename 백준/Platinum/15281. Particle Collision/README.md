# [Platinum V] Particle Collision - 15281

[문제 링크](https://www.acmicpc.net/problem/15281)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 20, 맞힌 사람: 17, 정답 비율: 29.310%

### 분류

수학, 구현, 기하학, 시뮬레이션, 많은 조건 분기

### 문제 설명

<p>Particle colliders are difficult to build and experiments are costly to run. Before running any real experiments it is better to do a simulation to test out the ideas first. You are required to write a very simple simulator for this problem.</p>

<p>There are only three particles in this system, and all particles are confined to an infinite plane so that they can be modelled as circles. Their locations are specified only by the x<sub>i</sub> and y<sub>i</sub> coordinates of their centers (1 &le; i &le; 3). All three particles have the same radius r, and are initially stationary.</p>

<p>We are given a vector (x<sub>v</sub>, y<sub>v</sub>) specifying the direction particle 1 will move when the experiment starts. When particle i hits particle j, particle j will start moving in the direction perpendicular to the tangent at the point of the contact, away from particle i. Particle i will cease to exist and be converted to radiation. A moving particle that does not hit another will continue moving indefinitely.</p>

<p>There are a number of possible scenarios your simulator should identify:</p>

<ol>
	<li>particle 1 hits particle 2, which in turns hits particle 3;</li>
	<li>particle 1 hits particle 3, which in turns hits particle 2;</li>
	<li>particle 1 hits particle 2, which moves indefinitely;</li>
	<li>particle 1 hits particle 3, which moves indefinitely;</li>
	<li>particle 1 moves indefinitely.</li>
</ol>

### 입력

<p>The input contains four lines. The first three lines each contains two integers x<sub>i</sub> and y<sub>i</sub> (|x<sub>i</sub>|, |y<sub>i</sub>| &le; 1000), describing particles 1, 2, and 3 in this order. The fourth line contains three integers x<sub>v</sub>, y<sub>v</sub>, and r (|x<sub>v</sub>|, |y<sub>v</sub>| &le; 1000, 0 &lt; r &le; 50).</p>

<p>You may assume that no two particles touch or overlap initially, and that the distance between the centers of particles 2 and 3 is greater than 4r.</p>

### 출력

<p>Output a single integer giving the number (1&ndash;5) identifying the scenarios described above.</p>

<p>Although you should take care of your calculations, it is guaranteed that the outcome would not change if the initial vector (x<sub>v</sub>, y<sub>v</sub>) is rotated by one degree either way.</p>