# [Platinum IV] Slalom - 4182

[문제 링크](https://www.acmicpc.net/problem/4182)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 11, 맞힌 사람: 9, 정답 비율: 31.034%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>You are competing in a ski slalom, and you need to select the best skis for the race. The format of the race is that there are N pairs of left and right gates, where each right gate is W metres to the right of its corresponding left gate, and you may neither pass to the left of the left gate nor to the right of the right gate. The ith pair of gates occurs at distance y<sub>i</sub> down the hill, with the horizontal position of the ith left gate given by x<sub>i</sub>. Each gate is further down the hill than the previous gate (i.e. y<sub>i</sub> &lt; y<sub>i+1</sub> for all i).</p>

<p>You may select from S pairs of skis, where the jth pair has speed s<sub>j</sub>. Your movement is governed by the following rule: if you select a pair of skis with speed s<sub>j</sub>, you move with a constant downward velocity of s<sub>j</sub> metres per second. Additionally, at any time you may move at a horizontal speed of at most v<sub>h</sub> metres per second.</p>

<p>You may start and finish at any two horizontal positions. Determine which pair of skis will allow you to get through the race course, passing through all the gates, in the shortest amount of time.</p>

### 입력

<p>The first line of input contains the three integers W, v<sub>h</sub>, and N, separated by spaces, with 1 &lt;= W &lt;= 10<sup>8</sup>, 1 &lt;= v<sub>h</sub> &lt;= 10<sup>6</sup>, and 1 &lt;= N &lt;= 10<sup>5</sup>.</p>

<p>The following N lines of input each contain two integers x<sub>i</sub> and y<sub>i</sub>, the horizontal and vertical positions respectively of the ith left gate, with 1 &lt;= x<sub>i</sub>, y<sub>i</sub> &lt;= 10<sup>8</sup>.</p>

<p>The next line of input contains an integer S, the number of skis, with 1 &lt;= S &lt;= 10<sup>6</sup>.</p>

<p>The following S lines of input each contain one integer s<sub>j</sub>, the speed of the jth pair of skis, with 1 &lt;= s<sub>j</sub> &lt;= 10<sup>6</sup>.</p>

### 출력

<p>If it is impossible to complete the race with any pair of skis, print the line IMPOSSIBLE. Otherwise, print the vertical speed s<sub>j</sub> of the pair of skis that allows you to get through the race course in the shortest time.</p>