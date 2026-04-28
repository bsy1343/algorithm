# [Platinum III] Hidden Sequence - 21952

[문제 링크](https://www.acmicpc.net/problem/21952)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

애드 혹, 구현

### 문제 설명

<p>You did it! You have finally made it to the X spot of the treasure map, but, to open the treasure chest, you first need to break the code. On the label attached to the chest, the rules of the game are written: the code is a binary sequence of length N, and in order to find this sequence you&rsquo;re allowed to ask questions of the following type: &ldquo;is S a subsequence of the hidden sequence?&rdquo;</p>

<p>A binary sequence S, with values S<sub>1</sub>, S<sub>2</sub>, &hellip; , S<sub>K</sub> is considered to be a subsequence of the code C, with values C<sub>1</sub>, C<sub>2</sub>, &hellip; , C<sub>N</sub>, if and only if S can be obtained by deleting some of the values of C.</p>

<p>Formally, S is a subsequence of C if and only if there exist K values 1 &le; i<sub>1</sub> &lt; i<sub>2</sub> &lt; ⋯ &lt; i<sub>K</sub> &le; N such that C<sub>i<sub>j</sub></sub> = S<sub>j</sub> for any 1 &le; j &le; N.</p>

<p>You will get a part of the treasure if you succeed in cracking the code. Depending on how short the longest query you&rsquo;ve asked for is, you&rsquo;ll get more or less of the treasure.&nbsp;(which, in our case, is represented by 100 points)</p>

### 입력



### 출력

