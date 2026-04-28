# [Platinum IV] ŽABE - 2880

[문제 링크](https://www.acmicpc.net/problem/2880)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

애드 혹, 수학, 정수론

### 문제 설명

<p>The Frog Regent has arranged his N frog servants in a circle, with each frog facing the back of the next one. Each frog is assigned a unique integer identifier (ID) from the set of 1 to N. The frog arrangement is specified as a sequence of IDs. The sequence always starts with the frog with the ID 1. It is followed by the ID of the frog in front of it, then the ID of the next one, and so on until the ID of the last frog - the one <em>behind</em> the frog with ID 1.</p>

<p>A frog is considered to have made a single leap if it has jumped over the frog in front of it, swapping places with it in the process. For example, if the frogs are sequenced as &ldquo;1 5 4 3 2 6&rdquo; and the frog with ID 2 makes two leaps, the resulting sequence will be &ldquo;1 2 5 4 3 6&rdquo; (the frog has shifted two places forward). When the Frog Regent proclaims the number B, the frog with ID B makes B leaps.</p>

<p>The Frog Regent wishes, using some number of proclamations, to rearrange the frogs from the starting sequence to his favourite resulting sequence. Given the starting and resulting frog sequences, write a program that will compute a sequence of proclamations needed for the Regent to rearrange the frogs into the resulting sequence. Naturally, the starting and resulting sequences will not be equal.</p>

### 입력

<p>The first line of input contains a positive integer N, the number of frogs (3 &le; N &le; 100).</p>

<p>The second line of input contains a permutation of the first N positive integers, the starting frog sequence.</p>

<p>The third line of input contains another permutation of the first N positive integers, the resulting frog sequence.</p>

### 출력

<p>Output any sequence of integers (one integer per line) that the Frog Regent can proclaim in order to rearrange the frogs into the resulting sequence.</p>

<p>The number of proclamations must not exceed 100 000.</p>

<p>Note: The test data will ensure that a solution will always exist.</p>