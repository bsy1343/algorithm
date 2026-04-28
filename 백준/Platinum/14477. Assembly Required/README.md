# [Platinum IV] Assembly Required - 14477

[문제 링크](https://www.acmicpc.net/problem/14477)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 39, 맞힌 사람: 30, 정답 비율: 57.692%

### 분류

자료 구조, 그래프 이론, 정렬, 최단 경로, 데이크스트라, 우선순위 큐

### 문제 설명

<p>Princess Lucy broke her old reading lamp, and needs a new one. The castle orders a shipment of parts from the Slick Lamp Parts Company, which produces interchangable lamp pieces.</p>

<p>There are m types of lamp pieces, and the shipment contained multiple pieces of each type. Making a lamp requires exactly one piece of each type. The princess likes each piece with some value, and she likes a lamp as much as the sum of how much she likes each of the pieces.</p>

<p>You are part of the castle staff, which has gotten fed up with the princess lately. The staff needs to propose k distinct lamp combinations to the princess (two lamp combinations are considered distinct if they differ in at least one piece). They decide to propose the k combinations she will like the least. How much will the princess like the k combinations that the staff proposes?</p>

### 입력

<p>The first line of input contains a single integer T (1 &le; T &le; 10), the number of test cases. The first line of each test case contains two integers m (1 &le; m &le; 100), the number of lamp piece types and k (1 &le; k &le; 100), the number of lamps combinations to propose. The next m lines each describe the lamp parts of a type; they begin with n<sub>i</sub> (2 &le; n<sub>i</sub> &le; 100), the number of pieces of this type, followed by n<sub>i</sub> integers v<sub>i,1</sub>, . . . , v<sub>i,n<sub>i</sub></sub> (1 &le; v<sub>i,j</sub> &le; 10,000) which represent how much the princess likes each piece. It is guaranteed that k is no greater than the product of all n<sub>i</sub>&rsquo;s.</p>

### 출력

<p>For each test case, output a single line containing k integers that represent how much the princess will like the proposed lamp combinations, in nondecreasing order.</p>

### 힌트

<p>In the first case, there are four lamp pieces, two of each type. The worst possible lamp has value 1 + 1 = 2, while the second worst possible lamp has value 2 + 1 = 3.</p>