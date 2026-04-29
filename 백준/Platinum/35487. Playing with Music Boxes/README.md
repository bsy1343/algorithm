# [Platinum III] Playing with Music Boxes - 35487

[문제 링크](https://www.acmicpc.net/problem/35487)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

그리디 알고리즘, 매개 변수 탐색, 문자열, 이분 탐색, kmp

### 문제 설명

<p>Jieun wants to play a musical score of length $N$ using<strong> </strong>$K$($K \le N$) music boxes. The score is a string of length $N$ consisting of digits from 0 to 9. She plans to divide the score into $K$ non-empty consecutive segments and assign each segment to one music box, and each music box is assigned to exactly one segment.</p>

<p>Each music box can only play a digit pattern that is stored in it, repeated infinitely. For example, if a music box stores <code>"123"</code>, then it will play the sequence <code>"123123123..."</code>. For each segment, the assigned part of the score must exactly match a prefix of the infinitely repeated sequence played by that music box. For instance, suppose a music box is assigned the segment <code>"12121"</code>. Patterns such as <code>"12"</code>, <code>"1212"</code>, or <code>"12121"</code> can be stored in the box to reproduce this segment, because repeating them produces a sequence whose prefix matches <code>"12121"</code>. However, storing <code>"121"</code> or <code>"1"</code> would result in <code>"121121..."</code> or <code>"11111..."</code>, respectively, which do not match the given segment.</p>

<p>Jieun wants to divide the score into $K$ segments and assign an appropriate pattern to each music box so that the entire score is played correctly. However, if a music box must store a pattern that is too long, it may break. Therefore, <b><strong>she wants to minimize the maximum length of the patterns</strong></b> stored in the music boxes. Your task is to determine the minimum possible value of the maximum pattern length, over all valid ways to divide the score into $K$ segments and assign patterns to the music boxes.</p>

### 입력

<p>The first line contains two integers $N$ and $K$, where $N$ is the musical score length and $K$ is the number of music boxes. ($1 \le N \le 100\,000, 1 \le K \le N$)</p>

<p>The second line contains a string of length $N$ consisting of <b><strong>digits </strong></b>from 0 to 9, representing the musical score.</p>

### 출력

<p>Print a single integer: the minimum possible value of the maximum pattern length stored in any music box when the score is divided into $K$ segments and each segment is assigned an appropriate repeating pattern.</p>

### 힌트

<p>The length of a pattern is defined as the number of digits it contains. For example, <code spellcheck="false">"12"</code> has length $2$, and <code spellcheck="false">"1171"</code> has length $4$.</p>