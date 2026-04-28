# [Bronze IV] Time to Decompress - 17010

[문제 링크](https://www.acmicpc.net/problem/17010)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3157, 정답: 2736, 맞힌 사람: 2627, 정답 비율: 87.625%

### 분류

구현

### 문제 설명

<p>You and your friend have come up with a way to send messages back and forth.</p>

<p>Your friend can encode a message to you by writing down a positive integer N&nbsp;and a symbol. You can decode that message by writing out that symbol N times in a row on one line.</p>

<p>Given a message that your friend has encoded, decode it.</p>

### 입력

<p>The first line of input contains L, the number of lines in the message.</p>

<p>The next L lines each contain one positive integer less than 80, followed by one space, followed by a (non-space) character.</p>

### 출력

<p>The output should be L lines long. Each line should contain the decoding of the corresponding line of the input. Specifically, if line i+1 of the input contained N x, then line i of the output should contain just the character x printed N times.</p>