# [Gold IV] A Bug That's Not a Pill Bug - 32049

[문제 링크](https://www.acmicpc.net/problem/32049)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 111, 정답: 58, 맞힌 사람: 45, 정답 비율: 61.644%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A bug that looks like a pill bug is walking on a plane. A Cartesian coordinate system is defined on the plane, in which its <i>x-</i>axis is directed from west to east, while its <i>y-</i>axis is directed from south to north.</p>

<p>The bug is initially at a lattice point (a point where both the <i>x-</i> and <i>y-</i>coordinates are integers), facing the positive direction of <i>x.</i> Obstacles are placed at some of the lattice points on the plane. The bug continues to move according to the following rules, avoiding obstacles.</p>

<ul>
	<li>The bug attempts to move from its current position to the adjacent lattice point in the direction it is currently facing.</li>
	<li>If that adjacent lattice point has no obstacles, the bug moves there without changing its direction.</li>
	<li>If that adjacent lattice point has an obstacle, the bug turns 90 degrees to the left, without changing its position.</li>
</ul>

<p>The initial position of the bug, the locations of the obstacles, and a moving distance are given. You are requested to find the position of the bug after it has moved exactly the given distance.</p>

<p>Some of the datasets in Sample Input are illustrated below. The points marked with an &quot;X&quot; indicate the presence of obstacles. The left figure corresponds to the first two datasets of Sample Input. In these datasets, the initial position of the bug is (0, 1), and it moves to (1, 1) and then to (2, 1). Next, it attempts to move to (3, 1), but since there is an obstacle there, it turns to the positive direction of <i>y</i> and moves to (2, 2). The points the bug traverses are shown with orange circles. The right figure shows the next two datasets.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32049.%E2%80%85A%E2%80%85Bug%E2%80%85That's%E2%80%85Not%E2%80%85a%E2%80%85Pill%E2%80%85Bug/2a8c67cf.png" data-original-src="https://upload.acmicpc.net/9e7c003c-c779-4130-b9cd-7e54833f7c87/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 400px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32049.%E2%80%85A%E2%80%85Bug%E2%80%85That's%E2%80%85Not%E2%80%85a%E2%80%85Pill%E2%80%85Bug/b97548d7.png" data-original-src="https://upload.acmicpc.net/45a24e9c-e820-4fbc-b456-4b96f46b2dc5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 400px;" /></p>

<p style="text-align: center;">Figure D-1: The first two datasets of Sample Input (left) and the next two datasets (right)</p>

### 입력

<p>The input consists of multiple datasets, each in the following format. The number of datasets does not exceed 200.</p>

<blockquote>
<p><i>n</i></p>

<p><i>a</i> <i>b</i> <i>d</i></p>

<p><i>x</i><sub>1</sub> <i>y</i><sub>1</sub></p>

<p>⋮</p>

<p><i>x<sub>n</sub></i> <i>y<sub>n</sub></i></p>
</blockquote>

<p>Here, <i>n</i> represents the number of obstacles, which is an integer (1 &le; <i>n</i> &le; 1000). Both <i>a</i> and <i>b</i> are integers between 0 and 100, inclusive, and the initial position of the bug is at coordinates (<i>a,</i> <i>b</i>). Additionally, <i>d</i> represents the distance to move, which is an integer (1 &le; <i>d</i> &le; 10<sup>18</sup>).</p>

<p>The <i>i</i>-th obstacle is located at coordinates (<i>x<sub>i</sub>,</i> <i>y<sub>i</sub></i>) (<i>i</i> = 1, ⋯, <i>n</i>). <i>x<sub>i</sub></i> and <i>y<sub>i</sub></i> are integers between 0 and 100, inclusive. No two obstacles are at the same location, that is, if <i>i</i> &ne; <i>j</i>, then (<i>x<sub>i</sub>,</i> <i>y<sub>i</sub></i>) &ne; (<i>x<sub>j</sub>,</i> <i>y<sub>j</sub></i>). Additionally, no obstacle is located at the initial position (<i>a,</i> <i>b</i>) of the bug. It is guaranteed that the bug can move distance <i>d</i> or more under the given configuration.</p>

<p>The end of the input is indicated by a line consisting of a zero.</p>

### 출력

<p>For each dataset, output two integers separated by a space on a single line representing the <i>x-</i> and <i>y-</i>coordinates of the position of the bug after it has moved distance <i>d.</i></p>

<p>Note that the <i>x-</i> and <i>y-</i>coordinates of the position of the bug can be negative.</p>