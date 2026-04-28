# [Gold IV] Straight Shot - 15108

[문제 링크](https://www.acmicpc.net/problem/15108)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 48, 맞힌 사람: 46, 정답 비율: 79.310%

### 분류

이분 탐색, 기하학, 수학, 매개 변수 탐색

### 문제 설명

<p>You have a toy robot that walks straight at a constant speed v, and you wish for it to travel on the two-dimensional plane from (0, 0) to (X, 0). If the plane were empty, you could start the robot facing straight east from the origin, and it would walk there in X/v time. Unfortunately, between the start and the destination are n moving sidewalks, each moving directly north or south, which affect the robot&rsquo;s position while it is walking.</p>

<p>The direction that robot is facing is not changed by the sidewalks; the robot will face in the same orientation for the entire duration of its walk. These sidewalks are aligned with the y-axis and are infinitely long. You still must get the robot to go from start to finish, but you&rsquo;ll need to adjust the orientation of the robot at the start. Given that you choose this direction correctly, so that the robot arrives exactly at the destination, how long will it take the robot to get there?</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15108.%E2%80%85Straight%E2%80%85Shot/a2f22993.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15108/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:260px; width:407px" /></p>

<p>One final caveat: You don&rsquo;t want the toy robot to walk for too long. If the robot cannot reach the destination in at most twice the time it would take in the absence of all moving sidewalks (i.e., 2X/v), indicate this.</p>

### 입력

<p>The first line consists of three space-separated numbers n, X, and v (0 &le; n &le; 100; 1 &le; X &le; 1,000,000; 1.0 &le; v &le; 100.0). Note that v is not necessarily an integer.</p>

<p>Each of the next n lines contains three space-separated numbers l<sub>i</sub>, r<sub>i</sub>, and v<sub>i</sub> (0 &le; l<sub>1</sub> &lt; r<sub>1</sub> &le; l<sub>2</sub> &lt; r<sub>2</sub> &le; &middot; &middot; &middot; &le; l<sub>n</sub> &lt; r<sub>n</sub> &le; X; &minus;100.0 &le; v<sub>i</sub> &le; 100.0), describing the ith moving sidewalk. The integer l<sub>i</sub> denotes the left edge of the sidewalk, the integer r<sub>i</sub> denotes the right edge of the sidewalk, and the decimal number v<sub>i</sub> denotes the speed of the sidewalk. A positive speed means the sidewalk moves north, while a negative speed means the sidewalk moves south.</p>

### 출력

<p>If the robot cannot reach the destination in at most twice the time it would take in the absence of all moving sidewalks, output &ldquo;Too hard&rdquo; on a single line (without quotation marks).</p>

<p>Otherwise, output, on a single line, the travel time of the robot from the start to the destination, rounded and displayed to exactly three decimal places.</p>