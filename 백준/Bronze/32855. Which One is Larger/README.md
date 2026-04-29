# [Bronze II] Which One is Larger - 32855

[문제 링크](https://www.acmicpc.net/problem/32855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 129, 정답: 68, 맞힌 사람: 60, 정답 비율: 60.606%

### 분류

구현, 문자열, 수학, 파싱

### 문제 설명

<p>A question that often confuses a chat bot is:</p>

<blockquote>
<p>$9.9$ or $9.11$, which one is larger?</p>
</blockquote>

<p>Some chat bot would incorrectly state that $9.11$ is larger than $9.9$. Though we are not exactly sure what reasoning is behind that wrong answer, one hypothesis is that the chat bot might have compared the decimal numbers as integer tuples and thought that $(9, 11) &gt; (9, 9)$. Integer tuples $(x_1, y_1)$ and $(x_2, y_2)$ are compared by first comparing $x_1$ against $x_2$, and if they are equal, then comparing $y_1$ against $y_2$.</p>

<p>Your task is to determine given two decimal numbers whether their comparison would confuse a chat bot that may use integer tuple comparison. That is, you want to check if the comparison result would be the same under integer tuple comparison and regular decimal comparison.</p>

### 입력

<p>Input has two lines. Each line has one positive decimal numbers with $1$ to $5$ digits before the decimal point, and $1$ to $5$ digits after the decimal point. There are no leading or trailing zeros (a single zero before or after the decimal point is possible). The two decimal numbers are not equal.</p>

<p>You may assume that the chat bot discards any leading zeros when converting the digits after the decimal point to an integer in a tuple, e.g. $4.01$ converts to $(4, 1)$. Note that it is possible that the two numbers are equal by integer tuple comparison, in which case it is considered to be a different result than the result of a regular decimal comparison.</p>

### 출력

<p>Output the decimal number that is larger if the comparison would be the same under integer tuple comparison and regular decimal comparison. Otherwise, output $-1$.</p>