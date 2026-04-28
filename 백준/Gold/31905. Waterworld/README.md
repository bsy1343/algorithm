# [Gold I] Waterworld - 31905

[문제 링크](https://www.acmicpc.net/problem/31905)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 70, 맞힌 사람: 55, 정답 비율: 93.220%

### 분류

수학, 미적분학

### 문제 설명

<p>Thousands of planets outside the Solar System have been discovered in recent years. An important factor for potential life support is the availability of liquid water. Detecting water on faraway planets is not easy. For rotating planets, a brand-new technology using relativistic quantum-polarized spectroscopy can help. It works as follows (this is a simplified description as only three people on <em>this</em> planet understand how it really works).</p>

<p><img alt="" src="https://upload.acmicpc.net/cf311743-4dfe-4804-8833-8553b693320b/-/preview/" style="width: 250px; height: 249px; float: right;" />Assume the telescope shows the planet such that its rotating axis is vertical and its equator is horizontal. Only the vertical line at the center of the image (the line that covers the rotating axis) is analyzed, because it provides the highest resolution of the planet&rsquo;s surface.</p>

<p>The analysis proceeds in steps of $d$ degrees. In one step, data is aggregated while the planet rotates by $d$ degrees, so each step gives information about a slice of $d$ degrees of the planet&rsquo;s surface. The image is split into $n$ segments of equal height, which are analyzed separately. So the slice of $d$ degrees is partitioned into $n$ areas $A_1,\dots ,A_n$. For each area $A_i$, image analysis produces a number that gives the percentage of $A_i$ covered by water. The areas $A_i$ for one step are highlighted in the diagram on the right.</p>

<p>You may assume the planet&rsquo;s surface is a sphere. This means each area $A_2,\dots ,A_{n-1}$ is a spherical quadrilateral: it has four vertices, two sides parallel to the equator (that is, in planes parallel to the equator&rsquo;s plane) and two sides on great circles through the planet&rsquo;s poles, where the great circles are $d$ degrees apart. At either pole, two of the four vertices collapse into the pole, so $A_1$ and $A_n$ are spherical triangles with only one side parallel to the equator. Due to the curvature of the surface, sides that are parallel to the equator are longer if they are closer to the equator, while sides on great circles are longer if they are closer to the poles.</p>

<p>The above process is repeated for the next $d$ degrees of rotation, and so on, a total number of $m$ times, until the whole surface of the planet has been covered (that is, $md=360$ degrees). Your task is to compute the percentage of the planet&rsquo;s surface covered by water from the given data.</p>

### 입력

<p>The first line of input contains the two integers $n$ and $m$ ($2&le;n,m&le;1000$). Each of the following $n$ lines contains $m$ integers $a_{i,j}$ ($0&le;a_{i,j}&le;100$ for $1&le;i&le;n$ and $1&le;j&le;m$). Each column of this matrix describes the measurements for a single step, that is, a rotation by $d$ degrees. The number $a_{i,j}$ is the percentage of area $A_i$ that is covered by water in the $j$th step.</p>

### 출력

<p>Output the percentage of the planet&rsquo;s surface covered by water. Your answer should have an absolute error of at most $10^{-6}$.</p>