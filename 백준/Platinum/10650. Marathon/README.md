# [Platinum III] Marathon - 10650

[문제 링크](https://www.acmicpc.net/problem/10650)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 399, 정답: 186, 맞힌 사람: 140, 정답 비율: 46.980%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>An avid marathon runner herself, Bessie enjoys creating marathon courses for her fellow cows to run. &nbsp;She has most recently designed a route specified by N checkpoints (1 &lt;= N &lt;= 100,000) that must be visited in sequence.</p>

<p>Unfortunately, Bessie realizes that the other cows may not have the stamina to run the full route. She therefore wants to know how long certain sub-routes take to run, where a sub-route is a contiguous subsequence of the checkpoints from the full route. &nbsp;To make matters more complicated, Bessie knows that the other cows, being lazy, might choose to skip one checkpoint any time they run a sub-route -- whichever one results in a minimum total travel time. &nbsp;They are not allowed to skip the first or last checkpoints in a sub-route, however.</p>

<p>In order to build the best possible marathon course, Bessie wants to investigate the ramifications of making changes to the checkpoint locations in her current course. &nbsp;Please help her determine how certain changes to checkpoint locations will affect the time required to run different sub-routes (taking into account that the cows might choose to omit one checkpoint any time they run a sub-route).</p>

<p>Since the course is set in a downtown area with a grid of streets, the distance between two checkpoints at locations (x1, y1) and (x2, y2) is given by |x1-x2| + |y1-y2|.&nbsp;</p>

### 입력

<p>The first line gives N and Q (1 &lt;= Q &lt;= 100,000).</p>

<p>The next N lines contain (x, y) locations of N checkpoints in the sequence they must be visited along the route. &nbsp;All coordinates are in the range -1000 .. 1000.</p>

<p>The next Q lines consist of updates and queries, one per line, to be processed in the order they are given. Lines will either take the form &quot;U I X Y&quot; or &quot;Q I J&quot;. &nbsp;A line of the form &quot;U I X Y&quot; indicates that the location of checkpoint I (1 &lt;= I &lt;= N) is to be changed to location (X, Y). &nbsp;A line of the form &quot;Q I J&quot; asks for the minimum travel time of the sub-route from checkpoint I to checkpoint J (I &lt;= J), given that the cows choose to skip one checkpoint along this sub-route (but not the endpoints I and J).</p>

### 출력

<p>For each sub-route length request, output on a single line the desired length.</p>