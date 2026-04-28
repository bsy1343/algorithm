# [Platinum IV] Matryoshka Dolls - 10462

[문제 링크](https://www.acmicpc.net/problem/10462)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 236, 정답: 72, 맞힌 사람: 40, 정답 비율: 27.586%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬

### 문제 설명

<p>You most likely have seen the Russian Dolls which stack inside each other. For example:</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/10462.%E2%80%85Matryoshka%E2%80%85Dolls/c6e91e1c.jpg" data-original-src="https://www.acmicpc.net/upload/images2/dolls.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Each doll has a different weight and storage ability. Your task is to nest as many dolls as possible.</p>

### 입력

<p>Standard input consists of several lines, each containing a pair of integers separated by one or more space characters, specifying the weight and storage ability of a doll. The weight of the doll is in grams. The storage ability, also in grams, is the doll&#39;s overall storage capacity, including its own weight. That is, a doll weighing 400g with a strength of 900g could carry 500g of dolls inside it. There are at most 6000 dolls. The maximum weight of any doll is 100000g and the maximum storage capacity is 20000000g.</p>

### 출력

<p>Your output is a single integer indicating the maximum number of dolls that can be nested without exceeding the storage ability of any one.</p>