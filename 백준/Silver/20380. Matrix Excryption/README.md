# [Silver I] Matrix Excryption - 20380

[문제 링크](https://www.acmicpc.net/problem/20380)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 25, 맞힌 사람: 23, 정답 비율: 82.143%

### 분류

수학, 구현, 문자열, 선형대수학

### 문제 설명

<p>A simple yet highly effective method of data encryption involves breaking a message into pieces of length n (the final piece is padded with blanks if necessary), where n is a positive integer, and then multiplying each piece, as a column vector, by an n&nbsp;&times; n non-singular integer matrix (there are a few important restriction on the formulation of the matrix, but these are not important for this problem). The resulting column vector form the encoded message. Since it is possible that the resulting column vectors will contain values not representable in the message alphabet, each element is mapped to its equivalent value (mod)k, where k is the number of characters in the message alphabet. (The decryption process is similar but involves the inverse of the encryption matrix.)</p>

<p>For this problem, consider messages which contain only uppercase letters, spaces, and three punctuation characters: commas, periods, and the question marks. Number the letter A . . . Z as 1 . . . 26, respectively, the space 27, the comma 28, the period 29, and the question mark 30. Now consider encrypting the message &quot;SEND HELP.&quot; using the encryption matrix \[M = \begin{bmatrix}1&amp;1&amp;1\\0&amp;-1&amp;2\\1&amp;3&amp;-5\end{bmatrix}\text{.}\]</p>

<p>Since $M$ is a 3&nbsp;&times; 3 matrix, the message will be encoded three characters at a time. The first three characters are &quot;SEN&quot;, represented by the numbers 19 5 14 according to the above scheme. Treating these numbers as a column vector, we compute&nbsp;\[M\begin{bmatrix}19\\5\\14\end{bmatrix} = \begin{bmatrix}38\\23\\-36\end{bmatrix}\text{.}\]</p>

<p>To map the elements of the resulting column vector back to the range 1 . . . 30, 30 is repeatedly added or subtracted to or from each element as necessary until each element is in the proper range (this is a lightly modified form of the modulus operation). Thus, the resulting column vector above becomes 8 23 24, which represents the string &quot;HWX&quot;.</p>

<p>Repeating this process with the next three characters in the message, &quot;D H&quot;, yields an encrypted string of &quot;ISO&quot;. Repeating again with &quot;ELP&quot; yields &quot;CTU&quot;. Finally, we take the final character (A period) along with enough blanks to pad to three characters, and perform the final encoding. So, encoding &quot;.&nbsp; &quot; (a period followed by 2 spaces) yields &quot;W E&quot;. So, the final encrypted message is &quot;HWXISOCTUW E&quot;.</p>

### 입력

<p>The input for this problem consists of several messages to be encrypted as just demonstrated. The first line of input is the dimension d of the matrix which will be used to encrypt the first message (the&nbsp;maximum dimension which will be used in the input file is 10). The next d lines are the rows of the matrix, and the line immediately following the matrix is the message to be encrypted (maximum length is 80 characters). Following this is another matrix and message, and then another, and so on. The end of input is indicated by a 0 for the dimension of the encryption matrix.</p>

<p>The element in the matrix will be integers from the interval [-10,10].</p>

### 출력

<p>The output should consisst of the encrypted text of each message, one message per line, enclosed in single quotes.</p>