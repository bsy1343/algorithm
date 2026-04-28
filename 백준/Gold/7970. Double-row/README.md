# [Gold III] Double-row - 7970

[문제 링크](https://www.acmicpc.net/problem/7970)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 13, 맞힌 사람: 11, 정답 비율: 52.381%

### 분류

그래프 이론, 그리디 알고리즘, 이분 그래프

### 문제 설명

<p>2n soldiers are standing in a double-row. They have to be rearranged, so that there are no equally tall soldiers in each row - then we shall say, that the soldiers are set up properly.</p>

<p>A single operation consists in swapping two soldiers who occupy the same position (but in different rows). Your task is to determine the minimum number of swaps necessary to set the soldiers up properly.</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from the standard input the number and heights of soldiers, as they stand initially,</li>
	<li>determines the minimum number of swaps (of soldiers standing on the same position in different rows) necessary to set up soldiers properly,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the input there is one integer n, 1 &le; n &le; 50,000. In each of the two rows there are n soldiers standing. In each of the following two lines there are n positive integers separated by single spaces. In the second line there are numbers x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>n</sub>, 1 &le; x<sub>i</sub> &le; 100,000; x<sub>i</sub> denotes the height of the i&#39;th soldier in the first line. In the third line there are numbers y<sub>1</sub>,y<sub>2</sub>,&hellip;,y<sub>n</sub>, 1 &le; y<sub>i</sub> &le; 100,000; y<sub>i</sub> denotes the height of the i&rsquo;th soldier in the second line.</p>

<p>It is guaranteed that in the instances from the test data it is possible to set up soldiers properly.</p>

### 출력

<p>In the first and only line of the standard output one integer should be written - the minimum number of swaps necessary to set up soldiers properly.</p>

### 힌트

<p>There is a double-row of 18 soldiers in the figure. Arrows indicate the swaps that rearrange the soldiers in a proper way.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7970/1.gif" style="height:80px; width:325px" /></p>