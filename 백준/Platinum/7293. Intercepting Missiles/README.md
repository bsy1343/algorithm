# [Platinum III] Intercepting Missiles - 7293

[문제 링크](https://www.acmicpc.net/problem/7293)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 5, 맞힌 사람: 4, 정답 비율: 21.053%

### 분류

이분 매칭, 최대 유량, 기하학, 그래프 이론

### 문제 설명

<p>Our country is under enemy&#39;s attack. Hostile bombers are going to fly towards the capital and destroy everything. To defend the capital, we have a number of missiles, ready to launch and hit the enemy&#39;s bombers, before they reach the capital. Unfortunately, there are passenger planes in the sky, which we do not want to hit by our missiles.</p>

<p>We have been able to gather useful information regarding enemy&#39;s bombers. While they taxi over our missile defense zone, bombers travel in a fixed altitude. All bombers fly with the same speed. The same applies to airplanes, and our missiles. We know the location of each bomber and each airplane at time zero. Our missiles are placed on the ground, and their locations are also known.</p>

<p>You should write a program, that given the information about the bombers, and the locations of passenger planes in the sky, determines the maximum number of bombers that can be successfully hit by our missiles. Then, we pray for the rest of bombers to explode by themselves!</p>

<p>To simplify your task, The following are assumed:</p>

<ul>
	<li>We consider a flat two-dimensional model of the earth. Thus, the y -coordinate of the airplanes, and attacking bombers, does not change during their movement over our defense zone.</li>
	<li>Each defending missile can be fired, at time zero or afterwards.</li>
	<li>The y -coordinate of bombers, and airplanes are distinct positive integers.</li>
	<li>Each bomber or airplane, has unit length, while our missiles have no length.</li>
	<li>If a missile hits, or just touches the edge of a target in the sky, our missile will explode, while the target keeps moving normally on its path for a while before it explodes. Assume that the hit bomber will explode after passing all defending missiles, i.e. after surpassing the x -coordinate of all our missiles. Note that during this time, it may be hit by other missiles.</li>
</ul>

### 입력

<p>The input file contains multiple test cases. The first line of the input, contains t , the number of test cases that follow. Each of the following t blocks, describes a test case, and is preceded by a blank line.</p>

<p>The first line of each block contains three integers, m , n and k (0 &le; m, n, k &le; 300) , which are the number of bombers, airplanes, and our missiles, respectively. The second line contains three integers, v<sub>m</sub> , v<sub>n</sub> , and v<sub>k</sub> (1 &le; v<sub>m</sub>, v<sub>n</sub>, v<sub>k</sub> &le; 10, 000) , which are the respective velocity of bombers, airplanes and our missiles. Airplanes and enemy&#39;s bombers, are assumed to move to the right, for simplicity, while our missile move upwards, without changing their x -coordinates.</p>

<p>Next come m lines, that each gives the x and y coordinate of the head of a bomber, at time zero. The planes in the sky, are described similarly, in the following n lines. The last line contains k integers, each being the x -coordinate of a defending missile which is ready to launch. The coordinates are all nonnegative integers less than 10,000.</p>

### 출력

<p>For each test case, output one line showing the maximum number of hit bombers, without any airplane being hit. Follow the format of the sample.</p>