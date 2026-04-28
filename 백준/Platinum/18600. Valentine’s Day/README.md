# [Platinum I] Valentine’s Day - 18600

[문제 링크](https://www.acmicpc.net/problem/18600)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 129, 정답: 51, 맞힌 사람: 43, 정답 비율: 41.748%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>Oipotato loves his girlfriend very much. Since Valentine&rsquo;s Day is coming, he decided to buy some presents for her.</p>

<p>There are n presents in the shop, and Oipotato can choose to buy some of them. We know that his girlfriend will possibly feel extremely happy if she receives a present. Therefore, if Oipotato gives k presents to his girlfriend, she has k chances to feel extremely happy. However, Oipotato doesn&rsquo;t want his girlfriend to feel extremely happy too many times for the gifts.</p>

<p>Formally, each present i will make Oipotato&rsquo;s girlfriend feel extremely happy with probability P<sub>i</sub>. Oipotato now needs to decide what to buy in order to maximize the probability that his girlfriend feels extremely happy exactly once. Please help him find that maximum probability.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer T (1 &le; T &le; 100), indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer n (1 &le; n &le; 10 000), indicating the number of possible presents.</p>

<p>The second line contains n real numbers P<sub>i</sub> (0 &le; P<sub>i</sub> &le; 1) given with exactly six digits after the decimal point, indicating the probability that Oipotato&rsquo;s girlfriend feels extremely happy when receiving present i.</p>

<p>It is guaranteed that the sum of n in all test cases does not exceed 500 000.</p>

### 출력

<p>For each test case, output one line with the answer. Your answer will be considered correct if and only if the absolute error of your answer is less than 10<sup>&minus;6</sup>.</p>