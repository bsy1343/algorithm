# [Silver I] Lost in Space - 20385

[문제 링크](https://www.acmicpc.net/problem/20385)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 19, 맞힌 사람: 14, 정답 비율: 36.842%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>This program should search for strings in an N by N array of characters. In the context of this problem, a &quot;character&quot; is any printable ASCII character (ASCII values 32 thru 126, inclusive).</p>

### 입력

<p>The input contains the following:</p>

<ul>
	<li>line 1: the value of N (&lt;= 50),</li>
	<li>lines 2 to N+1: N-character-long strings, possibly including blanks, (However please note that since some PC editors automatically truncate trailing blanks, none of the lines in the file SPACE.IN will contain trailing blanks. That is, every line will end with some non-blank character. Leading &amp; imbedded blanks are permissible.)</li>
	<li>lines N+2 through end of file: strings 1 to N characters long, containing no blanks.</li>
</ul>

<p>Lines 2 through N+1 of the file represent the contents of the N by N array, line 2 for row 1, line 3 for row 2, etc.</p>

<p>For Line N+2 and after, you are to determine each (and every) position at which the string appears in the array. &quot;Appears&quot; means that the first character of the string matches the character at the position, and that subsequent characters in the string match the characters in the array (skipping over any blanks in the array) going in any of the eight possible directions E (right), NE (diagonally up and right), N (up), NW (diagonally up and left), W (left), SW (diagonally down and left), S (down), and SE (diagonally down and right). The string you are looking for may not &quot;wrap around&quot; from one edge of the array to another.</p>

### 출력

<p>The output for each string will be:</p>

<ul>
	<li>the string itself</li>
	<li>Either the message &quot;not found&quot; OR A listing of every starting position and direction at which the string is found, using the format: (row,column) - dir [for example, (5,3) - NW]</li>
	<li>a blank line</li>
</ul>

<p>If the string appears more than once, you must report each occurrence. The order in which you report multiple occurrences is not important.</p>