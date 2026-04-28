# [Platinum IV] Cosmic Cleaner - 18655

[문제 링크](https://www.acmicpc.net/problem/18655)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 17, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

미적분학, 기하학, 3차원 기하학, 수학

### 문제 설명

<p>There are n asteroids forming an asteroid belt. Due to gravity, these asteroids revolve around a planet and they, asteroids and the planet, don&rsquo;t collide with each other at the moment. A cleaner is ordered to wipe out the planet, which means they will take advantage of their advanced technology to obliterate the planet, and anything close to its center will be erased immediately. If these celestial bodies are regarded as perfect balls, can you evaluate the total volume of areas that belong to asteroids but will be cleaned up after executing the mission?</p>

<p>Note that these celestial bodies don&rsquo;t intersect with each other, which means there is no point shared by any two bodies.</p>

### 입력

<p>The input contains several test cases. The first line contains an integer T indicating the number of test cases. The following describes all test cases. For each test case:</p>

<p>The first line contains an integer n.</p>

<p>Each of the following n lines contains four integers x, y, z and r, representing an asteroid with radius r, whose center is located at (x, y, z).</p>

<p>The last line contains four integers x&#39;, y&#39;, z&#39; and r&#39;, representing that the center of the planet, which is also the center of the cleaning area, is located at (x&#39;, y&#39;, z&#39;), and the radius of the area affected by the cleaner is r&#39;, which is greater than the planet&rsquo;s radius.</p>

### 출력

<p>For each test case, output a line containing &ldquo;Case #x: y&rdquo; (without quotes), where x is the test case</p>

<p>number starting from 1, and y is the answer to this test case, with an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>

<p>Formally, assuming that your answer is a and the jury&rsquo;s answer is b, your answer will be considered correct if |a&minus;b|/max{1,|b|} &le; 10<sup>&minus;6</sup>.</p>

### 제한

<ul>
	<li>1 &le; T &le; 6000</li>
	<li>1 &le; n &le; 100</li>
	<li>&minus;10<sup>3</sup> &le; x, y, z, x&#39;, y&#39;, z&#39; &le; 10<sup>3</sup></li>
	<li>1 &le; r, r&#39;&nbsp;&le; 10<sup>3</sup></li>
</ul>

### 힌트

<p>The following figure illustrates the sample test case, where the affected area is inside the red sphere, and asteroids are colored by orange, blue and green in the order they appear in the sample.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18655.%E2%80%85Cosmic%E2%80%85Cleaner/4707b85b.png" data-original-src="https://upload.acmicpc.net/5f72e061-90b8-4b98-a915-d10f0cdf9d70/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 493px; height: 299px;" /></p>