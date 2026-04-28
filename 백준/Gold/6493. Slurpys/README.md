# [Gold IV] Slurpys - 6493

[문제 링크](https://www.acmicpc.net/problem/6493)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 279, 정답: 144, 맞힌 사람: 120, 정답 비율: 57.143%

### 분류

문자열, 재귀, 정규 표현식

### 문제 설명

<p>Recognizing strings based on a set of restrictions is a common computational problem. A Slurpy is a string of characters that has certain properties. Your program will read in strings of characters and output whether or not they are Slurpys. </p>

<p>A Slump is a character string that has the following properties: </p>

<ol>
	<li>Its first character is either a &#39;D&#39; or an &#39;E&#39;. </li>
	<li>The first character is followed by a string of one or more &#39;F&#39;s. </li>
	<li>The string of one or more &#39;F&#39;s is followed by either a Slump or a &#39;G&#39;. The Slump or &#39;G&#39; that follows the F&#39;s ends the Slump. For example DFFEFFFG is a Slump since it has a &#39;D&#39; for its first character, followed by a string of two F&#39;s, and ended by the Slump &#39;EFFFG&#39;. </li>
	<li>Nothing else is a Slump. </li>
</ol>

<p>A Slimp is a character string that has the following properties: </p>

<p>A Slimp is a character string that has the following properties: </p>

<ol>
	<li>Its first character is an &#39;A&#39;. </li>
	<li>If it is a two character Slimp then its second and last character is an &#39;H&#39;. </li>
	<li>If it is not a two character Slimp then it is in one of these two forms: 
	<ul>
		<li>&#39;A&#39; followed by &#39;B&#39; followed by a Slimp followed by a &#39;C&#39;. </li>
		<li>&#39;A&#39; followed by a Slump (see above) followed by a &#39;C&#39;. </li>
	</ul>
	</li>
	<li>Nothing else is a Slimp. </li>
</ol>

<p>A Slurpy is a character string that consists of a Slimp followed by a Slump. </p>

<p>Examples </p>

<ul>
	<li>Slumps: DFG, EFG, DFFFFFG, DFDFDFDFG, DFEFFFFFG</li>
	<li>Not Slumps: DFEFF, EFAHG, DEFG, DG, EFFFFDG</li>
	<li>Slimps: AH, ABAHC, ABABAHCC, ADFGC, ADFFFFGC, ABAEFGCC, ADFDFGC</li>
	<li>Not Slimps: ABC, ABAH, DFGC, ABABAHC, SLIMP, ADGC</li>
	<li>Slurpys: AHDFG, ADFGCDFFFFFG, ABAEFGCCDFEFFFFFG</li>
	<li>Not Slurpys: AHDFGA, DFGAH, ABABCC</li>
</ul>

### 입력

<p>The first line contains an integer N between 1 and 10 describing how many strings of characters are represented. The next N lines each contain a string of 1 to 60 alpha characters.</p>

### 출력

<p>Each of the next N lines of output should consist of either YES or NO depending on whether or not the corresponding input line is a Slurpy.</p>