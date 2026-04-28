# [Gold I] Bounce Bounce Bounce - 15377

[문제 링크](https://www.acmicpc.net/problem/15377)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 274, 정답: 122, 맞힌 사람: 104, 정답 비율: 46.847%

### 분류

수학, 정수론, 오일러 피 함수

### 문제 설명

<p>Fidel invented a circular ring. Its boundary is made of a reflective material and at one point on the circle&rsquo;s boundary, a laser is placed. He wishes to set the angle of the laser in such a way that it bounces N times around the circle then returns to its original position. How many ways can he choose the initial direction of the laser?</p>

<p>Assume that the angle of incidence is equal to the angle of reflection (see the image below; the location of the laser in the image is for demonstration purposes only).</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15377.%E2%80%85Bounce%E2%80%85Bounce%E2%80%85Bounce/ed29ef11.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15377/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:276px; width:277px" /></p>

### 입력

<p>The first line of input contains T, the number of test cases.</p>

<p>A test case consists of a single integer, N, on a line by itself.</p>

<p>Constraints</p>

<ul>
	<li>1 &le; T &le; 3000</li>
	<li>1 &le; N &le; 10<sup>9</sup></li>
</ul>

### 출력

<p>For each test case, output one line containing the number of ways to launch the laser so that it bounces exactly N times and returns at the exact same point.</p>

### 힌트

<p>For the first example, there are exactly four ways to bounce exactly four times and return to the same point. See the figure below.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15377.%E2%80%85Bounce%E2%80%85Bounce%E2%80%85Bounce/570e9a3d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15377/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:143px; width:551px" /></p>

<p>For the second example, there are exactly two ways to bounce exactly three times and return to the same point. See the figure below.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15377.%E2%80%85Bounce%E2%80%85Bounce%E2%80%85Bounce/615111c1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15377/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:166px; width:334px" /></p>