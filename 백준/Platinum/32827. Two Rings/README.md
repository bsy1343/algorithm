# [Platinum II] Two Rings - 32827

[문제 링크](https://www.acmicpc.net/problem/32827)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 83, 정답: 24, 맞힌 사람: 15, 정답 비율: 23.438%

### 분류

매개 변수 탐색, 이분 탐색

### 문제 설명

<p>As a planar shape, a ring can be described as the area <em>between</em> two concentric circles. This concept can of course be generalized to any possible shapes. For example, one might define rectangular rings to be the area between two rectangles. A precise definition of rectangular rings is as follows: Here, any rectangles we discuss is assumed to be axis-aligned, so the four sides of a rectangle are horizontal or vertical, and are distinguished as the left, right, top, and bottom sides. Any vertical or horizontal segment is also considered a rectangle with empty interior. A <em>rectangular ring</em> is the closed area between two rectangles $R$ and $R'$, including the boundary, such that the following conditions are satisfied:</p>

<ol>
	<li>$R'$ is contained in $R$, including the boundary of $R$.</li>
	<li>The following four values are equal: the distance between the top side of $R$ and the top side of $R'$, the distance between the left side of $R$ and the left side of $R'$, the distance between the bottom side of $R$ and the bottom side of $R'$, and the distance between the right side of $R$ and the right side of $R'$.</li>
</ol>

<p>The distance described in the second condition is called the width of the rectangular ring defined by two rectangles $R$ and $R'$. The figure below illustrates three rectangular rings of <em>width</em> $w$ defined by two rectangles $R$ and $R'$. Note that the first and third ones show two extreme and degenerate cases: $R' = R$ (thus, $w = 0$ and the rectangular ring is the boundary of $R' = R$) and $R'$ is a line segment (thus, $R$ is the rectangular ring).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32827.%E2%80%85Two%E2%80%85Rings/6ad98b81.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32827-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 771px; height: 135px;"></p>

<p>Given a finite set $P$ of points in the plane, write a program that finds two <em>non-penetrating</em> rectangular rings $A_1$ and $A_2$ such that $P \subset A_1 \cup A_2$ and the larger of their widths is minimized. Two rectangular rings are called non-penetrating if one’s boundary neither intersects the other’s interior nor crosses the other’s boundary. Note that two non-penetrating rectangular rings still may touch in their boundaries in such a way that every point in the intersection between their boundaries lies in the intersection between two parallel sides of their defining rectangles or a corner.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32827.%E2%80%85Two%E2%80%85Rings/8b2151f5.png" data-original-src="https://boja.mercury.kr/assets/problem/32827-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 435px; height: 175px;"></p>

<p>The above figure shows (a) an example set $P$ of $22$ points and (b) an optimal pair of two non-penetrating rectangular rings containing $P$ that minimizes the larger value of their widths.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing an integer, $n$ ($1 ≤ n ≤300\,000$), where $n$ is the number of input points in $P$. In each of the following $n$ lines, there are two integers between $-10^9$ and $10^9$, separated by a space, that describe the coordinates of a point in $P$. You may assume that no two input points are identical.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain an integer that describes the minimum possible value for the larger width of two non-penetrating rectangular rings that include all points of $P$.</p>