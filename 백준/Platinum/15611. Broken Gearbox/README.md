# [Platinum II] Broken Gearbox - 15611

[문제 링크](https://www.acmicpc.net/problem/15611)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 18, 맞힌 사람: 18, 정답 비율: 58.065%

### 분류

수학, 그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>The mechanical Turk was an 18th-century sham robot designed to give the illusion of artificial intelligence by playing chess. More importantly, the Turk inspired us to make our own fake robot that gives the illusion of real intelligence by solving programming contest problems.</p>

<p>We put some gears on axles inside an uncovered panel to make our machine look more realistic. Since the gears are just for visual effect, they have been placed so as to create an impressive meshing pattern; however, the placement is without any regard to gear ratios or turning direction, so it is possible that none of the gears can really move.</p>

<p>It is guaranteed that every axle was connected to every other axle by meshing, either directly or indirectly. Two axles a and b are said to have directly meshing gears if their distance from one another is equal to the sum of the radii of their gears (d<sub>ab</sub> = r<sub>ga</sub> + r<sub>gb</sub>).</p>

<p>Sadly, the gears fell off our machine. We think we collected all of them back up again, but now we are not sure which should go back on which axle. Please find a way of putting the gears on the axles to make them mesh the way they did originally.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer n (2 &le; n &le; 10<sup>5</sup>), the number of gears and axles.</li>
	<li>One line with n integers r<sub>1</sub> . . . r<sub>n</sub> (1 &le; r<sub>i</sub> &le; 10<sup>8</sup> for each i), the radius of each gear.</li>
	<li>One line with an integer m (n &minus; 1 &le; m &le; 10<sup>5</sup>), the number of pairs of axles to mesh.</li>
	<li>m lines with three integers a<sub>i</sub>, b<sub>i</sub>, d<sub>i</sub> (1 &le; a &lt; b &le; n; 1 &le; d &le; 10<sup>8</sup>), the indices of two axles that were previously meshed, and the distance between them, respectively.</li>
</ul>

### 출력

<p>If the machine can be fixed with the given gears, give any one valid matching by outputting n integers g<sub>1</sub>. . .g<sub>n</sub>, where g<sub>i</sub> is the 1-based index of the gear to put on the i-th axle. Otherwise, output &ldquo;impossible&rdquo;.</p>