# [Bronze I] On-Screen Keyboard - 17578

[문제 링크](https://www.acmicpc.net/problem/17578)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 133, 정답: 120, 맞힌 사람: 115, 정답 비율: 89.844%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>You are to input a string with an OSK (on-screen keyboard). A remote control with five buttons, four arrows and an OK (Fig. B-1), is used for the OSK. Find the minimum number of button presses required to input a given string with the given OSK.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/46035938.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/46035938.png" data-original-src="https://upload.acmicpc.net/d2188645-f726-4f5f-820b-5b8d1a3ef878/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Fig. B-1 Remote control</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/9c4a21e1.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/9c4a21e1.png" data-original-src="https://upload.acmicpc.net/ecc7fd82-c13f-423a-a227-c892b2111df2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Fig. B-2 An on-screen keyboard</p>

<table class="table table-bordered table-center-70">
	<thead>
		<tr>
			<th>Character to input</th>
			<th>Move of highlighted cells</th>
			<th>Button presses</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td align="center"><code>I</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/fb09eabd.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/fb09eabd.png" data-original-src="https://upload.acmicpc.net/0cffd2f5-ab24-4dcc-9728-f92ff7706bfe/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>&rarr;,&rarr;,&rarr;,&rarr;,&rarr;,&rarr;,&rarr;,&rarr;,OK (9 presses)</td>
		</tr>
		<tr>
			<td align="center"><code>C</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/7a955ab2.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/7a955ab2.png" data-original-src="https://upload.acmicpc.net/d0a2edb6-6950-4bf1-94bb-17f790989cfb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>&larr;,&larr;,&larr;,&larr;,&larr;,&larr;,OK (7 presses)</td>
		</tr>
		<tr>
			<td align="center"><code>P</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/f50c2378.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/f50c2378.png" data-original-src="https://upload.acmicpc.net/11087df6-033e-4122-ab7e-efc82800fe97/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>&darr;,&rarr;,&rarr;,&rarr;,&rarr;,OK (6 presses)</td>
		</tr>
		<tr>
			<td align="center"><code>C</code></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/fade9784.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/17578.%E2%80%85On-Screen%E2%80%85Keyboard/fade9784.png" data-original-src="https://upload.acmicpc.net/0c1257c6-e5dd-42c4-b0f7-20654c6ba366/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>&uarr;,&larr;,&larr;,&larr;,&larr;,OK (6 presses)</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Fig. B-3 The minimum steps to input &ldquo;<code>ICPC</code>&rdquo; with the OSK in Fig. B-2</p>

<p>The OSK has cells arranged in a grid, each of which has a character in it or is empty. No two of the cells have the same character.</p>

<p>One of the cells of the OSK is highlighted, and pressing the OK button will input the character in that cell, if the cell is not empty.</p>

<p>Initially, the cell at the top-left corner is highlighted. Pressing one of the arrow buttons will change the highlighted cell to one of the adjacent cells in the direction of the arrow. When the highlighted cell is on an edge of the OSK, pushing the arrow button with the direction to go out of the edge will have no effect.</p>

<p>For example, using the OSK with its arrangement shown in Fig. B-2, a string &ldquo;<code>ICPC</code>&rdquo; can be input with 28 button presses as shown in Fig. B-3, which is the minimum number of presses.</p>

<p>Characters in cells of the OSKs are any of a lowercase letter (&lsquo;<code>a</code>&rsquo;, &lsquo;<code>b</code>&rsquo;, ..., &lsquo;<code>z</code>&rsquo;), an uppercase letter (&lsquo;<code>A</code>&rsquo;, &lsquo;<code>B</code>&rsquo;, ..., &lsquo;<code>Z</code>&rsquo;), a digit (&lsquo;<code>0</code>&rsquo;, &lsquo;<code>1</code>&rsquo;, ..., &lsquo;<code>9</code>&rsquo;), a comma (&lsquo;<code>,</code>&rsquo;), a hyphen (&lsquo;<code>-</code>&rsquo;), a dot (&lsquo;<code>.</code>&rsquo;), a slash (&lsquo;<code>/</code>&rsquo;), a colon (&lsquo;<code>:</code>&rsquo;), a semicolon (&lsquo;<code>;</code>&rsquo;), or an at sign (&lsquo;<code>@</code>&rsquo;).</p>

### 입력

<p>The input consists of at most 100 datasets, each in the following format.</p>

<pre>
<i>h w</i>
<i>r</i><sub>1</sub>
...
<i>r</i><sub>h</sub>
<i>s</i>
</pre>

<p>The two integers <i>h</i> and <i>w</i> in the first line are the height and the width of the OSK, respectively. They are separated by a space, and satisfy 1 &le; <i>h</i> &le; 50 and 1 &le; <i>w</i> &le; 50.</p>

<p>Each of the next <i>h</i> lines gives a row of the OSK. The <i>i</i>-th row, <i>r</i><sub>i</sub> is a string of length <i>w</i>. The characters in the string corresponds to the characters in the cells of the <i>i</i>-th row of the OSK or an underscore (&lsquo;<code>_</code>&rsquo;) indicating an empty cell, from left to right.</p>

<p>The given OSK satisfies the conditions stated above.</p>

<p>The next line is a string <i>s</i> to be input. Its length is between 1 and 1000, inclusive. All the characters in <i>s</i> appear in the given OSK. Note that <i>s</i> does not contain underscores.</p>

<p>The end of the input is indicated by a line containing two zeros.</p>

### 출력

<p>For each dataset, output a single line containing an integer indicating the minimum number of button presses required to input the given string with the given OSK.</p>