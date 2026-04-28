# [Gold V] Modified Gray Code - 30547

[문제 링크](https://www.acmicpc.net/problem/30547)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 21, 맞힌 사람: 20, 정답 비율: 80.000%

### 분류

자료 구조, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30547.%E2%80%85Modified%E2%80%85Gray%E2%80%85Code/d4668f08.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30547.%E2%80%85Modified%E2%80%85Gray%E2%80%85Code/d4668f08.png" data-original-src="https://upload.acmicpc.net/7e4a0969-259b-4245-811c-87926c6584b5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 224px; height: 156px;" /></p>

<p>The Gray Code is a well-known binary sequence in which successive elements differ by only one bit, and the bit chosen to be switched yields the smallest normal binary value not yet used.  The first element of the sequence is the binary sequence corresponding to 0. For example, the 3-bit Gray Code sequence is 000, 001, 011, 010, 110, 111, 101, 100.  So the element at index 0 is 000, the element at index 4 is 110, and so on.</p>

<p>We want to modify the Gray Code so that successive elements differ by an even number of bits, but again the bits selected to be changed should yield the smallest normal binary value not yet used.  We call this the even Gray code.  Here are the first 3 elements of the 5-bit even Gray Code:</p>

<pre>
0   0 0 0 0 0
1   0 0 0 1 1     (2 bits switched &ndash; positions 1 and 2)
2   0 0 1 0 1     (2 bits switched &ndash; positions 2 and 3)</pre>

<p>Given an index $K$, give the element at index $K$ in the 10-bit even Gray Code.</p>

### 입력

<p>The first line of input consists of an integer $N$ ($1\le N\le 500$), which is the number of queries that will be made.  The remaining $N$ lines each contains a positive integer $K$ ($1 \leq K \leq 500$) representing the index of the 10-bit even Gray Code.</p>

### 출력

<p>For each input query, print the 10-bit representation of the corresponding even Gray Code element. There may be leading 0&#39;s but there should be no spaces between the digits.</p>