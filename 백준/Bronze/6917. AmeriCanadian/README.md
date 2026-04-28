# [Bronze II] AmeriCanadian - 6917

[문제 링크](https://www.acmicpc.net/problem/6917)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 288, 정답: 152, 맞힌 사람: 125, 정답 비율: 52.743%

### 분류

구현, 문자열

### 문제 설명

<p>Americans spell differently from Canadians. Americans write <code>neighbor</code> and <code>color</code> while Canadians write <code>neighbour</code> and <code>colour</code>. Write a program to help Americans translate to Canadian.</p>

<p>Your program should interact with the user in the following way. The user should type a word (not to exceed 64 letters) and if the word appears to use American spelling, the program should echo the Canadian spelling for the same word. If the word does not appear to use American spelling, it should be output without change. When the user types <code>quit!</code> the program should terminate.</p>

<p>The rules for detecting American spelling are quite naive: If the word has more than four letters and has a suffix consisting of a consonant followed by <code>or</code>, you may assume it is an American spelling, and that the equivalent Canadian spelling replaces the <code>or</code> by <code>our</code>. Note: you should treat the letter <code>y</code> as a vowel.</p>

### 입력



### 출력

