# [Gold V] Mixtape Management - 20913

[문제 링크](https://www.acmicpc.net/problem/20913)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 177, 정답: 116, 맞힌 사람: 90, 정답 비율: 63.380%

### 분류

해 구성하기

### 문제 설명

<p>Mary has created a mixtape with her favourite reggae tracks. The mixtape consists of a list of MP3 files on her computer that she wants to share with her friends Wendy and Larry. However she knows that her friends have different musical tastes and will therefore also have different preferences for the order in which the tracks are played.</p>

<p>Mary knows that Wendy is a Windows user and Larry is a Linux user and realised that she can use this to her advantage. This is because Windows and Linux use different methods to sort files within a directory in case their names contain numerical data. In Windows, numbers in file names are read as actual numbers, causing the files to be sorted by increasing values of these numbers. In Linux, there is no special handling for numbers, so file names are sorted lexicographically. See Figure M.1&nbsp;for an example of file sorting on the two operating systems.</p>

<table class="table table-bordered table-center-20">
	<thead>
		<tr>
			<th>Linux</th>
			<th>Windows</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><code>337.mp3</code></td>
			<td><code>7.mp3</code></td>
		</tr>
		<tr>
			<td><code>34.mp3</code></td>
			<td><code>34.mp3</code></td>
		</tr>
		<tr>
			<td><code>3401.mp3</code></td>
			<td><code>79.mp3</code></td>
		</tr>
		<tr>
			<td><code>7.mp3</code></td>
			<td><code>337.mp3</code></td>
		</tr>
		<tr>
			<td><code>780.mp3</code></td>
			<td><code>780.mp3</code></td>
		</tr>
		<tr>
			<td><code>7803.mp3</code></td>
			<td><code>3401.mp3</code></td>
		</tr>
		<tr>
			<td><code>79.mp3</code></td>
			<td><code>7803.mp3</code></td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure M.1:&nbsp;Illustration of the first sample case. Note that the file extensions <code>.mp3</code> do not influence the ordering and are purely for illustration.</p>

<p>After deciding on the order in which she wants Wendy and Larry to listen to the tracks, Mary has already sorted the files according to Larry&#39;s taste. Now she wants to rename the files such that the filenames are distinct positive integers without leading zeroes, they are sorted in increasing lexicographic order, and when sorting them by value the new order will match Wendy&#39;s taste. For this purpose, she has come up with a permutation $p_1,\dots,p_n$ that describes how to rearrange Larry&#39;s list into Wendy&#39;s list: for every $i$, the $i$th number in lexicographic order needs to be the $p_i$th smallest by value. Help Mary find a suitable sequence of filenames.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \le n \le 100$), the number of tracks.</li>
	<li>One line with $n$ distinct integers $p_1,\dots,p_n$ ($1 \le p_i \le n$ for each $i$), the given permutation.</li>
</ul>

### 출력

<p>Output $n$ distinct integers in lexicographically increasing order, your sequence of filenames. All numbers must be positive integers less than $10^{1000}$ and may not contain leading zeroes. Any valid sequence of filenames will be accepted.</p>