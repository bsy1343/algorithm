# [Gold IV] Blue Gene, Jr. - 9976

[문제 링크](https://www.acmicpc.net/problem/9976)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

구현, 재귀, 문자열

### 문제 설명

<p>Inspired by IBM&#39;s Blue Gene project, the CEO of Universal Biological Machinery (UBM), has called on you, UBM&#39;s top software engineer, to develop a program that will calculate the mutation of the Areopagusvirus, a virus discovered on Mars by your company&#39;s privately-subsidized (top-secret) space program.</p>

### 입력

<p>Input to this problem will consist of a (non-empty) series of up to 100 data sets. Each data set will be formatted according to the following description, and there will be no blank lines separating data sets.</p>

<p>A single data set has 3 components:</p>

<ol>
	<li>Start line - A single line, &ldquo;START N&rdquo;, where 1 &lt;= N &lt;= 20.</li>
	<li>Viral code - A sequence of N alphanumeric characters. Alphanumeric characters will consist of an uppercase letter (A-Z) or a digit (0-9).</li>
	<li>End line - A single line, &ldquo;END&rdquo;</li>
</ol>

<p>Following the final data set will be a single line, &ldquo;ENDOFINPUT&rdquo;.</p>

### 출력

<p>For each data set, there will be exactly one output set, and there will be no blank lines separating output sets.</p>

<p>A single output set consists of a single line of the viral code after it has stabilized (through mutating). The viral code will mutate according to the following rules:</p>

<ol>
	<li>Initially the first viral segment to mutate begins with the first alphanumeric character of the viral code and ends with the rightmost alphanumeric character of the code.</li>
	<li>If the first alphanumeric character of a viral segment is a letter (A-Z), that alphanumeric character is considered &quot;unstable&quot;, and will mutate into n, where n is the number of mutations that occur to the viral segment immediately to the unstable alphanumeric character&#39;s right (see #5), unless n is greater than 9, in which case the unstable alphanumeric character will mutate into n % 10. Also, if there is no viral segment immediately to the right of the unstable alphanumeric character, the unstable alphanumeric character will mutate into 0.</li>
	<li>If the first alphanumeric character of a viral segment, n, is a positive number (1-9), that alphanumeric character is also considered &quot;unstable&quot;, and will mutate into n-1. It also causes the viral segment beginning with the alphanumeric character n alphanumeric characters to its right and ending with the rightmost alphanumeric character of the viral code to mutate. If there is no alphanumeric character n alphanumeric characters to its right, then the viral segment immediately to its right (see #5), if one exists, will mutate.</li>
	<li>If the first alphanumeric character of a viral segment is 0, that alphanumeric character is considered &quot;stable&quot;, and will not mutate (the alphanumeric character will remain a 0 and a mutation will not be considered to have occurred).</li>
	<li>A viral segment immediately to the right of an alphanumeric character begins with the alphanumeric character one position to its right and ending with the rightmost alphanumeric character of the viral code.</li>
</ol>