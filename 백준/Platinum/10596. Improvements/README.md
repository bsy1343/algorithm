# [Platinum I] Improvements - 10596

[문제 링크](https://www.acmicpc.net/problem/10596)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 63, 정답: 32, 맞힌 사람: 28, 정답 비율: 52.830%

### 분류

다이나믹 프로그래밍, 애드 혹, 이분 탐색, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Son Halo owns n spaceships numbered from 1 to \(n\) and a space station. They are initially placed on one line with the space station so the spaceship \(i\) is positioned \(x_i\) meters from the station and all ships are on the same side from the station (\(x_i\) &gt; 0). All \(x_i\) are distinct. Station is considered to have number 0 and \(x_0\) is considered to be equal to 0.</p>

<p>Every two spaceships with consequent numbers are connected by a rope, and the first one is connected to the station. The rope number \(i\) (for 1 &le; \(i\) &le; \(n\)) connects ships \(i\) and \(i-1\). Note, that the rope number 1 connects the first ship to the station.</p>

<p>Son Halo considers that the rope \(i\) and the rope \(j\) intersect when the segments [\(x_{i}^{min}\), \(x_{i}^{max}\)] and [\(x_{j}^{max}\), \(x_{j}^{max}\)] have common internal point but neither one of them is completely contained in the other, where \(x_{k}^{min}\) = min(\(x_{k&minus;1}\), \(x_k\)), \(x_{k}^{max}\) = max(\(x_{k&minus;1}\), \(x_k\)). That is:</p>

<p>\[\begin{cases} x_{i}^{min} &lt; x_{j}^{min} ~ \&amp; ~ x_{j}^{min} &lt; x_{i}^{max} ~ \&amp; ~ x_{i}^{max} &lt; x_{j}^{max} \\ x_{j}^{min} &lt; x_{i}^{min} ~ \&amp; ~ x_{i}^{min} &lt; x_{j}^{max} ~ \&amp; ~ x_{j}^{max} &lt; x_{i}^{max} &nbsp;\end{cases}\]</p>

<p>Son Halo wants to rearrange spaceships in such a way, that there are no rope intersections. Because he is lazy, he wants to rearrange the ships in such a way, that the total number of ships that remain at their original position \(x_i\) is maximal. All the ships must stay on the same side of the station and at different positions \(x_i\) after rearrangement. However, ships can occupy any real positions \(x_i\) after rearrangement.</p>

<p>Your task is to figure out what is the maximal number of ships that can remain at their initial positions.</p>

### 입력

<p>The first line of the input file contains \(n\) (1 &le; \(n\) &le; 200 000) &mdash; the number of ships. The following line contains \(n\) distinct integers \(x_i\) (1 &le; \(x_i\) &le; \(n\)) &mdash; the initial positions of the spaceships.</p>

### 출력

<p>The output file must contain one integer &mdash; the maximal number of ships that can remain at their initial positions in the solution of this problem.</p>

### 힌트

<p>In the first sample Son Halo can move the second spaceship in the position between the first and the third to solve the problem while keeping 3 other ships at their initial positions.</p>

<p>In the second sample there are no rope intersections, so all 4 ships can be left at their initial positions.</p>