# [Platinum II] Truck Delivery - 23006

[문제 링크](https://www.acmicpc.net/problem/23006)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 68, 정답: 24, 맞힌 사람: 20, 정답 비율: 33.898%

### 분류

자료 구조, 유클리드 호제법, 오일러 경로 테크닉, 느리게 갱신되는 세그먼트 트리, 수학, 정수론, 오프라인 쿼리, 세그먼트 트리, 트리

### 문제 설명

<p>Charles is a truck driver in the city of Googleland. Googleland is built in form of a tree with N nodes where each node represents a city and each edge represents a road between two cities. The cities are numbered 1 to N. The capital of Googleland is city 1. Each day Charles picks up a load of weight W in city C and wants to deliver it to city 1 using the <a href="https://en.wikipedia.org/wiki/Simple_path">simple path</a> (which is unique) between the cities. Each road i has a toll which charges amount A<sub>i</sub> if the weight of the load is greater than or equal to a load-limit L<sub>i</sub>.</p>

<p>Charles works for Q days, where for each day Charles will be given the starting city C and weight of the load W. For each day find the <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor">greatest common divisor</a> of all the toll charges that Charles pays for that day. If Charles did not have to pay in any of the tolls the answer is 0.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow.</p>

<p>The first line of each test case contains the two integers N and Q.</p>

<p>The next N&minus;1 lines describe the roads. i-th of these lines contains the four space separated integers X, Y, L<sub>i</sub> and A<sub>i</sub>, indicating a road between cities X and Y with load-limit L<sub>i</sub> and toll charge A<sub>i</sub>.</p>

<p>The next Q lines describe the queries. j-th of these lines contains the two space separated integers C<sub>j</sub> and W<sub>j</sub> representing the starting city and weight of the load on j-th day.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is a list of the answers for&nbsp;Q&nbsp;days in order, separated by spaces.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; L<sub>i</sub> &le; 2 &times; 10<sup>5</sup>, for all i.</li>
	<li>1 &le; A<sub>i</sub> &le; 10<sup>18</sup>, for all i.</li>
	<li>All L<sub>i</sub> are distinct.</li>
	<li>2 &le; C<sub>j</sub> &le; N, for all j.</li>
	<li>1 &le; W<sub>j</sub> &le; 2 &times; 10<sup>5</sup>, for all j.</li>
	<li>It is guaranteed that given roads form a tree.</li>
</ul>

### 힌트

<p>In Sample Case #1</p>

<p>On the first day, Charles should pay toll charges in the roads between cities (5,3), (3,2) and (2,1). The answer will be gcd(9,8,4) = 1.</p>

<p>On the second day, Charles should pay toll charges in the roads between cities (3,2) and (2,1). The answer will be gcd(8,4) = 4.</p>

<p>On the third day, Charles need not pay toll charges in any of the cities. Thus, the answer will be 0.</p>

<p>In Sample Case #2</p>

<p>On the first day, Charles should pay toll charges in the roads between cities (2,1). The answer will be 10.</p>

<p>On the second day, Charles should pay toll charges in the roads between cities (3,2) and (2,1). The answer will be gcd(5,10) = 5.</p>