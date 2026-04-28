# [Gold I] Where's Bessie? - 14529

[문제 링크](https://www.acmicpc.net/problem/14529)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 272, 정답: 137, 맞힌 사람: 99, 정답 비율: 46.047%

### 분류

너비 우선 탐색, 브루트포스 알고리즘, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Always known for being quite tech-savy, Farmer John is testing out his new automated drone-mounted cow locator camera, which supposedly can take a picture of his field and automatically figure out the location of cows. Unfortunately, the camera does not include a very good algorithm for finding cows, so FJ needs your help developing a better one.</p>

<p>The overhead image of his farm taken by the camera is described by an \(N \times N\) grid of characters, each in the range \(A \ldots Z\), representing one of 26 possible colors. Farmer John figures the best way to define a potential cow location (PCL) is as follows: A PCL is a rectangular sub-grid (possibly the entire image) with sides parallel to the image sides, not contained within any other PCL (so no smaller subset of a PCL is also a PCL). Furthermore, a PCL must satisfy the following property: focusing on just the contents of the rectangle and ignoring the rest of the image, exactly two colors must be present, one forming a contiguous region and one forming two or more contiguous regions.</p>

<p>For example, a rectangle with contents</p>

<p>&nbsp;</p>

<pre>
AAAAA
ABABA
AAABB
</pre>

<p>would constitute a PCL, since the A&#39;s form a single contiguous region and the B&#39;s form more than one contiguous region. The interpretation is a cow of color A with spots of color B.</p>

<p>A region is &quot;contiguous&quot; if you can traverse the entire region by moving repeatedly from one cell in the region to another cell in the region taking steps up, down, left, or right.</p>

<p>Given the image returned by FJ&#39;s camera, please count the number of PCLs.</p>

### 입력

<p>The first line of input contains \(N\), the size of the grid (\(1 \leq N \leq 20\)). The next \(N\) lines describe the image, each consisting of \(N\) characters.</p>

### 출력

<p>Print a count of the number of PCLs in the image.</p>

### 힌트

<p>In this example, the two PCLs are the rectangles with contents</p>

<pre>
ABB
BBB
AAB
ABB
</pre>

<p>and</p>

<pre>
BC
BC
BB
BC
</pre>