# [Platinum I] Solar Flight - 14034

[문제 링크](https://www.acmicpc.net/problem/14034)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 3, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

자료 구조, 오프라인 쿼리, 세그먼트 트리

### 문제 설명

<p>A new era of aviation is upon us - the first solar-powered jumbo jets are about to be made available for public travel! However, this cutting-edge technology raises some safety concerns, as the rays of sunlight which power these planes can be blocked by other objects in the sky. As such, some statistics must first be calculated concerning the planned initial flights.</p>

<p>We consider a set of N flight paths, all travelling East from one city to another. A plane can be considered as a single point. The sky through which they pass can be modelled as a Cartesian plane, with x-coordinates representing distance East from an arbitrary fixed point, and y-coordinates representing altitude. We are interested only in the section of the sky with x-coordinates in the inclusive range [0, X] (1 &le; X &le; 10<sup>9</sup>), in which all flight paths are straight lines. The ith plane flies from (0, A<sub>i</sub>) to (X, B<sub>i</sub>) (1 &le; A<sub>i</sub>, B<sub>i</sub> &le; 10<sup>9</sup>). All A values are distinct, as are all B values. The planes travel at unknown, possibly non-constant speeds along their flight paths, so at any point in time, a plane may be anywhere along its path. However, it is known that the planes will never crash with one another, so if two flight paths cross one another, both planes won&rsquo;t reach the intersection point at precisely the same time.</p>

<p>Planes also have an inteference factor: each plane i has an interference factor C<sub>i</sub> (1 &le; C<sub>i</sub> &le; 10<sup>9</sup>), which is a measure of how much plane i would negatively impact the solar absorbing capability of any plane below them.</p>

<p>The solar panels on each plane are rather strange, in that they can only collect energy from directly above the plane. This means the sunlight that a given plane can absorb can be obstructed by other planes which occupy the same x-coordinate as it, and have a larger y-coordinate than it. In particular, their effectiveness is reduced based on the sum of the interference factor of all such planes.</p>

<p>Given this information, as well as a fixed distance constant K (1 &le; K &le; X), you must answer Q queries regarding the possible impact on planes&rsquo; solar panels at various times. The ith query asks for the largest possible amount by which the plane P<sub>i</sub>&rsquo;s solar panels could be obstructed at a single moment in time, at any point while the plane&rsquo;s x-coordinate is in the inclusive range [S<sub>i</sub>, S<sub>i</sub> + K] (0 &le; S<sub>i</sub> &le; X &minus; K).</p>

### 입력

<p>The first line contains four space-separated integers: X (1 &le; X &le; 10<sup>9</sup>), the maximum x-coordinate to consider; K (1 &le; K &le; X), the fixed distance constant; N (1 &le; N &le; 2000), the number of flight paths; Q (1 &le; Q &le; 800 000), the number of queries.</p>

<p>Each of the next N lines contain three integers, A<sub>i</sub>, B<sub>i</sub>, and C<sub>i</sub>, for i = 1..N (1 &le; A<sub>i</sub>, B<sub>i</sub>, C<sub>i</sub> &le; 10<sup>9</sup>), representing, for plane i, the starting y-coordinate, the ending y-coordinate, and the interference factor (respectively).</p>

<p>Each of the next Q lines contain two integers, P<sub>i</sub> and S<sub>i</sub>, for i = 1..Q representing the query concerning&nbsp;plane P<sub>i</sub> while its x-coordinate is in the range [S<sub>i</sub>, S<sub>i</sub> + K].</p>

### 출력

<p>The output consists of Q lines, each with the integer answer to the ith query, for i = 1..Q.</p>