# [Platinum V] Multikill - 9430

[문제 링크](https://www.acmicpc.net/problem/9430)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 95, 정답: 17, 맞힌 사람: 15, 정답 비율: 20.000%

### 분류

기하학

### 문제 설명

<p>The Zombie Apocalypse is here! Zombies are quite easy to kill; however, ammunition is scarce so we need to maximize the explosive potential. Our most powerful defensive weapon is an automated grenade launcher that can identify zombified targets at extreme distances. The one missing piece is the code for optimizing the blasts to hit multiple targets.</p>

<p>For each known group of zombies, you will be given a kill radius and the locations of the zombies. The program should identify a coordinate to hit with the explosive to kill as many zombies as possible and output the maximum number of targets that can be killed with one round. A zombie will be killed if its distance from the explosive is equal to or less than the kill radius.</p>

### 입력

<p>The first line of input will contain an integer representing the number of test cases, C (1 &lt;= C &lt;= 20). For each test case, there will be a single line containing a kill radius as a real number, R (0 &lt; R &lt;= 1000.0), and a count of zombie targets, N (0 &lt;= N &lt;= 25), followed by N lines containing a pair of Cartesian coordinates X Y (-10^6 &lt;= X, Y &lt;= 10^6) giving each zombie position. The units used for the kill radius and the coordinates are both in meters.</p>

<pre>
C
R N
X0 Y0
...
XN-1 YN-1</pre>

### 출력

<p>Output will be a single line per test case with the number of targets that can be killed with a single explosive round. Output for each test case should be on its own line.</p>