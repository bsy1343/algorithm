# [Gold V] Difference - 16867

[문제 링크](https://www.acmicpc.net/problem/16867)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 142, 정답: 36, 맞힌 사람: 28, 정답 비율: 32.558%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>A smallest different sequence (SDS) is a sequence of positive integers created as follows: A<sub>1</sub> = r &ge; 1. For n &gt; 1, A<sub>n</sub> = A<sub>n&minus;1</sub> + d, where d is the smallest positive integer not yet appearing as a value in the sequence or as a difference between two values already in the sequence. For example, if A<sub>1</sub> = 1, then since 2 is the smallest number not in our sequence so far, A<sub>2</sub> = A<sub>1</sub> + 2 = 3. Likewise A<sub>3</sub> = 7, since 1, 2 and 3 are already accounted for, either as values in the sequence, or as a difference between two values. Continuing, we have 1, 2, 3, 4, 6, and 7 accounted for, leaving 5 as our next smallest difference; thus A<sub>4</sub> = 12. The next few values in this SDS are 20, 30, 44, 59, 75, 96, . . . For a positive integer m, you are to determine where in the SDS m first appears, either as a value in the SDS or as a difference between two values in the SDS. In the above SDS, 12, 5, 9 and 11 first appear in step 4.</p>

### 입력

<p>Input consists of a single line containing two positive integers A<sub>1</sub> m (1 &le; r &le; 100, 1 &le; m &le; 200 000 000).</p>

### 출력

<p>Display the smallest value n such that the sequence A<sub>1</sub>, . . . , A<sub>n</sub> either contains m as a value in the sequence or as a difference between two values in the sequence. All answers will be &le; 10 000.</p>