# [Platinum II] Fair Share - 16105

[문제 링크](https://www.acmicpc.net/problem/16105)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 194, 정답: 22, 맞힌 사람: 18, 정답 비율: 15.385%

### 분류

구현, 정렬, 기하학, 많은 조건 분기, 두 포인터, 회전하는 캘리퍼스

### 문제 설명

<p>Scientists have discovered vast water sources in the Great Victoria Desert. Representatives from Western Australia and South Australia&mdash;the two states sharing the desert&mdash;have agreed to divide the water sources in a fair way. They propose to map the water sources, to draw a straight line through the centre of the map and to assign each state the sources on one side of the line. The centre of the map is located at (0, 0).</p>

<p>The benefit for a state is the sum of the values of the water sources in its half minus the sum of the costs for infrastructure development in the same half. The costs are also given on the map. The state representatives ask you to compute a fair division, which minimises the difference between the benefits for the two states. The dividing line must not pass directly through any of the locations in question.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 10<sup>5</sup>), which is the number of water sources and infrastructure locations. Each of the next n lines contains three integers x<sub>i</sub>, y<sub>i</sub> and v<sub>i</sub> (&minus;10<sup>9</sup> &le; x<sub>i</sub>, y<sub>i</sub>, v<sub>i</sub> &le; 10<sup>9</sup>). They represent the location (x<sub>i</sub>, y<sub>i</sub>) of a water source with value v<sub>i</sub> (if v<sub>i</sub> &ge; 0) or an infrastructure location whose development costs &minus; v<sub>i</sub> (if v<sub>i</sub> &lt; 0). Locations are pairwise distinct and different from (0, 0).</p>

### 출력

<p>Display the minimum absolute difference between the benefits for the two states.</p>