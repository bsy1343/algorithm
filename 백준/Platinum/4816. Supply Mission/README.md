# [Platinum IV] Supply Mission - 4816

[문제 링크](https://www.acmicpc.net/problem/4816)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

수학, 브루트포스 알고리즘, 기하학, 물리학

### 문제 설명

<p>You are to fly a helicopter to bring supplies to a number of submarines that are currently moving across the ocean. You will be given the coordinates of the helicopter base and each submarine. Each submarine is travelling constantly at a heading and speed specified by the velocity vector (vx, vy), meaning that after 1 hour it would have travelled vx km in the x direction and vy km in the y direction (vx and vy may be negative). The length of the vector is the speed. The helicopter is capable of travelling at a constant speed in any direction (assume that acceleration and deceleration are instantaneous). The helicopter must land on each submarine at least once, and it takes 1 hour at each stop to unload the supplies and refuel. Each submarine rises to the surface at the appropriate landing time, and submerges once the helicopter leaves. You may assume that the velocity of each submarine is not affected by any change of its travelling depth. The helicopter can carry enough supplies for all submarines without having to return to the base. All coordinates have km as units, and all velocities and speeds have km/h as units.</p>

<p>Find the shortest time for the helicopter to bring supplies to each submarine from the base and return to its base.</p>

### 입력

<p>The input consists of a number of cases. Each case starts with a line containing the integer N (1 &lt;= N &lt;= 8) specifying the number of submarines. The next N lines contain 4 integers separated by a space: the initial (x,y) coordinates of the i-th submarine and its velocity vector. The last line of each case contains 3 integers specifying the (x,y) coordinates of the helicopter base and the speed of the helicopter. The end of input is indicated by a case that starts with N = 0, and this last case should not be processed. All input integers have absolute value at most 1000. You may assume that the helicopter travels at a greater speed than every submarine. Note that the paths of the submarines may cross each other or even the helicopter base, but since they can adjust their depth there will be no collisions.</p>

### 출력

<p>For each case, print its case number, a colon, followed by the minimum amount of time needed to complete the mission in the format:</p>

<pre>
Case a: b hour(s) c minute(s) d second(s)</pre>

<p>where a, b, c, d are appropriate non-negative integers, and c and d are at most 59. The time should be rounded up to the next second.</p>