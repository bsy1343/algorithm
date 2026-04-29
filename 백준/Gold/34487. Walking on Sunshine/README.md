# [Gold IV] Walking on Sunshine - 34487

[문제 링크](https://www.acmicpc.net/problem/34487)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 16, 맞힌 사람: 16, 정답 비율: 80.000%

### 분류

기하학, 누적 합, 스위핑, 애드 혹, 정렬, 차분 배열 트릭

### 문제 설명

<p>I’m walking on sunshine, and it don’t feel good – my eyes hurt!</p>

<p>Baku has plenty of sunshine. If you walk away from the sun, or at least perpendicular to its rays, it does not shine in your eyes. For this problem assume that the sun shines from the south. Walking west or east or in any direction between west and east with a northward component avoids looking into the sun. Your eyes will hurt if you walk in any direction with a southward component.</p>

<p>Baku also has many rectangular areas of shade, and staying in these protects your eyes regardless of which direction you walk in. For example, Figure L.1 shows two shaded areas.</p>

<p>Find the minimum distance you need to walk with the sun shining in your eyes to get from the contest location to the awards ceremony location.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34487.%E2%80%85Walking%E2%80%85on%E2%80%85Sunshine/54d6d471.png" data-original-src="https://boja.mercury.kr/assets/problem/34487-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 259px;"></p>

<p style="text-align: center;">Figure L.1: Sample Input 1 and a path that minimizes the sun shining in your eyes.</p>

### 입력

<p>The first line of input contains five integers $n$, $x_c$, $y_c$, $x_a$, and $y_a$, where $n$ ($0 ≤ n ≤ 10^5$) is the number of shaded areas, $(x_c, y_c)$ is the location of the contest, and $(x_a, y_a)$ is the location of the awards ceremony ($−10^6 ≤ x_c, y_c, x_a, y_a ≤ 10^6$). The sun shines in the direction $(0, 1)$ from south towards north. You look into the sun if you walk in direction $(x, y)$ for any $y &lt; 0$ and any $x$.</p>

<p>The next $n$ lines describe the shaded areas, which are axis-aligned rectangles. Each of these lines contains four integers $x_1$, $y_1$, $x_2$, and $y_2$ ($−10^6 ≤ x_1 &lt; x_2 ≤ 10^6$; $−10^6 ≤ y_1 &lt; y_2 ≤ 10^6$). The southwest corner of the rectangle is $(x_1, y_1)$ and its northeast corner is $(x_2, y_2)$. The rectangles describing the shaded areas do not touch or intersect.</p>

### 출력

<p>Output the minimum distance you have to walk with the sun shining in your eyes. Your answer must have an absolute or relative error of at most $10^{−7}$.</p>