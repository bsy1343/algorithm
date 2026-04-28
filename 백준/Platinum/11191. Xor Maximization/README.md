# [Platinum III] Xor Maximization - 11191

[문제 링크](https://www.acmicpc.net/problem/11191)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1141, 정답: 526, 맞힌 사람: 386, 정답 비율: 45.199%

### 분류

수학, 선형대수학, 가우스 소거법, 배타적 논리합 기저 (gf(2))

### 문제 설명

<p>As you might have heard, Gunnar is an old and forgetful researcher. Most of his research is in security and he cares a bit too much about his own security, so for each website he has a different password. It would be very hard for him to remember all passwords, so for every website he only remembers the method he used to create the password.</p>

<p>For one of the very important websites he started with a file containing a long list of non-negative integers. Since he very much likes the operation &oplus; (xor), his password is a xor of some integers in the list. Note that the operation xor is defined on boolean values as 0 &oplus; 0 = 1 &oplus; 1 = 0 and 0 &oplus; 1 = 1 &oplus; 0 = 1. We can then extend this definition to integers, namely we first write the two integers in binary and then do xor for each two corresponding bits in the numbers. For example the xor of 12 = (1100)<sub>2</sub> and 5 = (101)<sub>2</sub> is 9 = (1001)<sub>2</sub>. Instead of addition, we can use the operation xor when summing numbers and we call this modified sum xor-sum.</p>

<p>Gunnar&rsquo;s file contains a list of numbers and he selected a subset of the numbers such that its xor-sum is as large as possible. The resulting number was his password. Unfortunately, he forgot the algorithm to find the subset with the largest xor-sum, so he is asking you for help with restoring his password. Of course, he will not tell you for which website this password is.</p>

### 입력

<p>The first line of input contains an integer n (1 &le; n &le; 100 000): the length of the list of numbers in Gunnar&rsquo;s file. The second line contains n space separated integers a<sub>1</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>18</sup>), the numbers in the file.</p>

### 출력

<p>Output one line with the answer &ndash; the maximal number Gunnar can get by selecting a subset of the list of numbers and calculating the xor-sum of the subset.</p>