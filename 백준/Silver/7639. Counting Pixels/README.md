# [Silver I] Counting Pixels - 7639

[문제 링크](https://www.acmicpc.net/problem/7639)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 116, 정답: 47, 맞힌 사람: 34, 정답 비율: 47.887%

### 분류

수학, 기하학

### 문제 설명

<p>Did you know that if you draw a circle that fills the screen on your 1080p high definition display, almost a million pixels are lit? That&rsquo;s a lot of pixels! But do you know exactly how many pixels are lit? Let&rsquo;s find out!</p>

<p>Assume that our display is set on a Cartesian grid where every pixel is a perfect unit square. For example, one pixel occupies the area of a square with corners (0, 0) and (1, 1). A circle can be drawn by specifying its center in grid coordinates and its radius. On our display, a pixel is lit if any part of is covered by the circle being drawn; pixels whose edge or corner are just touched by the circle, however, are not lit.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7639.%E2%80%85Counting%E2%80%85Pixels/26799ff6.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/7639.%E2%80%85Counting%E2%80%85Pixels/26799ff6.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7639/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:338px; width:344px" /></p>

<p>Your job is to compute the exact number of pixels that are lit when a circle with a given position and radius is drawn.</p>

### 입력

<p>The input consists of several test cases, each on a separate line. Each test case consists of three integers, x, y, and r (1 &le; x, y, r &le; 10<sup>6</sup>), specifying respectively the center (x, y) and radius of the circle drawn. Input is followed by a single line with x = y = r = 0, which should not be processed.</p>

### 출력

<p>For each test case, output on a single line the number of pixels that are lit when the specified circle is drawn. Assume that the entire circle will fit within the area of the display.</p>