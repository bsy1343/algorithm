# [Platinum III] Circle Garden - 17867

[문제 링크](https://www.acmicpc.net/problem/17867)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 9, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

이분 탐색, 기하학, 매개 변수 탐색

### 문제 설명

<p>Joe has a pile of random lengths of pressure treated wood he would like to use as border for a flower garden. He would like the garden to be roughly circular, so he has decided the corners should all be on the same circle. For example:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17867.%E2%80%85Circle%E2%80%85Garden/51dacc08.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17867.%E2%80%85Circle%E2%80%85Garden/51dacc08.png" data-original-src="https://upload.acmicpc.net/a0cfeb7b-a007-4057-973b-9bd43d38572f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 433px; height: 168px;" /></p>

<p>Joe would prefer a layout like the leftmost (A), but definitely does not want one where the center of the circle is outside the garden polygon like the rightmost (C) example.</p>

<p>Write a program which takes as input the lengths of the chosen pieces of wood (in inches) and either: outputs the radius of the circle to use for the layout, says there is no such circle, says the center of the circle would be outside the polygon or says the radius of the circle would be more than 10 feet which is the maximum space Joe can use for the garden. Note that the order of the pieces does not affect the radius value. Joe must use all of the pieces of wood.</p>

### 입력

<p>The first line of input contains the an integer number N, (3 &lt;= N &lt;= 100) which is how many pieces of lumber are to be used. The following N lines of input each contain a single floating-point value giving the length of a piece of lumber in inches (1 &lt;= length &lt;= 240).</p>

### 출력

<p>Your program will produce a single line of output as follows:</p>

<ul>
	<li>If there is no such circle, the output line consists of the words NO CIRCLE (in all capitals).</li>
	<li>If the center of the circle is outside the polygon, the output line consists of the word OUTSIDE (in all capitals).</li>
	<li>If the radius of the circle is greater than 10 feet (120 inches), the output line consists of the words TOO BIG (in all capitals).</li>
	<li>Otherwise, the output line consists of the radius of the circle in inches to 4 decimal places.</li>
</ul>