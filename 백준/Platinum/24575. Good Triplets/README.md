# [Platinum III] Good Triplets - 24575

[문제 링크](https://www.acmicpc.net/problem/24575)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 21, 맞힌 사람: 20, 정답 비율: 47.619%

### 분류

수학, 누적 합, 조합론

### 문제 설명

<p>Andrew is a very curious student who drew a circle with the center at (0, 0) and an integer circumference of C &ge; 3. The location of a point on the circle is the counter-clockwise arc length from the right-most point of the circle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24575.%E2%80%85Good%E2%80%85Triplets/44478c15.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24575.%E2%80%85Good%E2%80%85Triplets/44478c15.png" data-original-src="https://upload.acmicpc.net/9976cddb-0579-44fe-adc4-ba07e083d81f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 199px; height: 158px;" /></p>

<p>Andrew drew N &ge; 3 points at integer locations. In particular, the i<sup>th</sup> point is drawn at location P<sub>i</sub> (0 &le; P<sub>i</sub> &le; C &minus; 1). It is possible for Andrew to draw multiple points at the same location.</p>

<p>A good triplet is defined as a triplet (a, b, c) that satisfies the following conditions:</p>

<ul>
	<li>1 &le; a &lt; b &lt; c &le; N.</li>
	<li>The origin (0, 0) lies strictly inside the triangle with vertices at P<sub>a</sub>, P<sub>b</sub>, and P<sub>c</sub>. In particular, the origin is <strong>not</strong> on the triangle&rsquo;s perimeter.</li>
</ul>

<p>Lastly, two triplets (a, b, c) and (a&#39;, b&#39;, c&#39;) are distinct if a &ne; a&#39;, b &ne; b&#39;, or c &ne; c&#39;.</p>

<p>Andrew, being a curious student, wants to know the number of distinct good triplets. Please help him determine this number.</p>

### 입력

<p>The first line contains the integers N and C, separated by one space.</p>

<p>The second line contains N space-separated integers. The i<sup>th</sup> integer is P<sub>i</sub> (0 &le; P<sub>i</sub> &le; C &minus; 1).</p>

### 출력

<p>Output the number of distinct good triplets.</p>