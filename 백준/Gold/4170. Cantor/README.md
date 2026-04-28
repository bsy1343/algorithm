# [Gold III] Cantor - 4170

[문제 링크](https://www.acmicpc.net/problem/4170)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 27, 맞힌 사람: 23, 정답 비율: 52.273%

### 분류

수학, 그래프 이론, 그래프 탐색, 정수론

### 문제 설명

<p>The ternary expansion of a number is that number written in base 3. A number can have more than one ternary expansion. A ternary expansion is indicated with a subscript 3. For example, 1 = 1<sub>3</sub> = 0.222...<sub>3</sub>, and 0.875 = 0.212121...<sub>3</sub>.</p>

<p>The Cantor set is defined as the real numbers between 0 and 1 inclusive that have a ternary expansion that does not contain a 1. If a number has more than one ternary expansion, it is enough for a single one to not contain a 1.</p>

<p>For example, 0 = 0.000...<sub>3</sub> and 1 = 0.222...<sub>3</sub>, so they are in the Cantor set. But 0.875 = 0.212121...<sub>3</sub> and this is its only ternary expansion, so it is not in the Cantor set.</p>

<p>Your task is to determine whether a given number is in the Cantor set.</p>

### 입력

<p>The input consists of several test cases.</p>

<p>Each test case consists of a single line containing a number x written in decimal notation, with 0 &lt;= x &lt;= 1, and having at most 6 digits after the decimal point.</p>

<p>The last line of input is END. This is not a test case.</p>

### 출력

<p>For each test case, output MEMBER if x is in the Cantor set, and NON-MEMBER if x is not in the Cantor set.</p>