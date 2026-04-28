# [Gold IV] Frames - 3534

[문제 링크](https://www.acmicpc.net/problem/3534)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>Vasya and Petya are playing an interesting game. Rules are pretty easy: there are two frames, the players have to make a translation of the second frame in such a way that the area of the intersection of the frames would be as large as possible. Both players think for a minute, and write down the translation vector of the second frame. The player whose vector gives a larger intersection area wins.</p>

<p>The game has many subtle cases, so Vasya wants to cheat and write a program that finds the best translation vector.</p>

<p>For this game the frame is a difference of two rectangles: the inner one and the outer one. The inner rectangle lies strictly inside the outer one. Sides of both rectangles are parallel to the coordinate axes.</p>

<p>To make the definition more clear let us consider some examples.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3534.%E2%80%85Frames/a9304563.png" data-original-src="https://upload.acmicpc.net/0ea4fa0f-b6ef-442b-b5fa-b72474a43105/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 182px; height: 121px;" /> &nbsp;</td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3534.%E2%80%85Frames/c21b12f4.png" data-original-src="https://upload.acmicpc.net/85484c82-d350-49b7-a689-bc33b02412b6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 184px; height: 121px;" /> &nbsp;</td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3534.%E2%80%85Frames/168d7889.png" data-original-src="https://upload.acmicpc.net/61823dc4-56d4-44a6-b5e5-e99c1a161e95/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 123px; height: 121px;" /> &nbsp;</td>
		</tr>
		<tr>
			<td>Incorrect frames</td>
			<td>Correct Frames</td>
			<td>Frames intersection</td>
		</tr>
	</tbody>
</table>

<p>The area of the frame is (W &middot; H &minus; w &middot; h), where W, H &mdash; dimensions of the outer rectangle and w, h &mdash; dimensions of the inner one (0 &lt; w &lt; W; 0 &lt; h &lt; H).</p>

<p>Write a program that finds a translation of one frame relative to another that results in maximum frames intersection area.</p>

### 입력

<p>Each frame is described by four points &mdash; two opposite corners of the outer rectangle, followed by two opposite corners of the inner rectangle. Points are described by their coordinates &mdash; pairs of integer numbers x and y. Coordinates do not exceed 10<sup>8</sup> by absolute value.</p>

<p>The first line of the input file contains the description of the first frame.</p>

<p>The second line of the input file contains the description of the second frame.</p>

### 출력

<p>The first line of the output file must contain an integer number A &mdash; the maximal possible intersection area of the given two frames achievable by a translation.</p>

<p>The second line of the output file must contain a pair of integer numbers x and y &mdash; coordinates of</p>

<p>the translation vector of the second frame that provides the intersection area A. Coordinates must not exceed 10<sup>18</sup> by the absolute value.</p>