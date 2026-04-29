# [Platinum V] Closest Equal Pair - 34784

[문제 링크](https://www.acmicpc.net/problem/34784)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 8, 맞힌 사람: 7, 정답 비율: 31.818%

### 분류

그리디 알고리즘, 스택, 자료 구조

### 문제 설명

<p>Shima has opened an art museum! He is very proud of his art museum, which is most well-known for its nanoblob exhibit featuring $n$ nanoblobs of various colors lined up in a row. The nanoblobs are very neatly arranged - specifically, the gap between two adjacent nanoblobs is exactly $10^9$ nanometers, or $1$ meter.</p>

<p>One day, Jerry the museum reviewer comes in to evaluate Shima's nanoblob exhibit. His evaluation process is a little peculiar. He starts by taking several pictures of the nanoblob exhibit. He is so specific about his picture taking that the following is true:</p>

<ul>
<li>If two nanoblobs are in a picture, then all nanoblobs in between them are also in the picture.</li>
<li>No two pictures contain exactly the same collection of nanoblobs.</li>
<li>It is not possible for Jerry to take another picture of the exhibit without violating one of the previous two conditions. </li>
</ul>

<p>Having taken all of these pictures, Jerry now evaluates each picture, giving each one a score. If all of the nanoblobs in a picture are distinct colors, the score of the picture is zero. Otherwise, Jerry identifies all pairs of nanoblobs that are the same color, finds the pair that are closest together, and gives the picture a score equal to the number of meters apart that these two nanoblobs are.</p>

<p>Jerry doesn't have time to manually do this for every picture, so he outsources it to you, his helpful assistant. Compute the sum of the scores of all of Jerry's pictures!</p>

### 입력

<p>The first line of input contains an integer $n$ ($1\le n\le 4\cdot 10^5$) --- the number of nanoblobs.</p>

<p>The next line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1\le a_i \le n$ for all $i$), the colors of the nanoblobs in order from left to right.</p>

### 출력

<p>Output one integer: the sum of the scores of all of Jerry's pictures.</p>