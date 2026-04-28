# [Silver III] ROT13 - 8385

[문제 링크](https://www.acmicpc.net/problem/8385)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 171, 정답: 54, 맞힌 사람: 46, 정답 비율: 44.660%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>The Byteland Aircraft Factory has recently developed a new type of jet plane. Naming the planes with numbers is not fashionable anymore, so the management decided to form a two-word name. To draw potential clients&#39; attention, the name should have an additional property: when encoded with the ROT13 cipher it should still be legible - the encoded form should differ only by the order of the words.</p>

<p>Recall that the ROT13 cipher changes each letter to the one that lies 13&nbsp;characters away in the alphabet. To be more precise, the encoding follows the table below.</p>

<table class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<td>original letter</td>
			<td><code>abcdefghijklmnopqrstuvwxyz</code></td>
		</tr>
		<tr>
			<td>encoded letter</td>
			<td><code>nopqrstuvwxyzabcdefghijklm</code></td>
		</tr>
	</tbody>
</table>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the list of available words,</li>
	<li>calculates the number of different possible plane names,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the input consists of a single integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000). In each of the next&nbsp;<em>n</em>&nbsp;lines there is one word consisting of small letters of the English alphabet. Each word contains at least one character. The cummulative length of all the words does not exceed 1 000 000&nbsp;letters.</p>

### 출력

<p>The first and only line of the output should contain one integer - the total number of different possible plane names.</p>