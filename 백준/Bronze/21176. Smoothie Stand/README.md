# [Bronze I] Smoothie Stand - 21176

[문제 링크](https://www.acmicpc.net/problem/21176)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 141, 정답: 97, 맞힌 사람: 87, 정답 비율: 67.969%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>Olivia runs a very famous and profitable smoothie stand. On any given day, she will always sell out (that is, she will sell as many smoothies as she has ingredients to make), regardless of what smoothie recipe she offers. Therefore, to simplify things, she has decided she will only make one type of smoothie per day. Now she has come to you to help her decide which of her recipes she should use today, given the ingredients she has on hand and the sale price of each type of smoothie.</p>

### 입력

<p>The first line contains two integers $k$&nbsp;and&nbsp;$r$, separated by a space. The value&nbsp;$k$&nbsp;is the number of different ingredients Olivia uses in her smoothies and&nbsp;$r$&nbsp;is the number of different recipes she makes. You may assume $1 \le k \le 100\,000$, $1 \le r \le 100\,000$, and $1 \le kr \le 100\,000$. The second line contains&nbsp;$k$&nbsp;integers, which represent the amount of each ingredient she currently has on hand. This is followed by&nbsp;$r$&nbsp;lines, each of which represents a recipe. On each such line, the first&nbsp;$k$&nbsp;space-separated integers represent the amount of each ingredient used in that recipe. This is followed by one integer representing the price charged for one smoothie of that recipe.</p>

<p>You may assume that all values, except possibly&nbsp;$k$&nbsp;and&nbsp;$r$, are nonnegative integers less than or equal to&nbsp;$10^4$. It is guaranteed that each recipe uses at least one ingredient.</p>

### 출력

<p>Output the largest total sales revenue that can be obtained by choosing a single recipe and making as many of that recipe as possible.</p>