# [Gold II] Tima goes to Xentopia - 16517

[문제 링크](https://www.acmicpc.net/problem/16517)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 13, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>The city of Xentopia has a well-connected railway network. The city has N junctions numbered from 1 to N. There are M pairs of railway tracks that exist between the junctions. Trains can travel in both directions on each track. Each railway track is labelled either red, blue, or white in colour.</p>

<p>Tima, a tourist in the city, wants to travel from junction S to junction T in the minimum possible time. She has a map of the railway network that she can use to achieve this goal.</p>

<p>Tima, being rather eccentric, has an interesting constraint for her travel: She wants to travel via exactly k1 red tracks, exactly k2 blue tracks, and any number of white tracks, in any order. She is fine with using a railway track more than once.</p>

<p>Can you tell the minimum time Tima will take to go from S to T, ensuring that her constraint is not violated?</p>

### 입력

<p>The first line contains four space-separated integers: N, (1 &le; N &le; 450); M, (1 &le; M &le; 1 100); k<sub>1</sub>; and k<sub>2</sub>, (0 &le; k<sub>1</sub>, k<sub>2</sub> &le; 800, k<sub>1</sub> &middot; k<sub>2</sub> &le; 800). Following are M lines. Each line contains four space-separated integers: U V X C, denoting that a track exists between junction U and junction V , (1 &le; U, V &le; N, U &ne; V ); the train covers this track in X seconds, (0 &le; X &le; 10<sup>9</sup>); and the track is labelled colour C, (0 &le; C &le; 2). A white track is denoted by C = 0, a red track is denoted by C = 1, and a blue track is denoted by C = 2.</p>

<p>The last line contains two space-separated integers S, (1 &le; S &le; N), and T, (1 &le; T &le; N), the source and destination of Tima&rsquo;s journey, respectively. Note: S may be equal to T.</p>

### 출력

<p>Print a single integer denoting the total time Tima would take. If it is not possible for Tima to reach her destination using exactly k<sub>1</sub> red tracks, k<sub>2</sub> blue tracks, and any number of white tracks, output -1.</p>