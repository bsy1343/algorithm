# [Silver IV] Medium Weird Measurements - 14008

[문제 링크](https://www.acmicpc.net/problem/14008)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 88, 맞힌 사람: 68, 정답 비율: 73.118%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p><strong>&quot;Almonds? Oh yeah, I have tried those before. Covered in chocolate.&quot;</strong>&nbsp;- Dudu, 2015.</p>

<p><strong>Note:</strong>&nbsp;This problem is identical to Small and Large Weird Measurements, but with different bounds.</p>

<p>Dudu is trying to achieve a perfect beach body for his upcoming trip to Thailand. As such, as part of his strict regime he weighs himself every morning.</p>

<p>A few intervals of time are good, with a constant decrease of weight, and a few are bad, with a constant increase of weight. But some intervals are just weird.</p>

<p>We say that the measurements from an interval are&nbsp;<strong>weird</strong>&nbsp;if they alternate between increasing and decreasing. For instance, if the measurements for consecutive days are [1,3,2,5,1], these measurements are weird. If the measurements are [1,3,5,4], then they are not weird, since the value increases between 1 and 3 and between 3 and 5. Note that all intervals of size 1 are weird by this definition.</p>

<p>Given a sequence of integers, we are interested in figuring out how many intervals are weird. See the sample below for a better explanation.</p>

### 입력

<p>The first line of input will contain a single integer N, the size of the sequence.</p>

<p>The next line contains N numbers: a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>&nbsp;representing the sequence of measurements.</p>

<ul>
	<li>1 &le; N &le; 5000</li>
	<li>0 &le; a<sub>i</sub> &le; 10<sup>9</sup></li>
</ul>

### 출력

<p>Output a single integer indicating the number of non-empty periods with weird measurements the sequence from the input has.</p>

### 힌트

<p>The intervals with measurements [1], [1,4], [4], [4], [4,2], [4,2,5], [4,2,5,2], [2], [2,5], [2,5,2], [5], [5,2], [2], [2,1], and [1] are weird.</p>

<p>Note that there are TWO intervals that corresponds to the measurement [4], so it is counted twice.</p>