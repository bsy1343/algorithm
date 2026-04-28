# [Platinum I] Necklace - 17187

[문제 링크](https://www.acmicpc.net/problem/17187)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 26, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

다이나믹 프로그래밍, KMP, 문자열

### 문제 설명

<p>Jill and Jane are sisters. Last Christmas each of them got a string consisting of colorful beads. We can describe each color as a letter of the English alphabet (&ldquo;a&rdquo;. . . &ldquo;z&rdquo;), and each string of beads as a word.</p>

<p>The girls would like to create necklaces from their strings. They can turn each string into a necklace by removing some (possibly zero) beads from the ends, and then connecting the ends of the remaining part of the string. The resulting necklace can be rotated and turned over.</p>

<p>The sisters want their necklaces to look exactly the same, and also be as long as possible. What is the maximum length they could achieve?</p>

### 입력

<p>The first and the second line each contain a non-empty sequence consisting of no more than N lowercase characters, the descriptions of Jill&rsquo;s and Jane&rsquo;s strings respectively.</p>

### 출력

<p>The first line should contain a single positive integer: the maximum number of beads each girl&rsquo;s necklace can have in the end. It is guaranteed that a positive length can be achieved.</p>

<p>The second line should contain two integers: the starting positions of the necklaces in Jill&rsquo;s and Jane&rsquo;s string respectively. If there are several possibilities, output any one of them. The positions are numbered left to right starting from 0.</p>