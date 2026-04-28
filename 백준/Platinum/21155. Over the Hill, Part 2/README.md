# [Platinum IV] Over the Hill, Part 2 - 21155

[문제 링크](https://www.acmicpc.net/problem/21155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 14, 맞힌 사람: 12, 정답 비율: 27.907%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>Bob Roberts is part of a crack espionage team working for the CIA (Chocolate Institute of Alabama) and he is working on decrypting the encoded messages of their arch rivals at the NSA (Nougat Society of Arkansas). &nbsp;Fortunately, the NSA&#39;s espionage staff is not nearly as crack as Bob&#39;s as they are using the Hill encryption scheme (described in the previous problem) which is susceptible to a known-plaintext attack. &nbsp;Bob has intercepted a plaintext/ciphertext pair and has knowledge of the size of the encryption matrix used by his not-so-sweet enemies. Given these Bob knows that there is a way to determine the encryption matrix, but no one on his staff is exactly sure how (hmmm $\ldots$ not quite as crack as they thought). &nbsp;Bob&#39;s come to you to solve this problem for them. &nbsp;One complication is that there might not be enough data to uniquely determine the NSA&#39;s encryption matrix, and the data they intercepted might have been corrupted leading to no solution to the problem.</p>

### 입력

<p>Input begins with a line containing a positive integer $n \leq 10$ indicating the size of the matrix and the vectors to use in the encryption. &nbsp;After this are two lines: the first of these contains the plaintext and the second the ciphertext. Both of these lines will consist only of characters in the set <code>A</code>, $\ldots$, <code>Z,0</code>, $\ldots$, <code>9</code> and the space character. &nbsp;The lengths of both strings are identical and are multiples of $n$. &nbsp;Both of these strings may include trailing blanks.</p>

### 출력

<p>Output one of three possible answers. &nbsp;If the input does not admit any possible encryption matrix output <code>No solution</code>. &nbsp;Otherwise if the input does not uniquely determine the encryption matrix output <code>Too many solutions</code>. &nbsp;Otherwise output the encryption matrix, one row per line with a single space between values on a line.</p>