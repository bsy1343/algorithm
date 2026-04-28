# [Bronze III] Cat’s Age - 25815

[문제 링크](https://www.acmicpc.net/problem/25815)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 421, 정답: 344, 맞힌 사람: 290, 정답 비율: 84.058%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>There are several proposals for converting a cat&rsquo;s age to human age. One such approach is as follows:</p>

<ol style="list-style-type: lower-alpha;">
	<li>The first year of cat&rsquo;s age is equivalent to 15 years of human age.</li>
	<li>The second year of cat&rsquo;s age is equivalent to 9 years of human age.</li>
	<li>Every year after the second year of cat&rsquo;s age is equivalent to 4 years of human age.</li>
</ol>

<p>For example, if a cat is 13-year old, the cat would be {(15) + (9) + [(13 &ndash; 2) * 4)]} = 68-year old in human age. Note that the above approach implies:</p>

<ol style="list-style-type: lower-alpha;">
	<li>If a cat is less than one-year old, each month of cat&rsquo;s age will be equivalent to 15 months of human age. For example, if a cat is 5-month old, the cat would be (5 * 15) = 75-month old in human age, which is 6-year-and-3-month old.</li>
	<li>If a cat is older than one year but less than two-year old, each month of cat&rsquo;s age after the first year will be equivalent to 9 months of human age. For example, if a cat is 1-year-and7-month old, the cat would be {(15 years) + [(7 * 9) months]} = {(15 years) + [63 months]} = 20-year-and-3-month old in human age.</li>
	<li>If a cat is beyond 2-year old, each month of cat&rsquo;s age after the second year will be equivalent to 4 months of human age. For example, if a cat is 5-year-and-7-month old, the cat would be {(15 years) + (9 years) + [(5 &ndash; 2) * 4 years] + [(7 * 4) months]} = 38-yearand-4-month old in human age.</li>
</ol>

<p>Given a cat&rsquo;s age, convert it to human age.</p>

### 입력

<p>There is only one input line; it contains two integers: y (0 &le; y &le; 20), indicating the year part of the cat&rsquo;s age and m (0 &le; m &le; 11), indicating the month part of the cat&rsquo;s age.</p>

### 출력

<p>Print two integers indicating the cat&rsquo;s age in human age (years and months). Note that the output value for months should not exceed 11.</p>