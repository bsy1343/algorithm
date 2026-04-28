# [Platinum II] Mario - 11631

[문제 링크](https://www.acmicpc.net/problem/11631)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 63, 정답: 19, 맞힌 사람: 14, 정답 비율: 28.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>In a final attempt to complete an impossible Super Mario level, you decided to write an AI and let it play the game for you.</p>

<p>As a first step, we forget about badguys and only implement navigation. In this problem, you will implement navigation over a river. The river has width W and occupies x = [0, W]. Transportation over water happens using boats. Each boat moves in a range [L, R]; all boats remain at height y = 0. At t = 0, Mario is at x = 0 and each boat is at its left endpoint (we assume boats are infinitely thin). Each boat moves periodically between its endpoints at the speed of one unit per second. So if a boat&rsquo;s parameters are [L, R], then it is at x = L at t = 0, at x = R at t = R &minus; L, at x = L again at t = 2(R &minus; L), at x = R again at t = 3(R &minus; L), etc. Mario cannot jump yet, so he can move between two boats if and only if their x-coordinates are equal. Furthermore, although there could be many boats sharing the same x-coordinate at some point in time, we assume that it is possible to move to any of the boats sharing the same x-coordinate.</p>

<p>Find the minimal time it takes to go from x = 0 to x = W, or determine that it is impossible to reach x = W.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with two space-separated integers N and W (0 &le; N &le; 100, 1 &le; W &le; 500), the number of boats and the width of the river, respectively.</li>
	<li>N lines, each containing two space-separated integers L<sub>i</sub> and R<sub>i</sub> (0 &le; L<sub>i</sub> &lt; R<sub>i</sub> &le; W), representing the range [L<sub>i</sub> , R<sub>i</sub>] covered by boat i.</li>
</ul>

### 출력

<p>For each test case, output one line containing an integer, the earliest possible time to reach x = W, or IMPOSSIBLE if it is impossible to reach x = W.</p>

### 힌트

<p>In the first test case, the two boats move synchronously so it is not possible to reach one from the other.</p>

<p>In the second test case, we can transfer to boat 3 at time 2, then to boat 2 at time 16, so that we finish at time 24.</p>