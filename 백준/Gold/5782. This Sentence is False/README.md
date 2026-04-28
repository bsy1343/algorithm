# [Gold II] This Sentence is False - 5782

[문제 링크](https://www.acmicpc.net/problem/5782)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 14, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

너비 우선 탐색, 브루트포스 알고리즘, 그래프 이론, 그래프 탐색

### 문제 설명

<p>The court of King Xeon 2.4 is plagued with intrigue and conspiracy. A document recently discovered by the King&rsquo;s Secret Service is thought to be part of some mischievous scheme. The document contains simply a set of sentences which state the truth or falsehood of each other. Sentences have the form &ldquo;Sentence X is true/false&rdquo; where X identifies one sentence in the set. The King&rsquo;s Secret Service suspects the sentences in fact refer to another, yet uncovered, document.</p>

<p>While they try to establish the origin and purpose of the document, the King ordered you to find whether the set of sentences it contains is consistent, that is, if there is a valid truth assignment for the sentences. If the set is consistent, the King wants you to determine the maximum number of sentences which can be made true in a valid truth assignment for the document.</p>

### 입력

<p>The input file contains several instances of documents. Each document starts with a line containing a single integer, N, which indicates the number of sentences in the document (1 &le; N &le; 1000). The following N lines contain each a sentence. Sentences are numbered sequentially, in the order they appear in the input (the first is sentence 1, the second is sentence 2, and so on). Each sentence has the form &ldquo;Sentence X is true.&rdquo; or &ldquo;Sentence X is false.&rdquo;, where 1 &le; X &le; N. The value N = 0 indicates the end of input.</p>

### 출력

<p>For each document in the input your program should output one line. If the document is consistent, your program should print the maximum number of sentences in a valid truth assignment for the document. Otherwise your program should print the word &lsquo;Inconsistent&rsquo;.</p>