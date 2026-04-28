# [Platinum III] Mate - 15496

[문제 링크](https://www.acmicpc.net/problem/15496)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 34, 맞힌 사람: 28, 정답 비율: 50.000%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 누적 합

### 문제 설명

<p>Little Mate got an array of lowercase letters from the English alphabet as a present from his parents. In order to have at least some use of such a clever present, he decided to use it for finding rhymes when writing his next song.</p>

<p>To find a specific rhyme, Mate wants to select a word of length D that ends with an array of characters XY, i.e. where the next to last letter is X, and the last Y. Mate&rsquo;s process of selecting a word is by first crossing out some letters in a given sequence, and then merging the letters he didn&rsquo;t cross out into a single word. He wants to know in how many different ways he can cross out the letters so that he meets the given conditions.</p>

<p>The selection of two words is considered distinct if the sets of positions of the crossed-out letters are different.</p>

### 입력

<p>The first line of input contains an array of lowercase letters of the English alphabet S (2 &le; |S| &le; 2000).</p>

<p>The second line of input contains the integer Q (1 &le; Q &le; 500 000), the number of different rhymes for which Mate needs to select words.</p>

<p>Each of the following Q lines contains the integer D (2 &le; D &le; |S|) and an array of lowercase letters of the English alphabet XY from the task.</p>

### 출력

<p>The i th out of Q lines must contain the required number of ways for the i th rhyme. Since that number can be quite large, output only the value modulo 1 000 000 007​.</p>

### 힌트

<p><strong>Clarification of the first test case:</strong></p>

<p>Word of length 2 that ends with &ldquo;na&rdquo; can be obtained in the following ways:</p>

<p><s>b a n a</s> <em><strong>n a</strong></em>​, <s>b a</s> <strong><em>n a</em></strong>​ <s>​n a</s>, <s>b a</s> <em><strong>n</strong></em>​ ​<s>a n</s> <em><strong>a</strong></em>​</p>