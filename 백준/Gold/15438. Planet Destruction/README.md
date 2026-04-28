# [Gold I] Planet Destruction - 15438

[문제 링크](https://www.acmicpc.net/problem/15438)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 15, 맞힌 사람: 9, 정답 비율: 42.857%

### 분류

정렬, 기하학, 이분 탐색, 스위핑, 매개 변수 탐색

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15438.%E2%80%85Planet%E2%80%85Destruction/cdc00a72.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15438/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:195px; width:469px" />Darth Vader is back to his favourite hobby: destroying planets (or their population to be precise). He just discovered that the rebel leadership has gathered at a planet named Watooine, so he must act quickly to eliminate the threat. Unfortunately, the Empire is in a pretty bad recession right now, so there aren&#39;t any Death Stars left around. Therefore, Vader&#39;s plan involves dropping several containers with deadly viruses onto the planet&#39;s surface.</p>

<p>To make things simpler for you, we will model this problem in 2D. Watooine has radius R and is centred at (0,0). There are K Empire spaceships, each of which will simultaneously launch a rocket with a container towards point (0, 0). Once the rocket hits the surface of the planet, a virus will start spreading along the surface in the shape of a circle of ever increasing radius. Since we are modelling the problem in 2D, the virus spreads from the point of impact at the same rate in both directions, clockwise and counterclockwise along the circumference of the circle that represents the surface of the planet. Each spaceship has a custom rocket speed, and each virus has a custom spread speed. Note that each virus spreads along the surface of the planet - it cannot pass through the planet to reach the other end.</p>

<p>Your task is to determine how much time will it take for Watooine to become completely infected - i.e. every point on the planet surface has been reached by a virus. Good luck!</p>

### 입력

<p>The first line contains T, the number of test cases, followed by the descriptions of the T test cases. Each test case description has the following structure: The first line contains two integers R, the radius of the planet (in meters), and K, the number of spaceships. The next K lines each contain 4 integers: the X-coordinate of the ship, the Y-coordinate of the ship, the rocket speed and the virus spread speed (in meters per second). It is guaranteed that no ships are inside the planet.</p>

<p>Both speeds are between 1 and 1000000, both coordinates are between -1000000 and 1000000, R is between 1 and 1000000. K is between 1 and 10000, and T is between 1 and 100.</p>

### 출력

<p>For each test case, print one line containing one real number, the time it takes for the planet to become completely infected. Your answer will be considered correct if it is within 10<sup>-4</sup>&nbsp;from the jury answer.</p>