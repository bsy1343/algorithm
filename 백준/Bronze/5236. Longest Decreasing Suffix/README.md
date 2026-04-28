# [Bronze II] Longest Decreasing Suffix - 5236

[문제 링크](https://www.acmicpc.net/problem/5236)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 285, 정답: 163, 맞힌 사람: 146, 정답 비율: 57.031%

### 분류

구현, 문자열

### 문제 설명

<p>Sam has discovered a possible communication pathway to the external world that was likely left open by Clu, but he needs to find the correct password to check if it still works. He also knows that Clu has trouble remembering the passwords to all the millions of gates in the Grid world, and usually writes down the passwords somewhere close by. However, Clu does not write down the password directly, but encodes the password in multiple strings written on a wall next to the gate. The first step in decoding the password is to find the longest decreasing suffix (LDS) of every string written on the wall; Sam knows how to go about constructing the password afterwards, but needs your help with this first step.</p>

<p>A decreasing suffix of a string is a suffix such that each character in the suffix is larger than the next character. The LDS of a string is the longest such suffix. For example, for string &ldquo;abcdbca&rdquo;, the LDS is &ldquo;ca&rdquo;, whereas for the string &ldquo;abcdljksdflkjzfcba&rdquo;, it is &ldquo;zfcba&rdquo;.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&le; 50). After that, each line contains an input string of length &lt; 100 characters. You can assume that the input strings will only contain lowercase characters from a to z.</p>

### 출력

<p>For each test case, find the longest decreasing suffix of the input string and print it out as shown below in the example.</p>