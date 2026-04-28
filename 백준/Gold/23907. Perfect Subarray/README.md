# [Gold I] Perfect Subarray - 23907

[문제 링크](https://www.acmicpc.net/problem/23907)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 116, 정답: 35, 맞힌 사람: 23, 정답 비율: 33.824%

### 분류

수학, 자료 구조, 브루트포스 알고리즘, 집합과 맵, 누적 합, 해시를 사용한 집합과 맵

### 문제 설명

<p>Cristobal has an array of&nbsp;<b>N</b>&nbsp;(possibly negative) integers. The i-th integer in his array is&nbsp;<b>A<sub>i</sub></b>. A contiguous non-empty subarray of Cristobal&#39;s array is&nbsp;<i>perfect</i>&nbsp;if its total sum is a&nbsp;<a href="https://en.wikipedia.org/wiki/Square_number">perfect square</a>. A perfect square is a number that is the product of a non-negative integer with itself. For example, the first five perfect squares are 0, 1, 4, 9 and 16.</p>

<p>How many subarrays are&nbsp;<i>perfect</i>? Two subarrays are different if they start or end at different indices in the array, even if the subarrays contain the same values in the same order.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case contains the integer&nbsp;<b>N</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers describing Cristobal&#39;s array. The i-th integer is&nbsp;<b>A<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of perfect subarrays.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>-100 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 100, for all i.</li>
</ul>

### 힌트

<p>In sample case #1, there is one perfect subarray:&nbsp;<code>[2 2]</code>&nbsp;whose sum is 2<sup>2</sup>.</p>

<p>In sample case #2, there are three perfect subarrays:</p>

<ul>
	<li><code>[9]</code>, whose total sum is 3<sup>2</sup>.</li>
	<li><code>[1]</code>, whose total sum is 1<sup>2</sup>.</li>
	<li><code>[30 30 9 1 30]</code>, whose total sum is 10<sup>2</sup>.</li>
</ul>

<p>In sample case #3, there are nine perfect subarrays:</p>

<ul>
	<li><code>[4]</code>, whose total sum is 2<sup>2</sup>.</li>
	<li><code>[4 0]</code>, whose total sum is 2<sup>2</sup>.</li>
	<li><code>[4 0 0]</code>, whose total sum is 2<sup>2</sup>.</li>
	<li><code>[0]</code>, whose total sum is 0<sup>2</sup>.</li>
	<li><code>[0 0]</code>, whose total sum is 0<sup>2</sup>.</li>
	<li><code>[0 0 16]</code>, whose total sum is 4<sup>2</sup>.</li>
	<li><code>[0]</code>, whose total sum is 0<sup>2</sup>.</li>
	<li><code>[0 16]</code>, whose total sum is 4<sup>2</sup>.</li>
	<li><code>[16]</code>, whose total sum is 4<sup>2</sup>.</li>
</ul>

<p><b>Note</b>: We do not recommend using interpreted/slower languages for the test set 2 of this problem.</p>