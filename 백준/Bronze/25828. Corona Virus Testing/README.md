# [Bronze IV] Corona Virus Testing - 25828

[문제 링크](https://www.acmicpc.net/problem/25828)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1420, 정답: 1160, 맞힌 사람: 1118, 정답 비율: 82.631%

### 분류

수학, 사칙연산

### 문제 설명

<p>Testing for Corona can be done individually, e.g., 100 people require 100 test kits. Alternatively, the test can be done in groups (pools), e.g., 100 people can be divided into five group of 20 people each and then using only one test kid per group. If one or more groups test positive, then individual tests are needed for each person in those group. So, for our example, five groups will need 5 test kits and let&rsquo;s say two groups test positive, so we would need additional 40 (2*20) test kits for a total of 45 (5+40) test kits.</p>

<p>Given the data for the two possible testing approaches, determine which approach will use fewer test kits.</p>

### 입력

<p>There is only one input line; it provides three integers: g (2 &le; g &le; 50), indicating the number of groups, p (2 &le; p &le; 50), indicating the number of people in each group, and t (0 &le; t &le; g), indicating how many groups tested positive (i.e., people in these groups need to be tested individually).</p>

### 출력

<p>Print 1 (one) if testing everyone individually will use fewer kits, 2 (two) if testing in groups will use fewer kits, and 0 (zero) if the two approaches use the same number of kits.</p>