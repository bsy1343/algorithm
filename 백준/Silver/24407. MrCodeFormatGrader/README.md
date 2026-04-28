# [Silver IV] MrCodeFormatGrader - 24407

[문제 링크](https://www.acmicpc.net/problem/24407)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 44, 맞힌 사람: 40, 정답 비율: 86.957%

### 분류

구현, 문자열

### 문제 설명

<p>Instructor Bob is building an automatic source code formatting grading website. The name of the website is &ldquo;MrCodeFormatGrader&rdquo;. When you run Bob&rsquo;s program and submit your source code to it, the program will output $C$, the number of lines of source code; $N$, the number of source code lines that have format errors; and a list of line numbers that are not properly formatted. The line numbers are separated by spaces and in increasing order.</p>

<p>So for a $100$-line program, with $10$ errors occurring on lines $2$, $3$, $5$, $10$, $11$, $12$, $25$, $26$, $88$, and $89$, the original program might output this:</p>

<pre>
100 10
2 3 5 10 11 12 25 26 88 89</pre>

<p>However, the people that used this program said that this output is not very readable. Your job is to read the output above and show two lists: a compressed list of errors and another compressed list of correct lines.</p>

### 입력

<p>Input consists of two lines. The first line contains two integers: $C$, the number of lines of source code in the program being checked, where $2 &le; C &le; 100\,000$; and $N$, the number of source code lines containing format errors, where $1 &le; N &le; \min(C, 1\,000)$. The second line of input will contain $N$ values, identifying the line numbers of source code lines with format errors. These values are positive integers less than or equal to $C$ and are listed in strictly increasing order.</p>

### 출력

<p>Output consists of two lines. The first line should start with the string: &ldquo;<code>Errors:</code>&rdquo;, followed by a space, followed by a list of lines with errors. The second line of output should start with the string: &ldquo;<code>Correct:</code>&rdquo;, followed by a space, followed by a list of lines without errors. For both lists, a contiguous set of line numbers should be represented by listing the first and last line, separated by a hyphen (&lsquo;<code>-</code>&rsquo;). In lists with two or more items, items should be separated by a comma and space except for the last value (or last range of contiguous values) of each list, which should be separated with an &ldquo;and&rdquo; instead of a comma and space. See the sample output. Note: every program will have at least one error and at least 1 correct line.</p>