# [Silver V] Dirty Driving - 5024

[문제 링크](https://www.acmicpc.net/problem/5024)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 151, 정답: 95, 맞힌 사람: 80, 정답 비율: 66.116%

### 분류

구현, 정렬

### 문제 설명

<p>Like all other good drivers, you like to curse, swear and honk your horn at your fellow automobile drivers. Today you&rsquo;re at the rear of a long line, brooding over the others&rsquo; inability to keep proper distance to the car in front. But are you really keeping your own distance?</p>

<p>You have calculated that in order to never have to use your breaks, you must keep a distance to any car x in front of you at least p(n + 1) where n is the number of cars between you and x, and p is an integer constant determined by which of your cars you are currently driving.</p>

<p>Given the value of p and the current distances (in random order) to each of the cars ahead of you, calculate the minimum distance you should be keeping to the car directly in front, in order to not have to use your breaks.</p>

### 입력

<p>A line with 1 &le; n &le; 100000 &ndash; the number of cars ahead of you &ndash; and 1 &le; p &le; 20 &ndash; the deceleration constant.</p>

<p>A single line with n unique integers denoting the current distance to each of the cars ahead of you. Each of these integers are in the interval [1, 10<sup>7</sup>]</p>

### 출력

<p>The minimum distance you must keep to the car directly in front, in order to not have to use your breaks.</p>