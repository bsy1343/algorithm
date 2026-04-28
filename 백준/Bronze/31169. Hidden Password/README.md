# [Bronze II] Hidden Password - 31169

[문제 링크](https://www.acmicpc.net/problem/31169)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 142, 정답: 100, 맞힌 사람: 82, 정답 비율: 71.930%

### 분류

구현, 문자열

### 문제 설명

<p>After a successful internship, Bytholomew was hired as a senior cyber-security expert. To lead by example, he decided to finally heed his own advice and use two <em>different</em> passwords for his e-mail and for the Facepalm social media. Unfortunately, remembering two passwords proved too much for him. Moreover, he couldn&#39;t just plainly write the passwords somewhere, as it would be against another of his recommendations. But being a security expert, Bytholomew knew exactly what to do. He chose his favorite integer $d &gt; 0$ and wrote both passwords encoded with Caesar cipher with key $d$.</p>

<p>Pleased with his work, he looked at his notes and the horrible truth dawned on him: after the encoding, the first (e-mail) password became literally the second (Facepalm) password, while the second one turned into the first one. ,,Holy moly!&quot; -- Bytholomew exclaimed, as there was nothing more to say.</p>

<p>Now you too can become a security expert -- knowing the first of Bytholomew&#39;s passwords, guess the second one, if possible.</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 20$). The descriptions of the test cases follow.</p>

<p>Each test case is one word -- the password -- consisting of lowercase English letters, in a separate line. The password has at least $1$ character and at most $200\,000$ characters.</p>

<p>The total number of characters in all passwords does not exceed $1\,000\,000$.</p>

### 출력

<p>For every given password, guess and output the second one in a separate line. If the second password cannot be determined (either because there is no solution or because there is more than one), output a single word <code>NIE</code> instead.</p>

### 힌트

<p>The Caesar cipher means substituting each letter with the one $d$ places down the alphabet, treating alphabet as cyclic if necessary. E.g. for $d = 3$ the letter <code>a</code> is substituted by <code>d</code>, <code>b</code> by <code>e</code>,...., <code>w</code> changes into <code>z</code>, <code>x</code> to <code>a</code>, <code>y</code> to <code>b</code> and <code>z</code> to <code>c</code>.</p>