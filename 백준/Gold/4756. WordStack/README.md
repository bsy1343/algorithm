# [Gold II] WordStack - 4756

[문제 링크](https://www.acmicpc.net/problem/4756)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

백트래킹, 비트마스킹, 브루트포스 알고리즘, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>As editor of a small-town newspaper, you know that a substantial number of your readers enjoy the daily word games that you publish, but that some are getting tired of the conventional crossword puzzles and word jumbles that you have been buying for years. You decide to try your hand at devising a new puzzle of your own.</p>

<p>Given a collection of N words, find an arrangement of the words that divides them among N lines, padding them with leading spaces to maximize the number of non-space characters that are the same as the character immediately above them on the preceding line. Your score for this game is that number.</p>

### 입력

<p>Input data will consist of one or more test sets.</p>

<p>The first line of each set will be an integer N (1 &le; N &le; 10) giving the number of words in the test case. The following N lines will contain the words, one word per line. Each word will be made up of the characters &rsquo;a&rsquo; to &rsquo;z&rsquo; and will be between 1 and 10 characters long (inclusive).</p>

<p>End of input will be indicated by a non-positive value for N .</p>

### 출력

<p>Your program should output a single line containing the maximum possible score for this test case, printed with no leading or trailing spaces.</p>

<p>&nbsp;</p>