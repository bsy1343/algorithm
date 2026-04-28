# [Gold V] The Still Embarrassed Cryptographer - 11115

[문제 링크](https://www.acmicpc.net/problem/11115)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 113, 정답: 58, 맞힌 사람: 51, 정답 비율: 54.255%

### 분류

수학, 그래프 이론, 문자열, 정수론, 순열 사이클 분할

### 문제 설명

<p>The not so young any more, but still very promising cryptographer B&oslash;rge is implementing a new security module for his company. There were a lot of problems with the old module last time B&oslash;rge was on holiday, as nobody could understand his code. So his boss have ordered him to keep this new module much simpler.</p>

<p>In this system the secret encryption key is an injective function c from the alphabet onto itself, such that for a string S = s<sub>1</sub> . . . s<sub>m</sub>, we have crypt(S) = c(s<sub>1</sub>). . . c(s<sub>m</sub>). The secret decryption key c<sup>&minus;1</sup> has the property c<sup>&minus;1</sup>(c(s)) = s, and is used in the decryption crypt<sup>&minus;1</sup>(T) = c<sup>&minus;1</sup>(t<sub>1</sub>). . . c<sup>&minus;1</sup>(t<sub>m</sub>). B&oslash;rge&rsquo;s functions crypt() and crypt<sup>&minus;1</sup>() send each symbol with a Remote Procedure Call to where the secret keys are stored, deep inside a mountain.</p>

<p>A problem is that crypt<sup>q</sup>(crypt(S)) = S for some q, and the eager cracker can just keep on applying crypt() on the encrypted message until he gets a readable message. To make the system totally safe, B&oslash;rge wants to make crypt() throw a <code>SecurityExceptionInAmundsCodeReally</code> if q is a small number. Help B&oslash;rge implement this function.</p>

### 입력

<p>The first line of input gives 1 &le; n &le; 100, the number of test cases. Each test case consists of two lines, containing original string S and the encrypted string T respectively, such that crypt(S) = T. You have 1 &le; |S| = |T| &le; 1000. The strings are from the alphabet &ldquo;A&rdquo;. . . &ldquo;Z&rdquo;. The encryption function c is different in each test case.</p>

### 출력

<p>For each test case, output a line with the number q, or &ldquo;mjau&rdquo;, if this cannot be decided just from S and T.</p>