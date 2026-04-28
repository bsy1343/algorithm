# [Bronze III] Gift - 9848

[문제 링크](https://www.acmicpc.net/problem/9848)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 724, 정답: 542, 맞힌 사람: 528, 정답 비율: 75.536%

### 분류

구현

### 문제 설명

<p>The coach of Jacqueline Yo, Olympic swimmer for Singapore, is concerned about her Butterfly stroke. He records her daily timing in milliseconds (a millisecond is onethousand of a second) and devises a scheme whereby each time she achieves a timing that is lower than the previous day&rsquo;s timing by at least a certain number of milliseconds, he will reward her with a small encouragement gift.</p>

<p>Given a list of daily timings, determine how many gifts Jacqueline would have received.</p>

### 입력

<p>The first line contains 2 integers n and k, where n (3 &le; n &le; 100) is the number of days, and k (0 &lt; k &le; 100,000) the desired improvement (in milliseconds). Whenever Jacqueline&rsquo;s timing reduces by at least k milliseconds over the previous day&rsquo;s timing, she will receive a gift from her coach. The first line is then followed by n lines where each line contains a single integer t (0 &lt; t &le; 100,000) which is Jacqueline&rsquo;s daily timing in milliseconds. The n timing records are listed in chronological order.</p>

### 출력

<p>The output&nbsp;consists of a single integer that indicates the number of gifts Jacqueline would have received.</p>