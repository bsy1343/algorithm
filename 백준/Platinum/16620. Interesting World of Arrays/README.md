# [Platinum II] Interesting World of Arrays - 16620

[문제 링크](https://www.acmicpc.net/problem/16620)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 20, 맞힌 사람: 15, 정답 비율: 39.474%

### 분류

수학, 다이나믹 프로그래밍, 브루트포스 알고리즘, 조합론, 런타임 전의 전처리

### 문제 설명

<p>Gwen is just about to finish her Ph.D. entitled The Interesting World of Arrays. She studies many different kinds of arrays, but her favourite type is counting arrays. A counting array simply counts the number of times each possible value appears in an array. Formally, [c<sub>0</sub>, c<sub>1</sub>, c<sub>2</sub>, . . . , c<sub>n&minus;1</sub>] is the counting array of A = [a<sub>0</sub>, a<sub>1</sub>, . . . , a<sub>n&minus;1</sub>] if there are c0 zeroes in A, c<sub>1</sub> ones in A, c<sub>2</sub> twos in A, and so on. For example, if A = [4, 1, 2, 0, 2], then its counting is [1, 1, 2, 0, 1]. Counting arrays are not defined unless a<sub>i</sub>&nbsp;is an integer and 0 &le; a<sub>i</sub> &lt; n for all 0 &le; i &lt; n.</p>

<p>The last chapter of Gwen&rsquo;s thesis is on mod-m self-describing arrays. Let A = [a<sub>0</sub>, a<sub>1</sub>, . . . , a<sub>n&minus;1</sub>] be an array with counting array [c<sub>0</sub>, c<sub>1</sub>, . . . , c<sub>n&minus;1</sub>]. For a positive integer m, the array A is a mod-m self-describing array&nbsp;if a<sub>i</sub> &equiv; c<sub>i</sub> (mod m) for all 0 &le; i &lt; n. That is, a<sub>i</sub> and c<sub>i</sub> leave the same remainder when divided by m. For example, consider A = [6, 6, 4, 6, 3, 5, 3] and its counting array [0, 0, 0, 2, 1, 1, 3]. Since they are the same modulo 2 (both become [0, 0, 0, 0, 1, 1, 1]), the array A is said to be a mod-2 self-describing array.</p>

<p>The only thing left to do before Gwen submits her thesis is to compute the number of mod-m self-describing arrays for various values of n and m. Please help compute these numbers.</p>

### 입력

<p>The input consists of a single line containing two integers n (1 &le; n &le; 12), which is the length of the array, and m (2 &le; m &le; 10<sup>9</sup>), which is the modulus.</p>

### 출력

<p>Display the number of mod-m self-describing arrays of length n.</p>