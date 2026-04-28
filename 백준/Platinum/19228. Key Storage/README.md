# [Platinum IV] Key Storage - 19228

[문제 링크](https://www.acmicpc.net/problem/19228)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 50, 맞힌 사람: 37, 정답 비율: 52.113%

### 분류

조합론, 수학

### 문제 설명

<p>Karl is developing a key storage service. Each user has a positive integer key.</p>

<p>Karl knows that storing keys in plain text is bad practice. So, instead of storing a key, he decided to store a fingerprint of a key. However, using some existing fingerprint algorithm looked too boring to him, so he invented his own one.</p>

<p>Karl&#39;s fingerprint is calculated by the following process: divide the given integer by 2, then divide the result by 3, then divide the result by 4, and so on, until we get a result that equals zero (we are speaking about integer division each time).&nbsp; The fingerprint is defined as the multiset of the remainders of these divisions.&nbsp;</p>

<p>For example, this is how Karl&#39;s fingerprint algorithm is applied to the key 11: 11 divided by 2 has remainder 1 and result 5, then 5 divided by 3 has remainder 2 and result 1, and 1 divided by 4 has remainder 1 and result 0. Thus, the key 11 produces the sequence of remainders $[1, 2, 1]$ and has the fingerprint multiset $\{1, 1, 2\}$.</p>

<p>Ksenia wants to prove that Karl&#39;s fingerprint algorithm is not very good. For example, she found that both keys 178800 and 123456 produce the fingerprint of $\{0, 0, 0, 0, 2, 3, 3, 4\}$. Thus, users are at risk of fingerprint collision with some commonly used and easy to guess keys like 123456.</p>

<p>Ksenia wants to make her words more persuasive. She wants to calculate the number of other keys that have the same fingerprint as the keys in the given list of some commonly used keys. Your task is to help her.</p>

### 입력

<p>The first line contains an integer $t$ ($1 \le t \le 50\,000$) --- the number of commonly used keys to examine.&nbsp; Each of the next $t$ lines contains one integer $k_i$ ($1 \le k_i \le 10^{18}$) --- the key itself.&nbsp;</p>

### 출력

<p>For each of the keys print one integer --- the number of other keys that have the same fingerprint.&nbsp;</p>

### 힌트

<p>The other key with the same fingerprint as 11 is 15. 15 produces a sequence of remainders $[1, 1, 2]$. So both numbers have the fingerprint multiset $\{1, 1, 2\}$.</p>