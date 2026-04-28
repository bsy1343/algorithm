# [Gold IV] Hidden Message - 25845

[문제 링크](https://www.acmicpc.net/problem/25845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 29, 맞힌 사람: 27, 정답 비율: 69.231%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>John was reading the local newspaper, and noticed that the phrase &ldquo;chime a cork teen&rdquo; could be split into three sub-phrases &ldquo;eat&rdquo;, &ldquo;more&rdquo;, and &ldquo;chicken&rdquo;. Note that the three sub-phrases combined contain exactly the same letters as the original phrase and the letters in each sub-phrase appear in the same order as they appear in the original phrase. Note also that the number of occurrences of each letter in the three sub-phrases combined is the same as that of the original phrase.</p>

<p>John began to theorize that the newspapers were sending him messages, but you decide to show him that a message like that was not abnormal. You want to determine the number of ways a phrase can be broken down into three words that John finds.</p>

<p>Given three sub-phrases and the original phrase, determine the number of ways the sub-phrases can be formed from the original phrase. The number of ways can be quite large, so determine the number modulo 1,000,000,007.</p>

### 입력

<p>The input consists of four lines. Each of the first three input lines contains 1-100 lowercase letters, representing a sub-phrase. The fourth input line contains 3-300 lowercase letters, representing the original phrase. Note that the sum of the lengths of the three sub-phrases is equal to the length of the original phrase.</p>

### 출력

<p>Print a single integer representing the number of ways to partition the original phrase into three groups where each group is one of the three sub-phrases. Print the count modulo 1,000,000,007.</p>