# [Platinum V] New Horizons - 4152

[문제 링크](https://www.acmicpc.net/problem/4152)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

기하학, 3차원 기하학

### 문제 설명

<blockquote>
<p>I&rsquo;m king of a house! And, what&rsquo;s more, beyond that,<br />
I&rsquo;m king of a blueberry bush and a cat!<br />
I&rsquo;m Yertle the Turtle! Oh, marvelous me!<br />
For I am the ruler of all that I see!&quot;</p>
</blockquote>

<p>Yertle has determined that the number of objects he can see, and hence rule, depends on the height of his throne. Your task, as Minister of Computing and Vertigo (a new combined Super Ministry), is to determine which objects Yertle would see should he build his throne to a particular height.&nbsp;</p>

### 입력

<p>Standard input consists of:</p>

<ul>
	<li>A floating point number on a line by itself, specifying the diameter of Yertle&rsquo;s planet in &quot;flipper lengths&quot;.</li>
	<li>A line containing three floating point numbers: the height of Yertle&rsquo;s throne (in flipper lengths), the latitude of Yertle&rsquo;s throne (between -90 and +90 degrees), the longitude of Yertle&rsquo;s throne (between 0 and 360 degrees).</li>
	<li>Several lines, each containing three floating point numbers and a string of alphabetic and space characters. Each line indicates the height, latitude, longitude and name of an object on the surface of Yertle&rsquo;s planet. The last line is indicated by the end of standard input.</li>
</ul>

<p>All distances are in flipper lengths, and all latitudes and longitudes are in degrees. Floating point values are formatted as a string of decimal digits with an optional decimal point and sign. The fields in the input are separated by exactly one space character. You may assume that no object hides another; only the horizon limits Yertle&rsquo;s view.&nbsp;</p>

### 출력

<p>Standard output consists of:</p>

<ul>
	<li>The list of objects whose tops are visible to Yertle, in alphabetical order.</li>
</ul>