# [Platinum II] Big Bang - 13890

[문제 링크](https://www.acmicpc.net/problem/13890)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 95, 맞힌 사람: 72, 정답 비율: 54.962%

### 분류

수학, 정수론, 뫼비우스 반전 공식

### 문제 설명

<p>A Big Bang has happened at coordinate (0,0,0) at time T = 0.Specifically, a &ldquo;Fixed Velocity Lattice Big Bang&rdquo; had happened. Just before the Big Bang, every particle was at (0,0,0) with zero volume and infinite density. After the Big Bang the particles propagate in a Cartesian 3D space. The movements of particles follow the following rules:</p>

<ol>
	<li>The direction of particles are always along a straight line (in 3D space), starting at (0,0,0).</li>
	<li>All particles start their journey at the time T=0. Two particles can have same direction but in that case they cannot have same speed. In other words no two particles occupy the same place at the same time.</li>
	<li>The speed of each particle is uniform.</li>
	<li>The number of particles can be considered unlimited.</li>
	<li>The velocity of the particles are such that the x, y and z components are always on the strictly positive side of respective axis.</li>
	<li>All particles are so small that they can be considered as points.</li>
	<li>All the particles is not visible. A particle is visible if it reaches a lattice point (all three coordinates are integers) at an integer time (Measured in micro-seconds) after the bigbang. This is because particle sensors are only at lattice points and they are activated once in every microsecond.</li>
</ol>

<p>Now if sensors are placed in all lattice points that have strictly positive x, y and z values not exceeding a positive integer N, and measures are taken up to Nth microseconds after bigbang, maximum how many distinct particles can be detected? For example the particle that is detected at (1,1,1) after 1 microsecond of Big-bang and the at (2,2,2) after 2 microsecond after Big-bang are basically the same particle as both have same direction and speed.</p>

### 입력

<p>The input contains 5 positive integers as input. All these are possible values of N: First four integers do not exceed 20 000. The last line contains the integer 80 000.</p>

### 출력

<p>For each integer in the input produce one line of output which denotes the maximum number of distinct particles that can be detected.</p>

### 힌트

<p>The output of 5th case is not shown for obvious reasons. &lsquo;?&rsquo; denotes a single digit</p>