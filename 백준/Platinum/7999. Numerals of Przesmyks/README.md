# [Platinum II] Numerals of Przesmyks - 7999

[문제 링크](https://www.acmicpc.net/problem/7999)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

임의 정밀도 / 큰 수 연산, 다이나믹 프로그래밍, 구현, 문자열

### 문제 설명

<p>In remote past there lived a tribe of Przesmyks (read it: &quot;Pshaesmix&quot;). They were outstanding, for those times, experts in numbers. To write numerals they used only two symbols, &ldquo;+&rdquo; and &ldquo;-&rdquo;, whose ritual meaning is still a subject for historians&#39; research. It is known that Przesmyks were able to write all natural numbers 0,1,2,&hellip;. They used sequences of characters &ldquo;+&rdquo; and &ldquo;-&ldquo; to write numerals, but for religious reasons some of such sequences were forbidden. Every year priests announced how many &ldquo;-&ldquo; characters in a row maximally were allowed in notation of numerals. Depending on the year the bound was from 1 to 113. The way of notation of numerals was stated as follows: All legal sequences of &ldquo;+&rdquo; and &ldquo;-&ldquo; characters were ordered from shorter to longer ones, and sequences of the same length alphabetically (same as in in a dictionary, assuming &ldquo;-&ldquo; preceded &ldquo;+&rdquo;). Sequences ordered that way represented successive numbers 0,1,2,&hellip;. For example if more than one &ldquo;-&ldquo; character in a row were not allowed, then the notation of numerals looked as follows:</p>

<p>&nbsp;&nbsp; &nbsp;0 -&nbsp;&nbsp; &nbsp;4 ++&nbsp;&nbsp; &nbsp;8 ++-<br />
&nbsp;&nbsp; &nbsp;1 +&nbsp;&nbsp; &nbsp;5 -+-&nbsp;&nbsp; &nbsp;9 +++&nbsp;&nbsp; &nbsp;<br />
&nbsp;&nbsp; &nbsp;2 -+&nbsp;&nbsp; &nbsp;6 -++&nbsp;&nbsp; &nbsp;10 -+-+<br />
&nbsp;&nbsp; &nbsp;3 +-&nbsp;&nbsp; &nbsp;7 +-+&nbsp;&nbsp; &nbsp;11 -++-</p>

<p>The notation of numerals changed according to changes in the bound. For example, when two or more &ldquo;-&ldquo; characters in a row were allowed then the number 2 was written as &ldquo;&mdash;&ldquo;. The situation puts contemporary historians to a lot of trouble.</p>

<p>
Write a program which:</p>

<ul>
	<li>reads two bounds of maximal number of &ldquo;-&ldquo; characters in a row that may appear in the notation of numerals, and a set of numbers written in the notation of Przesmyks according to the first bound,</li>
	<li>translates those numbers into the notation of Przesmyks according to the second bound,</li>
	<li>writes the numbers in the new notation.</li>
</ul>

### 입력

<p>In the first line of the standard input there are three positive integers m<sub>1</sub>, m<sub>2</sub> and n, separated by single spaces, 1 &le; m<sub>1</sub>,m<sub>2</sub> &le; 113, 1 &le; n &le; 10. The number m<sub>1</sub> is the bound on the maximal number of &ldquo;-&ldquo; characters in a row that may appear in the notation of numerals in the input data. The number m<sub>2</sub> is the bound on the maximal number of &ldquo;-&ldquo; characters in a row that may appear in the notation of numerals that have to be written out. The number n is the number of numerals that are to be converted. In the following n lines there are n numerals (strings of &lsquo;-&lsquo; and &lsquo;+&rsquo;), one per line. None of those numerals exceeds 1,000 characters.</p>

<p>&nbsp;</p>

### 출력

<p>Your program should write to the standard output. It should write in the successive lines the successive numbers from the input data translated into the notation of Przesmyks according to the bound m2 on the maximal number of &ldquo;-&ldquo; characters in a row.</p>

<p>&nbsp;</p>