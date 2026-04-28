# [Gold III] Christmas presents - 6722

[문제 링크](https://www.acmicpc.net/problem/6722)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 9, 맞힌 사람: 8, 정답 비율: 19.048%

### 분류

배낭 문제, 역추적

### 문제 설명

<p>The local Santa Claus needs help! He has realized that he cannot afford to give every child a present any longer, so he needs your help to select those lucky children that will get a present. He has made a record for each child containing the child&rsquo;s level of excitement and frustration when getting or not getting a present, and now he wants a program that ensures that maximum total satisfaction is reached while preventing the total expenses to exceed his upper limit. The total satisfaction is defined as the sum of all excitements for those children that get presents, minus the sum of frustrations for the others.</p>

### 입력

<p>First line: n &mdash; the number of children (integer less or equal 1000), and p (integer less or equal 1000) &mdash; the expense limit.</p>

<p>Next n lines: 3 integers: price, excitement level and frustration level for each child. You can assume that all the prices, and excitement and frustration levels are nonnegative integers.</p>

### 출력

<p>First line: Total satisfaction. Second line: A string of n zeroes and ones &mdash; 0 means that this child does not get a present, 1 means that s/he gets a present.</p>