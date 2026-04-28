# [Gold IV] Cow Crane - 11205

[문제 링크](https://www.acmicpc.net/problem/11205)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 39, 정답: 21, 맞힌 사람: 21, 정답 비율: 61.765%

### 분류

애드 혹, 수학

### 문제 설명

<p>Farmer Laura has a barn. In her barn, she has two cows, Monica and Lydia. Monica and Lydia love food, and they are quite lazy. For most of the day they chill out in the barn, waiting for Laura to come serve them a nice meal. Farmer Laura is always very precise about when to serve them food, so Monica and Lydia know exactly when to expect food, the same time every day.</p>

<p>This might sound surprising to you but there&rsquo;s a problem. Farmer Laura needs your help. She will be replacing some planks in the floor of the barn, which means that the cows have to be moved temporarily from their favorite spots. Since the cows are infinitely lazy, they refuse to walk themselves. Farmer Laura has rented an excellent tool to resolve this issue &ndash; a cow crane, designed and crafted specifically for the cow&rsquo;s comfort.</p>

<p>We visualize the barn as a one-dimensional line. The cow crane starts at time t = 0 at position x = 0, and it can move one distance unit per second. The crane can only carry one cow at a time, but it may pick up and drop off a cow as many times as necessary. Monica&rsquo;s current location is at x = m, and Lydia is located at x = l. Monica will be moved to the temporary location at x = M and Lydia to x = L. Monica and Lydia always have their daily meal tm and tl seconds into the day, so the cows had better be in their respective temporary locations exactly by these times. You may assume that it takes no time for the crane to pick up or drop off a cow and that the two cows can be at the same position at the same time.</p>

<p>Farmer Laura would like to know if she can move the cows so that both of them are in place at their temporary location no later than their daily meal occurs.</p>

### 입력

<p>Input consists of three lines. The first line consists of two integers m and l, the current positions of the cows. The second line consists of two integers M and L, the new positions of the cows. The third line consists of two integers t<sub>m</sub> and t<sub>l</sub>, the time at which the two cows will be served their daily meal. It is guaranteed that &minus;10<sup>8</sup> &le; m, l, M, L &le; 10<sup>8</sup> and 1 &le; t<sub>m</sub>, t<sub>l</sub> &le; 10<sup>8</sup>. It is also guaranteed that both cows will actually move, i.e., m &ne; M and l &ne; L.</p>

### 출력

<p>Output should consist of a single word. Print &ldquo;possible&rdquo; if it is possible to move both cows before they are served their daily meal. Otherwise, print &ldquo;impossible&rdquo;.</p>