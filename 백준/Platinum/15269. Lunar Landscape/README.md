# [Platinum II] Lunar Landscape - 15269

[문제 링크](https://www.acmicpc.net/problem/15269)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 124, 정답: 48, 맞힌 사람: 42, 정답 비율: 38.532%

### 분류

구현, 기하학, 스위핑

### 문제 설명

<p>A satellite is surveying a possible rover landing area on the moon. The landing area is modeled as a square grid embedded in the standard coordinate system.</p>

<p>The satellite has taken n photos, each capturing a square area of the surface. Careful camera calibration has ensured that all photos are aligned with the grid &mdash; all four vertices have integer coordinates. Due to the satellite&rsquo;s changing orbit there are two types of photos:</p>

<ul>
	<li>Photos of type Ahave sides that are parallel to coordinate axes. Such a photo is specified by giving the integer coordinates (x, y) of the square&rsquo;s middle point and the length of its side a &mdash; always an even integer.</li>
	<li>Photos of type Bhave sides at a 45<sup>◦</sup> angle to the coordinate axes. Such a photo is specified by giving the integer coordinates (x, y) of the square&rsquo;s middle point and the length of its diagonal d &mdash; always an even integer.</li>
</ul>

<p>Find the total surface area captured in the satellite photos.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 200 000) &mdash; the number of photos. The j-th of the following n lines is either of the form &ldquo;A x<sub>j</sub> y<sub>j</sub> a<sub>j</sub>&rdquo; or &ldquo;B x<sub>j</sub> y<sub>j</sub> d<sub>j</sub>&rdquo; representing a photo of type A or B, respectively. The x<sub>j</sub> and y<sub>j</sub> are the integer coordinates of the middle point of the photo (&minus;1 000 &le; x<sub>j</sub>, y<sub>j</sub> &le; 1 000). The a<sub>j</sub> and d<sub>j</sub> are even integers (2 &le; a<sub>j</sub>, d<sub>j</sub> &le; 1 000) &mdash; the side length and the diagonal length, respectively</p>

### 출력

<p>Output a number with exactly two digits after the decimal point &mdash; the total area of the surface. The answer has to exactly correspond to the judge&rsquo;s solution (no rounding errors are tolerated).</p>

### 힌트

<p>Sample 1:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15269.%E2%80%85Lunar%E2%80%85Landscape/1ed00b12.png" data-original-src="http://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15269/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:71px; width:79px" /></p>

<p>Sample 2:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15269.%E2%80%85Lunar%E2%80%85Landscape/b28f4b06.png" data-original-src="http://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15269/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:276px; width:273px" /></p>