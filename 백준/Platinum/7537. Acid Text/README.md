# [Platinum III] Acid Text - 7537

[문제 링크](https://www.acmicpc.net/problem/7537)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 16, 맞힌 사람: 11, 정답 비율: 14.474%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 파싱, 문자열, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>A couple of months ago the web standards project (WaSP) has come up with a test for modern browsers and their CSS implementation called acid2. This test ensures that all the browsers have similar results when it comes to parsing and displaying cascaded style sheet files (CSS) for HTML. Since you want to beat all the other text-based browsers on standard compliance you directly start implementing the CSS capabilities into your favorite text-browser Lynks.</p>

<p>Your text-browser will be given a set of graphic files and a simplified css-style-sheet. A graphic is defined by a name, height, width and a 2-dimensional array of characters. All characters are to be printed except for the character &rsquo;.&rsquo; which denotes a transparent pixel. Here is an example picture:</p>

<pre>
owl.png 5 7
.-----.
|O...O|
|..v..|
|.&lt;_&gt;.|
.-----.</pre>

<p>Given the style-sheet your task is it to produce the graphical result that the browser is supposed to display. A CSS-file is made up from a number of entries where each entry looks like this:</p>

<pre>
#&lt;id&gt; {
  pos-x : &lt;x&gt; px ;
  pos-y : &lt;y&gt; px ;
  position : &lt;relative = &lt;id of graphic&gt;|absolute&gt; ;
  file : &lt;filename&gt; ;
  layer : &lt;layer-number&gt; ;
}
</pre>

<p>The following rules hold for the CSS-entries:</p>

<ul>
	<li><strong>Lines</strong> Each CSS-entry will be given on exactly 7 lines as in the input above.</li>
	<li><strong>Ordering</strong> Each CSS-entry will contain exactly the 5 attributes <code>pos-x</code>, <code>pos-y</code>, <code>position</code>, <code>file</code> and <code>layer</code>, in this order, each attribute on a separate line.</li>
	<li><strong>Whitespace</strong> There may be zero or more white-spaces (spaces and tabs) at the beginning of lines, at the end of lines or everywhere where the sample above has a space.</li>
</ul>

<p>Here are the rules for composing the picture:</p>

<ul>
	<li><strong>Background</strong> The background is assumed to be black (i.e. just spaces).</li>
	<li><strong>Positioning</strong> The top left corner of the viewing device is assumed to be x : 0, y : 0. Absolute positioning always is based on this top-left corner. Relative positioning information is always based on the topleft pixel of another graphic. There will not be any circular references between CSS elements. All resulting positions will be zero or greater in x and y.</li>
	<li><strong>Layering</strong> Graphics with a higher layer number are to be printed after graphics with a lower layer number. Graphics with the same layer number are to be printed in the order they appear in the CSS.</li>
</ul>

### 입력

<p>The first line of the input is the number of scenarios that will follow. For each scenario the following information is given: The first line contains the number of files to follow (at least one, at most 100), each of which is given by a space separated triple of a filename f, a height h, a width w (1 &le; w, h &le; 100) and then h lines, each with exactly w characters. Following the file definition is a single line with a number m (at least one, at most 500), which is followed by a CSS file of m entries.</p>

<p>You can assume the resulting picture to be at most 1000 x 1000 characters large. All coordinates in CSS entries will be given as integers with an absolute value less than 1000000. All filenames and identifiers are made up from alphanumeric characters and dots only. No two files have the same name and no two identifiers are equal. The layer attribute will be at least 0 and at most 1000000.</p>

### 출력

<p>The output for every scenario begins with a line containing &ldquo;Scenario #i:&rdquo;, where i is the number of the scenario starting at 1. For each scenario print the resulting picture from overlaying all the given graphics following the instructions in the CSS file. Your result for each scenario should be rectangular as small as possible. However, transparent pixels always belong to the resulting picture, even if they are located directly at the border. The top-left corner of the result should always contain position (0, 0). All empty areas should be padded with spaces. Terminate the output for every scenario with a blank line.</p>