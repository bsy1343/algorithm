# [Gold IV] Apply a Cold Compress - 4776

[문제 링크](https://www.acmicpc.net/problem/4776)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

유클리드 호제법, 구현, 수학, 정수론, 파싱, 문자열

### 문제 설명

<p>Many techniques for compressing digital graphics focus on identifying and describing regions of a single uniform character. Here is a simple technique for compressing black-and-white images (which could be easily extended to color). The basic idea is to repeatedly split the original picture in half, either vertically or horizontally, until each of the resulting sub-pictures contains only a single color.</p>

<p>A rectangular digital graphic is described by a &ldquo;compression-expression,&rdquo; defined as follows: Each compression-expression begins with a two-bit tag, which may be followed by additional compression-expressions depending upon the tag value. The tag values are interpreted as follows:</p>

<p style="margin-left:40px"><strong>00</strong> A square region that consists entirely of black pixels. This region may be a single pixel, a 2x2 square, a 3x3 square, etc., depending upon context.<br />
<strong>11</strong> A square region that consists entirely of white pixels. This region may be a single pixel, a 2x2 square, a 3x3 square, etc., depending upon context.<br />
<strong>10</strong> A horizontal split. This is followed by two compression expressions. The picture produced by a split is formed by taking the pictures denoted by each of those two expressions and placing them along-side one another, the first picture to the left and the second to the right.<br />
Horizontal splits are only possible between two pictures of the same height.<br />
<strong>01</strong> A vertical split. This is followed by two compression expressions. The picture produced by a split is formed by taking the pictures denoted by each of those two expressions and placing them along-size one another, the first picture on the top and the second underneath it.<br />
Vertical splits are only possible between two pictures of the same width.</p>

<p>When interpreting splits, it may be necessary to change the scale of the components to make them compatible. For example, given a 2:6 picture A (i.e., 2 pixels wide, 6 pixels high) and a 3:4 picture B:</p>

<ul>
	<li>A vertical split involving these two is possible only if we scale A by a factor of 3, making it 6:18, and scale B by a factor of 2, making it 6:8. The resulting combined picture would have size 6:26.</li>
	<li>A horizontal split involving these two is possible only if we scale A by a factor of 2, making it 4:12, and scale B by a factor of 3, making it 9:12. The resulting combined picture would have size 13:12.</li>
</ul>

<p>For example, using Xs and &lsquo; &rsquo;s to denote black and white pixels, respectively, the expression &ldquo;00&rdquo; denotes the picture</p>

<pre>
--- 
|X| 
---</pre>

<p>and the expression &ldquo;1000010011&rdquo; denotes</p>

<pre>
    -----
    |XXX|
    |XX |
    -----</pre>

<p>Examination of this format will show that for any given compression-expression, there is some smallest picture that can be denoted by that expression, but the same expression can also denote pictures twice the size of the smallest one, three times the size, etc.</p>

### 입력

<p>Each line of the input will contain a compression-expression, presented as a single line containing an arbitrary number of 0&rsquo;s and 1&rsquo;s. The input ends following the line with the final compression- expression.</p>

<p>All input sets used in this problem will be valid compression-expressions.</p>

### 출력

<p>For each line of input, your should print the smallest black-and-white picture denoted by that expression, drawn in Xs (black) and &lsquo; &rsquo;s (white), as above, and framed in - and | characters as shown in the examples. There should be no characters or whitespace outside your frame except for the newlines terminating each line.</p>

<p>There should be no blank lines in your output.</p>