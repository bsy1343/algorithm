# [Platinum I] Festival Signs - 34737

[문제 링크](https://www.acmicpc.net/problem/34737)

### 성능 요약

시간 제한: 6.5 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

값 / 좌표 압축, 세그먼트 트리, 자료 구조

### 문제 설명

<p>During a festival, advertisement signs are added to and removed from a stage at different moments. Each sign has a rectangular shape and is placed perpendicular to the ground, with one side resting firmly on the ground.</p>

<p>A webcam is livestreaming the festival, showing a 2D image of the stage. In this image, the bottom border corresponds to the ground. Each sign covers a rectangular area in the image. A sign is described by an interval $[A, B]$ and a height $H$, meaning it covers all points $(x, y)$ of the image where $A ≤ x ≤ B$ and $0 ≤ y &lt; H$.</p>

<p>Note that the sign covers the points on the bottom and side borders of the rectangle, but not the top border. Besides, rectangles representing different signs may overlap.</p>

<p>During the livestream, the manager will make several queries at different moments. Each query specifies an interval $[L, R]$, and asks for the minimum height $y ≥ 0$ among all uncovered points $(x, y)$ with $L ≤ x ≤ R$, with $x$ and $y$ being real numbers.</p>

<p>Your task is to write a program to process a sequence of $N$ events: sign additions, sign removals, and queries about the minimum uncovered height over a given interval.</p>

<p>As an example, consider the following sequence of $N = 7$ events given in chronological order (see picture below):</p>

<ul>
<li>Sign with $[A, B] = [2, 5]$ and $H = 3$ is added.</li>
<li>Sign with $[A, B] = [4, 7]$ and $H = 5$ is added.</li>
<li>Query $[1, 10]$ is made. The answer to this query is $0$. An uncovered point with minimum height within the interval is, for instance, the point with coordinates $(1.5, 0)$.</li>
<li>Query $[2, 7]$ is made, with answer $3$.</li>
<li>Query $[4, 5]$ is made, with answer $5$.</li>
<li>Second added sign is removed.</li>
<li>Query $[4, 5]$ is made, with answer $3$. Note that the removal of the second added sign changed the answer of query $[4, 5]$.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34737.%E2%80%85Festival%E2%80%85Signs/c6a180fd.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34737-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 304px; height: 285px;"></p>

### 입력

<p>The first line contains an integer $N$ ($1 ≤ N ≤ 2 \cdot 10^5$) indicating the number of events.</p>

<p>Each of the next $N$ lines describes an event, in chronological order. The content of the line depends on the event, as follows:</p>

<ul>
<li>Sign addition: the line contains the character “<code>+</code>” (plus sign) and three integers $A$, $B$ and $H$ ($1 ≤ A, B, H ≤ 10^9$ and $A &lt; B$), representing that a sign is added, covering a rectangle of the image as explained in the statement. Each added sign is assigned a sequential integer identifier, starting from $1$.</li>
<li>Sign removal: the line contains the character “<code>-</code>” (minus sign) and an integer $I ≥ 1$, indicating that the sign with identifier $I$ is removed. It is guaranteed that $I$ identifies an added and not previously removed sign.</li>
<li>Query: the line contains the character “<code>?</code>” (question mark) and two integers $L$ and $R$ ($1 ≤ L &lt; R ≤ 10^9$), asking for the minimum uncovered height within the interval $[L, R]$, as explained in the statement. It is guaranteed that the input contains at least one query.</li>
</ul>

### 출력

<p>Output a line for each query, with an integer indicating the minimum uncovered height within the corresponding interval.</p>