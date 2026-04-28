# [Platinum I] Mowing the Field (Platinum) - 11980

[문제 링크](https://www.acmicpc.net/problem/11980)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 153, 정답: 70, 맞힌 사람: 13, 정답 비율: 34.211%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 집합과 맵, 스위핑, 트리를 사용한 집합과 맵, 값 / 좌표 압축, 차분 배열 트릭, 다차원 세그먼트 트리

### 문제 설명

<p>Farmer John is quite reliable in all aspects of managing his farm, except one: he is terrible at mowing the grass in a timely fashion. He only manages to move the mowing machine once per day, in fact. On day 1, he starts at position \((x_1, y_1)\) and on day \(d\) he mows along a straight segment to the position \((x_d, y_d)\), moving either horizontally or vertically on the 2D map of his farm; that is, either \(x_d = x_{d-1}\), or \(y_d = y_{d-1}\). FJ alternates between horizontal and vertical moves on successive days.</p>

<p>So slow is FJ&#39;s progress that some of the grass he mows might grow back before he is finished with all his mowing. Any section of grass that is cut in day \(d\) will reappear on day \(d + T\), so if FJ&#39;s mowing path crosses a path he cut at least \(T\) days earlier, he will end up cutting grass at the same point again. In an effort to try and reform his poor mowing strategy, FJ would like to count the number of times this happens.</p>

<p>Please count the number of times FJ&#39;s mowing path crosses over an earlier segment on which grass has already grown back. You should only count &quot;perpendicular&quot; crossings, defined as a point in common between a horizontal and a vertical segment that is an endpoint of neither.</p>

### 입력

<p>The first line of input contains \(N\) (\(2 \leq N \leq 100,000\)) and \(T\) (\(1 \leq T \leq N\), \(T\) even).</p>

<p>The next \(N\) lines describe the position of the mower on days \(1 \ldots N\). The \(i\)th of these lines contains integers \(x_i\) and \(y_i\) (nonnegative integers each at most 1,000,000,000).</p>

### 출력

<p>Please output a count of the number of crossing points described above, where FJ re-cuts a point of grass that had grown back after being cut earlier.</p>

### 힌트

<p>Here, FJ crosses on day 7 a segment of grass he cut on day 2, which counts. The other intersections do not count.</p>