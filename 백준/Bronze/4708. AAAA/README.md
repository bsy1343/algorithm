# [Bronze I] AAAA - 4708

[문제 링크](https://www.acmicpc.net/problem/4708)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 8, 맞힌 사람: 5, 정답 비율: 31.250%

### 분류

(분류 없음)

### 문제 설명

<p>Forays into Anti-Aliased Ascii Art</p>

<p>Aliasing is the term used for artifacts introduced when digitally sampling an analog source due to the finite resolution of the digital capture. Aliasing is a common problem in computer graphics, where lines and smooth curves appear jagged when plotted as pixels. For example, given an equation of a line to be plotted:</p>

<p style="text-align:center">y=mx+b</p>

<p>a naive attempt to draw this line might result in something like</p>

<pre>
        *** 
      **
   ***
***</pre>

<p>looking more like a staircase than a smooth line.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4708/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-10%20%EC%98%A4%ED%9B%84%204.14.38.png" style="height:103px; width:206px" /></p>

<p>Aliasing (a.k.a. jaggies) can be countered by anti-aliasing schemes&nbsp;in which pixels are drawn in varying shades of gray and, sometimes, diffused over neighboring pixels to yield a smoother-looking image when viewed from sufficient distance, as illustrated by the picture at the top of this page.</p>

<p>One scheme for anti-aliasing lines works on the idea of shading two&nbsp;pixels at a time for each value for each x. Given a point (x, y) where y = mx + b, let y<sub>w</sub> be the &ldquo;whole part&rdquo; of y (the largest integer that is less than or equal to y) and let y<sub>f</sub> be the &ldquo;fractional part&rdquo; of y such that</p>

<p style="text-align:center">y<sub>w</sub> + y<sub>f</sub> = y</p>

<p>For example, if y=23.56, then y<sub>w</sub> =23 and y<sub>f</sub> =0.56. Also,if y=&minus;1.3,then y<sub>w</sub> =&minus;2 and y<sub>f</sub> = 0.7.</p>

<p>Let the gray level of a pixel be a number from 0.0 to 1.0 where 0.0 denotes a pure white pixel and 1.0 denotes a pure black pixel. If y<sub>f</sub> is zero, then shade the pixel (x,y<sub>w</sub>) at a gray level of 1.0. If y<sub>f </sub>is non-zero, then shade the pixel (x, y<sub>w</sub>) at a gray level of 1 &minus; y<sub>f</sub> and shade the pixel (x, y<sub>w </sub>+ 1) at a gray level of y<sub>f</sub> .</p>

<p>Write a program to draw anti-aliased lines according to this scheme.</p>

### 입력

<p>The input set will consist of several cases. Each case is given as a single line, containing two numbers, m and b, denoting the slope and intercept of the line in the formula</p>

<p style="text-align:center">y = mx + b</p>

<p>These numbers will be presented as floating point numbers with no more than 2 digits after the decimal point. m will be in the range 0.00 to 0.50 inclusive and b will be in the range -20.00 to 20.00 inclusive.</p>

<p>A zero value for both m and b signals the end of input and is not plotted.</p>

### 출력

<p>For each line in the input, produce a separate plot consisting of a 20 &times; 20 square of characters. Each character represents a point on the portion of the Cartesian plane defined by 0 &le; x &lt; 20, 0 &le; y &lt; 20. Each character position unrelated to the line is filled with a blank. The line is plotted by filling the appropriate character positions with a character obtained by computing the appropriate gray level as described above, rounding to the closest tenth, and then selecting a character from the following table:</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:500px">
	<tbody>
		<tr>
			<td style="text-align:right">Rounded gray scale:</td>
			<td style="text-align:center">0.0</td>
			<td style="text-align:center">0.1</td>
			<td style="text-align:center">0.2</td>
			<td style="text-align:center">0.3</td>
			<td style="text-align:center">0.4</td>
			<td style="text-align:center">0.5</td>
			<td style="text-align:center">0.6</td>
			<td style="text-align:center">0.7</td>
			<td style="text-align:center">0.8</td>
			<td style="text-align:center">0.9</td>
			<td style="text-align:center">1.0</td>
		</tr>
		<tr>
			<td style="text-align:right">Character:</td>
			<td style="text-align:center">.</td>
			<td style="text-align:center">:</td>
			<td style="text-align:center">-</td>
			<td style="text-align:center">=</td>
			<td style="text-align:center">+</td>
			<td style="text-align:center">t</td>
			<td style="text-align:center">w</td>
			<td style="text-align:center">*</td>
			<td style="text-align:center">#</td>
			<td style="text-align:center">%</td>
			<td style="text-align:center">@</td>
		</tr>
	</tbody>
</table>

<p>The characters, if you have difficulty recognizing them, are: period, colon, hyphen, equals, plus, lower-case T, lower-case W, asterisk, hash, percent, at. y<sub>f</sub> and the gray level must be computed exactly. When rounding the gray level to the closest tenth, break ties by rounding up.</p>

<p>Each line of the plot will be printed as 20 characters, immediately preceded and immediately followed by a vertical bar (&lsquo;|&rsquo;).</p>

<p>After each plot, print a single line containing 22 underscore (&lsquo;_&rsquo;) characters.</p>