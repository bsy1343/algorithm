# [Gold I] Stampede - 10672

[문제 링크](https://www.acmicpc.net/problem/10672)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 423, 정답: 105, 맞힌 사람: 81, 정답 비율: 23.754%

### 분류

자료 구조, 정렬, 스위핑, 우선순위 큐

### 문제 설명

<p>Farmer John&#39;s N cows (1 &lt;= N &lt;= 50,000) appear to be stampeding along the road at the front of FJ&#39;s farm, but they are actually just running in a foot race to see which cow is the fastest.</p>

<p>Viewed from above, each cow is represented by a unit-length horizontal line segment, specified by the coordinates of its left corner point at time t=0. &nbsp;For example, (-3,6) would specify a cow who at time t=0 is represented by the segment from (-3,6) to (-2,6). &nbsp;Each cow is moving to the right (in the +x direction) at a certain rate, specified by the integer amount of time it takes her to move 1 unit to the right.</p>

<p>FJ is not particularly thrilled that his cows are outside running instead of in the barn producing milk. &nbsp;He plans to admonish them with a stern lecture after the race ends. &nbsp;In order to determine which of his cows are participating in the race, FJ situates himself at (0,0) and looks along a ray extending in the +y direction. &nbsp;As the race unfolds, FJ sees a cow if she is ever the first cow visible along this ray. &nbsp;That is, a cow might not be visible if another cow is &quot;in front&quot; of her during the entire time she crosses FJ&#39;s line of sight.</p>

<p>Please compute the number of cows FJ can see during the entire race.</p>

### 입력

<p>The first line of the input contains N. &nbsp;Each of the following N lines describes a cow with three integers x y r, corresponding to a cow whose left endpoint is at (x,y) at time t=0, moving to the right at a continuous speed of 1 unit of distance every r units of time. &nbsp;The value of x is in the range -1000..-1, the value of y is in the range 1..1,000,000 (and distinct for every cow, to prevent any possible collisions), and the value of r is in the range 1..1,000,000.</p>

### 출력

<p>A single integer, specifying the number of cows FJ can see during the entire race (from t=0 onward).</p>

### 힌트

<p>FJ can see cows 1 and 2 but not cow 3.</p>

<p>&nbsp;</p>