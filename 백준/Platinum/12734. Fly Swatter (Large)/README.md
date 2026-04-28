# [Platinum I] Fly Swatter (Large) - 12734

[문제 링크](https://www.acmicpc.net/problem/12734)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 25, 맞힌 사람: 22, 정답 비율: 46.809%

### 분류

수학, 기하학, 확률론, 미적분학, 피타고라스 정리

### 문제 설명

<p>What are your chances of hitting a fly with a tennis racquet?</p>

<p>To start with, ignore the racquet&#39;s handle. Assume the racquet is a perfect ring, of outer radius&nbsp;<strong>R</strong>&nbsp;and thickness&nbsp;<strong>t</strong>&nbsp;(so the inner radius of the ring is&nbsp;<strong>R</strong>&minus;<strong>t</strong>).</p>

<p>The ring is covered with horizontal and vertical strings. Each string is a cylinder of radius&nbsp;<strong>r</strong>. Each string is a chord of the ring (a straight line connecting two points of the circle). There is a gap of length&nbsp;<strong>g</strong>&nbsp;between neighbouring strings. The strings are symmetric with respect to the center of the racquet i.e. there is a pair of strings whose centers meet at the center of the ring.</p>

<p>The fly is a sphere of radius&nbsp;<strong>f</strong>. Assume that the racquet is moving in a straight line perpendicular to the plane of the ring. Assume also that the fly&#39;s center is inside the outer radius of the racquet and is equally likely to be anywhere within that radius.Any overlap between the fly and the racquet (the ring or a string) counts as a hit.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12734.%E2%80%85Fly%E2%80%85Swatter%E2%80%85(Large)/e90dabec.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12734.%E2%80%85Fly%E2%80%85Swatter%E2%80%85(Large)/e90dabec.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12733/images.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:267px; opacity:0.9; width:308px" /></p>

### 입력

<p>One line containing an integer&nbsp;<strong>N</strong>, the number of test cases in the input file.</p>

<p>The next&nbsp;<strong>N</strong>&nbsp;lines will each contain the numbers&nbsp;<strong>f</strong>,&nbsp;<strong>R</strong>,&nbsp;<strong>t</strong>,&nbsp;<strong>r</strong>&nbsp;and&nbsp;<strong>g</strong>&nbsp;separated by exactly one space. Also the numbers will have at most 6 digits after the decimal point.</p>

<p>- Limits</p>

<ul>
	<li><strong>f</strong>,&nbsp;<strong>R</strong>,&nbsp;<strong>t</strong>,&nbsp;<strong>r</strong>&nbsp;and&nbsp;<strong>g</strong>&nbsp;will be positive and smaller or equal to 10000.</li>
	<li><strong>t</strong>&nbsp;&lt;&nbsp;<strong>R</strong></li>
	<li><strong>f</strong>&nbsp;&lt;&nbsp;<strong>R</strong></li>
	<li><strong>r</strong>&nbsp;&lt;&nbsp;<strong>R</strong></li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100</li>
	<li>The total number of strings will be at most 2000 (so at most 1000 in each direction).</li>
</ul>

<div>&nbsp;</div>

### 출력

<p><strong>N</strong>&nbsp;lines, each of the form &quot;Case #<strong>k</strong>:&nbsp;<strong>P</strong>&quot;, where&nbsp;<strong>k</strong>&nbsp;is the number of the test case and&nbsp;<strong>P</strong>&nbsp;is the probability of hitting the fly with a piece of the racquet.</p>

<p>Answers with a relative or absolute error of at most 10<sup>-6</sup>&nbsp;will be considered correct.</p>