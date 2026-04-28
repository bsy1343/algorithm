# [Bronze II] Cedric's Cypher - 9954

[문제 링크](https://www.acmicpc.net/problem/9954)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 355, 정답: 273, 맞힌 사람: 231, 정답 비율: 81.053%

### 분류

구현, 문자열

### 문제 설명

<p>A Caesar cipher is a way of encrypting text. Each letter in the text is replaced by the letter s places after it in the alphabet. S is called the shift &ndash; with a shift of 5, for example, &#39;A&#39; becomes &#39;F&#39;, &#39;H&#39; becomes &#39;M&#39; and &#39;Y&#39; becomes &#39;D &#39;(the alphabet wraps round so &#39;A&#39; follows &#39;Z&#39;). The text is easy to decrypt if you know the value of s.</p>

<p>Cedric has come up with a variation on this. Instead of telling his friends what the shift is, he encrypts the letter &#39;A&#39; (always producing an upper case letter) and places it at the end of his message. In that way, they can work out what the shift is and thus decrypt the text.</p>

### 입력

<p>Input will consist of a number of lines of text, terminated by a line consisting of only #. Each line will consist of up to 255 characters of encrypted text (including the encrypted &#39;A&#39;).</p>

### 출력

<p>Output will be one line for each line of input containing the decrypted text. The final letter &#39;A&#39; should NOT be included. Punctuation, spaces, digits and any other non-letter characters are output unchanged.</p>