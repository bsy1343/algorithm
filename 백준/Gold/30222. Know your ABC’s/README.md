# [Gold II] Know your ABC’s - 30222

[문제 링크](https://www.acmicpc.net/problem/30222)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 19, 맞힌 사람: 16, 정답 비율: 53.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>UCF has started running a pre-school, where it is teaching all the students their ABC&rsquo;s! Naturally, all of the blocks the kids have to play with have one of the three letters on them. The kids like arranging the blocks, but don&#39;t like any arrangements where two of the same letters are in a row (i.e., right next to each other).</p>

<p>For example, if a kid had 2 A blocks, 3 B blocks and 1 C block, a valid arrangement of the blocks would be BACBAB, but CBABBA would not be valid because the letter B appears twice in a row.</p>

<p>The preschool teacher is wondering: how many different valid orders can the blocks be arranged? Two arrangements are considered different if there is a different letter in the same corresponding positions in the two arrangements.</p>

<p>Given the number of blocks showing the letter A, the number of blocks showing the letter B, and the number of blocks showing the letter C, determine the number of arrangements of all of the blocks in a row, with no two consecutive blocks showing the same letter. Since the answer might be quite large, determine the result modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>There is only one input line; it contains three integers: a (1 &le; a &le; 100), b (1 &le; b &le; 100), and c (1 &le; c &le; 100), representing the number of blocks with the letter A, the number of blocks with the letter B and the number of blocks with the letter C, respectively.</p>

### 출력

<p>Print the number of valid arrangement of all of the blocks in a row without two of the same letter appearing consecutively modulo 10<sup>9</sup> + 7.</p>