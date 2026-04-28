# [Platinum IV] The Big Surprise - 18334

[문제 링크](https://www.acmicpc.net/problem/18334)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

값 / 좌표 압축, 데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>&ldquo;A big surprise is coming on the next Thursday!&rdquo;, the young mayor of TetrisCity announced in the social media. TetrisCity is the most populous and modern city in Neverland constructed on a flat area with endless clusters of high-rise buildings packed so closely together that they resemble a game of Tetris. Buildings look like axisparallel boxes constructed on the ground and they are disjoint (they do not even touch each other).</p>

<p>The big surprise announced by the mayor is going to be a special delivery service using drones. The drones used in this service are a generation of quadcopters which can physically move only in one of x, y, and z directions. So, the distance traveled by a drone is the sum of distances traveled by it in each axis. The young mayor now has ordered to make the drones smart by equipping them with a software that computes the shortest path from any source to any destination avoiding the buildings. Your job is to develop this software.</p>

### 입력

<p>The first line of the input contains an integer n (0 ⩽ n ⩽ 100), specifying the number of buildings in the TetrisCity. Each of the next n lines contains 5 space-separated integers x, y, x&prime;, y&prime;, and h specifying a building: the coordinates (x, y) and (x&prime;, y&prime;) respectively specify the west-south corner and the east-north corner of the building, and h determines its height. It is guaranteed that the volume of the building is not zero. The source and destination appear at the end of the input in two separated lines; each containing x, y, and z coordinates. All numbers in the input are non-negative integers being at most 100 000. It is guaranteed that the source and destination are outside the buildings (they can be on the boundary of buildings). The shortest path can touch buildings and it is assumed that a drone looks like a point.</p>

### 출력

<p>In the output, print the length of the shortest path from the source to the destination avoiding the buildings.</p>