# [Platinum V] Corrupted File - 34608

[문제 링크](https://www.acmicpc.net/problem/34608)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 56, 정답: 26, 맞힌 사람: 24, 정답 비율: 48.000%

### 분류

그리디 알고리즘, 많은 조건 분기, 애드 혹, 이분 탐색

### 문제 설명

<p>The WannaLaugh malware is a new computer malware that is spreading on the internet. If a computer is infected by this malware, then the malware will corrupt all files in the computer. A file in a computer contains zero or more bits. The malware corrupts a file by performing zero or more operations. In one operation, the malware randomly picks two consecutive bits and replaces them with a single bit. The new bit is <code>1</code> if both of the replaced bits are <code>1</code>, or <code>0</code> otherwise.</p>

<p>For example, the malware might corrupt a file with bits <code>11011011</code> as follows:</p>

<ol>
<li>The malware picks the first and second bits: <code><strong>11</strong>011011</code> → <code><strong>1</strong>011011</code>.</li>
<li>The malware picks the second and third bits: <code>1<strong>01</strong>1011</code> → <code>1<strong>0</strong>1011</code>.</li>
<li>The malware picks the third and fourth bits: <code>10<strong>10</strong>11</code> → <code>10<strong>0</strong>11</code>.</li>
</ol>

<p>Alternatively, the malware might first pick the third and fourth bits: <code>11<strong>01</strong>1011</code> → <code>11<strong>0</strong>1011</code>.</p>

<p>At the start of the day, you have a file containing $n$ bits, denoted by $B$. You spend the day surfing the internet, including checking on your favorite programming contest website, just like many ICPC contestants would do. At the end of the day, the same file contains $m$ bits, denoted by $C$. You want to determine whether this file could have been corrupted by the WannaLaugh malware, or if it must have changed for other reasons.</p>

### 입력

<p>The first line of input contains one integer $t$ ($1 ≤ t ≤ 10\, 000$) representing the number of test cases. After that, $t$ test cases follow. Each of them is presented as follows.</p>

<p>The first line of input contains two integers $n$ and $m$ ($1 ≤ m ≤ n ≤ 100\, 000$). The second line contains a string with $n$ characters, each is either <code>0</code> or <code>1</code>, representing the bits $B$. The third line contains a string with $m$ characters, each is either <code>0</code> or <code>1</code>, representing the bits $C$.</p>

<p>The sum of $n$ across all test cases in one input file does not exceed $100\, 000$.</p>

### 출력

<p>For each test case, output <code>yes</code> if the file with bits $B$ could have been corrupted by the WannaLaugh malware into bits $C$, or <code>no</code> otherwise.</p>