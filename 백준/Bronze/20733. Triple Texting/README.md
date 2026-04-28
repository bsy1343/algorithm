# [Bronze II] Triple Texting - 20733

[문제 링크](https://www.acmicpc.net/problem/20733)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 258, 정답: 210, 맞힌 사람: 184, 정답 비율: 81.416%

### 분류

문자열

### 문제 설명

<p>Julia enjoys talking to her grandma, playing with legos, and inventing two-player card games where she has a winning strategy. Recently however, she has not been able to talk to her grandma in person because of some kind of &quot;pandemonium&quot;. Instead, they have resorted to texting, which is a very slow process since grandma types very slowly and often mistypes letters. To make matters worse, grandma has started to write every word three times so that Julia can correct her mistypes. For example, if grandma wants to write the word &quot;hello&quot;, she will instead write &quot;hellohellohello&quot;. If she mistypes one of those letters, it might instead be sent as &quot;hellohrllohello&#39;.&#39;</p>

<p>Your task is to write a program that given a message sent by grandma, where possibly one letter has been changed to some other letter, finds the original word.</p>

### 입력

<p>The input consists of one string $s$ containing lower case English letters ($3 \leq |s| \leq 99$). This is the message sent by grandma. It is guaranteed that this string is the result of a word being written three times, where possibly one letter was changed to some other letter.</p>

### 출력

<p>Output one string $t$, the original word.</p>