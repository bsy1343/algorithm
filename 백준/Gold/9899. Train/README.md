# [Gold IV] Train - 9899

[문제 링크](https://www.acmicpc.net/problem/9899)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 15, 맞힌 사람: 13, 정답 비율: 48.148%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Consider the following configuration of train tracks.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/89c6160b-4bc0-4ef6-bdef-d00eddd8949d/-/preview/" style="width: 381px; height: 188px;" /></p>

<p>Tracks I, II, and III may hold train cars that can move in one go between Track I and Track III, and between Track II and Track III, but not between Track I and Track II. Cars cannot pass each other on a track in one go. Cars can move together in one go. In the situation depicted above, the cars&nbsp;<b>G</b>&nbsp;and&nbsp;<b>A</b>&nbsp;can move together in one go from Tack III to Track I, after which the sequence of cars on Track I is&nbsp;<b>B</b>,&nbsp;<b>F</b>,&nbsp;<b>F</b>,&nbsp;<b>G</b>,&nbsp;<b>A</b>. However, the car&nbsp;<b>A</b>&nbsp;cannot move alone in one go from Track III to Track I (because to do so it has to pass car&nbsp;<b>G</b>&nbsp;but this is not allowed). Each track is long enough to hold all cars.</p>

<p>Initially, a sequence of cars is on Track I, and Tracks II and III are empty. The goal is to move cars between Tracks I and III and between Tracks II and III, such that a desired sequence of cars, and no other cars, resides on Track II. The question to be answered by your program is: What is the smallest number of movements that achieves the desired sequence of cars, and no other cars, on Track II? Note that when two or more adjacent cars move together in one go, it counts as one single movement.</p>

<p>Let us say initially, the cars&nbsp;<b>A</b>,&nbsp;<b>B</b>,&nbsp;<b>C</b>,&nbsp;<b>D</b>&nbsp;and&nbsp;<b>E</b>&nbsp;are on Track I in the order&nbsp;<b>ABCDE</b>. This means that the car&nbsp;<b>A</b>&nbsp;is furthest to the left, and car&nbsp;<b>E</b>&nbsp;is furthest to the right and closest to Track III. Let us say at the end, we want the sequence&nbsp;<b>DBC</b>&nbsp;on Track II. We can achieve this with four movements. First, we move the cars&nbsp;<b>D</b>&nbsp;and&nbsp;<b>E</b>&nbsp;together from Track I to Track III, then we move car&nbsp;<b>D</b>&nbsp;from Track III to Track II, then we move the cars&nbsp;<b>B</b>&nbsp;and&nbsp;<b>C</b>&nbsp;together from Track I to Track III, and finally, we move the cars&nbsp;<b>B</b>&nbsp;and&nbsp;<b>C</b>&nbsp;together from Track III to Track II. Figure 3 shows teh sequence of movements. The answer therefore is the number 4.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/07a63bfe-7038-4fea-9a59-12f9bd2b69d9/-/preview/" style="width: 369px; height: 188px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/02ab8480-4024-4de2-8d90-d907ccb8bd4c/-/preview/" style="width: 369px; height: 188px;" /></td>
		</tr>
		<tr>
			<td>(a) Before first movement</td>
			<td>(b) After first movement</td>
		</tr>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/cbd2a725-296e-482e-b288-a218cf11b665/-/preview/" style="width: 369px; height: 188px;" /></td>
			<td><img alt="" src="https://upload.acmicpc.net/7519b57d-5f74-4d7d-99a8-acc8f54c3884/-/preview/" style="width: 369px; height: 188px;" /></td>
		</tr>
		<tr>
			<td>(c) After second movement</td>
			<td>(d) After third movement</td>
		</tr>
		<tr>
			<td colspan="2"><img alt="" src="https://upload.acmicpc.net/36262a60-8262-4da0-ad7f-45522d89adda/-/preview/" style="width: 369px; height: 188px;" /></td>
		</tr>
		<tr>
			<td colspan="2">(e) After fourth and final movement</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure 3: Movements for example.</p>

### 입력

<p>The input consists of three lines. The first line contains two integers, separated with a blank character. The first integer&nbsp;<i>i</i>&nbsp;represents the initial number of cars on Track I, and the second number&nbsp;<i>j</i>&nbsp;represents the number of desired cars on Track II. The second line contains&nbsp;<i>i</i>&nbsp;capital letters, representing the initial sequence of cars on Track I. The third line contains&nbsp;<i>j</i>&nbsp;capital letters representing the desired sequence of cars on Track II.</p>

<p>You may assume that all letters in the second line are distinct, that all letters in the third line are distinct, and that every letter in the third line occurs in the second line, and that 0 &lt;&nbsp;<i>j</i>&nbsp;&lt; 7, 0 &lt;&nbsp;<i>i</i>&nbsp;&lt; 7.</p>

### 출력

<p>The output contains an integer, representing the minimal number of movements to achieve the desired sequence of cars in Track II.</p>