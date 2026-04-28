# [Gold III] Computer Millionaire - 30003

[문제 링크](https://www.acmicpc.net/problem/30003)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

구현, 다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Computers are playing a game to become a millionaire. Each computer is given 1 euro to begin with and gets 20 questions. If a question contains a palindromic subsequence of 4 or more characters, the amount of money is doubled and then the length of the longest palindromic subsequence is added to it, otherwise the amount of money remains the same.</p>

<p>A palindrome is a string that remains the same when reversed, for example &quot;anna&quot;. Palindromes can be formed by joining neighboring words, for example &quot;\ldots and name \ldots&quot; contains the palindromic subsequence &quot;andna&quot;. Palindromes may also wrap from the end of the question to the beginning, for example &quot;Jane went walking with Jelena&quot; contains the palindromic subsequence &quot;enajane&quot; and &quot;Matti is I ttam&quot; contains the palindromic subsequence &quot;ittammatti&quot;.</p>

<p>When looking for palindromes, comparison of letters should be case-insensitive. Spaces and line breaks should be ignored, but other punctuation does matter.</p>

<p>Write a program that reads the list of questions and outputs the final amount of money.</p>

### 입력

<p>The input will have exactly 20 paragraphs containing only <a href="https://en.wikipedia.org/wiki/ASCII">ASCII</a> characters. Each paragraph is separated from the next by an empty line. A paragraph can contain at most 600 characters.</p>

### 출력

<p>The first and only line of output should contain the final amount of money that is won.</p>