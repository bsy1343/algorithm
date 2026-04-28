# [Platinum V] Frodo and the Monster - 11823

[문제 링크](https://www.acmicpc.net/problem/11823)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 114, 정답: 28, 맞힌 사람: 19, 정답 비율: 21.839%

### 분류

수학, 정수론, 이분 탐색, 조합론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Frodo is ﬁghting with the monster, whose heads are numbered sequentially from 1 to K. Monster is cybernetic genome carrier and it&rsquo;s characterised with unusual properties.&nbsp;</p>

<p>If Frodo cuts a head with an odd number X, then Y new heads will appear on this place, where Y is the maximal prime number less than X. If Frodo cuts the ﬁrst head, no new head will appear. It&rsquo;s known, that the monster&rsquo;s neck can not accommodate more than 30000000 heads (it means, that if sum of Y and the count of remaining heads is greater than 30 000 000, then the count of heads will be exactly 30000000).&nbsp;</p>

<p>If Frodo cuts a head with an even number Z, the monster will lose all heads with numbers containing the same number of ones in binary notation as Z. If monster loses all heads, then the ﬁght ends.&nbsp;</p>

<p>After each Frodo&rsquo;s strike (after appearance of new heads as well as after losing of some heads) monster&rsquo;s heads are renumbered starting with 1.&nbsp;</p>

<p>Frodo doesn&rsquo;t have time to examine whether numbers of monster&rsquo;s heads are odd or even and he cuts them unsystematically. Fortunately, he has modern laser sword which memorises numbers of cut heads in the moment of the cut.&nbsp;</p>

<p>The ﬁght was ﬁnished in the evening, but tired Frodo cannot count the heads left.&nbsp;</p>

<p>You need to write a program which counts the number of heads after the ﬁght is ﬁnished.&nbsp;</p>

### 입력

<p>In the ﬁrst line of the input ﬁle there are two space separated integer numbers K (2 &le; K &le; 30000000) and N (2 &le; N &le; 200000), where K is the initial count of monster heads, and N is the number of cuts. Each of the next N lines contains an integer number. These numbers describe the sequence of cutting heads. Head numbers are correct, i. e. they never exceed the total count of monster heads at the moment of the strike.&nbsp;</p>

### 출력

<p>Write to the output ﬁle the count of heads left on the monster&rsquo;s neck after the ﬁght is ﬁnished.&nbsp;</p>

### 힌트

<p>After cutting 5th head, 3 new heads will appear and the total number becomes 9. After cutting 9th head, 7 new heads will appear and the total number becomes 15. After cutting 6th head, monster will also lose heads with numbers 3, 5, 9, 10, 12. And after cutting 4th head, it will lose heads 8, 2, 1. After the ﬁght monster will have 5 heads left.&nbsp;</p>

<p>&nbsp;</p>