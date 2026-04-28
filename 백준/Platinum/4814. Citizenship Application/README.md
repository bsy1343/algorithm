# [Platinum V] Citizenship Application - 4814

[문제 링크](https://www.acmicpc.net/problem/4814)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 7, 맞힌 사람: 4, 정답 비율: 16.000%

### 분류

많은 조건 분기, 구현

### 문제 설명

<p>In Canada, once you have landed as a permanent resident, you can apply for citizenship if you have lived in Canada for at least 1095 days (approximately 3 years) in the 1460 days (approximately 4 years) immediately prior to the application for citizenship (i.e. the date of application is not counted). Any time travelling outside Canada is not counted as a day living in Canada. Furthermore, if you are already residing in Canada (e.g. to study) before landing as a permanent resident during the 1460-day period, that time in Canada before the landing date (up to 730 days) can be counted as half rounded down (e.g. if the waiting time was 101 days, that can be counted as 50 days). Thus, the starting date of residence is counted as a half day if it occurs before the landing date (assuming that it is not more than 730 days before), or a full day if it coincides with the landing date.</p>

<p>In this problem, you will be determining the first day on which an application for citizenship can be made.</p>

### 입력

<p>The input consists of a number of cases. The first line of each case gives the starting date of residence in the country, and the second line gives the landing date as a permanent resident. The third line gives an integer N (0 &lt;= N &lt;= 100) indicating the number of travels outside of Canada. Each of the next N lines contains two dates separated by a space, indicating the start and end date (inclusive) of travel outside of Canada. That is, you are considered to be outside of Canada from the start date through the end date.</p>

<p>You may assume that the starting date of residence is no later than the landing date. You may also assume that the start date of each travel is no later than the end date, and no travel outside of Canada will be longer than 200 days. Of course, you can assume that your trips do not include the starting date of residence and the landing date, and no two trips overlap. No trips take place before the starting date of residence. All dates are given in the form Month/Day/Year and are valid dates, and no dates in the input will be before January 1, 1980 or after December 31, 2020.</p>

### 출력

<p>For each case, print on one line the date of the first day (in the same format as the input) on which an application for citizenship can be made.</p>