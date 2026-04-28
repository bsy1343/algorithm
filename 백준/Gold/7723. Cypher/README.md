# [Gold II] Cypher - 7723

[문제 링크](https://www.acmicpc.net/problem/7723)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 29, 정답: 20, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

수학

### 문제 설명

<p>For some time, the police has been intercepting encrypted messages from a terrorist group, however they have been unable to decrypt them. Last night, during a raid of an abandoned warehouse, they have seized the encryption device. Careful analysis has unveiled its inner workings.</p>

<p>Device&rsquo;s input consists of plain text, which is first converted to lowercase and stripped of anything but latin letters a ... z resulting in string S = s<sub>1</sub>s<sub>2</sub> ... s<sub>n</sub> (making it harder to read). Afterwards, all n cyclical rotations of S (S<sub>1</sub> ... S<sub>n</sub>; S<sub>i</sub> = s<sub>i</sub> ... s<sub>n</sub>s<sub>1</sub> ... s<sub>i&minus;1</sub>) are sorted lexicographically (see example below). The encrypted message then consists of the index i of the original message and a string R made by taking the last letter of each rotation in the given order.</p>

<p>The string abracadabra would be encoded as 3 rdarcaaaabb as shown in the example below.</p>

<pre>
1. aabracadabr = S11
2. abraabracad = S8
3. abracadabra = S1
4. acadabraabr = S4
5. adabraabrac = S6
6. braabracada = S9
7. bracadabraa = S2
8. cadabraabra = S5
9. dabraabraca = S7
10. raabracadab = S10
11. racadabraab = S3</pre>

<p>You have been chosen to write a program to recover the string S given the encrypted message (i, R). The program needs to be efficient as the messages have been rather long. There are rumours the terrorists have been encrypting and sending Koran in a number of European languages in a plot to provoke terror and possibly convert some police officers to islam if they were ever forced to read the decrypted messages.</p>

<p>Given the encrypted message (i, R) on input calculate the original message S.</p>

### 입력

<p>The first line is the number i (1 &le; i &le; n). The second line is the string R of length n (1 &le; n &le; 1 000 000). The decrypted message S is guaranteed to exist and to be unique.</p>

### 출력

<p>Output the string S on a single line.</p>