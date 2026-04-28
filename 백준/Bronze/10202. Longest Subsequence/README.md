# [Bronze II] Longest Subsequence - 10202

[문제 링크](https://www.acmicpc.net/problem/10202)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 214, 정답: 177, 맞힌 사람: 158, 정답 비율: 84.043%

### 분류

구현, 문자열

### 문제 설명

<p>Gru and Lucy are trying to break into El Macho&rsquo;s lair. They arrive at a hallway that they need to walk across, which is likely booby-trapped. The hallway is a single line of squares, each of which is annotated either X or O. Gru believes that the only &ldquo;safe&rdquo; squares are the ones that comprise the longest subsequence of X&rsquo;s, i.e., the longest contiguous set of squares that are all annotated X.</p>

<p>Your goal is to help Gru find the safe squares to jump on.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 100). After that, each line contains one test case: the first number is the number of entries in the sequence, n (provided as an int), and the next n Strings (which can only be &ldquo;X&rdquo; or &ldquo;O&rdquo;) are the sequence itself.</p>

### 출력

<p>For each test case, you are to find the longest subsequence of consecutive X&rsquo;s, and output the number of X&rsquo;s in that sequence. The exact format is shown below in the examples.</p>