# [Silver II] Basic - 4339

[문제 링크](https://www.acmicpc.net/problem/4339)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 113, 정답: 35, 맞힌 사람: 18, 정답 비율: 22.785%

### 분류

많은 조건 분기, 구현, 수학, 파싱, 문자열

### 문제 설명

<p>The programming language Ada has integer constants that look like this: 123, 8#123#, 16#abc#. These constants represent the integers 123, 83 (123 base 8) and 2739 (abc base 16). More precisely, an integer may be a decimal integer given as a sequence of one or more digits less than 10, or it may be an integer to some specific base, given as the base followed by a sequence of one or more digits less than the base enclosed by # symbols. Lower case letters from a through f are used as the digits representing 10 through 15. In Ada, the base, if specified, must be a sequence of decimal digits. For this problem, however, the base may be of any form described above so long as it represents an integer between 2 and 16 inclusive.</p>

### 입력

<p>The first line of input contains a positive integer n. n lines follow.</p>

### 출력

<p>For each line of input, output a line &quot;yes&quot; if it is a valid integer constant according to the above rules; otherwise output a line containing &quot;no&quot;. Input lines contain no spaces and are between 1 and 80 characters in length.</p>