# [Platinum V] Interstellar Trade - 9509

[문제 링크](https://www.acmicpc.net/problem/9509)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 24, 맞힌 사람: 22, 정답 비율: 73.333%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>As a rare reward for passing one of his inscrutable tests, Q has offered Commander Sisko the opportunity to relocate both endpoints of the Bajoran wormhole (and Deep Space Nine along with it, of course). The Commander has asked for proposals for the relocation, and various merchants wish to relocate the endpoints into known space to decrease the transit time between planets known for their commerce. Your job is to figure out how to place the endpoints of the wormhole so as to minimize the maximum distance between any pair of these planets.</p>

<p>Conveniently, all of the planets of interest lie on a straight line, and in the absence of the wormhole, the distance between any pair of them is simply the straight-line distance. Once the wormhole has been added, a traveler has the additional option of going from one planet straight to one end of the wormhole, and then straight from the other end of the wormhole to the other planet. The distance traveled in this case is then the sum of those two distances (travel between the two ends of the wormhole is instantaneous). Note that a traveler always has the option of not using the wormhole, even if an endpoint of the wormhole lies directly between the two planets of interest. Finally, you may place a wormhole endpoint arbitrarily close to any planet, such that the distance from the planet to the wormhole is effectively zero.</p>

### 입력

<p>Input begins with a line with one integer T (1 &le; T &le; 50) denoting the number of test cases. Each test case begins with a line with a single integer N (2 &le; N &le; 4000) denoting the number of planets. This is followed by N lines with a single integer x<sub>i</sub> each (&minus;10<sup>9</sup> &le; x<sub>i</sub> &le; 10<sup>9</sup>) denoting the location of planet i (all planets are points on the x-axis). No two planets will be at the same location.</p>

### 출력

<p>For each test case, print on a single line the maximum distance between any pair of planets after the wormhole has been placed in such a manner as to minimize this value. If this distance is fractional, round it up to the next integer. Note that although all planet locations are given as integers, the wormhole location may not have integer coordinates.</p>