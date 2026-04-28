# [Bronze III] Bike Tour - 23901

[문제 링크](https://www.acmicpc.net/problem/23901)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 376, 정답: 301, 맞힌 사람: 272, 정답 비율: 80.712%

### 분류

구현

### 문제 설명

<p>Li has planned a bike tour through the mountains of Switzerland. His tour consists of&nbsp;<b>N</b>&nbsp;checkpoints, numbered from 1 to&nbsp;<b>N</b>&nbsp;in the order he will visit them. The i-th checkpoint has a height of&nbsp;<b>H<sub>i</sub></b>.</p>

<p>A checkpoint is a&nbsp;<i>peak</i>&nbsp;if:</p>

<ul>
	<li>It is not the 1st checkpoint or the&nbsp;<b>N</b>-th checkpoint, and</li>
	<li>The height of the checkpoint is&nbsp;<i>strictly greater than</i>&nbsp;the checkpoint immediately before it and the checkpoint immediately after it.</li>
</ul>

<p>Please help Li find out the number of peaks.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the integer&nbsp;<b>N</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers. The i-th integer is&nbsp;<b>H<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of peaks in Li&#39;s bike tour.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>H<sub>i</sub></b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<ul>
	<li>In sample case #1, the 2nd checkpoint is a peak.</li>
	<li>In sample case #2, there are no peaks.</li>
	<li>In sample case #3, the 2nd and 4th checkpoint are peaks.</li>
	<li>In sample case #4, there are no peaks.</li>
</ul>