# [Silver IV] Time Zone - 18987

[문제 링크](https://www.acmicpc.net/problem/18987)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 273, 정답: 99, 맞힌 사람: 47, 정답 비율: 27.168%

### 분류

수학, 문자열, 사칙연산, 파싱

### 문제 설명

<p>Chiaki often participates in international competitive programming contests. The time zone becomes a big problem.</p>

<p>Given a time in Beijing time (UTC +8), Chiaki would like to know the time in another time zone $s$.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$ ($1 \le T \le 10^5$), indicating the number of test cases. For each test case:</p>

<p>The first line contains two integers $a$, $b$ ($0 \le a \le 23, 0 \le b \le 59$) and a string $s$ in the format of <code>UTC+X</code>, <code>UTC-X</code>, <code>UTC+X.Y</code>, or <code>UTC-X.Y</code> ($0 \le X, X.Y \le 14$).</p>

### 출력

<p>For each test, output the time in the format of $hh:mm$ (24-hour clock).</p>