# [Silver I] Error Correction - 6586

[문제 링크](https://www.acmicpc.net/problem/6586)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 54, 맞힌 사람: 45, 정답 비율: 73.770%

### 분류

수학, 구현, 애드 혹

### 문제 설명

<p>A boolean matrix has the <em>parity property</em> when each row and each column has an even sum, i.e. contains an even number of bits which are set. Here&#39;s a 4 x 4 matrix which has the parity property:</p>

<pre>
1 0 1 0
0 0 0 0
1 1 1 1
0 1 0 1
</pre>

<p>The sums of the rows are 2, 0, 4 and 2. The sums of the columns are 2, 2, 2 and 2.</p>

<p>Your job is to write a program that reads in a matrix and checks if it has the parity property. If not, your program should check if the parity property can be established by changing only one bit. If this is not possible either, the matrix should be classified as <em>corrupt</em>.</p>

### 입력

<p>The input file will contain one or more test cases. The first line of each test case contains one integer <em>n</em> (n &lt; 100, representing the size of the matrix. On the next <em>n</em> lines, there will be <em>n</em> integers per line. No other integers than 0 and 1 will occur in the matrix. Input will be terminated by a value of 0 for <em>n</em>.</p>

### 출력

<p>For each matrix in the input file, print one line. If the matrix already has the parity property, print &quot;OK&quot;. If the parity property can be established by changing one bit, print &quot;Change bit <em>(i,j)</em>&quot; where <em>i</em> is the row and <em>j</em> the column of the bit to be changed. Otherwise, print &quot;Corrupt&quot;.</p>