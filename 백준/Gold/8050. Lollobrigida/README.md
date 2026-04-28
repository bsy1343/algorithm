# [Gold IV] Lollobrigida - 8050

[문제 링크](https://www.acmicpc.net/problem/8050)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 16, 맞힌 사람: 15, 정답 비율: 53.571%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>A testing track in the factory of hovercrafts is built of standard blocks of different heights. In a perfectly built track, called lollobrigida, there are neither two neighbouring blocks of equal height nor three consecutive blocks with either increasing or decreasing heights.</p>

<p>To express it more formally, let h<sub>1</sub>,&hellip;,h<sub>n</sub> denote the sequence of heights of blocks belonging to a track. If for each 1 &le; i &le; n-2 the following conditions are satisfied:</p>

<ul>
	<li>h<sub>i</sub> &lt; h<sub>i+1</sub>&nbsp;and h<sub>i+1</sub>&nbsp;&gt; h<sub>i+2</sub>&nbsp;or</li>
	<li>h<sub>i</sub> &gt; h<sub>i+1</sub>&nbsp;and h<sub>i+1</sub>&nbsp;&lt; h<sub>i+2</sub>,</li>
</ul>

<p>then we can call such a track lollobrigida.</p>

<p>One cannot build a lollobrigida with the set of blocks of heights: 3,3,3,5,2, because two blocks of height 3 would have to stand side by side or one of the following sequences would have to appear in it: (2,3,5) or (5,3,2), and these are not allowed.</p>

<p>Here is an example of a lollobrigida built with another set of blocks - (3,2,5,2,3,1). One can build also other lollobrigidas with this set</p>

<p>Write a program which reads the number of sets of data from the standard input and for each set:</p>

<ul>
	<li>reads the number of blocks and the height of each block,</li>
	<li>checks if one can build a lollobrigida with this set,</li>
	<li>writes the answer to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer d, 1 &le; d &le; 100, equal to the number of sets of data. In the next line of the standard input the first set of data begins.</p>

<p>In the first line of each set of data there is one integer n, 3 &le; n &le; 1,000,000, which is equal to the number of blocks in this set.</p>

<p>In the following n lines there are heights of blocks. Each line contains one integer h equal to the height of the corresponding block, 1 &le; h &le; 10^9.</p>

<p>Next sets of data follow one after another.</p>

### 출력

<p>The text of the standard output should contain exactly d lines, one for each set of data. One word should be written in the i-th line of the standard output:</p>

<ul>
	<li>TAK (which means YES in Polish), if one can build a lollobrigida, with the i-th set</li>
	<li>NIE (which means NO in Polish), in the other case.</li>
</ul>