# [Platinum III] Substitution Mania! - 24812

[문제 링크](https://www.acmicpc.net/problem/24812)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

브루트포스 알고리즘, 자료 구조, 해시를 사용한 집합과 맵, 중간에서 만나기, 집합과 맵

### 문제 설명

<p>Your friend Ben absolutely loves substitution ciphers!</p>

<p>A substitution cipher takes the alphabet and lines up a substitution with it, as shown in the example below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24812.%E2%80%85Substitution%E2%80%85Mania!/7b05cdc7.png" data-original-src="https://upload.acmicpc.net/7817592d-2a71-4c70-b387-97c41cec1b98/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 196px; height: 118px;" /></p>

<p>Then, for each letter of the plaintext, we find that letter in the top row and substitute it with the corresponding letter in the bottom row. The cipher is referred to by the string in the bottom row. &nbsp;In this example, &quot;hello abc&quot; would encrypt to &quot;kpxxt sau&quot; (Ben leaves spaces as spaces so things don&#39;t get too confusing).</p>

<p>Ben always encrypts his messages to you using between $1$ and $12$ substitution ciphers which he applies consecutively because he doesn&#39;t want anyone else getting into your business.</p>

<p>He also gives you the substitution ciphers he uses, but to increase security he doesn&#39;t give them to you at the same time. &nbsp;Unfortunately, sometimes he ends up giving them to you in the wrong order!</p>

<p>Luckily, you have the plaintext and ciphertext of another message that used exactly the same sequence of ciphers. &nbsp;Given this message and the list of ciphers, write a program to decrypt Ben&#39;s latest message!</p>

### 입력

<p>The first line contains $d_0$, the plaintext of the message you have, with $\text{length}(d_0) \leq 10\,000$. The second line contains $e_0$, the ciphertext that corresponds to $d_0$.</p>

<p>The third line contains an integer $1 \leq i \leq 12$, the number of substitution ciphers Ben used.</p>

<p>The following $i$ lines each contain one of the substitution ciphers, each of which is a nonrepeating string of exactly $26$ lowercase letters.</p>

<p>The last line contains $e_1$, the ciphertext of the message you should decrypt.</p>

<p>All lines containing text consist of only lowercase English letters and spaces.</p>

<p>You are guaranteed that there is a unique sequence of applications of the given substitution ciphers that encrypts $d_0$ to $e_0$ in which each of the given ciphers is used exactly once.</p>

### 출력

<p>Output the plaintext $d_1$ obtained after decrypting the ciphertext $e_1$ on a single line.</p>