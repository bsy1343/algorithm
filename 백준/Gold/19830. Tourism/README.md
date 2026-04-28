# [Gold V] Tourism - 19830

[문제 링크](https://www.acmicpc.net/problem/19830)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 35, 맞힌 사람: 32, 정답 비율: 65.306%

### 분류

애드 혹

### 문제 설명

<p>In Lineland the Ministry of Tourism has decided to prepare a sightseeing route for tourists. There are $n$ cities in Lineland, they are located at a straight road. The cities are enumerated from $1$ to $n$ along this road. Some of these cities contain sights interesting for tourists. Let us introduce the value $a_i$, if the $i$-th city has a sight then $a_i = 1$, otherwise $a_i = 0$. &nbsp;</p>

<p>The sightseeing route for tourists will be chosen by the Ministry of Tourism. You have to provide them with two <em>similar</em> routes to choose from. Each route must visit a continuous segment of cities along the line: $l, l+1, \ldots, r$. Two routes are similar if they visit the same number of cities, and also they visit the same number of cities that have sights.</p>

<p>Your task is two find two similar routes that have the maximum number of visited cities.</p>

### 입력

<p>Input contains a string that consists of characters &quot;<code>0</code>&quot; and &quot;<code>1</code>&quot;. The $i$-th character of the string represents $a_i$. The length of this string is from $3$ to $10^6$. Input contains no spaces.</p>

### 출력

<p>Output four integers: $s_1$, $t_1$, $s_2$ and $t_2$ --- the numbers of the first and the last cities of the first route, and the numbers of the first and the last cities of the second route, respectively. It is guaranteed that the answer always exists.</p>