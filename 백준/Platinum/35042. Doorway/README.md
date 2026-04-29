# [Platinum IV] Doorway - 35042

[문제 링크](https://www.acmicpc.net/problem/35042)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 18, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

세그먼트 트리, 우선순위 큐, 자료 구조, 정렬

### 문제 설명

<p>The construction of the doorway for the Nonsense Engineering and Research Convention was delegated to one of the future attendees, who decided on a multi-layered sliding door design.</p>

<p>Each layer can be described as a horizontal interval, bounded by solid walls on the left and right, containing a number of sliding doors of fixed lengths. Within a layer, each door can move independently to the left or right, as long as it does not overlap other doors or the walls. All layers are parallel and stacked vertically.</p>

<p>After construction, the organizers noticed a problem: it is difficult to fully open the door, and since a large number of attendees are expected, they need to create the largest possible opening to allow everyone to pass through freely.</p>

<p>The size of the opening is defined as the total length of horizontal intervals such that, at every point of such an interval and in every layer, there is neither a door nor a wall. Your task is to determine the largest possible opening, given the doors' layout.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 100\,000$) --- the number of layers of the door.</p>

<p>Each of the next $n$ lines starts with three integers $k_i$, $x_{i,1}$, $x_{i,2}$ ($0 \le k_i \le 300\,000$; $0 \le x_{i,1} &lt; x_{i,2} \le 10^9$) --- the number of sliding doors on that layer and the $x$-coordinates $x_{i,1}$ and $x_{i,2}$ of the walls on that layer. There is a wall at $x_{i,1}$ and a wall at $x_{i,2}$; all positions with $x &lt; x_{i,1}$ or $x &gt; x_{i,2}$ are blocked by walls.</p>

<p>They are followed by $k_i$ integers $l_{i,1}, \ldots, l_{i,k_i}$ ($1 \le l_{i,j}$; $\sum\limits_{j=1}^{k_i} l_{i,j} \le x_{i,2} - x_{i,1}$) --- the lengths of the sliding doors on that layer given in order from the leftmost door to the rightmost.</p>

<p>It is guaranteed that $\sum\limits_{i=1}^{n} k_i \le 300\,000$.</p>

### 출력

<p>Output a single integer --- the size of the largest possible opening that can be achieved by moving the sliding doors on each layer.</p>

### 힌트

<p>This illustration shows a solution for the first example. Walls are filled with black color, doors are filled with various shades of grey, the opening is white. When first doors on each layer are shifted to the left and the rest of the doors to the right, we get the largest opening of 4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35042.%E2%80%85Doorway/206a30df.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35042-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 545px; height: 88px;"></p>