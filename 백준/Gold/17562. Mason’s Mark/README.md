# [Gold II] Mason’s Mark - 17562

[문제 링크](https://www.acmicpc.net/problem/17562)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 38, 맞힌 사람: 35, 정답 비율: 53.846%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17562.%E2%80%85Mason%E2%80%99s%E2%80%85Mark/11b394da.png" data-original-src="https://upload.acmicpc.net/bfd16030-c350-4ac8-a612-6399ead205e0/-/crop/452x721/11,14/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 226px; height: 361px;" /></p>

<p>A mason&rsquo;s mark is a symbol often found on dressed stones in buildings and other public structures. As Peter walks with his camera through Paris, he notices these marks on the wall of the Tour JeanSans-Peur. Every stone has one of the marks A, B or C, which are quite visible. He makes a black and white photo and observes:</p>

<ul>
	<li>The picture shows stones, and every stone contains exactly one mark.</li>
	<li>All marks have one of the following shape with x and y being arbitrary strictly positive integers, and possibly different for each mark. Note that marks are surrounded by white pixels, and that marks cannot be rotated.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17562.%E2%80%85Mason%E2%80%99s%E2%80%85Mark/8109c4c0.png" data-original-src="https://upload.acmicpc.net/95d8488b-7df3-4a23-bc0d-b764a6e93847/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 409px; height: 201px;" /></p>

<ul>
	<li>The picture contains some noise, which are black pixels surrounded by 8 white pixels.</li>
	<li>There are 3 kinds of black pixels, corresponding respectively to the noise, the mason&rsquo;s marks, and the region around the stones.</li>
	<li>Every white pixel belongs to the surface of a stone and some of them also belong to the interior of a mark.</li>
	<li>The white pixels belonging to the surface of the same stone but not belonging to the interior of the mark are all connected with respect to vertical and horizontal adjacency. However the&nbsp;surface of a stone may be non-convex.</li>
	<li>The black pixels of the region around the stones are connected with respect to vertical, horizontal, diagonal, and anti-diagonal adjacency, which means that you can go from any black pixel of the region around the stones to any other such pixel by moving from one pixel to one of its eight adjacent pixels. All pixels of the border of the picture are black and belong to this region.</li>
</ul>

<p>You are given a rectangular matrix representing a picture made by Peter. The &lsquo;#&rsquo; character represents a black pixel and the &lsquo;.&rsquo; character a white pixel. You should count how many stones are on the picture with the respective letters A, B, and C.</p>

### 입력

<p>The first line contains two integers W and H. The next H lines each contain a string of length W. The strings are composed of &lsquo;.&rsquo; and &lsquo;#&rsquo;.</p>

### 출력

<p>The output should consist of a single line, whose content is three integers A, B, and C separated with single spaces, indicating the number of stones with the respective marks A, B, and C.</p>

### 제한

<ul>
	<li>7 &le; W &le; 1 000;</li>
	<li>9 &le; H &le; 1 000.</li>
</ul>