# [Gold IV] Getting Rid of Coins - 11185

[문제 링크](https://www.acmicpc.net/problem/11185)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 91, 정답: 17, 맞힌 사람: 17, 정답 비율: 32.692%

### 분류

많은 조건 분기, 그리디 알고리즘

### 문제 설명

<p>When Per was living in New York, he couldn&rsquo;t use his debit card as often as in Sweden. He had to carry cash all the time and his wallet was getting heavy from all the coins he was carrying around. He was once in a candy store buying a few kilos of candy and he wanted to get rid of as many coins as possible but couldn&rsquo;t figure out how to do it without getting any change back.</p>

<p>You will be given a price P that Per was going to pay. You will also be given the number of 1-, 5-, 10- and 25-cent coins that he had in his wallet. He didn&rsquo;t have any notes. Find the maximum number of coins he could have used for paying the price P without getting any change back.</p>

### 입력

<p>The first line of input contains an integer P, 1 &le; P &le; 100 000 000, the price Per was going to pay. On the second line there are 4 space separated integers N<sub>1</sub>, N<sub>5</sub>, N<sub>10</sub>, N<sub>25</sub>; 0 &le; N<sub>1</sub>, N<sub>5</sub>, N<sub>10</sub>, N<sub>25</sub> &le; 100 000 000, the number of 1-, 5-, 10- and 25-cent coins in Per&rsquo;s wallet.</p>

### 출력

<p>If Per couldn&rsquo;t pay exactly P without getting any change back, output Impossible on a single line. Otherwise output the maximum number of coins Per could use to pay the price P.</p>