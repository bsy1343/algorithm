# [Platinum I] Geometrical Combinatorics - 20705

[문제 링크](https://www.acmicpc.net/problem/20705)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 17, 맞힌 사람: 15, 정답 비율: 51.724%

### 분류

조합론, 기하학, 구현, 수학

### 문제 설명

<p>Grace is developing a brand new theory of geometrical combinatorics --- a study about geometrical properties of combinatoric objects.&nbsp;</p>

<p>Consider two triangles on plane --- a Pascal&#39;s triangle and an ordinary triangle. Pascal&#39;s triangle is drawn with it&#39;s root at point (0, 0), and two sides along diagonals of upper-halfplane quarters. Formally, there are 1&#39;s written in points $(i, i)$ and $(-i, i)$, and between them at point $(-i + 2 k, i)$ there is a number equal to the sum of numbers at $(-i + 2k + 1, i - 1)$ and at $(-i + 2k - 1, i - 1)$ for all $k$ from $1$ to $i - 1$. An ordinary triangle is drawn as just a triangle with vertices at $(x_A, y_A)$, $(x_B, y_B)$, $(x_C, y_C)$.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20705.%E2%80%85Geometrical%E2%80%85Combinatorics/e9ca750c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20705.%E2%80%85Geometrical%E2%80%85Combinatorics/e9ca750c.png" data-original-src="https://upload.acmicpc.net/fe9b0673-265d-4413-bf06-88f0f78d2686/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 479px; height: 287px;" /></p>

<p>Grace defines an <em>intersection value</em> of Pascal&#39;s triangle and an ordinary triangle as the sum of values of Pascal&#39;s triangle inside or on the border of the ordinary triangle. Can you develop a program that calculates this intersection value?</p>

### 입력

<p>On the first line there is an integer $t$ ($1 \le t \le 5$) --- the number of tests to process. Each of the next $t$ lines contains 6 integers $x_A$, $y_A$, $x_B$, $y_B$, $x_C$, $y_C$ ($-10^6 \le x_A, y_A, x_B, y_B, x_C, y_C \le 10^6$). Three points in each test do not lie on a line.&nbsp;</p>

### 출력

<p>For each test output an integer --- the intersection value modulo $10^9+7$.&nbsp;</p>