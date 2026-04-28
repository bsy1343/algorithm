# [Gold I] Colored stones - 7688

[문제 링크](https://www.acmicpc.net/problem/7688)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You are given a row of m stones each of which has one of k different colors. What is the minimum number of stones you must remove so that no two stones of one color are separated by a stone of a different color?</p>

### 입력

<p>The input test file will contain multiple test cases. Each input test case begins with a single line containing the integers m and k where 1 &le; m &le; 100 and 1 &le; k &le; 5. The next line contains m integers x1, . . . , xm each of which takes on values from the set {1, . . . , k}, representing the k different stone colors. The end-of-file is marked by a test case with m = k = 0 and should not be processed.</p>

### 출력

<p>For each input case, the program should the minimum number of stones removed to satisfy the condition given in the problem.</p>

### 힌트

<p>In the above example, an optimal solution is achieved by removing the 2nd stone and the 7th stone, leaving three &ldquo;2&rdquo; stones, three &ldquo;1&rdquo; stones, and two &ldquo;3&rdquo; stones. Other solutions may be possible.</p>