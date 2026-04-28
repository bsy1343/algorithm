# [Gold V] Space Alignment - 28154

[문제 링크](https://www.acmicpc.net/problem/28154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 169, 정답: 66, 맞힌 사람: 55, 정답 비율: 46.218%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 스택

### 문제 설명

<p>You are collaborating with a few other programmers on a coding project. To your horror, you discover that some people have been using tabs to indent code while other people have been using spaces to indent code within the same file. Apparently these people didn&#39;t notice that anything was amiss when they did so.</p>

<p>You wish to replace the tabs with spaces so that the file has consistent indenting. Consistent indenting means that for every line at a nesting depth of $k$, $k \ge 0$, the first non-whitespace character in the line should be preceded by exactly $k \cdot i$ spaces, where $i&gt;0$.</p>

<p>Is it possible to replace each tabs with a fixed number of spaces to repair the file and have consistent indenting?</p>

### 입력

<p>The first line of input contains a single integer $n$ ($2 \le n \le 100$), which is the number of lines of code.</p>

<p>Each of the next $n$ lines contains a string, consisting of a sequence of the characters &#39;<strong>s</strong>&#39; (representing a space) and/or &#39;<strong>t</strong>&#39; (representing a tab), followed by a single &#39;<strong>\{</strong>&#39; or &#39;<strong>\</strong>}&#39;. Each line will have at most $1\,000$ characters.</p>

<p>The first line is guaranteed to be a single &#39;<strong>\{</strong>&#39;, the last line is guaranteed to be a single &#39;<strong>\</strong>}&#39;, and the braces throughout the data are guaranteed to match; that is, looking at only those characters as a single string, it is always possible to repeatedly remove a substring &quot;<strong>\{\</strong>}&quot; until you are left with the empty string.</p>

### 출력

<p>Output a single integer, which is the smallest number of spaces greater than zero to replace each tab with and achieve consistent indentation, or $-1$ if it isn&#39;t possible.</p>