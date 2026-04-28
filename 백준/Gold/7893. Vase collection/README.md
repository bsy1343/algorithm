# [Gold IV] Vase collection - 7893

[문제 링크](https://www.acmicpc.net/problem/7893)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 15, 맞힌 사람: 11, 정답 비율: 40.741%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Mr Cheng is a collector of old Chinese porcelain, more specifically late 15th century Feng dynasty vases. The art of vase-making at this time followed very strict artistic rules. There was a limited number of accepted styles, each defined by its shape and decoration. More specifically, there were 36 vase shapes and 36 different patterns of decoration &ndash; in all 1296 different styles.</p>

<p>For a collector, the obvious goal is to own a sample of each of the 1296 styles. Mr Cheng however, like so many other collectors, could never afford a complete collection, and instead concentrates on some shapes and some decorations. As symmetry between shape and decoration was one of the main aestheathical paradigms of the Feng dynasty, Mr Cheng wants to have a full collection of all combinations of k shapes and k decorations, for as large a k as possible. However, he has discovered that determining this k for a given collection is not always trivial. This means that his collection might actually be better than he thinks. Can you help him?</p>

### 입력

<p>On the first line of the input, there is a single positive integer n, telling the number of test scenarios to follow. Each test scenario begins with a line containing a single positive integer m &le; 100 , the number of vases in the collection. Then follow m lines, one per vase, each with a pair of numbers, si and di, separated by a single space, where si ( 0 &lt; si &le; 36 ) indicates the shape of Mr Cheng&#39;s i:th vase, and di ( 0 &lt; di &le; 36 ) indicates its decoration.</p>

### 출력

<p>For each test scenario, output one line containing the maximum k, such that there are k shapes and k decorations for which Mr Cheng&#39;s collection contains all k*k combined styles.</p>