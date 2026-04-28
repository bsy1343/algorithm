# [Silver IV] Y2K Accounting Bug - 4391

[문제 링크](https://www.acmicpc.net/problem/4391)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 40, 맞힌 사람: 29, 정답 비율: 54.717%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>Accounting for Computer Machinists (ACM) has sufferred from the Y2K bug and lost some vital data for preparing annual report for MS Inc.</p>

<p>All what they remember is that MS Inc. posted a surplus or a deficit each month of 1999 and each month when MS Inc. posted surplus, the amount of surplus was s and each month when MS Inc. posted deficit, the deficit was d. They do not remember which or how many months posted surplus or deficit. MS Inc., unlike other companies, posts their earnings for each consecutive 5 months during a year. ACM knows that each of these 8 postings reported a deficit but they do not know how much. The chief accountant is almost sure that MS Inc. was about to post surplus for the entire year of 1999. Almost but not quite.</p>

<p>Write a program, which decides whether MS Inc. suffered a deficit during 1999, or if a surplus for 1999 was possible, what is the maximum amount of surplus that they can post.</p>

### 입력

<p>Input is a sequence of lines, each containing two positive integers s and d.</p>

### 출력

<p>For each line of input, output one line containing either a single integer giving the amount of surplus for the entire year, or output Deficit if it is impossible.</p>