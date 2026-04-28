# [Platinum IV] Hardcore Hangman - 26018

[문제 링크](https://www.acmicpc.net/problem/26018)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 133, 정답: 64, 맞힌 사람: 51, 정답 비율: 50.000%

### 분류

애드 혹, 비트마스킹

### 문제 설명

<p>You have probably heard about the game called hangman (and played it as a child). You try to guess a word with as few guesses as possible. In each guess, you suggest a letter, for example an <code>a</code>, and you get all the positions in the word, where an <code>a</code> appears.</p>

<p>That can take quite a few guesses, in particular, if a difficult word was chosen. So, let&#39;s change the game a bit. Instead of guessing just a single letter, any set of letters can be guessed in one turn. As a result you get all positions which contain one of the guessed letters.</p>

<p>If the word is &#39;hangman&#39; and you guess the letters <code>h</code>, <code>z</code> and <code>a</code> in the first turn, you get the positions 1, 2 and 6. Of course, you still don&#39;t know whether there is an <code>h</code>, <code>z</code> or <code>a</code> at these positions, but it has to be one of those three letters.</p>

<p>Your task is to find the hidden word (it is not always a proper English word, but can be any string consisting of lowercase English letters) using at most 7 guesses.</p>

### 입력



### 출력

