# [Silver V] Sequence - 7367

[문제 링크](https://www.acmicpc.net/problem/7367)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 65, 맞힌 사람: 64, 정답 비율: 79.012%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>The sequence&nbsp;1, 1010, 2012, 10021 may not look like an arithmetic sequence, but it is one in base 3. Likewise, the sequence 11, 33, 55 is clearly an arithmetic sequence in base 10, but it is also one in base 6. For this problem, you will be given a sequence of numbers and you must write an Arithmetic Conrmation Machine to determine the smallest base under which the numbers form an arithmetic sequence.</p>

### 입력

<p>Input will consist of multiple problem instances. The first line will contain a single integer 2 &le; n &le; 5 indicating the number of values in the sequence. The next line will contain the n numbers in strictly increasing order, separated by a single blank. A value of n = 0 will terminate the input. All numbers will be positive and made up of the digits 0-9exclusively, and no number will have more than 5 digits.</p>

<p>&nbsp;</p>

### 출력

<p>Output for each instance should consist of one line of either the form</p>

<p>Minimum base = x.</p>

<p>where x is the the smallest base &le; 10 which results in an arithmetic sequence, or you should output</p>

<p>No base &lt;= 10 can be found.</p>