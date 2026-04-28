# [Platinum IV] LHC - 6759

[문제 링크](https://www.acmicpc.net/problem/6759)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 21, 맞힌 사람: 19, 정답 비율: 43.182%

### 분류

수학, 그래프 이론, 그래프 탐색, 트리, 조합론, 깊이 우선 탐색, 트리의 지름

### 문제 설명

<p>For your latest top-secret experiment, you will need a large quantity of Higgs bosons. To obtain these elusive particles, you will need to build a large hadron collider, a long circular tunnel that you can use to accelerate particles and smash them into each other.</p>

<p>You already have access to an extensive network of tunnels, which is guaranteed to be connected and free of cyclic paths. In other words, the existing tunnels form a tree structure. This system can be represented by N junctions, labelled 1 through N, connected by N &minus; 1 tunnels, each of which connects two junctions. Tunnels can be traversed in either direction (i.e., if there is a junction from a to b, that junction also goes from b to a).</p>

<p>By adding exactly one tunnel to the network, you can create a cyclic path, which you will use to build your large hadron collider. You wish to form the longest possible collider in this way, where we define length as the number of tunnels in a cycle. Also, you would like to compute the number of ways to do this&ndash; that is, the number of distinct pairs of junctions such that adding a tunnel between them forms a cycle of maximum length.</p>

<p>For example, in the following network, we can form a collider of length 4 by building a tunnel between junctions 1 and 5, or between 2 and 5:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6759.%E2%80%85LHC/64d1fc2e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6759.%E2%80%85LHC/64d1fc2e.png" data-original-src="https://upload.acmicpc.net/e66006bb-1b72-4217-a27d-49d72d1a5643/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 179px; height: 161px;" /></p>

### 입력

<p>The first line of each test case will contain N (3 &le; N &le; 400 000), the number of junctions. The next N &minus; 1 lines will each contain two space-separated integers i and j, indicating that there is a tunnel between junctions i and j (1 &le; i, j &le; N).</p>

### 출력

<p>The output should consist of a single line with two space-separated integers: the length of the longest possible collider, and the number of ways to achieve that length. Note that you may need a 64-bit integer to store the answer.</p>