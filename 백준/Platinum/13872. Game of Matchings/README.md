# [Platinum II] Game of Matchings - 13872

[문제 링크](https://www.acmicpc.net/problem/13872)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 151, 정답: 64, 맞힌 사람: 51, 정답 비율: 56.044%

### 분류

해싱, KMP, 문자열

### 문제 설명

<p>Adam and Carol are having a great time playing the Game of Matchings. The game is played on a string S composed of |S| lowercase English letters, s<sub>1</sub>s<sub>2</sub> . . . s<sub>|S| </sub>. The goal is to find all matchings of a special kind of pattern P in S. The pattern has length N and is defined by a sequence of integers between 1 and 26.</p>

<p>We consider a contiguous substring s<sub>i</sub>s<sub>i+1</sub> . . . s<sub>i+N&minus;1</sub> starting at position i of S a matching of pattern P if there is a mapping from the numbers in P to lowercase English letters such that the pattern is mapped to s<sub>i</sub>s<sub>i+1</sub>...s<sub>i+N&minus;1</sub> but no two distinct numbers are mapped to the same letter.</p>

<p>For instance, if S is &rdquo;awawww&rdquo; and P is [10, 21, 10], the matchings of P are the substrings of S of length three starting at positions 1 and 2: &rdquo;awa&rdquo; and &rdquo;waw&rdquo;. Note that &rdquo;www&rdquo; is not an occurence because pattern numbers 10 and 21 would both map to &rsquo;w&rsquo;.</p>

<p>Adam and Carol lost the answer sheet and are not sure if they are finding all occurrences for some of the strings in the game. Given S and P can you find the number of matchings for them?</p>

### 입력

<p>The first line contains a non-empty string S of at most 5 &times; 10<sup>5</sup> characters. Each character of S is a lowercase English letter from &rsquo;a&rsquo; to &rsquo;z&rsquo;. The second line contains an integer N representing the size of the pattern (1 &le; N &le; |S|). The third line contains N integers P<sub>1</sub>, P<sub>2</sub>, . . . , P<sub>N</sub> denoting the pattern (1 &le; P<sub>i </sub>&le; 26 for i = 1, 2, . . . , N).</p>

### 출력

<p>Output a line with one integer representing the number of matchings of P found in S.</p>