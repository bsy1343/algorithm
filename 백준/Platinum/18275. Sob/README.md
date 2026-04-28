# [Platinum I] Sob - 18275

[문제 링크](https://www.acmicpc.net/problem/18275)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 39, 맞힌 사람: 39, 정답 비율: 63.934%

### 분류

수학, 애드 혹, 분할 정복

### 문제 설명

<p>It was a dark and dreary Christmas Eve when our hero pondered, weak and weary, over a quaint and curious COCI task. When he nodded, nearly napping, suddenly he heard a tapping, tapping and a mighty roar. A giant reindeer broke through his chamber door, merely this and nothing more. While our hero&rsquo;s heart slightly fluttered, the beast simply uttered: &ldquo;I won&rsquo;t leave until you solve this problem&rdquo;.</p>

<p>In the problem you were given two integers N and M and you were supposed to perfectly match the numbers from sets A = {0, 1, 2, . . . , N &minus; 1} and B = {M, . . . , M + N &minus; 1} into N pairs, such that for the matched numbers x &isin; A and y &isin; B it holds x &amp; y = x, where &amp; denotes a bitwise AND operation.</p>

### 입력

<p>The first line contains two integers N and M (1 &le; N &le; M, N + M &le; 10<sup>6</sup>) from the task description.</p>

### 출력

<p>You should output N lines and in each line you should output two integers x and y, where x belongs to set A and y belongs to set B. Numbers in each line should correspond to one of the matched pairs from task description.</p>

<p>It is possible to prove that the solution always exists.</p>