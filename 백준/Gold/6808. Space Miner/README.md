# [Gold III] Space Miner - 6808

[문제 링크](https://www.acmicpc.net/problem/6808)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 12, 맞힌 사람: 11, 정답 비율: 34.375%

### 분류

기하학, 3차원 기하학, 수학

### 문제 설명

<p>There are M (1 &le; M &le; 1, 000) planets each with v<sub>i</sub> (1 &le; v<sub>i</sub> &le; 10, 000) units of resources and radius r<sub>i</sub> (1 &le; r<sub>i</sub> &le; 100).</p>

<p>Starting from (0, 0, 0), you travel in straight lines through N (1 &le; N &le; 1, 000) waypoints in a specific order.</p>

<p>Whenever you travel within D + r<sub>i</sub> (1 &le; D &le; 50) units from a planet&rsquo;s center, you can mine the planet using your tractor beam retrieving v<sub>i</sub> units of resources. Note that if you are exactly D units from the surface of the planet, you can mine the planet. If your path takes you through a planet, do not worry, since your spaceship can drill through planets, which makes mining even easier. Also note that you cannot mine the same planet on a subsequent visit.</p>

<p>Give the number of minerals that can be mined on your journey.</p>

<p>Hint: you should do all calculations with 64-bit integers.</p>

### 입력

<p>On the first line of input is the number M, the number of planets. On the next M lines are five integers describing each of the M planets. These integers are x<sub>i</sub>&nbsp;y<sub>i</sub>&nbsp;z<sub>i</sub>&nbsp;v<sub>i</sub>&nbsp;r<sub>i</sub>, where the planet i is at position (x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub>), (where &minus;1, 000 &le; x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub> &le; 1, 000) and this planet has v<sub>i</sub> resources and radius r<sub>i</sub>. On the next line is the number N, the number of waypoints to pass through. Each of the next N lines contains the position of these waypoints, as three integers x<sub>i</sub>&nbsp;y<sub>i</sub>&nbsp;z<sub>i</sub> (&minus;1, 000 &le; x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub> &le; 1, 000). The last line of input is the number D, the maximum distance from a planet&rsquo;s surface that your ship can be and still mine a planet.</p>

### 출력

<p>On one line, output the amount of minerals that you can mine on your journey.</p>