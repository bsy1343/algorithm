# [Gold IV] Rebel Against The Empire (Small) - 14351

[문제 링크](https://www.acmicpc.net/problem/14351)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 14, 맞힌 사람: 12, 정답 비율: 48.000%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 정렬, 기하학, 최단 경로, 데이크스트라, 분리 집합, 피타고라스 정리

### 문제 설명

<p>You are a rebel against the evil Galactic Empire, and you are on the run!</p>

<p>You have sabotaged the Empire&#39;s Factory of Evil, and imperial security forces will be after you soon! The factory is located on asteroid 0 in a system of&nbsp;N&nbsp;numbered asteroids. Your getaway ship, the Century Quail, is located on asteroid 1, and if you can get there, you will be able to fly away safely.</p>

<p>Each asteroid is a single point in space with a velocity, and you move through space along with whichever asteroid you are currently on. Your Asteroid Jumper will allow you to instantaneously jump between any two asteroids in the system. Long jumps are scarier than short ones (and the vacuum of space is terrifying), so you want to minimize the maximum distance you need to jump. However, starting now, if you ever spend more than a continuous&nbsp;S&nbsp;seconds without jumping, the imperial security forces will catch you. That is, the interval from now until your first jump, and each interval between subsequent jumps, must be less than or equal to&nbsp;S. You may jump at&nbsp;any&nbsp;instant; it does not have to be after an integer number of seconds have elapsed. You escape the instant you jump to asteroid 1.</p>

<p>The i-th asteroid starts at position (x<sub>i</sub>,&nbsp;y<sub>i</sub>,&nbsp;z<sub>i</sub>) in space, and it will move a total distance of (V<sub>xi</sub>,&nbsp;V<sub>yi</sub>,&nbsp;V<sub>zi</sub>) each second. This movement is continuous throughout time; it does not update discretely each second. (It is also possible for an asteroid to be stationary.) Nothing happens if asteroids occupy the same point in space at the same time. You can only travel between two asteroids by jumping, even if they happen to occupy the same point at the instant of your jump.</p>

<p>In the escape plan that minimizes the maximum jump distance, what is that maximum jump distance?</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. The first line of each test case contains two integers:&nbsp;N&nbsp;(the number of asteroids) and&nbsp;S&nbsp;(the limit on how long you can go without jumping). Next, there are&nbsp;N&nbsp;lines describing the asteroids. The i-th of these lines (counting starting from 0) contains six integers: the initial (x<sub>i</sub>,&nbsp;y<sub>i</sub>,&nbsp;z<sub>i</sub>) position of the i-th asteroid in space, and the distance (V<sub>xi</sub>,&nbsp;V<sub>yi</sub>,&nbsp;V<sub>zi</sub>) it moves in a single second.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 20.</li>
	<li>2 &le;&nbsp;N&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;S&nbsp;&le; 100.</li>
	<li>-500 &le;&nbsp;x<sub>i</sub>&nbsp;&le; 500.</li>
	<li>-500 &le;&nbsp;y<sub>i</sub>&nbsp;&le; 500.</li>
	<li>-500 &le;&nbsp;z<sub>i</sub>&nbsp;&le; 500.</li>
	<li>V<sub>xi</sub>&nbsp;= 0.</li>
	<li>V<sub>yi</sub>&nbsp;= 0.</li>
	<li>V<sub>zi</sub>&nbsp;= 0.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a floating-point number: the distance of the longest jump you will have to make in order to get away.&nbsp;<code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-4</sup>&nbsp;of the correct answer.&nbsp;</p>

### 힌트

<p>Sample case #1 is the only sample case that could appear in the Small dataset. Any of the sample cases could appear in the Large dataset.</p>

<p>In sample case #1, we start on a stationary asteroid at (0, 0, 0), and our ship is on an asteroid at (1, 2, 2). There is another asteroid at (1, 1, 1). One option is to jump directly to our ship, which is a distance of 3 away. Another option is to jump to the other asteroid, which is a distance of sqrt(3) away, and then jump to the ship from there, which is a distance of sqrt(2) away. The maximum jump distance is 3 for the first option and sqrt(3) for the second option, so the second option is preferable.</p>

<p>Note that the value of&nbsp;<strong>S</strong>&nbsp;does not matter in the Small cases. Since all of the asteroids are stationary, there is no reason to wait around; we can make all jumps instantaneously.</p>

<p>In sample case #2, we start on a stationary asteroid at (0, 0, 0). We can wait there for 4 seconds for asteroid 4 to come very close, jump onto it, fly for 1 second on it, and then jump back at time 5 back to asteroid 0 (the distance between the two asteroids is 1 at this moment). There we wait 10 seconds, cutting it very close to being caught, and then jump to the speeding asteroid 3 at time 15. Two seconds later, asteroid 3 flies by asteroid 2, and we jump to asteroid 2. At time 27, we can jump from asteroid 2 to asteroid 0. There we patiently wait until time 35 when asteroid 1 reaches us, then we can jump onto it and escape. The longest jump we made was from asteroid 0 to asteroid 3 at time 15, and the distance we jumped was 2.</p>

<p>In sample case #3, the security forces are really active! You could, of course, wait one second and jump directly to asteroid 1, but a better choice - that allows you to make jumps no longer than 4 - is to jump back and forth between asteroids 0 and 2; while waiting for asteroid 1 to get close, and only then jump to it.</p>