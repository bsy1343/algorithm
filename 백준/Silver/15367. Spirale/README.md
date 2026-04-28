# [Silver III] Spirale - 15367

[문제 링크](https://www.acmicpc.net/problem/15367)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 113, 정답: 51, 맞힌 사람: 41, 정답 비율: 46.591%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Little Stjepan often likes to go out with his friends and have fun in a popular nightclub in Zagreb. However, Stjepan sometimes drinks too much soda and gets light headed from all the sugar. Last night was an example of this, which is why Stjepan had the same image in his mind the whole time. It was a scribble of number spirals of some sort. Since he can&rsquo;t quite remember what the image looked like, but can describe it, he is asking you to reconstruct it for him.</p>

<p>Stjepan recalls that the image was of the shape of a table consisting of numbers written in N rows and M columns. Also, he recalls that there were K spirals in that table. For each spiral, the starting position is known, as well as the direction it&rsquo;s moving in, which can be clockwise and counter-clockwise. An example is shown in the images below. The spirals created Stjepan&rsquo;s image in exactly 10<sup>100</sup> steps in the following way:</p>

<ol>
	<li>Initially, the table is empty, and each spiral is in its own starting position.</li>
	<li>In each following step, each spiral moves to its next position. It is possible that, at times, the spirals leave the boundaries of the table, but also to return within it.</li>
	<li>After exactly 10<sup>100</sup> steps, for each field in the table, the final value is the value of the earliest step in which one of the spirals touched that field.</li>
</ol>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15367/1.png" style="height:108px; width:138px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15367/2.png" style="height:108px; width:138px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:50%">Image 1: a spiral moving counter-clockwise</td>
			<td style="text-align:center; width:50%">Image 2: a spiral moving clockwise</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The first line of input contains positive integers N, M (1 &le; N, M &le; 50) and K (1 &le; K &le; N&times;M). Each of the following K lines contains three positive integers X<sub>i</sub>, Y<sub>i</sub> and T<sub>i</sub> (1 &le; X &le; N, 1 &le; Y &le; M, 0 &le; T &le; 1), the starting position of the i th spiral and its direction (0 - clockwise, 1 - counter-clockwise). No two spirals will begin in the same field.</p>

### 출력

<p>You must output N lines with M numbers, representing the table after each spiral makes 10<sup>100</sup> steps.</p>

### 힌트

<p>Clarification of the third test case:</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15367/3.png" style="height:162px; width:366px" /></p>

<p>For simplicity&rsquo;s sake, the letter A was added to the numbers from the first spiral, and the letter B to the numbers from the second spiral. Only the first 20 steps of the first spiral are shown, and 21 steps of the second spiral. The fields in gray are the fields from the table we&rsquo;re interested in, all other fields are out of the table&rsquo;s bounds, but are shown to illustrate the way the spirals move outside of the table.</p>