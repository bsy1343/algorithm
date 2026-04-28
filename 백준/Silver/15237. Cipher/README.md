# [Silver II] Cipher - 15237

[문제 링크](https://www.acmicpc.net/problem/15237)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 221, 정답: 157, 맞힌 사람: 134, 정답 비율: 73.224%

### 분류

자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Sean is a great code breaker (or thinks he is). He knows any cipher in the world can be broken by frequency analysis, but he has the completely the wrong idea what frequency analysis is, however.</p>

<p>He intercepted an enemy message. The message consists of N numbers, smaller than or equal to C.</p>

<p>Sean believes frequency analysis consists of sorting this sequence so that more frequent numbers appear before less frequent ones. Formally, the sequence must be sorted so that given any two numbers X and Y , X appears before Y if the number of times X appears in the original sequence is larger than the number of time Y does. If the number of appearances is equal, the number whose value appears sooner in the input should appear sooner in the sorted sequence.</p>

<p>Help Sean by creating a &quot;frequency sorter&quot;.</p>

### 입력

<p>First line of input contains two integers, N (1 &le; N &le; 1 000), length of message, and C (1 &le; C &le; 1 000 000 000), the number from task description. Next line contains N integers smaller than or equal to C, message itself.</p>

### 출력

<p>First and only line of output should contain N numbers, the sorted sequence.</p>