# [Platinum I] Old Solution Methods - 33456

[문제 링크](https://www.acmicpc.net/problem/33456)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

기하학, 수학

### 문제 설명

<p>There are $6$ distinct points $A$, $B$, $C$, $D$, $E$, $F$ on the plane. Points $A$, $B$, and $C$ are not collinear.</p>

<p>Svetozar drew a line $a$ through points $A$ and $D$, a line $b$ through points $B$ and $E$, and a line $c$ through points $C$ and $F$. It turned out that none of these lines are parallel. Now he wants to rotate line $a$ around point $A$, line $b$ around point $B$, and line $c$ around point $C$ counterclockwise by the same angle, then find the intersection points of the resulting lines, and then draw a triangle with vertices at the obtained three points (if they are not collinear).</p>

<p>Svetozar wants to obtain a triangle with the largest possible area. If it is not possible to form a triangle, Svetozar considers the area to be zero. Find this area.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 10^5$), denoting the number of test cases.</p>

<p>Then $T$ descriptions of test cases follow. Each description consists of $6$ lines, describing points $A$, $B$, $C$, $D$, $E$, $F$ respectively. Each point description consists of two integers $x$ and $y$ ($-20 \leq x, y \leq 20$): the coordinates of the point.</p>

<p>It is guaranteed that in each test case all points are distinct, points $A$, $B$, and $C$ are not collinear, and the lines $AD$, $BE$, and $CF$ are pairwise not parallel.</p>

### 출력

<p>For each test case, output a single real number with an absolute or relative error not exceeding $10^{-6}$: the largest possible area of the triangle. It is guaranteed that in none of the tests this area exceeds $10^7$.</p>

### 힌트

<p>In the example, the maximum possible area is achieved by rotating the lines by an angle approximately equal to $104.036^\circ$. The triangle with the largest area has sides equal to $\sqrt{17}$, $\sqrt{17}$, $\sqrt{34}$, and vertices at points $(a, b)$, $(a - 1, b + 4)$, and $(a + 4, b + 1)$, where $a \approx 3.8235$, $b \approx 1.7059$.</p>

<p>In the illustration below, the original lines are marked with dashed lines, and the lines after rotation are marked with solid lines:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33456.%E2%80%85Old%E2%80%85Solution%E2%80%85Methods/5f637180.png" data-original-src="https://boja.mercury.kr/assets/problem/33456-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 506px;"></p>