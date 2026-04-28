# [Platinum V] Cezar - 13486

[문제 링크](https://www.acmicpc.net/problem/13486)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 152, 정답: 49, 맞힌 사람: 42, 정답 비율: 31.343%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Mirko has an array of N different​ words that he wants to encrypt using a substitution cypher.</p>

<p>We encrypt the text using a substitution cypher by first choosing a key &ndash; a permutation of the&nbsp;English alphabet. Then we replace all occurrences of letter &lsquo;a&rsquo; with the first letter of the key,&nbsp;all occurrences of letter &lsquo;b&rsquo; with the second letter of the key, and so on until letter &lsquo;z&rsquo;.</p>

<p>Besides the words, Mirko has an array A consisting of numbers from 1 to N given in a certain&nbsp;order (in other words, array A is a permutation of numbers from 1 to N). Mirko wants to pick&nbsp;a key such that the array of words after encrypting and lexicographic sorting corresponds to&nbsp;array A. More precisely, he wants the word initially located at A<sub>i</sub>&nbsp;to be at location i after&nbsp;encryption and sorting.</p>

<p>Let&rsquo;s recall that the lexicographic word order is the order in which the words appear in the&nbsp;dictionary. If we are comparing two words, going from left to right, we search for the first&nbsp;position in both words where the letters differ and, based on that, we determine which word&nbsp;is lexicographically smaller. If word X is the beginning of the word Y, then word X is&nbsp;lexicographically smaller than word Y.</p>

<p>Mirko is currently not in the mood for encrypting, so he kindly asks you to do it for him.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (2 &le; N &le; 100).</p>

<p>Each of the following N lines contains a single word that consists of at most 100 lowercase letters of the English alphabet. The words will be mutually distinct.</p>

<p>The last line contains N integers &ndash; the elements of array A.</p>

### 출력

<p>In the case when a solution doesn&rsquo;t exist, output &ldquo;NE&rdquo;.</p>

<p>Otherwise, output &ldquo;DA&rdquo; in the first line, and in the second line output a word consisting of 26 different letters of the English alphabet &ndash; the key for the substitution cipher.</p>

<p>If multiple solutions exist, output any.</p>

### 힌트

<p>After encrypting, the words become &ldquo;ba&rdquo;, &ldquo;ac&rdquo;, after lexicographic sorting, the array becomes &ldquo;ac&rdquo;, &ldquo;ba&rdquo;,&nbsp;which means the first word ended up in the second spot, and the second word in the first spot.&nbsp;</p>