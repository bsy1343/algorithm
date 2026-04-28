# [Bronze III] Dates - 19813

[문제 링크](https://www.acmicpc.net/problem/19813)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 395, 정답: 244, 맞힌 사람: 199, 정답 비율: 59.940%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>One of the problems in dates processing is that there are several formats of writing down dates.</p>

<p>Peter has the task to write a program that processes an array of texts. Some of them have Russian and European format &quot;day.month.year&quot;, while others use American format  --- &quot;month/day/year&quot;.</p>

<p>Here, year is a number from 1 to 9999, which may contain leading zeroes to get 2, 3 or 4 digits, month  --- number from 1 to 12, which may contain leading zero to get 2 digits, day  --- number from 1 to 31, which may contain leading zeros to get 2 digits. Dates can be incorrect (for example there can be &quot;Since 2001 isn&#39;t a leap year, that&#39;s why 29.02.2001  --- incorrect date&quot;).</p>

<p>You&#39;ve got an array of Peters&#39; strings, which correspond to dates. Print each date in two formats: first as &quot;<code>DD.MM.YYYY</code>&#39;, second as &quot;<code>MM/DD/YYYY</code>&quot;.</p>

### 입력

<p>The first line of input contains one integer $n$ ($1 \le n \le 20\,000$).</p>

<p>Each of the following $n$ lines contain one date in format &quot;<code>day.month.year</code>&quot; or &quot;<code>month/day/year</code>&quot;.</p>

### 출력

<p>Print $n$ lines. Each line should contain the date in two formats: first as &quot;<code>DD.MM.YYYY</code>&quot;, second as &quot;<code>MM/DD/YYYY</code>&quot;.</p>