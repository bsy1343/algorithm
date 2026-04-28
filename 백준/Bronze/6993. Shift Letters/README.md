# [Bronze II] Shift Letters - 6993

[문제 링크](https://www.acmicpc.net/problem/6993)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 278, 정답: 223, 맞힌 사람: 198, 정답 비율: 81.481%

### 분류

구현, 문자열

### 문제 설명

<p>Bilbo wants to send a message to the dwarves, currently being held prisoners by the Great Goblin. He has a mechanism to get it to the dwarves, but there is a chance that the orcs may intercept the message. So he decides to encrypt the message using a very simple scheme (sucient to fool the orcs, who are not known for their IQs).</p>

<p>ically, he decides to shift the letters in every word in the message toward the right (wrapping around appropriately) by a small number. For example, shifting &ldquo;oakenshield&rdquo; by 3 gives him &ldquo;eldoakenshi&rdquo;, whereas shifting &ldquo;gandalf&rdquo; by 2 gives him &ldquo;lfganda&rdquo;. He chooses to shift every word by a different number of letters, always less than the number of letters in the word.</p>

<p>You are to write a program to help Bilbo encode his message.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 100). After that, each line contains one test case, a word, w, (provided as a String) followed by an integer, n (int). You can assume that: 0 &lt; n &lt; length(w).</p>

### 출력

<p>For each test case, you are to output the word formed by shifting every letter in w to the right by n, and wrapping around to the beginning appropriately. The exact format is shown below in the examples.</p>