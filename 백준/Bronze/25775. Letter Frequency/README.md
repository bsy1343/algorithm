# [Bronze I] Letter Frequency - 25775

[문제 링크](https://www.acmicpc.net/problem/25775)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 190, 정답: 148, 맞힌 사람: 124, 정답 비율: 81.579%

### 분류

구현, 자료 구조, 문자열, 집합과 맵

### 문제 설명

<p>The most common consonants in English are R, T, N, S, and L. The most common vowels are E, A, and I. It is definitely fun to find the most common letters.</p>

<p>Given a set of words, find the letter that occurs the most in each position. That is, the most frequent letter at Position 1 when considering all the words, the most frequent letter at Position 2 when considering all the words, etc. If more than one letter is the most frequent for a particular position (i.e., ties for max at that position), print those letters in alphabetical order.</p>

### 입력

<p>The first input line contains an integer, n (1 &le; n &le; 20), indicating the number of words. Each of the next n input lines contains a word. Assume that each word contains 1-30 lowercase letters and it starts in column one.</p>

### 출력

<p>Print each position and the letter(s) that occur the most in that position, following the format illustrated in Sample Output. Note that each output line starts with a number, immediately followed by a colon (&lsquo;:&rsquo;), followed by a space, followed by a letter. If there are multiple letters for an output line, they are separated by exactly one space.</p>