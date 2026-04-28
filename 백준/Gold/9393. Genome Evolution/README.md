# [Gold II] Genome Evolution - 9393

[문제 링크](https://www.acmicpc.net/problem/9393)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 164, 정답: 30, 맞힌 사람: 30, 정답 비율: 26.786%

### 분류

애드 혹, 집합과 맵

### 문제 설명

<p>Xi, a developmental biologist is working on developmental distances of chromosomes. A chromosome, in the Xi&#39;s simplistic view, is a permutation from n genes numbered 1 to n. Xi is working on an evolutionary distance metric between two chromosomes. In Xi&#39;s theory of evolution any subset of genes lying together in both chromosomes is a positive witness for chromosomes to be similar.</p>

<p>A positive witness is a pair of sequence of the same length A and A&#39;, where A is a consecutive subsequence of the first chromosome, A&#39; is a consecutive subsequence of the second chromosome, and A is a permutation of A&#39;. The goal is to count the number of positive witnesses of two given chromosomes that have a length greater than one.</p>

### 입력

<p>There are several test case in the input. Each test case starts with a line containing the number of genes (2 &le; n &le;&nbsp;3000). The next two lines contain the two chromosomes, each as a list of positive integers. The input terminates with a line containing &quot;0&quot;&nbsp;which should not be processed as a test case.</p>

### 출력

<p>For each test case, output a single line containing the number of positive witness for two chromosomes to be similar.</p>

<p>&nbsp;</p>