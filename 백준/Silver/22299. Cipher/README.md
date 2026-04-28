# [Silver I] Cipher - 22299

[문제 링크](https://www.acmicpc.net/problem/22299)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 18, 맞힌 사람: 15, 정답 비율: 45.455%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>You&#39;ve been tasked with analyzing messages to look for various threats; however, the messages have been encrypted. Luckily, they&#39;re only encrypted using a Caesar cipher, which means that each letter in the plaintext is shifted a fixed number of positions later in the alphabet. The alphabet wraps around, so after&nbsp;<code>z</code>&nbsp;is&nbsp;<code>a</code>, and after&nbsp;<code>Z</code>&nbsp;is&nbsp;<code>A</code>. For instance, the message &quot;How are you?&quot; with a shift of 5 would become &quot;Mtb fwj dtz?&quot;. To decrypt a message, you simply shift the letters in the opposite direction.</p>

<p>For each message, you will need to determine the key (shift value) and the plaintext corresponding to the given ciphertext. To assist you, you will be given lists of known threat words and known non-threat words. Matching against words in these lists is not case sensitive, e.g. &quot;word&quot; matches &quot;Word&quot;. You can assume you guessed the correct key if it results in more known words (threat and non-threat) than any other key. For the purpose of this task, a word is an uninterrupted sequence of&nbsp;<code>1 &le; x &le; 20</code>&nbsp;characters&nbsp;<code>A-Z</code>&nbsp;and/or&nbsp;<code>a-z</code>. All other characters are are not effected by the shift and are the same in the plaintext and the ciphertext. All messages (both plaintext and ciphertext) consist only of printable characters, including space.</p>

### 입력

<p>The first line of input will contain the number of test cases,&nbsp;<code>C</code>&nbsp;(<code>1 &le; C &le; 50</code>). Each test case will begin with a line containing the number of known non-threat words,&nbsp;<code>G</code>&nbsp;(<code>1 &le; G &le; 50</code>). The following&nbsp;<code>G</code>&nbsp;lines will each contain a lower-case non-threat word. The next line will contain the number of known threat words,&nbsp;<code>B</code>&nbsp;(<code>1 &le; B &le; 50</code>). The following&nbsp;<code>B</code>&nbsp;lines will each contain a lower-case threat word. The next line will contain a message of&nbsp;<code>1 &le; y &le; 1000</code>&nbsp;characters of ciphertext. No line will contain any leading or trailing whitespace.</p>

### 출력

<p>Each test case will produce one or two lines of output.</p>

<p>If the key and plaintext can be determined, the first line of output should contain the plaintext message, preserving the case and punctuation of the original ciphertext, and the second line should contain &quot;<code>Shift: S, Match: M%, Threat: T%</code>&quot;, where&nbsp;<code>S</code>&nbsp;(<code>0 &le; S &lt; 26</code>) is the number of characters the plaintext was shifted to encrypt the message,&nbsp;<code>M</code>&nbsp;is an integer indicating what percentage of the words in the plaintext are known words (threat and non-threat), and&nbsp;<code>T</code>&nbsp;is an integer indicating what percentage of the words in the plaintext are threat words. All percentages should be rounded to the nearest 1%.</p>

<p>If the key and plaintext cannot be determined, there should be a single line of output containing &quot;<code>Unable to decipher</code>&quot;.</p>