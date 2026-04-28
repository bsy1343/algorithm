# [Platinum IV] Fence - 21624

[문제 링크](https://www.acmicpc.net/problem/21624)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 128, 정답: 86, 맞힌 사람: 59, 정답 비율: 67.816%

### 분류

기하학, 볼록 껍질

### 문제 설명

<p>Donald owns a nice small house in Manhattan. Due to recent elections it is important to protect yourself from the potential public unrest, so Donald has decided to build a fence around his house.</p>

<p>Donald&#39;s house can be represented as a polygon on the plane, with all the coordinates being integers. Moreover, all of his house corners are exactly $90\deg$, and each wall is parallel to either east-west or north-south axis. Donald wants to build a fence so that the house is completely inside of it and that the fence is not too close to the house. More precisely, Donald wants to build a fence in such way that Manhattan distance between any point of the fence and any point of the house is at least $l$.</p>

<p>Recall that Manhattan distance between points $(x_1, y_1)$ and $(x_2, y_2)$ is $|x_1 - x_2| + |y_1 - y_2|$.</p>

<p>Donald wants to minimize building costs, so he asks you to find the smallest possible length of the fence.</p>

### 입력

<p>The first line contains integers $n$ and $l$ ($4 \le n \le 100\,000$, $0 \le l \le 10^8$).</p>

<p>Each of the next $n$ lines contains integers $x_i$, $y_i$ ($|x_i|, |y_i| \le 10^8$), describing the border of the house in clockwise or counterclockwise order.</p>

<p>It&#39;s guaranteed that the house is non-degenerate, doesn&#39;t contain any self-intersections (no two segments intersect except the neighboring segments having a common end), no two points coincide, all the house walls are either vertical or horizontal.</p>

### 출력

<p>Print a single real value, the smallest possible length of the fence. Your answer will be considered correct if it&#39;s absolute or relative error will be at most $10^{-6}$.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21624.%E2%80%85Fence/3a28c9e7.png" data-original-src="https://upload.acmicpc.net/3635a55d-b9f6-467f-bde5-a7b320abaf06/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 454px; height: 420px;" /></p>

<p style="text-align: center;">Example 1, the house is shown inside in orange, and the optimal fence is shown outside in blue.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21624.%E2%80%85Fence/1b2c118c.png" data-original-src="https://upload.acmicpc.net/66e4f627-5217-4459-b85e-8a34b76fa785/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 425px; height: 304px;" /></p>

<p style="text-align: center;">Example 2, the house is shown inside in orange, and the optimal fence is shown outside in blue.</p>