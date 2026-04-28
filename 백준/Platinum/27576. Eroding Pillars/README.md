# [Platinum III] Eroding Pillars - 27576

[문제 링크](https://www.acmicpc.net/problem/27576)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 15, 맞힌 사람: 14, 정답 비율: 35.000%

### 분류

단절점과 단절선, 이분 탐색, 그래프 이론

### 문제 설명

<p>You&#39;ve landed yourself in a real mess, or more accurately a cave filled with dilapidated and unstable pillars. You are luckily standing on a solid rock in the middle of the cave. You know there is a valuable artifact on one of the pillars in the cave, but you aren&#39;t sure which one yet. While you wait for the results of a scan of the cave, you start building a robot to help you retrieve the artifact.</p>

<p>The robot you build will be light, and it will assuredly be able to land and jump from any pillar at least once. To build the robot, you need to determine how powerful it needs to be in terms of its jump distance. If the robot is too weak, then it might not be able to reach a pillar. If the robot is too strong, then it will cause a lot of damage when jumping and landing.</p>

<p>Luckily you have already mapped out where all the pillars are located with respect to your starting point at $(0, 0)$. You don&#39;t know yet which pillar contains the artifact, and you need to finish building the robot first before the scan finishes.</p>

<p>Given the locations of the pillars, you&#39;d like to determine the smallest jump distance to guarantee that your robot can reach any pillar and return back to the start, without landing on a pillar twice. </p>

### 입력

<p>The first line of input contains a single integer $n$ $(1 \le n \le 1,000)$, which is  the number of pillars.</p>

<p>Each of the next $n$ lines contains two integers, $x$ and $y$ $(-10^9 \le x, y \le 10^9)$. These are the ($x$,$y$) coordinates of the pillars. All pillar locations will be distinct, and no pillar will be at $(0, 0)$.</p>

### 출력

<p>Output a single number, which is the minimum jump distance needed to guarantee that a robot could reach any pillar and return back to your starting point, without landing on a pillar twice. Your answer will be accepted if it has an absolute or relative error of at most $10^{-6}$.</p>