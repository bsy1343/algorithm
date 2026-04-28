# [Platinum V] High Load Database - 18074

[문제 링크](https://www.acmicpc.net/problem/18074)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 94, 정답: 49, 맞힌 사람: 42, 정답 비율: 66.667%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>Henry profiles a high load database migration script. The script is the list of n transactions. The i-th transaction consists of ai queries. Henry wants to split the script to the minimum possible number of batches, where each batch contains either one transaction or a sequence of consecutive transactions, and the total number of queries in each batch does not exceed t.</p>

<p>Unfortunately, Henry does not know the exact value of t for the production database, so he is going to estimate the minimum number of batches for q possible values of t: t<sub>1</sub>, t<sub>2</sub>, . . . , t<sub>q</sub>. Help Henry to calculate the number of transactions for each of them.</p>

### 입력

<p>The first line contains a single integer n &mdash; the number of transactions in the migration script (1 &le; n &le; 200 000).</p>

<p>The second line consists of n integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> &mdash; the number of queries in each transaction (1 &le; a<sub>i</sub>; &sum;a<sub>i</sub> &le; 10<sup>6</sup>).</p>

<p>The third line contains an integer q &mdash; the number of queries (1 &le; q &le; 100 000). The fourth line contains q integers t<sub>1</sub>, t<sub>2</sub>, . . . , t<sub>q</sub> (1 &le; t<sub>i</sub> &le; &sum;a<sub>i</sub>).</p>

### 출력

<p>Output q lines. The i-th line should contain the minimum possible number of batches, having at most ti queries each. If it is not possible to split the script into the batches for some ti , output &ldquo;Impossible&rdquo; instead.</p>

<p>Remember that you may not rearrange transactions, only group consecutive transactions in a batch.</p>