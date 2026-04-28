# [Silver I] The Lights Going On and Off - 6816

[문제 링크](https://www.acmicpc.net/problem/6816)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 21, 맞힌 사람: 20, 정답 비율: 86.957%

### 분류

브루트포스 알고리즘, 애드 혹

### 문제 설명

<p>For your birthday, you have been given a grid of R (1 &lt; R &lt; 30) rows of lights, with each row containing L (1 &le; L &lt; 8) lights. Lights can be in one of two states: on or off. For this question, the topmost row is row R, and the bottom-most row is row 1. Also, beside all rows except the topmost row (row R), there is a button which can be pushed.</p>

<p>Pushing the button beside row k (1 &le; k &lt; R) will peform an &ldquo;exclusive-or&rdquo; operation on each light of row k, which is described below. Consider column i in row k, where 1 &le; i &le; L. If the lights in column i of row k and column i of row k + 1 are both the same (i.e., both on, or both off), then pushing the button beside row k will cause the light in column i of row k to be off. If the lights in column i of row k and column i of row k + 1 are different (i.e., one is on, and the other is off), then pushing the button beside row k will cause the light in column i of row k to be on. An example is shown below, for L = 4:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>Column numbers</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<td>Row k + 1</td>
			<td>on</td>
			<td>on</td>
			<td>off</td>
			<td>off</td>
		</tr>
		<tr>
			<td>Row k before button pushed</td>
			<td>on</td>
			<td>off</td>
			<td>on</td>
			<td>off</td>
		</tr>
		<tr>
			<td>Row k after button pushed</td>
			<td>off</td>
			<td>on</td>
			<td>on</td>
			<td>off</td>
		</tr>
	</tbody>
</table>

<p>You are told which lights are initially on and which are initially off. You must calculate how many different light patterns are possible for the bottom row by any sequence of button pushes.</p>

### 입력

<p>The first line of input will contain the integer R, the number of rows. The second line of input will contain the integer L, the number of lights per row. The next R lines of input will contain L integers, where the integer will either be 0 (to indicate &ldquo;off&rdquo;) or 1 (to indicate &rdquo;on&rdquo;). Pairs of consecutive integers will be separated by one space character. These R lines will be given in topdown order: that is, the third line of input will be the description of row R, the fourth line will be R &minus; 1, and so on, until the last line describes the bottom row.</p>

### 출력

<p>Output the number of possible light patterns of the bottom row.</p>