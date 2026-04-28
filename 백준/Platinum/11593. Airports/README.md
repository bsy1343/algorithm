# [Platinum II] Airports - 11593

[문제 링크](https://www.acmicpc.net/problem/11593)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 173, 정답: 39, 맞힌 사람: 36, 정답 비율: 25.352%

### 분류

그래프 이론, 최단 경로, 이분 매칭, 플로이드–워셜

### 문제 설명

<p>An airline company offers flights out of n airports, conveniently labeled from 1 to n. The flight time t<sub>ij</sub> from airport i to airport j is known for every i and j. It may be the case that t<sub>ij</sub> &ne; t<sub>ji</sub>, due to things like wind or geography. Upon landing at a given airport, a plane must be inspected before it can be flown again. This inspection time p<sub>i</sub> is dependent only on the airport at which the inspection is taking place and not where the previous flight may have originated.</p>

<p>Given a set of m flights that the airline company must provide, determine the minimum number of planes that the company needs to purchase. The airline may add unscheduled flights to move the airplanes around if that would reduce the total number of planes needed.</p>

### 입력

<p>The first line of input contains two space-separated integers n and m (1 &le; n, m &le; 500). The next line contains n space-separated integers p<sub>1</sub>, . . . , p<sub>n</sub> (0 &le; p<sub>i</sub> &le; 10<sup>6</sup>).</p>

<p>Each of the next n lines contains n space-separated integers. The jth integer in line i + 2 is t<sub>ij</sub> (0 &le; t<sub>ij</sub> &le; 10<sup>6</sup>). It is guaranteed that t<sub>ii</sub> = 0 for all i. However, it may be the case that t<sub>ij</sub> &ne; t<sub>ji</sub> when i &ne; j.</p>

<p>Each of the next m lines contains three space-separated integers, s<sub>i</sub>, f<sub>i</sub>, and t<sub>i</sub> (1 &le; s<sub>i</sub>, f<sub>i</sub> &le; n, s<sub>i</sub> &ne; f<sub>i</sub>, 1 &le; t<sub>i</sub> &le; 10<sup>6</sup>), indicating that the airline company must provide a flight that flies out from airport s<sub>i</sub> at exactly time t<sub>i</sub> , heading directly to airport f<sub>i</sub>.</p>

### 출력

<p>Print, on a single line, a single integer indicating the minimum number of planes the airline company must purchase in order to provide the m requested flights.</p>