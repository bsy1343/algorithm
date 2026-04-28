# [Bronze III] Federal Voting Age - 6845

[문제 링크](https://www.acmicpc.net/problem/6845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 482, 정답: 386, 맞힌 사람: 353, 정답 비율: 81.336%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>For the big election on February 27, 2007, the government has commissioned an electronic voting system, and you have been hired as a sub-subcontractor for this very grand programming project.</p>

<p>Your task is to write the system that determines whether a given person is old enough to vote. The voting age is 18, so given someone&rsquo;s birthday, you must determine whether that person will be 18 years of age on the day of the election.</p>

### 입력

<p>The input will consist of a number n (1 &le; n &le; 100) on a single line, indicating the number of birthdays to evaluate. Then, each of the following n lines, will be of the form y m d, where y is the year of a potential voter&rsquo;s birth (0 &le; y &le; 2007), m (1 &le; m &le; 12) is the month of birth, and d (1 &le; d &le; 31) is the day. It is assured that each birthday is a correct and valid date.</p>

### 출력

<p>For each date in the input, output a line with either &ldquo;Yes&rdquo; if the voter is eligible to vote, or &ldquo;No&rdquo; otherwise.</p>