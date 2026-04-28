# [Silver II] Deranging Hat - 15030

[문제 링크](https://www.acmicpc.net/problem/15030)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 171, 정답: 52, 맞힌 사람: 45, 정답 비율: 36.290%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>In the wizarding world of security, there are two kinds of researcher: the idealist arranging hat and the mercenary deranging hat.</p>

<p>As we learned last year, an arranging hat carefully sorts out any list of letters given to it into ascending order. However, a deranging hat performs the exact opposite function: putting a sorted string of letters back into its original order.</p>

<p>The tool of choice for today&rsquo;s discerning headwear is a sorting network: a sequence of instructions represented by a list of pairs of numbers A<sub>i</sub> and B<sub>i</sub>, meaning that if at step i the A-th item in the string is not already smaller than the B-th item, they should be swapped immediately.</p>

<p>Given a specific word W, output a sorting network that the deranging hat can use to form the word from its original sorted letters.</p>

### 입력

<p>One line containing one string of lowercase Latin letters (&lsquo;a&rsquo;-&lsquo;z&rsquo;), S, containing at most 1000 characters.</p>

### 출력

<p>Output at most 10000 lines, each containing two integers A<sub>i</sub> and B<sub>i</sub> (1 &le; A<sub>i</sub>, B<sub>i</sub> &le; |S|) giving the i-th operation to perform.</p>