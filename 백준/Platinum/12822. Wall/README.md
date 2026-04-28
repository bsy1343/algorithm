# [Platinum II] Wall - 12822

[문제 링크](https://www.acmicpc.net/problem/12822)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 29, 맞힌 사람: 29, 정답 비율: 38.667%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 누적 합

### 문제 설명

<p>Mirek is a conservator. His job is to maintain monuments, keeping them in good condition. Mirek&rsquo;s today task is to repair the defense wall of an old fortress. The wall is about to fall to pieces, so he must hurry. He searched through the Internet and found a robot designed to repair such walls extremely fast. After purchasing the robot, he tried to make the optimal repairment plan, but this was way too difficult for him.</p>

<p>The wall can be considered as a straight line. Mirek wrote down all points on the wall, which require repairing. For each point he knows, what would be the cost C<sub>i</sub> of repairing it, and a coefficient D<sub>i</sub> &ndash; how would the cost increase if it wasn&rsquo;t repaired immediately. If the i-th point will be repaired after time t, then the cost of repairing it would be equal to:</p>

<p style="text-align: center;">Ci + t &middot; Di</p>

<p>Given the coordinates of all points on the wall and the initial position of the robot, and knowing that transportation of the robot from point x<sub>1</sub> to point x<sub>2</sub> would take |x<sub>1</sub> &minus; x<sub>2</sub>| time, calculate the minimum cost of repairing all spoiled points. You can assume that repairing a single point takes no time.</p>

### 입력

<p>On the first line of input there are two integers N and P (1 &le; N &le; 2 000, 0 &le; P &le; 10<sup>9</sup>) &ndash; the number of points on the wall, which should be repaired, and the initial position of the robot. Then, N lines follow, i-th of these lines describes i-th point on the wall and contains three integers X<sub>i</sub> , C<sub>i</sub> and D<sub>i</sub> (0 &le; X<sub>i</sub> &le; 10<sup>9</sup> , 0 &le; C<sub>i</sub> , D<sub>i</sub> &le; 10<sup>6</sup> , X<sub>i</sub>&nbsp;&ne;&nbsp;P) &ndash; the position of the point and cost coefficients. There are no two points with equal positions.</p>

### 출력

<p>Output a single line with integer C, where C is the minimal cost of repairing all points on the wall.</p>

### 힌트

<p>The optimal plan of repairing points is:</p>

<ul>
	<li>Transport robot from point 7 to point 10 and repair the first point after time 3.</li>
	<li>Transport robot from point 10 to point 14 and repair the third point after time 3 + 4 = 7.</li>
	<li>Transport robot from point 14 to point 3 and repair the second point after time 3+4+11 = 18.</li>
</ul>

<p>Thus, the total cost of repairing the wall is 5 + 18 &middot; 1 + 32 + 3 &middot; 1 + 0 + 7 &middot; 2 = 72.</p>