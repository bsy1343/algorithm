# [Platinum IV] Run Away - 3478

[문제 링크](https://www.acmicpc.net/problem/3478)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 11, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

기하학, 휴리스틱

### 문제 설명

<p>One of the traps we will encounter in the Pyramid is located in the Large Room. A lot of small holes are drilled into the floor. They look completely harmless at the first sight. But when activated, they start to throw out very hot java, uh ... pardon, lava. Unfortunately, all known paths to the Center Room (where the Sarcophagus is) contain a&nbsp;trigger that activates the trap. The ACM were not able to avoid that. But they have carefully monitored the positions of all the holes. So it is important to find the place in the Large Room that has the maximal distance from all the holes. This place is the safest in the entire room and the archaeologist has to hide there.</p>

### 입력

<p>The input consists of T test cases. The number of them (T) is given on the first line of the input file. Each test case begins with a line containing three integers X, Y, M separated by space. The numbers satisfy conditions: 1 &lt;= X,Y &lt;=10000, 1 &lt;= M &lt;= 1000. The numbers X and Yindicate the dimensions of the Large Room which has a rectangular shape. The number M stands for the number of holes. Then exactly M lines follow, each containing two integer numbers Ui and Vi (0 &lt;= Ui &lt;= X, 0 &lt;= Vi &lt;= Y) indicating the coordinates of one hole. There may be several holes at the same position.</p>

### 출력

<p>Print exactly one line for each test case. The line should contain the sentence &quot;The safest point is (P, Q).&quot; where P and Qare the coordinates of the point in the room that has the maximum distance from the nearest hole, rounded to the nearest number with exactly one digit after the decimal point (0.05 rounds up to 0.1).</p>