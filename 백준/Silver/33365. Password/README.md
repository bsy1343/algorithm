# [Silver V] Password - 33365

[문제 링크](https://www.acmicpc.net/problem/33365)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 68, 정답: 46, 맞힌 사람: 37, 정답 비율: 64.912%

### 분류

그리디 알고리즘, 수학

### 문제 설명

<p>After another leak of personal data, the administrator of Pochta.com decided to tighten the rules for employee passwords. Now, each employee's password must consist of exactly $n$ characters, and non-letter characters must occur among every three consecutive characters. Additional restriction is that the non-letter character must be present in the center of the password: one center character if $n$ is odd, or both characters closest to the center if $n$ is even.</p>

<p>For example, for $n = 9$, the following passwords are valid: "<code>p4ss\#or0s</code>", "<code>1a2b34CD5</code>". The password "<code>1234a56bc</code>" is not valid because the fifth character must be non-letter. The password "<code>9ASE\#orkd</code>" is not valid because it contains three letters in a row.</p>

<p>For $n = 6$, the passwords "<code>ab23bc</code>" and "<code>5a428E</code>" are valid. The passwords "<code>111e11</code>" and "<code>4sy1um</code>" are not valid.</p>

<p>The employees now wonder: what is the minimum and maximum number of non-letter characters that can occur in a password of a given length? Help them figure this out.</p>

### 입력

<p>The first line contains an integer $n$: the length of the password ($1 \le n \le 1\,000\,000$).</p>

### 출력

<p>Output two integers separated by a space: the minimum and maximum number of non-letter characters in the password.</p>