# [Bronze I] Latin Squares - 15117

[문제 링크](https://www.acmicpc.net/problem/15117)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 307, 정답: 186, 맞힌 사람: 165, 정답 비율: 60.886%

### 분류

구현, 문자열

### 문제 설명

<p>A Latin Square is an n-by-n array filled with n different digits, each digit occurring exactly once in each row and once in each column. (The name &ldquo;Latin Square&rdquo; was inspired by the work of Leonhard Euler, who used Latin characters in his papers on the topic.)</p>

<p>A Latin Square is said to be in reduced form if both its top row and leftmost column are in their natural order. The natural order of a set of digits is by increasing value.</p>

<p>Your team is to write a program that will read an n-by-n array, and determine whether it is a Latin Square, and if so, whether it is in reduced form.</p>

### 입력

<p>The first line of input contains a single integer n (2 &le; n &le; 36). Each of the next n lines contains n digits in base n, with the normal digits &lsquo;0&rsquo; through &lsquo;9&rsquo; for digit values below 10 and uppercase letters &lsquo;A&rsquo; through &lsquo;Z&rsquo; representing digit values 10 through 35. All digits will be legal for base n; for instance, if n is 3, the only legal characters in the n input lines describing the square will be &lsquo;0&rsquo;, &lsquo;1&rsquo;, and &lsquo;2&rsquo;.</p>

### 출력

<p>If the given array is not a Latin Square, print &ldquo;No&rdquo; on a single line (without quotation marks). If it is a Latin Square, but not in reduced form, print &ldquo;Not Reduced&rdquo; on a single line (without quotation marks). If it is a Latin Square in reduced form, print &ldquo;Reduced&rdquo; on a single line (without quotation marks).</p>